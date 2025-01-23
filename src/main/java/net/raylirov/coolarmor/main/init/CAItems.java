package net.raylirov.coolarmor.main.init;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.content.armor.*;
import net.raylirov.coolarmor.main.utils.ArmorHelper;

public class CAItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CoolArmor.MOD_ID);

    /*
    ARMOR
    */
    public static final RegistryObject<Item> NETHERITE_GILDED_HELMET = ITEMS.register("netherite_gilded_helmet",
            () -> new CAArmorItem(CAArmorMaterials.NETHERITE_GILDED, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_GILDED_CHESTPLATE = ITEMS.register("netherite_gilded_chestplate",
            () -> new CAArmorItem(CAArmorMaterials.NETHERITE_GILDED, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_GILDED_LEGGINGS = ITEMS.register("netherite_gilded_leggings",
            () -> new CAArmorItem(CAArmorMaterials.NETHERITE_GILDED, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_GILDED_BOOTS = ITEMS.register("netherite_gilded_boots",
            () -> new CAArmorItem(CAArmorMaterials.NETHERITE_GILDED, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> NETHERITE_TURTLE_HELMET = ITEMS.register("netherite_turtle_helmet",
            () -> new TurtleArmorItem(CAArmorMaterials.NETHERITE_TURTLE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_TURTLE_CHESTPLATE = ITEMS.register("netherite_turtle_chestplate",
            () -> new TurtleArmorItem(CAArmorMaterials.NETHERITE_TURTLE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_TURTLE_LEGGINGS = ITEMS.register("netherite_turtle_leggings",
            () -> new TurtleArmorItem(CAArmorMaterials.NETHERITE_TURTLE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_TURTLE_BOOTS = ITEMS.register("netherite_turtle_boots",
            () -> new TurtleArmorItem(CAArmorMaterials.NETHERITE_TURTLE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> NETHERITE_LEATHERED_HELMET = ITEMS.register("netherite_leathered_helmet",
            () -> new LeatheredArmorItem(CAArmorMaterials.NETHERITE_LEATHERED, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_LEATHERED_CHESTPLATE = ITEMS.register("netherite_leathered_chestplate",
            () -> new LeatheredArmorItem(CAArmorMaterials.NETHERITE_LEATHERED, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_LEATHERED_LEGGINGS = ITEMS.register("netherite_leathered_leggings",
            () -> new LeatheredArmorItem(CAArmorMaterials.NETHERITE_LEATHERED, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_LEATHERED_BOOTS = ITEMS.register("netherite_leathered_boots",
            () -> new LeatheredArmorItem(CAArmorMaterials.NETHERITE_LEATHERED, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> DIAMOND_LEATHERED_HELMET = ITEMS.register("diamond_leathered_helmet",
            () -> new LeatheredArmorItem(CAArmorMaterials.DIAMOND_LEATHERED, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_LEATHERED_CHESTPLATE = ITEMS.register("diamond_leathered_chestplate",
            () -> new LeatheredArmorItem(CAArmorMaterials.DIAMOND_LEATHERED, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_LEATHERED_LEGGINGS = ITEMS.register("diamond_leathered_leggings",
            () -> new LeatheredArmorItem(CAArmorMaterials.DIAMOND_LEATHERED, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_LEATHERED_BOOTS = ITEMS.register("diamond_leathered_boots",
            () -> new LeatheredArmorItem(CAArmorMaterials.DIAMOND_LEATHERED, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> GOLDEN_LEATHERED_HELMET = ITEMS.register("golden_leathered_helmet",
            () -> new LeatheredArmorItem(CAArmorMaterials.GOLDEN_LEATHERED, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_LEATHERED_CHESTPLATE = ITEMS.register("golden_leathered_chestplate",
            () -> new LeatheredArmorItem(CAArmorMaterials.GOLDEN_LEATHERED, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_LEATHERED_LEGGINGS = ITEMS.register("golden_leathered_leggings",
            () -> new LeatheredArmorItem(CAArmorMaterials.GOLDEN_LEATHERED, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_LEATHERED_BOOTS = ITEMS.register("golden_leathered_boots",
            () -> new LeatheredArmorItem(CAArmorMaterials.GOLDEN_LEATHERED, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CHAINMAIL_LEATHERED_HELMET = ITEMS.register("chainmail_leathered_helmet",
            () -> new LeatheredArmorItem(CAArmorMaterials.CHAINMAIL_LEATHERED, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CHAINMAIL_LEATHERED_CHESTPLATE = ITEMS.register("chainmail_leathered_chestplate",
            () -> new LeatheredArmorItem(CAArmorMaterials.CHAINMAIL_LEATHERED, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CHAINMAIL_LEATHERED_LEGGINGS = ITEMS.register("chainmail_leathered_leggings",
            () -> new LeatheredArmorItem(CAArmorMaterials.CHAINMAIL_LEATHERED, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CHAINMAIL_LEATHERED_BOOTS = ITEMS.register("chainmail_leathered_boots",
            () -> new LeatheredArmorItem(CAArmorMaterials.CHAINMAIL_LEATHERED, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> IRON_LEATHERED_HELMET = ITEMS.register("iron_leathered_helmet",
            () -> new LeatheredArmorItem(CAArmorMaterials.IRON_LEATHERED, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> IRON_LEATHERED_CHESTPLATE = ITEMS.register("iron_leathered_chestplate",
            () -> new LeatheredArmorItem(CAArmorMaterials.IRON_LEATHERED, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> IRON_LEATHERED_LEGGINGS = ITEMS.register("iron_leathered_leggings",
            () -> new LeatheredArmorItem(CAArmorMaterials.IRON_LEATHERED, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> IRON_LEATHERED_BOOTS = ITEMS.register("iron_leathered_boots",
            () -> new LeatheredArmorItem(CAArmorMaterials.IRON_LEATHERED, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> NETHERITE_TINTED_HELMET = ITEMS.register("netherite_tinted_helmet",
            () -> new CAArmorItem(CAArmorMaterials.NETHERITE_TINTED, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> DIAMOND_TINTED_HELMET = ITEMS.register("diamond_tinted_helmet",
            () -> new CAArmorItem(CAArmorMaterials.DIAMOND_TINTED, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> GOLDEN_TINTED_HELMET = ITEMS.register("golden_tinted_helmet",
            () -> new CAArmorItem(CAArmorMaterials.GOLDEN_TINTED, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> CHAINMAIL_TINTED_HELMET = ITEMS.register("chainmail_tinted_helmet",
            () -> new CAArmorItem(CAArmorMaterials.CHAINMAIL_TINTED, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> IRON_TINTED_HELMET = ITEMS.register("iron_tinted_helmet",
            () -> new CAArmorItem(CAArmorMaterials.IRON_TINTED, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> LEATHER_TINTED_HELMET = ITEMS.register("leather_tinted_helmet",
            () -> new LeatheredArmorItem(CAArmorMaterials.LEATHER_TINTED, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> IRON_WOOLED_BOOTS = ITEMS.register("iron_wooled_boots",
            () -> new WooledArmorItem(CAArmorMaterials.IRON_WOOLED, ArmorItem.Type.BOOTS, new Item.Properties()));
    /*
    ARMOR
    */

    public static final RegistryObject<Item> LEATHER_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("leather_upgrade_smithing_template",
            () -> new SmithingTemplateItem(ArmorHelper.LEATHER_UPGRADE_APPLIES_TO,
                    ArmorHelper.LEATHER_UPGRADE_INGREDIENTS,
                    ArmorHelper.LEATHER_UPGRADE,
                    ArmorHelper.LEATHER_UPGRADE_BASE_SLOT_DESCRIPTION,
                    ArmorHelper.LEATHER_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                    ArmorHelper.createUpgradeFullArmorIconList,
                    ArmorHelper.createLeatherUpgradeMaterialList));

    public static final RegistryObject<Item> TURTLE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("turtle_upgrade_smithing_template",
            () -> new SmithingTemplateItem(ArmorHelper.TURTLE_UPGRADE_APPLIES_TO,
                    ArmorHelper.TURTLE_UPGRADE_INGREDIENTS,
                    ArmorHelper.TURTLE_UPGRADE,
                    ArmorHelper.TURTLE_UPGRADE_BASE_SLOT_DESCRIPTION,
                    ArmorHelper.TURTLE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                    ArmorHelper.createUpgradeFullArmorIconList,
                    ArmorHelper.createTurtleUpgradeMaterialList));

    public static final RegistryObject<Item> GILDED_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("gilded_upgrade_smithing_template",
            () -> new SmithingTemplateItem(ArmorHelper.GILDED_UPGRADE_APPLIES_TO,
                    ArmorHelper.GILDED_UPGRADE_INGREDIENTS,
                    ArmorHelper.GILDED_UPGRADE,
                    ArmorHelper.GILDED_UPGRADE_BASE_SLOT_DESCRIPTION,
                    ArmorHelper.GILDED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                    ArmorHelper.createUpgradeFullArmorIconList,
                    ArmorHelper.createIngotUpgradeMaterialList));

    public static final RegistryObject<Item> WOOLED_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("wooled_upgrade_smithing_template",
            () -> new SmithingTemplateItem(ArmorHelper.WOOLED_UPGRADE_APPLIES_TO,
                    ArmorHelper.WOOLED_UPGRADE_INGREDIENTS,
                    ArmorHelper.WOOLED_UPGRADE,
                    ArmorHelper.WOOLED_UPGRADE_BASE_SLOT_DESCRIPTION,
                    ArmorHelper.WOOLED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                    ArmorHelper.createUpgradeBootsIconList,
                    ArmorHelper.createBlockUpgradeMaterialList));

    public static final RegistryObject<Item> TINTED_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("tinted_upgrade_smithing_template",
            () -> new SmithingTemplateItem(ArmorHelper.TINTED_UPGRADE_APPLIES_TO,
                    ArmorHelper.TINTED_UPGRADE_INGREDIENTS,
                    ArmorHelper.TINTED_UPGRADE,
                    ArmorHelper.TINTED_UPGRADE_BASE_SLOT_DESCRIPTION,
                    ArmorHelper.TINTED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                    ArmorHelper.createUpgradeHelmetIconList,
                    ArmorHelper.createAmethystUpgradeMaterialList));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
