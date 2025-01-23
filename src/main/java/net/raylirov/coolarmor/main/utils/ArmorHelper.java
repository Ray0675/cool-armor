package net.raylirov.coolarmor.main.utils;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.content.armor.CAArmorMaterials;

import java.util.Calendar;
import java.util.List;

public class ArmorHelper {

    public static List<ArmorMaterial> tintedHelmetMaterials = List.of(CAArmorMaterials.NETHERITE_TINTED, CAArmorMaterials.DIAMOND_TINTED, CAArmorMaterials.GOLDEN_TINTED, CAArmorMaterials.CHAINMAIL_TINTED, CAArmorMaterials.IRON_TINTED, CAArmorMaterials.LEATHER_TINTED);
    public static List<ArmorMaterial> leatherBootsMaterials = List.of(CAArmorMaterials.NETHERITE_LEATHERED, CAArmorMaterials.DIAMOND_LEATHERED, CAArmorMaterials.GOLDEN_LEATHERED, CAArmorMaterials.CHAINMAIL_LEATHERED, CAArmorMaterials.IRON_LEATHERED, ArmorMaterials.LEATHER);
    public static List<ArmorMaterial> goldenArmorMaterials = List.of(CAArmorMaterials.NETHERITE_GILDED, CAArmorMaterials.GOLDEN_TINTED, CAArmorMaterials.GOLDEN_LEATHERED);

    public static List<ArmorMaterial> modelGenTintedHelmetMaterials = List.of(CAArmorMaterials.NETHERITE_TINTED, CAArmorMaterials.DIAMOND_TINTED, CAArmorMaterials.GOLDEN_TINTED, CAArmorMaterials.CHAINMAIL_TINTED, CAArmorMaterials.IRON_TINTED);
    public static List<ArmorMaterial> modelGenLeatherArmorMaterials = List.of(CAArmorMaterials.NETHERITE_LEATHERED, CAArmorMaterials.DIAMOND_LEATHERED, CAArmorMaterials.GOLDEN_LEATHERED, CAArmorMaterials.CHAINMAIL_LEATHERED, CAArmorMaterials.IRON_LEATHERED, CAArmorMaterials.LEATHER_TINTED);

    private static final ChatFormatting DESCRIPTION_FORMAT = ChatFormatting.BLUE;
    private static final ChatFormatting TITLE_FORMAT = ChatFormatting.GRAY;

    public static final Component LEATHER_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.leather_upgrade.base_slot_description");
    public static final Component TURTLE_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.turtle_upgrade.base_slot_description");
    public static final Component GILDED_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.gilded_upgrade.base_slot_description");
    public static final Component WOOLED_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.wooled_upgrade.base_slot_description");
    public static final Component TINTED_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.tinted_upgrade.base_slot_description");

    public static final Component LEATHER_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.leather_upgrade.additions_slot_description");
    public static final Component TURTLE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.turtle_upgrade.additions_slot_description");
    public static final Component GILDED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.gilded_upgrade.additions_slot_description");
    public static final Component WOOLED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.wooled_upgrade.additions_slot_description");
    public static final Component TINTED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.tinted_upgrade.additions_slot_description");

    public static final Component LEATHER_UPGRADE = Component.translatable("upgrade." + CoolArmor.MOD_ID + ".leather_upgrade").withStyle(TITLE_FORMAT);
    public static final Component TURTLE_UPGRADE = Component.translatable("upgrade." + CoolArmor.MOD_ID + ".turtle_upgrade").withStyle(TITLE_FORMAT);
    public static final Component GILDED_UPGRADE = Component.translatable("upgrade." + CoolArmor.MOD_ID + ".gilded_upgrade").withStyle(TITLE_FORMAT);
    public static final Component WOOLED_UPGRADE = Component.translatable("upgrade." + CoolArmor.MOD_ID + ".wooled_upgrade").withStyle(TITLE_FORMAT);
    public static final Component TINTED_UPGRADE = Component.translatable("upgrade." + CoolArmor.MOD_ID + ".tinted_upgrade").withStyle(TITLE_FORMAT);

    public static final Component LEATHER_UPGRADE_APPLIES_TO = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.leather_upgrade.applies_to").withStyle(DESCRIPTION_FORMAT);
    public static final Component TURTLE_UPGRADE_APPLIES_TO = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.turtle_upgrade.applies_to").withStyle(DESCRIPTION_FORMAT);
    public static final Component GILDED_UPGRADE_APPLIES_TO = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.gilded_upgrade.applies_to").withStyle(DESCRIPTION_FORMAT);
    public static final Component WOOLED_UPGRADE_APPLIES_TO = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.wooled_upgrade.applies_to").withStyle(DESCRIPTION_FORMAT);
    public static final Component TINTED_UPGRADE_APPLIES_TO = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.tinted_upgrade.applies_to").withStyle(DESCRIPTION_FORMAT);

    public static final Component LEATHER_UPGRADE_INGREDIENTS = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.leather_upgrade.ingredients").withStyle(DESCRIPTION_FORMAT);
    public static final Component TURTLE_UPGRADE_INGREDIENTS = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.turtle_upgrade.ingredients").withStyle(DESCRIPTION_FORMAT);
    public static final Component GILDED_UPGRADE_INGREDIENTS = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.gilded_upgrade.ingredients").withStyle(DESCRIPTION_FORMAT);
    public static final Component WOOLED_UPGRADE_INGREDIENTS = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.wooled_upgrade.ingredients").withStyle(DESCRIPTION_FORMAT);
    public static final Component TINTED_UPGRADE_INGREDIENTS = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.tinted_upgrade.ingredients").withStyle(DESCRIPTION_FORMAT);

