package net.raylirov.coolarmor.main.datagen.generators;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.main.init.CAItemTags;
import net.raylirov.coolarmor.main.init.CAItems;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class CAItemTagGenerator extends ItemTagsProvider {

    public CAItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, CoolArmor.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(CAItems.NETHERITE_TINTED_HELMET.get())
                .add(CAItems.DIAMOND_TINTED_HELMET.get())
                .add(CAItems.GOLDEN_TINTED_HELMET.get())
                .add(CAItems.CHAINMAIL_TINTED_HELMET.get())
                .add(CAItems.IRON_TINTED_HELMET.get())
                .add(CAItems.LEATHER_TINTED_HELMET.get())

                .add(CAItems.IRON_WOOLED_BOOTS.get())

                .add(CAItems.NETHERITE_GILDED_HELMET.get())
                .add(CAItems.NETHERITE_GILDED_CHESTPLATE.get())
                .add(CAItems.NETHERITE_GILDED_LEGGINGS.get())
                .add(CAItems.NETHERITE_GILDED_BOOTS.get())

                .add(CAItems.NETHERITE_TURTLE_HELMET.get())
                .add(CAItems.NETHERITE_TURTLE_CHESTPLATE.get())
                .add(CAItems.NETHERITE_TURTLE_LEGGINGS.get())
                .add(CAItems.NETHERITE_TURTLE_BOOTS.get())

                .add(CAItems.NETHERITE_LEATHERED_HELMET.get())
                .add(CAItems.NETHERITE_LEATHERED_CHESTPLATE.get())
                .add(CAItems.NETHERITE_LEATHERED_LEGGINGS.get())
                .add(CAItems.NETHERITE_LEATHERED_BOOTS.get())

                .add(CAItems.DIAMOND_LEATHERED_HELMET.get())
                .add(CAItems.DIAMOND_LEATHERED_CHESTPLATE.get())
                .add(CAItems.DIAMOND_LEATHERED_LEGGINGS.get())
                .add(CAItems.DIAMOND_LEATHERED_BOOTS.get())

                .add(CAItems.GOLDEN_LEATHERED_HELMET.get())
                .add(CAItems.GOLDEN_LEATHERED_CHESTPLATE.get())
                .add(CAItems.GOLDEN_LEATHERED_LEGGINGS.get())
                .add(CAItems.GOLDEN_LEATHERED_BOOTS.get())

                .add(CAItems.CHAINMAIL_LEATHERED_HELMET.get())
                .add(CAItems.CHAINMAIL_LEATHERED_CHESTPLATE.get())
                .add(CAItems.CHAINMAIL_LEATHERED_LEGGINGS.get())
                .add(CAItems.CHAINMAIL_LEATHERED_BOOTS.get())

                .add(CAItems.IRON_LEATHERED_HELMET.get())
                .add(CAItems.IRON_LEATHERED_CHESTPLATE.get())
                .add(CAItems.IRON_LEATHERED_LEGGINGS.get())
                .add(CAItems.IRON_LEATHERED_BOOTS.get());

        this.tag(ItemTags.FREEZE_IMMUNE_WEARABLES)
                .add(CAItems.NETHERITE_LEATHERED_HELMET.get())
                .add(CAItems.NETHERITE_LEATHERED_CHESTPLATE.get())
                .add(CAItems.NETHERITE_LEATHERED_LEGGINGS.get())
                .add(CAItems.NETHERITE_LEATHERED_BOOTS.get())

                .add(CAItems.DIAMOND_LEATHERED_HELMET.get())
                .add(CAItems.DIAMOND_LEATHERED_CHESTPLATE.get())
                .add(CAItems.DIAMOND_LEATHERED_LEGGINGS.get())
                .add(CAItems.DIAMOND_LEATHERED_BOOTS.get())

                .add(CAItems.GOLDEN_LEATHERED_HELMET.get())
                .add(CAItems.GOLDEN_LEATHERED_CHESTPLATE.get())
                .add(CAItems.GOLDEN_LEATHERED_LEGGINGS.get())
                .add(CAItems.GOLDEN_LEATHERED_BOOTS.get())

                .add(CAItems.CHAINMAIL_LEATHERED_HELMET.get())
                .add(CAItems.CHAINMAIL_LEATHERED_CHESTPLATE.get())
                .add(CAItems.CHAINMAIL_LEATHERED_LEGGINGS.get())
                .add(CAItems.CHAINMAIL_LEATHERED_BOOTS.get())

                .add(CAItems.IRON_LEATHERED_HELMET.get())
                .add(CAItems.IRON_LEATHERED_CHESTPLATE.get())
                .add(CAItems.IRON_LEATHERED_LEGGINGS.get())
                .add(CAItems.IRON_LEATHERED_BOOTS.get())

                .add(CAItems.LEATHER_TINTED_HELMET.get());

        this.tag(CAItemTags.NETHERITE_ARMOR_HELMET)
                .add(Items.NETHERITE_HELMET)
                .add(CAItems.NETHERITE_LEATHERED_HELMET.get())
                .add(CAItems.NETHERITE_GILDED_HELMET.get())
                .add(CAItems.NETHERITE_TURTLE_HELMET.get())
                .add(CAItems.NETHERITE_TINTED_HELMET.get());

        this.tag(CAItemTags.NETHERITE_ARMOR_CHESTPLATE)
                .add(Items.NETHERITE_CHESTPLATE)
                .add(CAItems.NETHERITE_LEATHERED_CHESTPLATE.get())
                .add(CAItems.NETHERITE_GILDED_CHESTPLATE.get())
                .add(CAItems.NETHERITE_TURTLE_CHESTPLATE.get());

        this.tag(CAItemTags.NETHERITE_ARMOR_LEGGINGS)
                .add(Items.NETHERITE_LEGGINGS)
                .add(CAItems.NETHERITE_LEATHERED_LEGGINGS.get())
                .add(CAItems.NETHERITE_GILDED_LEGGINGS.get())
                .add(CAItems.NETHERITE_TURTLE_LEGGINGS.get());

        this.tag(CAItemTags.NETHERITE_ARMOR_BOOTS)
                .add(Items.NETHERITE_BOOTS)
                .add(CAItems.NETHERITE_LEATHERED_BOOTS.get())
                .add(CAItems.NETHERITE_GILDED_BOOTS.get())
                .add(CAItems.NETHERITE_TURTLE_BOOTS.get());

        this.tag(CAItemTags.IRON_ARMOR)
                .add(Items.IRON_HELMET)
                .add(Items.IRON_CHESTPLATE)
                .add(Items.IRON_LEGGINGS)
                .add(Items.IRON_BOOTS)
                .add(CAItems.IRON_LEATHERED_HELMET.get())
                .add(CAItems.IRON_LEATHERED_CHESTPLATE.get())
                .add(CAItems.IRON_LEATHERED_LEGGINGS.get())
                .add(CAItems.IRON_LEATHERED_BOOTS.get())
                .add(CAItems.IRON_WOOLED_BOOTS.get())
                .add(CAItems.IRON_TINTED_HELMET.get());

        this.tag(CAItemTags.DIAMOND_ARMOR)
                .add(Items.DIAMOND_HELMET)
                .add(Items.DIAMOND_CHESTPLATE)
                .add(Items.DIAMOND_LEGGINGS)
                .add(Items.DIAMOND_BOOTS)
                .add(CAItems.DIAMOND_LEATHERED_HELMET.get())
                .add(CAItems.DIAMOND_LEATHERED_CHESTPLATE.get())
                .add(CAItems.DIAMOND_LEATHERED_LEGGINGS.get())
                .add(CAItems.DIAMOND_LEATHERED_BOOTS.get())
                .add(CAItems.DIAMOND_TINTED_HELMET.get());

        this.tag(ItemTags.PIGLIN_LOVED)
                .add(CAItems.NETHERITE_GILDED_HELMET.get())
                .add(CAItems.NETHERITE_GILDED_CHESTPLATE.get())
                .add(CAItems.NETHERITE_GILDED_LEGGINGS.get())
                .add(CAItems.NETHERITE_GILDED_BOOTS.get())
                .add(CAItems.GOLDEN_LEATHERED_HELMET.get())
                .add(CAItems.GOLDEN_LEATHERED_CHESTPLATE.get())
                .add(CAItems.GOLDEN_LEATHERED_LEGGINGS.get())
                .add(CAItems.GOLDEN_LEATHERED_BOOTS.get())
                .add(CAItems.GOLDEN_TINTED_HELMET.get());

        this.tag(CAItemTags.LEATHERED_ARMOR_HELMET)
                .add(CAItems.NETHERITE_LEATHERED_HELMET.get())
                .add(CAItems.DIAMOND_LEATHERED_HELMET.get())
                .add(CAItems.GOLDEN_LEATHERED_HELMET.get())
                .add(CAItems.CHAINMAIL_LEATHERED_HELMET.get())
                .add(CAItems.IRON_LEATHERED_HELMET.get());

        this.tag(CAItemTags.LEATHERED_ARMOR_CHESTPLATE)
                .add(CAItems.NETHERITE_LEATHERED_CHESTPLATE.get())
                .add(CAItems.DIAMOND_LEATHERED_CHESTPLATE.get())
                .add(CAItems.GOLDEN_LEATHERED_CHESTPLATE.get())
                .add(CAItems.CHAINMAIL_LEATHERED_CHESTPLATE.get())
                .add(CAItems.IRON_LEATHERED_CHESTPLATE.get());

        this.tag(CAItemTags.LEATHERED_ARMOR_LEGGINGS)
                .add(CAItems.NETHERITE_LEATHERED_LEGGINGS.get())
                .add(CAItems.DIAMOND_LEATHERED_LEGGINGS.get())
                .add(CAItems.GOLDEN_LEATHERED_LEGGINGS.get())
                .add(CAItems.CHAINMAIL_LEATHERED_LEGGINGS.get())
                .add(CAItems.IRON_LEATHERED_LEGGINGS.get());

        this.tag(CAItemTags.LEATHERED_ARMOR_BOOTS)
                .add(CAItems.NETHERITE_LEATHERED_BOOTS.get())
                .add(CAItems.DIAMOND_LEATHERED_BOOTS.get())
                .add(CAItems.GOLDEN_LEATHERED_BOOTS.get())
                .add(CAItems.CHAINMAIL_LEATHERED_BOOTS.get())
                .add(CAItems.IRON_LEATHERED_BOOTS.get());
        
        this.tag(CAItemTags.LEATHER_ARMOR_BOOTS)
                .add(CAItems.NETHERITE_LEATHERED_BOOTS.get())
                .add(CAItems.DIAMOND_LEATHERED_BOOTS.get())
                .add(CAItems.GOLDEN_LEATHERED_BOOTS.get())
                .add(CAItems.CHAINMAIL_LEATHERED_BOOTS.get())
                .add(CAItems.IRON_LEATHERED_BOOTS.get())
                .add(Items.LEATHER_BOOTS);
        
        this.tag(CAItemTags.TURTLE_ARMOR_HELMET)
                .add(CAItems.NETHERITE_TURTLE_HELMET.get());
        
        this.tag(CAItemTags.TURTLE_ARMOR_CHESTPLATE)
                .add(CAItems.NETHERITE_TURTLE_CHESTPLATE.get());
        
        this.tag(CAItemTags.TURTLE_ARMOR_LEGGINGS)
                .add(CAItems.NETHERITE_TURTLE_LEGGINGS.get());
        
        this.tag(CAItemTags.TURTLE_ARMOR_BOOTS)
                .add(CAItems.NETHERITE_TURTLE_BOOTS.get());

        this.tag(CAItemTags.GILDED_ARMOR_HELMET)
                .add(CAItems.NETHERITE_GILDED_HELMET.get());

        this.tag(CAItemTags.GILDED_ARMOR_CHESTPLATE)
                .add(CAItems.NETHERITE_GILDED_CHESTPLATE.get());

        this.tag(CAItemTags.GILDED_ARMOR_LEGGINGS)
                .add(CAItems.NETHERITE_GILDED_LEGGINGS.get());

        this.tag(CAItemTags.GILDED_ARMOR_BOOTS)
                .add(CAItems.NETHERITE_GILDED_BOOTS.get());
    }
}
