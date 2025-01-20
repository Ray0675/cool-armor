package net.raylirov.coolarmor.main.init;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.raylirov.coolarmor.CoolArmor;
<<<<<<< Updated upstream:src/main/java/net/raylirov/coolarmor/main/init/ModItems.java
import net.raylirov.coolarmor.content.armor.*;
import net.raylirov.coolarmor.main.utils.ArmorHelper;

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
            () -> new EffectArmorItem(ModArmorMaterials.NETHERITE_TURTLE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_TURTLE_CHESTPLATE = ITEMS.register("netherite_turtle_chestplate",
            () -> new EffectArmorItem(ModArmorMaterials.NETHERITE_TURTLE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_TURTLE_LEGGINGS = ITEMS.register("netherite_turtle_leggings",
            () -> new EffectArmorItem(ModArmorMaterials.NETHERITE_TURTLE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_TURTLE_BOOTS = ITEMS.register("netherite_turtle_boots",
            () -> new EffectArmorItem(ModArmorMaterials.NETHERITE_TURTLE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));

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
=======
import net.raylirov.coolarmor.content.armor.LeatheredArmorItem;
import net.raylirov.coolarmor.content.armor.CAArmorMaterials;
import net.raylirov.coolarmor.content.armor.TurtleArmorItem;
import net.raylirov.coolarmor.content.armor.WooledArmorItem;
import net.raylirov.coolarmor.content.items.*;

public class CAItems {

    public static final Item NETHERITE_GILDED_HELMET = registerItem("netherite_gilded_helmet",
            new ArmorItem(CAArmorMaterials.NETHERITE_GILDED, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_GILDED_CHESTPLATE = registerItem("netherite_gilded_chestplate",
            new ArmorItem(CAArmorMaterials.NETHERITE_GILDED, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_GILDED_LEGGINGS = registerItem("netherite_gilded_leggings",
            new ArmorItem(CAArmorMaterials.NETHERITE_GILDED, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_GILDED_BOOTS = registerItem("netherite_gilded_boots",
            new ArmorItem(CAArmorMaterials.NETHERITE_GILDED, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item NETHERITE_TURTLE_HELMET = registerItem("netherite_turtle_helmet",
            new TurtleArmorItem(CAArmorMaterials.NETHERITE_TURTLE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_TURTLE_CHESTPLATE = registerItem("netherite_turtle_chestplate",
            new TurtleArmorItem(CAArmorMaterials.NETHERITE_TURTLE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_TURTLE_LEGGINGS = registerItem("netherite_turtle_leggings",
            new TurtleArmorItem(CAArmorMaterials.NETHERITE_TURTLE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_TURTLE_BOOTS = registerItem("netherite_turtle_boots",
            new TurtleArmorItem(CAArmorMaterials.NETHERITE_TURTLE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item NETHERITE_LEATHERED_HELMET = registerItem("netherite_leathered_helmet",
            new LeatheredArmorItem(CAArmorMaterials.NETHERITE_LEATHERED, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_LEATHERED_CHESTPLATE = registerItem("netherite_leathered_chestplate",
            new LeatheredArmorItem(CAArmorMaterials.NETHERITE_LEATHERED, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_LEATHERED_LEGGINGS = registerItem("netherite_leathered_leggings",
            new LeatheredArmorItem(CAArmorMaterials.NETHERITE_LEATHERED, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_LEATHERED_BOOTS = registerItem("netherite_leathered_boots",
            new LeatheredArmorItem(CAArmorMaterials.NETHERITE_LEATHERED, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item DIAMOND_LEATHERED_HELMET = registerItem("diamond_leathered_helmet",
            new LeatheredArmorItem(CAArmorMaterials.DIAMOND_LEATHERED, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item DIAMOND_LEATHERED_CHESTPLATE = registerItem("diamond_leathered_chestplate",
            new LeatheredArmorItem(CAArmorMaterials.DIAMOND_LEATHERED, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item DIAMOND_LEATHERED_LEGGINGS = registerItem("diamond_leathered_leggings",
            new LeatheredArmorItem(CAArmorMaterials.DIAMOND_LEATHERED, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item DIAMOND_LEATHERED_BOOTS = registerItem("diamond_leathered_boots",
            new LeatheredArmorItem(CAArmorMaterials.DIAMOND_LEATHERED, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item GOLDEN_LEATHERED_HELMET = registerItem("golden_leathered_helmet",
            new LeatheredArmorItem(CAArmorMaterials.GOLDEN_LEATHERED, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item GOLDEN_LEATHERED_CHESTPLATE = registerItem("golden_leathered_chestplate",
            new LeatheredArmorItem(CAArmorMaterials.GOLDEN_LEATHERED, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item GOLDEN_LEATHERED_LEGGINGS = registerItem("golden_leathered_leggings",
            new LeatheredArmorItem(CAArmorMaterials.GOLDEN_LEATHERED, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item GOLDEN_LEATHERED_BOOTS = registerItem("golden_leathered_boots",
            new LeatheredArmorItem(CAArmorMaterials.GOLDEN_LEATHERED, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item CHAINMAIL_LEATHERED_HELMET = registerItem("chainmail_leathered_helmet",
            new LeatheredArmorItem(CAArmorMaterials.CHAINMAIL_LEATHERED, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item CHAINMAIL_LEATHERED_CHESTPLATE = registerItem("chainmail_leathered_chestplate",
            new LeatheredArmorItem(CAArmorMaterials.CHAINMAIL_LEATHERED, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item CHAINMAIL_LEATHERED_LEGGINGS = registerItem("chainmail_leathered_leggings",
            new LeatheredArmorItem(CAArmorMaterials.CHAINMAIL_LEATHERED, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item CHAINMAIL_LEATHERED_BOOTS = registerItem("chainmail_leathered_boots",
            new LeatheredArmorItem(CAArmorMaterials.CHAINMAIL_LEATHERED, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item IRON_LEATHERED_HELMET = registerItem("iron_leathered_helmet",
            new LeatheredArmorItem(CAArmorMaterials.IRON_LEATHERED, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item IRON_LEATHERED_CHESTPLATE = registerItem("iron_leathered_chestplate",
            new LeatheredArmorItem(CAArmorMaterials.IRON_LEATHERED, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item IRON_LEATHERED_LEGGINGS = registerItem("iron_leathered_leggings",
            new LeatheredArmorItem(CAArmorMaterials.IRON_LEATHERED, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item IRON_LEATHERED_BOOTS = registerItem("iron_leathered_boots",
            new LeatheredArmorItem(CAArmorMaterials.IRON_LEATHERED, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item NETHERITE_TINTED_HELMET = registerItem("netherite_tinted_helmet",
            new ArmorItem(CAArmorMaterials.NETHERITE_TINTED, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item DIAMOND_TINTED_HELMET = registerItem("diamond_tinted_helmet",
            new ArmorItem(CAArmorMaterials.DIAMOND_TINTED, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item GOLDEN_TINTED_HELMET = registerItem("golden_tinted_helmet",
            new ArmorItem(CAArmorMaterials.GOLDEN_TINTED, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item CHAINMAIL_TINTED_HELMET = registerItem("chainmail_tinted_helmet",
            new ArmorItem(CAArmorMaterials.CHAINMAIL_TINTED, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item IRON_TINTED_HELMET = registerItem("iron_tinted_helmet",
            new ArmorItem(CAArmorMaterials.IRON_TINTED, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item LEATHER_TINTED_HELMET = registerItem("leather_tinted_helmet",
            new LeatheredArmorItem(CAArmorMaterials.LEATHER_TINTED, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item IRON_WOOLED_BOOTS = registerItem("iron_wooled_boots",
            new WooledArmorItem(CAArmorMaterials.IRON_WOOLED, ArmorItem.Type.BOOTS, new FabricItemSettings()));
>>>>>>> Stashed changes:src/main/java/net/raylirov/coolarmor/main/init/CAItems.java

    public static final RegistryObject<Item> LEATHER_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("leather_upgrade_smithing_template",
            () -> new SmithingTemplateItem(ArmorHelper.LEATHER_UPGRADE_APPLIES_TO,
                    ArmorHelper.LEATHER_UPGRADE_INGREDIENTS,
                    ArmorHelper.LEATHER_UPGRADE,
                    ArmorHelper.LEATHER_UPGRADE_BASE_SLOT_DESCRIPTION,
                    ArmorHelper.LEATHER_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                    ArmorHelper.createUpgradeFullArmorIconList(),
                    ArmorHelper.createLeatherUpgradeMaterialList()));

    public static final RegistryObject<Item> TURTLE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("turtle_upgrade_smithing_template",
            () -> new SmithingTemplateItem(ArmorHelper.TURTLE_UPGRADE_APPLIES_TO,
                    ArmorHelper.TURTLE_UPGRADE_INGREDIENTS,
                    ArmorHelper.TURTLE_UPGRADE,
                    ArmorHelper.TURTLE_UPGRADE_BASE_SLOT_DESCRIPTION,
                    ArmorHelper.TURTLE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                    ArmorHelper.createUpgradeFullArmorIconList(),
                    ArmorHelper.createTurtleUpgradeMaterialList()));

    public static final RegistryObject<Item> GILDED_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("gilded_upgrade_smithing_template",
            () -> new SmithingTemplateItem(ArmorHelper.GILDED_UPGRADE_APPLIES_TO,
                    ArmorHelper.GILDED_UPGRADE_INGREDIENTS,
                    ArmorHelper.GILDED_UPGRADE,
                    ArmorHelper.GILDED_UPGRADE_BASE_SLOT_DESCRIPTION,
                    ArmorHelper.GILDED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                    ArmorHelper.createUpgradeFullArmorIconList(),
                    ArmorHelper.createIngotUpgradeMaterialList()));

    public static final RegistryObject<Item> WOOLED_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("wooled_upgrade_smithing_template",
            () -> new SmithingTemplateItem(ArmorHelper.WOOLED_UPGRADE_APPLIES_TO,
                    ArmorHelper.WOOLED_UPGRADE_INGREDIENTS,
                    ArmorHelper.WOOLED_UPGRADE,
                    ArmorHelper.WOOLED_UPGRADE_BASE_SLOT_DESCRIPTION,
                    ArmorHelper.WOOLED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                    ArmorHelper.createUpgradeBootsIconList(),
                    ArmorHelper.createBlockUpgradeMaterialList()));

    public static final RegistryObject<Item> TINTED_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("tinted_upgrade_smithing_template",
            () -> new SmithingTemplateItem(ArmorHelper.TINTED_UPGRADE_APPLIES_TO,
                    ArmorHelper.TINTED_UPGRADE_INGREDIENTS,
                    ArmorHelper.TINTED_UPGRADE,
                    ArmorHelper.TINTED_UPGRADE_BASE_SLOT_DESCRIPTION,
                    ArmorHelper.TINTED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                    ArmorHelper.createUpgradeHelmetIconList(),
                    ArmorHelper.createAmethystUpgradeMaterialList()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