    public static final ResourceLocation EMPTY_SLOT_HELMET = new ResourceLocation("item/empty_armor_slot_helmet");
    public static final ResourceLocation EMPTY_SLOT_CHESTPLATE = new ResourceLocation("item/empty_armor_slot_chestplate");
    public static final ResourceLocation EMPTY_SLOT_LEGGINGS = new ResourceLocation("item/empty_armor_slot_leggings");
    public static final ResourceLocation EMPTY_SLOT_BOOTS = new ResourceLocation("item/empty_armor_slot_boots");

    public static final ResourceLocation EMPTY_SLOT_LEATHER = new ResourceLocation(CoolArmor.MOD_ID,"item/empty_slot_leather");
    public static final ResourceLocation EMPTY_SLOT_AMETHYST_SHARD = new ResourceLocation(CoolArmor.MOD_ID, "item/empty_slot_amethyst_shard");
    public static final ResourceLocation EMPTY_SLOT_SCUTE = new ResourceLocation(CoolArmor.MOD_ID, "item/empty_slot_scute");
    public static final ResourceLocation EMPTY_SLOT_BLOCK = new ResourceLocation(CoolArmor.MOD_ID,"item/empty_slot_block");
    private static final ResourceLocation EMPTY_SLOT_INGOT = new ResourceLocation("item/empty_slot_ingot");

    public static final List<ResourceLocation> createUpgradeFullArmorIconList = List.of(EMPTY_SLOT_HELMET, EMPTY_SLOT_CHESTPLATE, EMPTY_SLOT_LEGGINGS, EMPTY_SLOT_BOOTS);
    public static final List<ResourceLocation> createUpgradeHelmetIconList = List.of(EMPTY_SLOT_HELMET);
    public static final List<ResourceLocation> createUpgradeBootsIconList = List.of(EMPTY_SLOT_BOOTS);
    public static final List<ResourceLocation> createLeatherUpgradeMaterialList = List.of(EMPTY_SLOT_LEATHER);
    public static final List<ResourceLocation> createIngotUpgradeMaterialList = List.of(EMPTY_SLOT_INGOT);
    public static final List<ResourceLocation> createTurtleUpgradeMaterialList = List.of(EMPTY_SLOT_SCUTE, EMPTY_SLOT_HELMET);
    public static final List<ResourceLocation> createBlockUpgradeMaterialList = List.of(EMPTY_SLOT_BLOCK);
    public static final List<ResourceLocation> createAmethystUpgradeMaterialList = List.of(EMPTY_SLOT_AMETHYST_SHARD);

    public static boolean currentMonth = false;
    public static boolean summer = false;
    public static boolean halloween = false;
    public static boolean xmas = false;
    public static byte cntCheckCurrentMonth = 0;
    public static byte cntCheckSummer = 0;
    public static byte cntCheckHalloween = 0;
    public static byte cntCheckXmas = 0;

    public static boolean trimArmor(ArmorItem armorItem) {
        return isOneOfArmor(armorItem, modelGenLeatherArmorMaterials) ||
                isNeededArmorPiece(armorItem, CAArmorMaterials.IRON_WOOLED) ||
                isOneOfArmor(armorItem, modelGenTintedHelmetMaterials);
    }

    public static boolean isNeededFullArmor(LivingEntity entity, ArmorMaterial material) {
        if (entity == null) return false;

        Iterable<ItemStack> iterable = entity.getArmorSlots();

        for (ItemStack itemStack : iterable) {
            Item item = itemStack.getItem();

            if (!(item instanceof ArmorItem) || ((ArmorItem) item).getMaterial() != material) {
                return false;
            }
        }

        return true;
    }

    public static boolean isOneOfArmor(Item item, List<ArmorMaterial> materials) {
        if (item instanceof ArmorItem armor) {
            ArmorMaterial material = armor.getMaterial();
            for (ArmorMaterial mat : materials) {
                if (material == mat) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isNeededArmorPiece(Item item, ArmorMaterial material) {
        return item instanceof ArmorItem armor && armor.getMaterial() == material;
    }

    public static boolean getCurrentMonth() {
        if (currentMonth) {
            return true;
        } else if (cntCheckCurrentMonth >= 1) {
            return false;
        }

        Calendar calendar = Calendar.getInstance();

        byte[] monthMass = {6, 10, 11, 12};

        for (byte month = 0; month < 4; month++) {
            if (calendar.get(Calendar.MONTH) + 1 == monthMass[month]) {
                currentMonth = true;
                break;
            }
        }

        cntCheckCurrentMonth++;
        return currentMonth;
    }

    public static boolean summer() {
        if (summer) {
            return true;
        } else if (cntCheckSummer >= 1) {
            return false;
        }

        Calendar calendar = Calendar.getInstance();

        if (calendar.get(Calendar.MONTH) + 1 == 6) {
            summer = true;
        }

        cntCheckSummer++;
        return summer;
    }

    public static boolean halloween() {
        if (halloween) {
            return true;
        } else if (cntCheckHalloween >= 1) {
            return false;
        }

        Calendar calendar = Calendar.getInstance();
        if ((calendar.get(Calendar.MONTH) + 1 == 10 && calendar.get(Calendar.DATE) >= 30) || (calendar.get(Calendar.MONTH) + 1 == 11 && calendar.get(Calendar.DATE) == 1)) {
            halloween = true;
        }

        cntCheckHalloween++;
        return halloween;
    }

    public static boolean xmas() {
        if (xmas) {
            return true;
        } else if (cntCheckXmas >= 1) {
            return false;
        }

        Calendar calendar = Calendar.getInstance();
        if (calendar.get(Calendar.MONTH) + 1 == 12 && calendar.get(Calendar.DATE) >= 24 && calendar.get(Calendar.DATE) <= 26) {
            xmas = true;
        }

        cntCheckXmas++;
        return xmas;
    }

}