package net.raylirov.coolarmor.main.utils;

<<<<<<< Updated upstream
import net.minecraft.ChatFormatting;
import net.minecraft.advancements.critereon.*;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.content.armor.ModArmorMaterials;
import net.raylirov.coolarmor.main.init.ModItems;
=======
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.raylirov.coolarmor.content.armor.CAArmorMaterials;

import java.util.Iterator;
>>>>>>> Stashed changes

import java.util.Calendar;
import java.util.List;

public class ArmorHelper {

    public static boolean currentMonth = false;
    public static boolean summer = false;
    public static boolean halloween = false;
    public static boolean xmas = false;
    public static byte cntCheckCurrentMonth = 0;
    public static byte cntCheckSummer = 0;
    public static byte cntCheckHalloween = 0;
    public static byte cntCheckXmas = 0;

    public static boolean getCurrentMonth(){
        if (currentMonth) {
            return true;
        } else if (cntCheckCurrentMonth >= 1) {
            return false;
        }

        Calendar calendar = Calendar.getInstance();

        byte[] monthMass = {6, 10, 11, 12};

        for(byte month = 0; month < 4; month++) {
            if (calendar.get(Calendar.MONTH) + 1 == monthMass[month]) {
                currentMonth = true;
                break;
            }
        }

        cntCheckCurrentMonth++;
        return currentMonth;
    }

<<<<<<< Updated upstream
    public static boolean summer(){
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


    public static boolean isWearingAnyTintedHelmet(ItemStack item){
        return item.is(ModItems.NETHERITE_TINTED_HELMET.get()) ||
                item.is(ModItems.DIAMOND_TINTED_HELMET.get()) ||
                item.is(ModItems.GOLDEN_TINTED_HELMET.get()) ||
                item.is(ModItems.CHAINMAIL_TINTED_HELMET.get()) ||
                item.is(ModItems.IRON_TINTED_HELMET.get()) ||
                item.is(ModItems.LEATHER_TINTED_HELMET.get());
    }

    public static boolean isWearingNeededBoots(ItemStack onEntity, Item boots) {
        return onEntity.is(boots);
    }

    public static boolean inFullTurtleArmor(LivingEntity entity) {
        ItemStack chestplate = entity.getItemBySlot(EquipmentSlot.CHEST);
        ItemStack leggings = entity.getItemBySlot(EquipmentSlot.LEGS);
        ItemStack boots = entity.getItemBySlot(EquipmentSlot.FEET);

        return chestplate.is(ModItems.NETHERITE_TURTLE_CHESTPLATE.get())
                && leggings.is(ModItems.NETHERITE_TURTLE_LEGGINGS.get())
                && boots.is(ModItems.NETHERITE_TURTLE_BOOTS.get());
    }

    // For IF in ModelGen
    public static boolean trimArmorAnyTintedHelmet(RegistryObject<Item> itemRegistryObject){
        if (itemRegistryObject.get() instanceof ArmorItem armorItem){
            return armorItem.getMaterial() == ModArmorMaterials.NETHERITE_TINTED ||
                    armorItem.getMaterial() == ModArmorMaterials.DIAMOND_TINTED ||
                    armorItem.getMaterial() == ModArmorMaterials.GOLDEN_TINTED ||
                    armorItem.getMaterial() == ModArmorMaterials.CHAINMAIL_TINTED ||
                    armorItem.getMaterial() == ModArmorMaterials.IRON_TINTED;
        }
        return false;
    }
    public static boolean trimArmorAnyLeatherArmor(RegistryObject<Item> itemRegistryObject){
        if (itemRegistryObject.get() instanceof ArmorItem armorItem){
            return armorItem.getMaterial() == ModArmorMaterials.NETHERITE_LEATHERED ||
                    armorItem.getMaterial() == ModArmorMaterials.DIAMOND_LEATHERED ||
                    armorItem.getMaterial() == ModArmorMaterials.GOLDEN_LEATHERED ||
                    armorItem.getMaterial() == ModArmorMaterials.CHAINMAIL_LEATHERED ||
                    armorItem.getMaterial() == ModArmorMaterials.IRON_LEATHERED ||
                    armorItem.getMaterial() == ModArmorMaterials.LEATHER_TINTED;
        }
        return false;
    }

    public static boolean trimArmorAnyWooledArmor(RegistryObject<Item> itemRegistryObject){
        if (itemRegistryObject.get() instanceof ArmorItem armorItem){
            return armorItem.getMaterial() == ModArmorMaterials.IRON_WOOLED;
        }
        return false;

    }
    // For IF in ModelGen

    // For LeatheredArmorItem
    public static boolean anyLeatheredBoots(ItemStack stack){
        return stack.is(ModItems.NETHERITE_LEATHERED_BOOTS.get()) ||
                stack.is(ModItems.GOLDEN_LEATHERED_BOOTS.get()) ||
                stack.is(ModItems.CHAINMAIL_LEATHERED_BOOTS.get()) ||
                stack.is(ModItems.DIAMOND_LEATHERED_BOOTS.get()) ||
                stack.is(ModItems.IRON_LEATHERED_BOOTS.get());
    }
    // For LeatheredArmorItem


    // For advancements
    public static InventoryChangeTrigger.TriggerInstance hasNetheriteTurtleArmor() {
        return InventoryChangeTrigger.TriggerInstance.hasItems(
                ModItems.NETHERITE_TURTLE_HELMET.get(),
                ModItems.NETHERITE_TURTLE_CHESTPLATE.get(),
                ModItems.NETHERITE_TURTLE_LEGGINGS.get(),
                ModItems.NETHERITE_TURTLE_BOOTS.get());
    }

    public static InventoryChangeTrigger.TriggerInstance hasNetheriteGildedArmor() {
        return InventoryChangeTrigger.TriggerInstance.hasItems(
                ModItems.NETHERITE_GILDED_HELMET.get(),
                ModItems.NETHERITE_GILDED_CHESTPLATE.get(),
                ModItems.NETHERITE_GILDED_LEGGINGS.get(),
                ModItems.NETHERITE_GILDED_BOOTS.get());
=======
    public static boolean isWearingAnyTintedHelmet(PlayerEntity wearer) {
        if (wearer == null) return false;
        if (!(wearer.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof ArmorItem armorItem)) return false;
        return armorItem.getMaterial() == CAArmorMaterials.NETHERITE_TINTED ||
                armorItem.getMaterial() == CAArmorMaterials.DIAMOND_TINTED ||
                armorItem.getMaterial() == CAArmorMaterials.GOLDEN_TINTED ||
                armorItem.getMaterial() == CAArmorMaterials.CHAINMAIL_TINTED ||
                armorItem.getMaterial() == CAArmorMaterials.IRON_TINTED ||
                armorItem.getMaterial() == CAArmorMaterials.LEATHER_TINTED;
    }

    public static boolean isWearingWooledBoots(LivingEntity wearer) {
        if (wearer == null) return false;
        if (!(wearer.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof ArmorItem armorItem)) return false;
        return armorItem.getMaterial() == CAArmorMaterials.IRON_WOOLED;
    }

    public static boolean isWearingAnyLeatheredBoots(LivingEntity wearer) {
        if (wearer == null) return false;
        if (!(wearer.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof ArmorItem armorItem)) return false;
        return armorItem.getMaterial() == CAArmorMaterials.NETHERITE_LEATHERED ||
                armorItem.getMaterial() == CAArmorMaterials.DIAMOND_LEATHERED ||
                armorItem.getMaterial() == CAArmorMaterials.GOLDEN_LEATHERED ||
                armorItem.getMaterial() == CAArmorMaterials.CHAINMAIL_LEATHERED ||
                armorItem.getMaterial() == CAArmorMaterials.IRON_LEATHERED ||
                armorItem.getMaterial() == ArmorMaterials.LEATHER;
    }

    public static boolean isWearingGoldenTintedHelmet(LivingEntity wearer) {
        if (wearer == null) return false;
        if (!(wearer.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof ArmorItem armorItem)) return false;
        return armorItem.getMaterial() == CAArmorMaterials.GOLDEN_TINTED;
    }

    public static boolean isWearingAnyGoldenLeatheredArmor(LivingEntity wearer) {
        if (wearer == null) return false;

        Iterable<ItemStack> iterable = wearer.getArmorItems();
        Iterator<ItemStack> var2 = iterable.iterator();
        Item item;
        do {
            if (!var2.hasNext()) {
                return false;
            }

            ItemStack itemStack = var2.next();
            item = itemStack.getItem();
        } while (!(item instanceof ArmorItem) || ((ArmorItem)item).getMaterial() != CAArmorMaterials.GOLDEN_LEATHERED);

        return true;
    }

    public static boolean isWearingAnyGildedArmor(LivingEntity wearer) {
        if (wearer == null) return false;

        Iterable<ItemStack> iterable = wearer.getArmorItems();
        Iterator<ItemStack> var2 = iterable.iterator();
        Item item;
        do {
            if (!var2.hasNext()) {
                return false;
            }

            ItemStack itemStack = var2.next();
            item = itemStack.getItem();
        } while (!(item instanceof ArmorItem) || ((ArmorItem)item).getMaterial() != CAArmorMaterials.NETHERITE_GILDED);

        return true;
    }

    public static boolean isWearingGildedBoots(LivingEntity wearer) {
        if (wearer == null) return false;
        if (!(wearer.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof ArmorItem armorItem)) return false;
        return armorItem.getMaterial() == CAArmorMaterials.NETHERITE_GILDED;
    }

    public static boolean isWearingFullTurtleArmor(LivingEntity wearer) {
        if (wearer == null) return false;
        if (!(wearer.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof ArmorItem helmet)) return false;
        if (!(wearer.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof ArmorItem chestplate)) return false;
        if (!(wearer.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof ArmorItem leggings)) return false;
        if (!(wearer.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof ArmorItem boots)) return false;
        return helmet.getMaterial() == CAArmorMaterials.NETHERITE_TURTLE &&
                chestplate.getMaterial() == CAArmorMaterials.NETHERITE_TURTLE &&
                leggings.getMaterial() == CAArmorMaterials.NETHERITE_TURTLE &&
                boots.getMaterial() == CAArmorMaterials.NETHERITE_TURTLE;
    }

    public static boolean isWearingTurtleHelmet(LivingEntity wearer) {
        if (wearer == null) return false;
        if (!(wearer.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof ArmorItem armorItem)) return false;
        return armorItem.getMaterial() == CAArmorMaterials.NETHERITE_TURTLE;
>>>>>>> Stashed changes
    }
    // For advancements

    private static final ChatFormatting DESCRIPTION_FORMAT = ChatFormatting.BLUE;
    private static final ChatFormatting TITLE_FORMAT = ChatFormatting.GRAY;

    public static List<ResourceLocation> createUpgradeFullArmorIconList() {
        return List.of(EMPTY_SLOT_HELMET, EMPTY_SLOT_CHESTPLATE, EMPTY_SLOT_LEGGINGS, EMPTY_SLOT_BOOTS);
    }

    public static List<ResourceLocation> createUpgradeHelmetIconList() {
        return List.of(EMPTY_SLOT_HELMET);
    }

    public static List<ResourceLocation> createUpgradeBootsIconList() {
        return List.of(EMPTY_SLOT_BOOTS);
    }

    public static List<ResourceLocation> createLeatherUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_LEATHER);
    }

    public static List<ResourceLocation> createIngotUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_INGOT);
    }

    public static List<ResourceLocation> createTurtleUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_SCUTE, EMPTY_SLOT_HELMET);
    }

    public static List<ResourceLocation> createBlockUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_BLOCK);
    }

    public static List<ResourceLocation> createAmethystUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_AMETHYST_SHARD);
    }

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

}
