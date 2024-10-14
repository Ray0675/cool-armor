package net.raylirov.coolarmor.datagen.generators;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.init.ModItemTags;
import net.raylirov.coolarmor.init.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {

    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, CoolArmor.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.NETHERITE_TINTED_HELMET.get(),
                        ModItems.DIAMOND_TINTED_HELMET.get(),
                        ModItems.GOLDEN_TINTED_HELMET.get(),
                        ModItems.CHAINMAIL_TINTED_HELMET.get(),
                        ModItems.IRON_TINTED_HELMET.get(),
                        ModItems.LEATHER_TINTED_HELMET.get(),

                        ModItems.IRON_WOOLED_BOOTS.get(),

                        ModItems.NETHERITE_GILDED_HELMET.get(),
                        ModItems.NETHERITE_GILDED_CHESTPLATE.get(),
                        ModItems.NETHERITE_GILDED_LEGGINGS.get(),
                        ModItems.NETHERITE_GILDED_BOOTS.get(),

                        ModItems.NETHERITE_TURTLE_HELMET.get(),
                        ModItems.NETHERITE_TURTLE_CHESTPLATE.get(),
                        ModItems.NETHERITE_TURTLE_LEGGINGS.get(),
                        ModItems.NETHERITE_TURTLE_BOOTS.get(),

                        ModItems.NETHERITE_LEATHERED_HELMET.get(),
                        ModItems.NETHERITE_LEATHERED_CHESTPLATE.get(),
                        ModItems.NETHERITE_LEATHERED_LEGGINGS.get(),
                        ModItems.NETHERITE_LEATHERED_BOOTS.get(),

                        ModItems.DIAMOND_LEATHERED_HELMET.get(),
                        ModItems.DIAMOND_LEATHERED_CHESTPLATE.get(),
                        ModItems.DIAMOND_LEATHERED_LEGGINGS.get(),
                        ModItems.DIAMOND_LEATHERED_BOOTS.get(),

                        ModItems.GOLDEN_LEATHERED_HELMET.get(),
                        ModItems.GOLDEN_LEATHERED_CHESTPLATE.get(),
                        ModItems.GOLDEN_LEATHERED_LEGGINGS.get(),
                        ModItems.GOLDEN_LEATHERED_BOOTS.get(),

                        ModItems.CHAINMAIL_LEATHERED_HELMET.get(),
                        ModItems.CHAINMAIL_LEATHERED_CHESTPLATE.get(),
                        ModItems.CHAINMAIL_LEATHERED_LEGGINGS.get(),
                        ModItems.CHAINMAIL_LEATHERED_BOOTS.get(),

                        ModItems.IRON_LEATHERED_HELMET.get(),
                        ModItems.IRON_LEATHERED_CHESTPLATE.get(),
                        ModItems.IRON_LEATHERED_LEGGINGS.get(),
                        ModItems.IRON_LEATHERED_BOOTS.get());

        this.tag(ItemTags.FREEZE_IMMUNE_WEARABLES)
                .add(ModItems.NETHERITE_LEATHERED_HELMET.get(),
                        ModItems.NETHERITE_LEATHERED_CHESTPLATE.get(),
                        ModItems.NETHERITE_LEATHERED_LEGGINGS.get(),
                        ModItems.NETHERITE_LEATHERED_BOOTS.get(),

                        ModItems.DIAMOND_LEATHERED_HELMET.get(),
                        ModItems.DIAMOND_LEATHERED_CHESTPLATE.get(),
                        ModItems.DIAMOND_LEATHERED_LEGGINGS.get(),
                        ModItems.DIAMOND_LEATHERED_BOOTS.get(),

                        ModItems.GOLDEN_LEATHERED_HELMET.get(),
                        ModItems.GOLDEN_LEATHERED_CHESTPLATE.get(),
                        ModItems.GOLDEN_LEATHERED_LEGGINGS.get(),
                        ModItems.GOLDEN_LEATHERED_BOOTS.get(),

                        ModItems.CHAINMAIL_LEATHERED_HELMET.get(),
                        ModItems.CHAINMAIL_LEATHERED_CHESTPLATE.get(),
                        ModItems.CHAINMAIL_LEATHERED_LEGGINGS.get(),
                        ModItems.CHAINMAIL_LEATHERED_BOOTS.get(),

                        ModItems.IRON_LEATHERED_HELMET.get(),
                        ModItems.IRON_LEATHERED_CHESTPLATE.get(),
                        ModItems.IRON_LEATHERED_LEGGINGS.get(),
                        ModItems.IRON_LEATHERED_BOOTS.get(),

                        ModItems.LEATHER_TINTED_HELMET.get());

        this.tag(ModItemTags.NETHERITE_ARMOR_HELMET)
                .add(Items.NETHERITE_HELMET,
                        ModItems.NETHERITE_LEATHERED_HELMET.get(),
                        ModItems.NETHERITE_GILDED_HELMET.get(),
                        ModItems.NETHERITE_TURTLE_HELMET.get(),
                        ModItems.NETHERITE_TINTED_HELMET.get());

        this.tag(ModItemTags.NETHERITE_ARMOR_CHESTPLATE)
                .add(Items.NETHERITE_CHESTPLATE,
                        ModItems.NETHERITE_LEATHERED_CHESTPLATE.get(),
                        ModItems.NETHERITE_GILDED_CHESTPLATE.get(),
                        ModItems.NETHERITE_TURTLE_CHESTPLATE.get());

        this.tag(ModItemTags.NETHERITE_ARMOR_LEGGINGS)
                .add(Items.NETHERITE_LEGGINGS,
                        ModItems.NETHERITE_LEATHERED_LEGGINGS.get(),
                        ModItems.NETHERITE_GILDED_LEGGINGS.get(),
                        ModItems.NETHERITE_TURTLE_LEGGINGS.get());

        this.tag(ModItemTags.NETHERITE_ARMOR_BOOTS)
                .add(Items.NETHERITE_BOOTS,
                        ModItems.NETHERITE_LEATHERED_BOOTS.get(),
                        ModItems.NETHERITE_GILDED_BOOTS.get(),
                        ModItems.NETHERITE_TURTLE_BOOTS.get());

        this.tag(ModItemTags.IRON_ARMOR)
                .add(Items.IRON_HELMET,
                        Items.IRON_CHESTPLATE,
                        Items.IRON_LEGGINGS,
                        Items.IRON_BOOTS,
                        ModItems.IRON_LEATHERED_HELMET.get(),
                        ModItems.IRON_LEATHERED_CHESTPLATE.get(),
                        ModItems.IRON_LEATHERED_LEGGINGS.get(),
                        ModItems.IRON_LEATHERED_BOOTS.get(),
                        ModItems.IRON_WOOLED_BOOTS.get(),
                        ModItems.IRON_TINTED_HELMET.get());

        this.tag(ModItemTags.DIAMOND_ARMOR)
                .add(Items.DIAMOND_HELMET,
                        Items.DIAMOND_CHESTPLATE,
                        Items.DIAMOND_LEGGINGS,
                        Items.DIAMOND_BOOTS,
                        ModItems.DIAMOND_LEATHERED_HELMET.get(),
                        ModItems.DIAMOND_LEATHERED_CHESTPLATE.get(),
                        ModItems.DIAMOND_LEATHERED_LEGGINGS.get(),
                        ModItems.DIAMOND_LEATHERED_BOOTS.get(),
                        ModItems.DIAMOND_TINTED_HELMET.get());

        this.tag(ItemTags.PIGLIN_LOVED)
                .add(ModItems.NETHERITE_GILDED_HELMET.get(),
                        ModItems.NETHERITE_GILDED_CHESTPLATE.get(),
                        ModItems.NETHERITE_GILDED_LEGGINGS.get(),
                        ModItems.NETHERITE_GILDED_BOOTS.get(),
                        ModItems.GOLDEN_LEATHERED_HELMET.get(),
                        ModItems.GOLDEN_LEATHERED_CHESTPLATE.get(),
                        ModItems.GOLDEN_LEATHERED_LEGGINGS.get(),
                        ModItems.GOLDEN_LEATHERED_BOOTS.get(),
                        ModItems.GOLDEN_TINTED_HELMET.get());

        this.tag(ModItemTags.LEATHERED_ARMOR_HELMET)
                .add(ModItems.NETHERITE_LEATHERED_HELMET.get(),
                        ModItems.DIAMOND_LEATHERED_HELMET.get(),
                        ModItems.GOLDEN_LEATHERED_HELMET.get(),
                        ModItems.CHAINMAIL_LEATHERED_HELMET.get(),
                        ModItems.IRON_LEATHERED_HELMET.get());


        this.tag(ModItemTags.LEATHERED_ARMOR_CHESTPLATE)
                .add(ModItems.NETHERITE_LEATHERED_CHESTPLATE.get(),
                        ModItems.DIAMOND_LEATHERED_CHESTPLATE.get(),
                        ModItems.GOLDEN_LEATHERED_CHESTPLATE.get(),
                        ModItems.CHAINMAIL_LEATHERED_CHESTPLATE.get(),
                        ModItems.IRON_LEATHERED_CHESTPLATE.get());

        this.tag(ModItemTags.LEATHERED_ARMOR_LEGGINGS)
                .add(ModItems.NETHERITE_LEATHERED_LEGGINGS.get(),
                        ModItems.DIAMOND_LEATHERED_LEGGINGS.get(),
                        ModItems.GOLDEN_LEATHERED_LEGGINGS.get(),
                        ModItems.CHAINMAIL_LEATHERED_LEGGINGS.get(),
                        ModItems.IRON_LEATHERED_LEGGINGS.get());

        this.tag(ModItemTags.LEATHERED_ARMOR_BOOTS)
                .add(ModItems.NETHERITE_LEATHERED_BOOTS.get(),
                        ModItems.DIAMOND_LEATHERED_BOOTS.get(),
                        ModItems.GOLDEN_LEATHERED_BOOTS.get(),
                        ModItems.CHAINMAIL_LEATHERED_BOOTS.get(),
                        ModItems.IRON_LEATHERED_BOOTS.get());
    }
}
