package net.raylirov.coolarmor.main.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.main.datagen.generators.*;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = CoolArmor.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CADataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), new CALanguageGenerator(packOutput,  "en_us"));
        generator.addProvider(event.includeClient(), new CALanguageGenerator(packOutput,  "ru_ru"));
        generator.addProvider(event.includeServer(), new CARecipeGenerator(packOutput));
        generator.addProvider(event.includeServer(), new CAItemModelGenerator(packOutput, existingFileHelper));
        generator.addProvider(event.includeServer(), new CAGlobalLootModifiersGenerator(packOutput));

        CABlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
                new CABlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new CAItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));


    }

}
