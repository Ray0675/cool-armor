package net.raylirov.coolarmor.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.armor.LeatheredArmorItem;
import net.raylirov.coolarmor.armor.ModArmorMaterials;
import net.raylirov.coolarmor.armor.WooledArmorItem;
import net.raylirov.coolarmor.items.*;

public class ModItems {

    public static final Item NETHERITE_GILDED_HELMET = registerItem("netherite_gilded_helmet",
            new ArmorItem(ModArmorMaterials.NETHERITE_GILDED, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_GILDED_CHESTPLATE = registerItem("netherite_gilded_chestplate",
            new ArmorItem(ModArmorMaterials.NETHERITE_GILDED, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_GILDED_LEGGINGS = registerItem("netherite_gilded_leggings",
            new ArmorItem(ModArmorMaterials.NETHERITE_GILDED, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_GILDED_BOOTS = registerItem("netherite_gilded_boots",
            new ArmorItem(ModArmorMaterials.NETHERITE_GILDED, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item NETHERITE_TURTLE_HELMET = registerItem("netherite_turtle_helmet",
            new ArmorItem(ModArmorMaterials.NETHERITE_TURTLE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_TURTLE_CHESTPLATE = registerItem("netherite_turtle_chestplate",
            new ArmorItem(ModArmorMaterials.NETHERITE_TURTLE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_TURTLE_LEGGINGS = registerItem("netherite_turtle_leggings",
            new ArmorItem(ModArmorMaterials.NETHERITE_TURTLE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_TURTLE_BOOTS = registerItem("netherite_turtle_boots",
            new ArmorItem(ModArmorMaterials.NETHERITE_TURTLE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item NETHERITE_LEATHERED_HELMET = registerItem("netherite_leathered_helmet",
            new LeatheredArmorItem(ModArmorMaterials.NETHERITE_LEATHERED, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_LEATHERED_CHESTPLATE = registerItem("netherite_leathered_chestplate",
            new LeatheredArmorItem(ModArmorMaterials.NETHERITE_LEATHERED, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_LEATHERED_LEGGINGS = registerItem("netherite_leathered_leggings",
            new LeatheredArmorItem(ModArmorMaterials.NETHERITE_LEATHERED, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_LEATHERED_BOOTS = registerItem("netherite_leathered_boots",
            new LeatheredArmorItem(ModArmorMaterials.NETHERITE_LEATHERED, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item DIAMOND_LEATHERED_HELMET = registerItem("diamond_leathered_helmet",
            new LeatheredArmorItem(ModArmorMaterials.DIAMOND_LEATHERED, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item DIAMOND_LEATHERED_CHESTPLATE = registerItem("diamond_leathered_chestplate",
            new LeatheredArmorItem(ModArmorMaterials.DIAMOND_LEATHERED, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item DIAMOND_LEATHERED_LEGGINGS = registerItem("diamond_leathered_leggings",
            new LeatheredArmorItem(ModArmorMaterials.DIAMOND_LEATHERED, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item DIAMOND_LEATHERED_BOOTS = registerItem("diamond_leathered_boots",
            new LeatheredArmorItem(ModArmorMaterials.DIAMOND_LEATHERED, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item GOLDEN_LEATHERED_HELMET = registerItem("golden_leathered_helmet",
            new LeatheredArmorItem(ModArmorMaterials.GOLDEN_LEATHERED, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item GOLDEN_LEATHERED_CHESTPLATE = registerItem("golden_leathered_chestplate",
            new LeatheredArmorItem(ModArmorMaterials.GOLDEN_LEATHERED, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item GOLDEN_LEATHERED_LEGGINGS = registerItem("golden_leathered_leggings",
            new LeatheredArmorItem(ModArmorMaterials.GOLDEN_LEATHERED, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item GOLDEN_LEATHERED_BOOTS = registerItem("golden_leathered_boots",
            new LeatheredArmorItem(ModArmorMaterials.GOLDEN_LEATHERED, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item CHAINMAIL_LEATHERED_HELMET = registerItem("chainmail_leathered_helmet",
            new LeatheredArmorItem(ModArmorMaterials.CHAINMAIL_LEATHERED, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item CHAINMAIL_LEATHERED_CHESTPLATE = registerItem("chainmail_leathered_chestplate",
            new LeatheredArmorItem(ModArmorMaterials.CHAINMAIL_LEATHERED, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item CHAINMAIL_LEATHERED_LEGGINGS = registerItem("chainmail_leathered_leggings",
            new LeatheredArmorItem(ModArmorMaterials.CHAINMAIL_LEATHERED, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item CHAINMAIL_LEATHERED_BOOTS = registerItem("chainmail_leathered_boots",
            new LeatheredArmorItem(ModArmorMaterials.CHAINMAIL_LEATHERED, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item IRON_LEATHERED_HELMET = registerItem("iron_leathered_helmet",
            new LeatheredArmorItem(ModArmorMaterials.IRON_LEATHERED, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item IRON_LEATHERED_CHESTPLATE = registerItem("iron_leathered_chestplate",
            new LeatheredArmorItem(ModArmorMaterials.IRON_LEATHERED, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item IRON_LEATHERED_LEGGINGS = registerItem("iron_leathered_leggings",
            new LeatheredArmorItem(ModArmorMaterials.IRON_LEATHERED, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item IRON_LEATHERED_BOOTS = registerItem("iron_leathered_boots",
            new LeatheredArmorItem(ModArmorMaterials.IRON_LEATHERED, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item NETHERITE_TINTED_HELMET = registerItem("netherite_tinted_helmet",
            new ArmorItem(ModArmorMaterials.NETHERITE_TINTED, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item DIAMOND_TINTED_HELMET = registerItem("diamond_tinted_helmet",
            new ArmorItem(ModArmorMaterials.DIAMOND_TINTED, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item GOLDEN_TINTED_HELMET = registerItem("golden_tinted_helmet",
            new ArmorItem(ModArmorMaterials.GOLDEN_TINTED, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item CHAINMAIL_TINTED_HELMET = registerItem("chainmail_tinted_helmet",
            new ArmorItem(ModArmorMaterials.CHAINMAIL_TINTED, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item IRON_TINTED_HELMET = registerItem("iron_tinted_helmet",
            new ArmorItem(ModArmorMaterials.IRON_TINTED, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item LEATHER_TINTED_HELMET = registerItem("leather_tinted_helmet",
            new LeatheredArmorItem(ModArmorMaterials.LEATHER_TINTED, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item IRON_WOOLED_BOOTS = registerItem("iron_wooled_boots",
            new WooledArmorItem(ModArmorMaterials.IRON_WOOLED, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    public static final Item GILDED_UPGRADE_SMITHING_TEMPLATE = registerItem("gilded_upgrade_smithing_template",
            GildedSmithingTemplateItem.createUpgradeTemplate());
    public static final Item TURTLE_UPGRADE_SMITHING_TEMPLATE = registerItem("turtle_upgrade_smithing_template",
            TurtleSmithingTemplateItem.createUpgradeTemplate());
    public static final Item LEATHER_UPGRADE_SMITHING_TEMPLATE = registerItem("leather_upgrade_smithing_template",
            LeatherSmithingTemplateItem.createUpgradeTemplate());
    public static final Item TINTED_UPGRADE_SMITHING_TEMPLATE = registerItem("tinted_upgrade_smithing_template",
            TintedSmithingTemplateItem.createUpgradeTemplate());
    public static final Item WOOLED_UPGRADE_SMITHING_TEMPLATE = registerItem("wooled_upgrade_smithing_template",
            WooledSmithingTemplateItem.createUpgradeTemplate());


    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(CoolArmor.MOD_ID, name), item);
    }

    public static void registerModItems(){
        CoolArmor.LOGGER.info("Registering Mod Items for " + CoolArmor.MOD_ID);
    }
}
