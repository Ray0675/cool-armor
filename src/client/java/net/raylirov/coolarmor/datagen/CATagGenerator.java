package net.raylirov.coolarmor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.raylirov.coolarmor.main.init.CAItemTags;
import net.raylirov.coolarmor.main.init.CAItems;

import java.util.concurrent.CompletableFuture;

public class CATagGenerator extends FabricTagProvider.ItemTagProvider {

    public CATagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(CAItems.NETHERITE_TINTED_HELMET,
                        CAItems.DIAMOND_TINTED_HELMET,
                        CAItems.GOLDEN_TINTED_HELMET,
                        CAItems.CHAINMAIL_TINTED_HELMET,
                        CAItems.IRON_TINTED_HELMET,
                        CAItems.LEATHER_TINTED_HELMET,

                        CAItems.IRON_WOOLED_BOOTS,

                        CAItems.NETHERITE_GILDED_HELMET,
                        CAItems.NETHERITE_GILDED_CHESTPLATE,
                        CAItems.NETHERITE_GILDED_LEGGINGS,
                        CAItems.NETHERITE_GILDED_BOOTS,

                        CAItems.NETHERITE_TURTLE_HELMET,
                        CAItems.NETHERITE_TURTLE_CHESTPLATE,
                        CAItems.NETHERITE_TURTLE_LEGGINGS,
                        CAItems.NETHERITE_TURTLE_BOOTS,

                        CAItems.NETHERITE_LEATHERED_HELMET,
                        CAItems.NETHERITE_LEATHERED_CHESTPLATE,
                        CAItems.NETHERITE_LEATHERED_LEGGINGS,
                        CAItems.NETHERITE_LEATHERED_BOOTS,

                        CAItems.DIAMOND_LEATHERED_HELMET,
                        CAItems.DIAMOND_LEATHERED_CHESTPLATE,
                        CAItems.DIAMOND_LEATHERED_LEGGINGS,
                        CAItems.DIAMOND_LEATHERED_BOOTS,

                        CAItems.GOLDEN_LEATHERED_HELMET,
                        CAItems.GOLDEN_LEATHERED_CHESTPLATE,
                        CAItems.GOLDEN_LEATHERED_LEGGINGS,
                        CAItems.GOLDEN_LEATHERED_BOOTS,

                        CAItems.CHAINMAIL_LEATHERED_HELMET,
                        CAItems.CHAINMAIL_LEATHERED_CHESTPLATE,
                        CAItems.CHAINMAIL_LEATHERED_LEGGINGS,
                        CAItems.CHAINMAIL_LEATHERED_BOOTS,

                        CAItems.IRON_LEATHERED_HELMET,
                        CAItems.IRON_LEATHERED_CHESTPLATE,
                        CAItems.IRON_LEATHERED_LEGGINGS,
                        CAItems.IRON_LEATHERED_BOOTS);

        getOrCreateTagBuilder(ItemTags.FREEZE_IMMUNE_WEARABLES)
                .add(CAItems.NETHERITE_LEATHERED_HELMET,
                        CAItems.NETHERITE_LEATHERED_CHESTPLATE,
                        CAItems.NETHERITE_LEATHERED_LEGGINGS,
                        CAItems.NETHERITE_LEATHERED_BOOTS,

                        CAItems.DIAMOND_LEATHERED_HELMET,
                        CAItems.DIAMOND_LEATHERED_CHESTPLATE,
                        CAItems.DIAMOND_LEATHERED_LEGGINGS,
                        CAItems.DIAMOND_LEATHERED_BOOTS,

                        CAItems.GOLDEN_LEATHERED_HELMET,
                        CAItems.GOLDEN_LEATHERED_CHESTPLATE,
                        CAItems.GOLDEN_LEATHERED_LEGGINGS,
                        CAItems.GOLDEN_LEATHERED_BOOTS,

                        CAItems.CHAINMAIL_LEATHERED_HELMET,
                        CAItems.CHAINMAIL_LEATHERED_CHESTPLATE,
                        CAItems.CHAINMAIL_LEATHERED_LEGGINGS,
                        CAItems.CHAINMAIL_LEATHERED_BOOTS,

                        CAItems.IRON_LEATHERED_HELMET,
                        CAItems.IRON_LEATHERED_CHESTPLATE,
                        CAItems.IRON_LEATHERED_LEGGINGS,
                        CAItems.IRON_LEATHERED_BOOTS,

                        CAItems.LEATHER_TINTED_HELMET);

        getOrCreateTagBuilder(CAItemTags.NETHERITE_ARMOR_HELMET)
                .add(Items.NETHERITE_HELMET,
                        CAItems.NETHERITE_LEATHERED_HELMET,
                        CAItems.NETHERITE_GILDED_HELMET,
                        CAItems.NETHERITE_TURTLE_HELMET,
                        CAItems.NETHERITE_TINTED_HELMET);

