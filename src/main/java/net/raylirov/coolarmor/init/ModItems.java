package net.raylirov.coolarmor.init;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.armor.*;
import net.raylirov.coolarmor.item.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CoolArmor.MOD_ID);

    /*
    ARMOR
    */
    public static final RegistryObject<Item> NETHERITE_GILDED_HELMET = ITEMS.register("netherite_gilded_helmet",
            () -> new ModArmorItem(ModArmorMaterials.NETHERITE_GILDED, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_GILDED_CHESTPLATE = ITEMS.register("netherite_gilded_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.NETHERITE_GILDED, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_GILDED_LEGGINGS = ITEMS.register("netherite_gilded_leggings",
            () -> new ModArmorItem(ModArmorMaterials.NETHERITE_GILDED, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_GILDED_BOOTS = ITEMS.register("netherite_gilded_boots",
            () -> new ModArmorItem(ModArmorMaterials.NETHERITE_GILDED, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> NETHERITE_TURTLE_HELMET = ITEMS.register("netherite_turtle_helmet",
            () -> new ModArmorItem(ModArmorMaterials.NETHERITE_TURTLE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_TURTLE_CHESTPLATE = ITEMS.register("netherite_turtle_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.NETHERITE_TURTLE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_TURTLE_LEGGINGS = ITEMS.register("netherite_turtle_leggings",
            () -> new ModArmorItem(ModArmorMaterials.NETHERITE_TURTLE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_TURTLE_BOOTS = ITEMS.register("netherite_turtle_boots",
            () -> new ModArmorItem(ModArmorMaterials.NETHERITE_TURTLE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> NETHERITE_LEATHERED_HELMET = ITEMS.register("netherite_leathered_helmet",
            () -> new LeatheredArmorItem(ModArmorMaterials.NETHERITE_LEATHERED, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_LEATHERED_CHESTPLATE = ITEMS.register("netherite_leathered_chestplate",
            () -> new LeatheredArmorItem(ModArmorMaterials.NETHERITE_LEATHERED, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_LEATHERED_LEGGINGS = ITEMS.register("netherite_leathered_leggings",
            () -> new LeatheredArmorItem(ModArmorMaterials.NETHERITE_LEATHERED, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_LEATHERED_BOOTS = ITEMS.register("netherite_leathered_boots",
            () -> new LeatheredArmorItem(ModArmorMaterials.NETHERITE_LEATHERED, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> DIAMOND_LEATHERED_HELMET = ITEMS.register("diamond_leathered_helmet",
            () -> new LeatheredArmorItem(ModArmorMaterials.DIAMOND_LEATHERED, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_LEATHERED_CHESTPLATE = ITEMS.register("diamond_leathered_chestplate",
            () -> new LeatheredArmorItem(ModArmorMaterials.DIAMOND_LEATHERED, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_LEATHERED_LEGGINGS = ITEMS.register("diamond_leathered_leggings",
            () -> new LeatheredArmorItem(ModArmorMaterials.DIAMOND_LEATHERED, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_LEATHERED_BOOTS = ITEMS.register("diamond_leathered_boots",
            () -> new LeatheredArmorItem(ModArmorMaterials.DIAMOND_LEATHERED, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> GOLDEN_LEATHERED_HELMET = ITEMS.register("golden_leathered_helmet",
            () -> new LeatheredArmorItem(ModArmorMaterials.GOLDEN_LEATHERED, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_LEATHERED_CHESTPLATE = ITEMS.register("golden_leathered_chestplate",
            () -> new LeatheredArmorItem(ModArmorMaterials.GOLDEN_LEATHERED, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_LEATHERED_LEGGINGS = ITEMS.register("golden_leathered_leggings",
            () -> new LeatheredArmorItem(ModArmorMaterials.GOLDEN_LEATHERED, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_LEATHERED_BOOTS = ITEMS.register("golden_leathered_boots",
            () -> new LeatheredArmorItem(ModArmorMaterials.GOLDEN_LEATHERED, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CHAINMAIL_LEATHERED_HELMET = ITEMS.register("chainmail_leathered_helmet",
            () -> new LeatheredArmorItem(ModArmorMaterials.CHAINMAIL_LEATHERED, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CHAINMAIL_LEATHERED_CHESTPLATE = ITEMS.register("chainmail_leathered_chestplate",
            () -> new LeatheredArmorItem(ModArmorMaterials.CHAINMAIL_LEATHERED, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CHAINMAIL_LEATHERED_LEGGINGS = ITEMS.register("chainmail_leathered_leggings",
            () -> new LeatheredArmorItem(ModArmorMaterials.CHAINMAIL_LEATHERED, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CHAINMAIL_LEATHERED_BOOTS = ITEMS.register("chainmail_leathered_boots",
            () -> new LeatheredArmorItem(ModArmorMaterials.CHAINMAIL_LEATHERED, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> IRON_LEATHERED_HELMET = ITEMS.register("iron_leathered_helmet",
            () -> new LeatheredArmorItem(ModArmorMaterials.IRON_LEATHERED, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> IRON_LEATHERED_CHESTPLATE = ITEMS.register("iron_leathered_chestplate",
            () -> new LeatheredArmorItem(ModArmorMaterials.IRON_LEATHERED, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> IRON_LEATHERED_LEGGINGS = ITEMS.register("iron_leathered_leggings",
            () -> new LeatheredArmorItem(ModArmorMaterials.IRON_LEATHERED, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> IRON_LEATHERED_BOOTS = ITEMS.register("iron_leathered_boots",
            () -> new LeatheredArmorItem(ModArmorMaterials.IRON_LEATHERED, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> NETHERITE_TINTED_HELMET = ITEMS.register("netherite_tinted_helmet",
            () -> new ModArmorItem(ModArmorMaterials.NETHERITE_TINTED, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> DIAMOND_TINTED_HELMET = ITEMS.register("diamond_tinted_helmet",
            () -> new ModArmorItem(ModArmorMaterials.DIAMOND_TINTED, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> GOLDEN_TINTED_HELMET = ITEMS.register("golden_tinted_helmet",
            () -> new ModArmorItem(ModArmorMaterials.GOLDEN_TINTED, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> CHAINMAIL_TINTED_HELMET = ITEMS.register("chainmail_tinted_helmet",
            () -> new ModArmorItem(ModArmorMaterials.CHAINMAIL_TINTED, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> IRON_TINTED_HELMET = ITEMS.register("iron_tinted_helmet",
            () -> new ModArmorItem(ModArmorMaterials.IRON_TINTED, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> LEATHER_TINTED_HELMET = ITEMS.register("leather_tinted_helmet",
            () -> new LeatheredArmorItem(ModArmorMaterials.LEATHER_TINTED, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> IRON_WOOLED_BOOTS = ITEMS.register("iron_wooled_boots",
            () -> new WooledArmorItem(ModArmorMaterials.IRON_WOOLED, ArmorItem.Type.BOOTS, new Item.Properties()));
    /*
    ARMOR
    */

    public static final RegistryObject<Item> LEATHER_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("leather_upgrade_smithing_template",
            LeatherSmithingTemplateItem::createUpgradeTemplate);
    public static final RegistryObject<Item> TURTLE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("turtle_upgrade_smithing_template",
            TurtleSmithingTemplateItem::createUpgradeTemplate);
    public static final RegistryObject<Item> GILDED_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("gilded_upgrade_smithing_template",
            GildedSmithingTemplateItem::createUpgradeTemplate);
    public static final RegistryObject<Item> WOOLED_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("wooled_upgrade_smithing_template",
            WooledSmithingTemplateItem::createUpgradeTemplate);
    public static final RegistryObject<Item> TINTED_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("tinted_upgrade_smithing_template",
            TintedSmithingTemplateItem::createUpgradeTemplate);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
