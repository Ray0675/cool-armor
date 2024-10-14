package net.raylirov.coolarmor.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.raylirov.coolarmor.CoolArmor;

public class ModItemGroup {

    public static final ItemGroup COOL_ARMOR_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CoolArmor.MOD_ID, CoolArmor.MOD_ID + "_tab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup." + CoolArmor.MOD_ID + "_tab"))
                    .icon(() -> new ItemStack(ModItems.NETHERITE_GILDED_HELMET)).entries((displayContext, entries) -> {

                        entries.add(ModItems.WOOLED_UPGRADE_SMITHING_TEMPLATE);

                        entries.add(ModItems.IRON_WOOLED_BOOTS);

                        entries.add(ModItems.TINTED_UPGRADE_SMITHING_TEMPLATE);

                        entries.add(ModItems.NETHERITE_TINTED_HELMET);
                        entries.add(ModItems.DIAMOND_TINTED_HELMET);
                        entries.add(ModItems.GOLDEN_TINTED_HELMET);
                        entries.add(ModItems.CHAINMAIL_TINTED_HELMET);
                        entries.add(ModItems.IRON_TINTED_HELMET);
                        entries.add(ModItems.LEATHER_TINTED_HELMET);

                        entries.add(ModItems.GILDED_UPGRADE_SMITHING_TEMPLATE);

                        entries.add(ModItems.NETHERITE_GILDED_HELMET);
                        entries.add(ModItems.NETHERITE_GILDED_CHESTPLATE);
                        entries.add(ModItems.NETHERITE_GILDED_LEGGINGS);
                        entries.add(ModItems.NETHERITE_GILDED_BOOTS);

                        entries.add(ModItems.TURTLE_UPGRADE_SMITHING_TEMPLATE);

                        entries.add(ModItems.NETHERITE_TURTLE_HELMET);
                        entries.add(ModItems.NETHERITE_TURTLE_CHESTPLATE);
                        entries.add(ModItems.NETHERITE_TURTLE_LEGGINGS);
                        entries.add(ModItems.NETHERITE_TURTLE_BOOTS);

                        entries.add(ModItems.LEATHER_UPGRADE_SMITHING_TEMPLATE);

                        entries.add(ModItems.NETHERITE_LEATHERED_HELMET);
                        entries.add(ModItems.NETHERITE_LEATHERED_CHESTPLATE);
                        entries.add(ModItems.NETHERITE_LEATHERED_LEGGINGS);
                        entries.add(ModItems.NETHERITE_LEATHERED_BOOTS);

                        entries.add(ModItems.DIAMOND_LEATHERED_HELMET);
                        entries.add(ModItems.DIAMOND_LEATHERED_CHESTPLATE);
                        entries.add(ModItems.DIAMOND_LEATHERED_LEGGINGS);
                        entries.add(ModItems.DIAMOND_LEATHERED_BOOTS);

                        entries.add(ModItems.GOLDEN_LEATHERED_HELMET);
                        entries.add(ModItems.GOLDEN_LEATHERED_CHESTPLATE);
                        entries.add(ModItems.GOLDEN_LEATHERED_LEGGINGS);
                        entries.add(ModItems.GOLDEN_LEATHERED_BOOTS);

                        entries.add(ModItems.CHAINMAIL_LEATHERED_HELMET);
                        entries.add(ModItems.CHAINMAIL_LEATHERED_CHESTPLATE);
                        entries.add(ModItems.CHAINMAIL_LEATHERED_LEGGINGS);
                        entries.add(ModItems.CHAINMAIL_LEATHERED_BOOTS);

                        entries.add(ModItems.IRON_LEATHERED_HELMET);
                        entries.add(ModItems.IRON_LEATHERED_CHESTPLATE);
                        entries.add(ModItems.IRON_LEATHERED_LEGGINGS);
                        entries.add(ModItems.IRON_LEATHERED_BOOTS);
                    }).build());

    public static void registerItemGroup() {
        CoolArmor.LOGGER.info("Registering Item Group for " + CoolArmor.MOD_ID);
    }
}
