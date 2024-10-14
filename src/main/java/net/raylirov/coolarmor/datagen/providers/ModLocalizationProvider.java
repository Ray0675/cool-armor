package net.raylirov.coolarmor.datagen.providers;

import com.google.common.base.Preconditions;
import com.google.gson.JsonObject;
import net.minecraft.advancements.FrameType;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.network.chat.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CompletableFuture;

public class ModLocalizationProvider implements DataProvider {
    private final Map<String, String> localizations = new HashMap<>();

    private final DataGenerator generator;

    private boolean wasSaved = false;

    public ModLocalizationProvider(DataGenerator generator) {
        this.generator = generator;
    }

    @Override
    public final CompletableFuture<?> run(CachedOutput cache) {

        generateLocalizations();

        return save(cache, localizations);
    }


    public void add(String key, String text) {
        Preconditions.checkState(!wasSaved, "Cannot add more translations after they were already saved");
        var previous = localizations.put(key, text);
        if (previous != null) {
            throw new IllegalStateException("Localization key " + key + " is already translated to: " + previous);
        }
    }

    public Component component(String key, String text, FrameType task, boolean b, boolean b1, boolean b2) {
        add(key, text);
        return Component.translatable(key);
    }

    private void generateLocalizations() {

    }

    private CompletableFuture<?> save(CachedOutput cache, Map<String, String> localizations) {
        wasSaved = true;

        var path = this.generator.getPackOutput().getOutputFolder().resolve("assets/coolitems/lang/en_us.json");

        var sorted = new TreeMap<>(localizations);
        var jsonLocalization = new JsonObject();
        for (var entry : sorted.entrySet()) {
            jsonLocalization.addProperty(entry.getKey(), entry.getValue());
        }

        return DataProvider.saveStable(cache, jsonLocalization, path);
    }

    @Override
    public String getName() {
        return "Localization (en_us)";
    }
}