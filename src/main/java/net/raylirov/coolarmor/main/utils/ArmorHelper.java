package net.raylirov.coolarmor.main.utils;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.raylirov.coolarmor.content.armor.CAArmorMaterials;

import java.util.Iterator;

public class ArmorHelper {

    public static boolean isWearingAnyGoldenArmor(LivingEntity wearer) {
        return isWearingAnyGoldenLeatheredArmor(wearer) ||
                isWearingAnyGildedArmor(wearer) ||
                isWearingGoldenTintedHelmet(wearer);
    }

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
    }
}