        getOrCreateTagBuilder(CAItemTags.NETHERITE_ARMOR_CHESTPLATE)
                .add(Items.NETHERITE_CHESTPLATE,
                        CAItems.NETHERITE_LEATHERED_CHESTPLATE,
                        CAItems.NETHERITE_GILDED_CHESTPLATE,
                        CAItems.NETHERITE_TURTLE_CHESTPLATE);
        
        getOrCreateTagBuilder(CAItemTags.NETHERITE_ARMOR_LEGGINGS)
                .add(Items.NETHERITE_LEGGINGS,
                        CAItems.NETHERITE_LEATHERED_LEGGINGS,
                        CAItems.NETHERITE_GILDED_LEGGINGS,
                        CAItems.NETHERITE_TURTLE_LEGGINGS);

        getOrCreateTagBuilder(CAItemTags.NETHERITE_ARMOR_BOOTS)
                .add(Items.NETHERITE_BOOTS,
                        CAItems.NETHERITE_LEATHERED_BOOTS,
                        CAItems.NETHERITE_GILDED_BOOTS,
                        CAItems.NETHERITE_TURTLE_BOOTS);

        getOrCreateTagBuilder(CAItemTags.IRON_ARMOR)
                .add(Items.IRON_HELMET,
                        Items.IRON_CHESTPLATE,
                        Items.IRON_LEGGINGS,
                        Items.IRON_BOOTS,
                        CAItems.IRON_LEATHERED_HELMET,
                        CAItems.IRON_LEATHERED_CHESTPLATE,
                        CAItems.IRON_LEATHERED_LEGGINGS,
                        CAItems.IRON_LEATHERED_BOOTS,
                        CAItems.IRON_WOOLED_BOOTS,
                        CAItems.IRON_TINTED_HELMET);

        getOrCreateTagBuilder(CAItemTags.DIAMOND_ARMOR)
                .add(Items.DIAMOND_HELMET,
                        Items.DIAMOND_CHESTPLATE,
                        Items.DIAMOND_LEGGINGS,
                        Items.DIAMOND_BOOTS,
                        CAItems.DIAMOND_LEATHERED_HELMET,
                        CAItems.DIAMOND_LEATHERED_CHESTPLATE,
                        CAItems.DIAMOND_LEATHERED_LEGGINGS,
                        CAItems.DIAMOND_LEATHERED_BOOTS,
                        CAItems.DIAMOND_TINTED_HELMET);

        getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED)
                .add(CAItems.NETHERITE_GILDED_HELMET,
                        CAItems.NETHERITE_GILDED_CHESTPLATE,
                        CAItems.NETHERITE_GILDED_LEGGINGS,
                        CAItems.NETHERITE_GILDED_BOOTS,
                        CAItems.GOLDEN_LEATHERED_HELMET,
                        CAItems.GOLDEN_LEATHERED_CHESTPLATE,
                        CAItems.GOLDEN_LEATHERED_LEGGINGS,
                        CAItems.GOLDEN_LEATHERED_BOOTS,
                        CAItems.GOLDEN_TINTED_HELMET);

        getOrCreateTagBuilder(CAItemTags.LEATHERED_ARMOR_HELMET)
                .add(CAItems.NETHERITE_LEATHERED_HELMET,
                        CAItems.DIAMOND_LEATHERED_HELMET,
                        CAItems.GOLDEN_LEATHERED_HELMET,
                        CAItems.CHAINMAIL_LEATHERED_HELMET,
                        CAItems.IRON_LEATHERED_HELMET);

        getOrCreateTagBuilder(CAItemTags.LEATHERED_ARMOR_CHESTPLATE)
                .add(CAItems.NETHERITE_LEATHERED_CHESTPLATE,
                        CAItems.DIAMOND_LEATHERED_CHESTPLATE,
                        CAItems.GOLDEN_LEATHERED_CHESTPLATE,
                        CAItems.CHAINMAIL_LEATHERED_CHESTPLATE,
                        CAItems.IRON_LEATHERED_CHESTPLATE);

        getOrCreateTagBuilder(CAItemTags.LEATHERED_ARMOR_LEGGINGS)
                .add(CAItems.NETHERITE_LEATHERED_LEGGINGS,
                        CAItems.DIAMOND_LEATHERED_LEGGINGS,
                        CAItems.GOLDEN_LEATHERED_LEGGINGS,
                        CAItems.CHAINMAIL_LEATHERED_LEGGINGS,
                        CAItems.IRON_LEATHERED_LEGGINGS);

        getOrCreateTagBuilder(CAItemTags.LEATHERED_ARMOR_BOOTS)
                .add(CAItems.NETHERITE_LEATHERED_BOOTS,
                        CAItems.DIAMOND_LEATHERED_BOOTS,
                        CAItems.GOLDEN_LEATHERED_BOOTS,
                        CAItems.CHAINMAIL_LEATHERED_BOOTS,
                        CAItems.IRON_LEATHERED_BOOTS);
    }
}
