package net.raylirov.coolarmor.main.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.raylirov.coolarmor.CoolArmor;

public class CAItemGroup {

    public static final ItemGroup COOL_ARMOR_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CoolArmor.MOD_ID, CoolArmor.MOD_ID + "_tab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup." + CoolArmor.MOD_ID + "_tab"))
                    .icon(() -> new ItemStack(CAItems.NETHERITE_GILDED_HELMET)).entries((displayContext, entries) -> {

                        entries.add(CAItems.WOOLED_UPGRADE_SMITHING_TEMPLATE);

                        entries.add(CAItems.IRON_WOOLED_BOOTS);

                        entries.add(CAItems.TINTED_UPGRADE_SMITHING_TEMPLATE);

                        entries.add(CAItems.NETHERITE_TINTED_HELMET);
                        entries.add(CAItems.DIAMOND_TINTED_HELMET);
                        entries.add(CAItems.GOLDEN_TINTED_HELMET);
                        entries.add(CAItems.CHAINMAIL_TINTED_HELMET);
                        entries.add(CAItems.IRON_TINTED_HELMET);
                        entries.add(CAItems.LEATHER_TINTED_HELMET);

                        entries.add(CAItems.GILDED_UPGRADE_SMITHING_TEMPLATE);

                        entries.add(CAItems.NETHERITE_GILDED_HELMET);
                        entries.add(CAItems.NETHERITE_GILDED_CHESTPLATE);
                        entries.add(CAItems.NETHERITE_GILDED_LEGGINGS);
                        entries.add(CAItems.NETHERITE_GILDED_BOOTS);

                        entries.add(CAItems.TURTLE_UPGRADE_SMITHING_TEMPLATE);

                        entries.add(CAItems.NETHERITE_TURTLE_HELMET);
                        entries.add(CAItems.NETHERITE_TURTLE_CHESTPLATE);
                        entries.add(CAItems.NETHERITE_TURTLE_LEGGINGS);
                        entries.add(CAItems.NETHERITE_TURTLE_BOOTS);

                        entries.add(CAItems.LEATHER_UPGRADE_SMITHING_TEMPLATE);

                        entries.add(CAItems.NETHERITE_LEATHERED_HELMET);
                        entries.add(CAItems.NETHERITE_LEATHERED_CHESTPLATE);
                        entries.add(CAItems.NETHERITE_LEATHERED_LEGGINGS);
                        entries.add(CAItems.NETHERITE_LEATHERED_BOOTS);

                        entries.add(CAItems.DIAMOND_LEATHERED_HELMET);
                        entries.add(CAItems.DIAMOND_LEATHERED_CHESTPLATE);
                        entries.add(CAItems.DIAMOND_LEATHERED_LEGGINGS);
                        entries.add(CAItems.DIAMOND_LEATHERED_BOOTS);

                        entries.add(CAItems.GOLDEN_LEATHERED_HELMET);
                        entries.add(CAItems.GOLDEN_LEATHERED_CHESTPLATE);
                        entries.add(CAItems.GOLDEN_LEATHERED_LEGGINGS);
                        entries.add(CAItems.GOLDEN_LEATHERED_BOOTS);

                        entries.add(CAItems.CHAINMAIL_LEATHERED_HELMET);
                        entries.add(CAItems.CHAINMAIL_LEATHERED_CHESTPLATE);
                        entries.add(CAItems.CHAINMAIL_LEATHERED_LEGGINGS);
                        entries.add(CAItems.CHAINMAIL_LEATHERED_BOOTS);

                        entries.add(CAItems.IRON_LEATHERED_HELMET);
                        entries.add(CAItems.IRON_LEATHERED_CHESTPLATE);
                        entries.add(CAItems.IRON_LEATHERED_LEGGINGS);
                        entries.add(CAItems.IRON_LEATHERED_BOOTS);
                    }).build());

    public static void registerItemGroup() {
        CoolArmor.LOGGER.info("Registering Item Group for " + CoolArmor.MOD_ID);
    }
}
