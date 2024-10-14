package net.raylirov.coolarmor.datagen.generators;

import net.minecraft.advancements.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.datagen.providers.ModTranslationKeyTypeProvider;
import net.raylirov.coolarmor.datagen.providers.ModTranslationKeyProvider;
import net.raylirov.coolarmor.init.ModItems;
import net.raylirov.coolarmor.util.ArmorFilter;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancementGenerator extends ForgeAdvancementProvider {

    public ModAdvancementGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, ExistingFileHelper existingFileHelper) {
        super(output, registries, existingFileHelper, List.of(new ModAdvancementSubProvider()));
    }

    public static class ModAdvancementSubProvider implements ForgeAdvancementProvider.AdvancementGenerator {

        @Override
        public void generate(HolderLookup.@NotNull Provider registries, @NotNull Consumer<Advancement> consumer, @NotNull ExistingFileHelper fileHelper) {
            Advancement turtleAdvancement = withDisplay(ModItems.NETHERITE_TURTLE_HELMET.get(),
                    "turtle_power",
                    Advancement.Builder.advancement(),
                    FrameType.CHALLENGE)
                    .parent(new ResourceLocation("nether/netherite_armor"))
                    .rewards(new AdvancementRewards.Builder().addExperience(50))
                    .addCriterion("k_armor", ArmorFilter.hasNetheriteTurtleArmor())
                    .save(consumer, new ResourceLocation(CoolArmor.MOD_ID, "turtle_power"), fileHelper);

            Advancement gildedAdvancement = withDisplay(ModItems.NETHERITE_GILDED_HELMET.get(),
                    "gilded",
                    Advancement.Builder.advancement(),
                    FrameType.CHALLENGE)
                    .parent(new ResourceLocation("nether/netherite_armor"))
                    .rewards(new AdvancementRewards.Builder().addExperience(50))
                    .addCriterion("k_armor", ArmorFilter.hasNetheriteGildedArmor())
                    .save(consumer, new ResourceLocation(CoolArmor.MOD_ID, "gilded"), fileHelper);


        }

        private Advancement.Builder withDisplay(ItemLike item, String name, Advancement.Builder builder, FrameType type) {
            return builder.display(new ItemStack(item),
                    Component.translatable(ModTranslationKeyProvider.advancementTranslationKeyFor(name,
                            ModTranslationKeyTypeProvider.AdvancementKeySubType.TITLE)),
                    Component.translatable(ModTranslationKeyProvider.advancementTranslationKeyFor(name,
                            ModTranslationKeyTypeProvider.AdvancementKeySubType.DESCRIPTION)),
                    null, type,
                    true,
                    true,
                    false);
        }

    }


}
