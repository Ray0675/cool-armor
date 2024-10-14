package net.raylirov.coolarmor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.raylirov.coolarmor.init.ModItemTags;
import net.raylirov.coolarmor.init.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModTagGenerator extends FabricTagProvider.ItemTagProvider {

    public ModTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.NETHERITE_TINTED_HELMET,
                        ModItems.DIAMOND_TINTED_HELMET,
                        ModItems.GOLDEN_TINTED_HELMET,
                        ModItems.CHAINMAIL_TINTED_HELMET,
                        ModItems.IRON_TINTED_HELMET,
                        ModItems.LEATHER_TINTED_HELMET,

                        ModItems.IRON_WOOLED_BOOTS,

                        ModItems.NETHERITE_GILDED_HELMET,
                        ModItems.NETHERITE_GILDED_CHESTPLATE,
                        ModItems.NETHERITE_GILDED_LEGGINGS,
                        ModItems.NETHERITE_GILDED_BOOTS,

                        ModItems.NETHERITE_TURTLE_HELMET,
                        ModItems.NETHERITE_TURTLE_CHESTPLATE,
                        ModItems.NETHERITE_TURTLE_LEGGINGS,
                        ModItems.NETHERITE_TURTLE_BOOTS,

                        ModItems.NETHERITE_LEATHERED_HELMET,
                        ModItems.NETHERITE_LEATHERED_CHESTPLATE,
                        ModItems.NETHERITE_LEATHERED_LEGGINGS,
                        ModItems.NETHERITE_LEATHERED_BOOTS,

                        ModItems.DIAMOND_LEATHERED_HELMET,
                        ModItems.DIAMOND_LEATHERED_CHESTPLATE,
                        ModItems.DIAMOND_LEATHERED_LEGGINGS,
                        ModItems.DIAMOND_LEATHERED_BOOTS,

                        ModItems.GOLDEN_LEATHERED_HELMET,
                        ModItems.GOLDEN_LEATHERED_CHESTPLATE,
                        ModItems.GOLDEN_LEATHERED_LEGGINGS,
                        ModItems.GOLDEN_LEATHERED_BOOTS,

                        ModItems.CHAINMAIL_LEATHERED_HELMET,
                        ModItems.CHAINMAIL_LEATHERED_CHESTPLATE,
                        ModItems.CHAINMAIL_LEATHERED_LEGGINGS,
                        ModItems.CHAINMAIL_LEATHERED_BOOTS,

                        ModItems.IRON_LEATHERED_HELMET,
                        ModItems.IRON_LEATHERED_CHESTPLATE,
                        ModItems.IRON_LEATHERED_LEGGINGS,
                        ModItems.IRON_LEATHERED_BOOTS);

        getOrCreateTagBuilder(ItemTags.FREEZE_IMMUNE_WEARABLES)
                .add(ModItems.NETHERITE_LEATHERED_HELMET,
                        ModItems.NETHERITE_LEATHERED_CHESTPLATE,
                        ModItems.NETHERITE_LEATHERED_LEGGINGS,
                        ModItems.NETHERITE_LEATHERED_BOOTS,

                        ModItems.DIAMOND_LEATHERED_HELMET,
                        ModItems.DIAMOND_LEATHERED_CHESTPLATE,
                        ModItems.DIAMOND_LEATHERED_LEGGINGS,
                        ModItems.DIAMOND_LEATHERED_BOOTS,

                        ModItems.GOLDEN_LEATHERED_HELMET,
                        ModItems.GOLDEN_LEATHERED_CHESTPLATE,
                        ModItems.GOLDEN_LEATHERED_LEGGINGS,
                        ModItems.GOLDEN_LEATHERED_BOOTS,

                        ModItems.CHAINMAIL_LEATHERED_HELMET,
                        ModItems.CHAINMAIL_LEATHERED_CHESTPLATE,
                        ModItems.CHAINMAIL_LEATHERED_LEGGINGS,
                        ModItems.CHAINMAIL_LEATHERED_BOOTS,

                        ModItems.IRON_LEATHERED_HELMET,
                        ModItems.IRON_LEATHERED_CHESTPLATE,
                        ModItems.IRON_LEATHERED_LEGGINGS,
                        ModItems.IRON_LEATHERED_BOOTS,

                        ModItems.LEATHER_TINTED_HELMET);

        getOrCreateTagBuilder(ModItemTags.NETHERITE_ARMOR_HELMET)
                .add(Items.NETHERITE_HELMET,
                        ModItems.NETHERITE_LEATHERED_HELMET,
                        ModItems.NETHERITE_GILDED_HELMET,
                        ModItems.NETHERITE_TURTLE_HELMET,
                        ModItems.NETHERITE_TINTED_HELMET);

        getOrCreateTagBuilder(ModItemTags.NETHERITE_ARMOR_CHESTPLATE)
                .add(Items.NETHERITE_CHESTPLATE,
                        ModItems.NETHERITE_LEATHERED_CHESTPLATE,
                        ModItems.NETHERITE_GILDED_CHESTPLATE,
                        ModItems.NETHERITE_TURTLE_CHESTPLATE);
        
        getOrCreateTagBuilder(ModItemTags.NETHERITE_ARMOR_LEGGINGS)
                .add(Items.NETHERITE_LEGGINGS,
                        ModItems.NETHERITE_LEATHERED_LEGGINGS,
                        ModItems.NETHERITE_GILDED_LEGGINGS,
                        ModItems.NETHERITE_TURTLE_LEGGINGS);

        getOrCreateTagBuilder(ModItemTags.NETHERITE_ARMOR_BOOTS)
                .add(Items.NETHERITE_BOOTS,
                        ModItems.NETHERITE_LEATHERED_BOOTS,
                        ModItems.NETHERITE_GILDED_BOOTS,
                        ModItems.NETHERITE_TURTLE_BOOTS);

        getOrCreateTagBuilder(ModItemTags.IRON_ARMOR)
                .add(Items.IRON_HELMET,
                        Items.IRON_CHESTPLATE,
                        Items.IRON_LEGGINGS,
                        Items.IRON_BOOTS,
                        ModItems.IRON_LEATHERED_HELMET,
                        ModItems.IRON_LEATHERED_CHESTPLATE,
                        ModItems.IRON_LEATHERED_LEGGINGS,
                        ModItems.IRON_LEATHERED_BOOTS,
                        ModItems.IRON_WOOLED_BOOTS,
                        ModItems.IRON_TINTED_HELMET);

        getOrCreateTagBuilder(ModItemTags.DIAMOND_ARMOR)
                .add(Items.DIAMOND_HELMET,
                        Items.DIAMOND_CHESTPLATE,
                        Items.DIAMOND_LEGGINGS,
                        Items.DIAMOND_BOOTS,
                        ModItems.DIAMOND_LEATHERED_HELMET,
                        ModItems.DIAMOND_LEATHERED_CHESTPLATE,
                        ModItems.DIAMOND_LEATHERED_LEGGINGS,
                        ModItems.DIAMOND_LEATHERED_BOOTS,
                        ModItems.DIAMOND_TINTED_HELMET);

        getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED)
                .add(ModItems.NETHERITE_GILDED_HELMET,
                        ModItems.NETHERITE_GILDED_CHESTPLATE,
                        ModItems.NETHERITE_GILDED_LEGGINGS,
                        ModItems.NETHERITE_GILDED_BOOTS,
                        ModItems.GOLDEN_LEATHERED_HELMET,
                        ModItems.GOLDEN_LEATHERED_CHESTPLATE,
                        ModItems.GOLDEN_LEATHERED_LEGGINGS,
                        ModItems.GOLDEN_LEATHERED_BOOTS,
                        ModItems.GOLDEN_TINTED_HELMET);

        getOrCreateTagBuilder(ModItemTags.LEATHERED_ARMOR_HELMET)
                .add(ModItems.NETHERITE_LEATHERED_HELMET,
                        ModItems.DIAMOND_LEATHERED_HELMET,
                        ModItems.GOLDEN_LEATHERED_HELMET,
                        ModItems.CHAINMAIL_LEATHERED_HELMET,
                        ModItems.IRON_LEATHERED_HELMET);

        getOrCreateTagBuilder(ModItemTags.LEATHERED_ARMOR_CHESTPLATE)
                .add(ModItems.NETHERITE_LEATHERED_CHESTPLATE,
                        ModItems.DIAMOND_LEATHERED_CHESTPLATE,
                        ModItems.GOLDEN_LEATHERED_CHESTPLATE,
                        ModItems.CHAINMAIL_LEATHERED_CHESTPLATE,
                        ModItems.IRON_LEATHERED_CHESTPLATE);

        getOrCreateTagBuilder(ModItemTags.LEATHERED_ARMOR_LEGGINGS)
                .add(ModItems.NETHERITE_LEATHERED_LEGGINGS,
                        ModItems.DIAMOND_LEATHERED_LEGGINGS,
                        ModItems.GOLDEN_LEATHERED_LEGGINGS,
                        ModItems.CHAINMAIL_LEATHERED_LEGGINGS,
                        ModItems.IRON_LEATHERED_LEGGINGS);

        getOrCreateTagBuilder(ModItemTags.LEATHERED_ARMOR_BOOTS)
                .add(ModItems.NETHERITE_LEATHERED_BOOTS,
                        ModItems.DIAMOND_LEATHERED_BOOTS,
                        ModItems.GOLDEN_LEATHERED_BOOTS,
                        ModItems.CHAINMAIL_LEATHERED_BOOTS,
                        ModItems.IRON_LEATHERED_BOOTS);
    }
}
