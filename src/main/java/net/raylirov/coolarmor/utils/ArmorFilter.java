package net.raylirov.coolarmor.utils;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.raylirov.coolarmor.init.ModItems;

public class ArmorFilter {

    public static boolean isWearingAnyGoldenArmor(LivingEntity wearer){
        return isWearingAnyGoldenLeatheredArmor(wearer) ||
                isWearingAnyGildedArmor(wearer) ||
                isWearingGoldenTintedHelmet(wearer);
    }

    public static boolean isWearingAnyTintedHelmet(){
        ItemStack itemStack = MinecraftClient.getInstance().player.getInventory().armor.get(3);
        return itemStack.isOf(ModItems.NETHERITE_TINTED_HELMET) ||
                itemStack.isOf(ModItems.DIAMOND_TINTED_HELMET) ||
                itemStack.isOf(ModItems.GOLDEN_TINTED_HELMET) ||
                itemStack.isOf(ModItems.CHAINMAIL_TINTED_HELMET) ||
                itemStack.isOf(ModItems.IRON_TINTED_HELMET) ||
                itemStack.isOf(ModItems.LEATHER_TINTED_HELMET);
    }

    public static boolean isWearingWooledBoots(LivingEntity wearer){
        return wearer.getEquippedStack(EquipmentSlot.FEET).isOf(ModItems.IRON_WOOLED_BOOTS);
    }

    public static boolean isWearingAnyLeatheredBoots(LivingEntity wearer){
        return wearer.getEquippedStack(EquipmentSlot.FEET).isOf(ModItems.NETHERITE_LEATHERED_BOOTS) ||
                wearer.getEquippedStack(EquipmentSlot.FEET).isOf(ModItems.DIAMOND_LEATHERED_BOOTS) ||
                wearer.getEquippedStack(EquipmentSlot.FEET).isOf(ModItems.GOLDEN_LEATHERED_BOOTS) ||
                wearer.getEquippedStack(EquipmentSlot.FEET).isOf(ModItems.CHAINMAIL_LEATHERED_BOOTS) ||
                wearer.getEquippedStack(EquipmentSlot.FEET).isOf(ModItems.IRON_LEATHERED_BOOTS);
    }

    public static boolean isWearingGoldenTintedHelmet(LivingEntity wearer){
        return wearer.getEquippedStack(EquipmentSlot.HEAD).isOf(ModItems.GOLDEN_TINTED_HELMET);
    }

    public static boolean isWearingAnyGoldenLeatheredArmor(LivingEntity wearer){
        return wearer.getEquippedStack(EquipmentSlot.HEAD).isOf(ModItems.GOLDEN_LEATHERED_HELMET) ||
                wearer.getEquippedStack(EquipmentSlot.CHEST).isOf(ModItems.GOLDEN_LEATHERED_CHESTPLATE) ||
                wearer.getEquippedStack(EquipmentSlot.LEGS).isOf(ModItems.GOLDEN_LEATHERED_LEGGINGS) ||
                wearer.getEquippedStack(EquipmentSlot.FEET).isOf(ModItems.GOLDEN_LEATHERED_BOOTS);
    }

    public static boolean isWearingAnyGildedArmor(LivingEntity wearer){
        return wearer.getEquippedStack(EquipmentSlot.HEAD).isOf(ModItems.NETHERITE_GILDED_HELMET) ||
                wearer.getEquippedStack(EquipmentSlot.CHEST).isOf(ModItems.NETHERITE_GILDED_CHESTPLATE) ||
                wearer.getEquippedStack(EquipmentSlot.LEGS).isOf(ModItems.NETHERITE_GILDED_LEGGINGS) ||
                wearer.getEquippedStack(EquipmentSlot.FEET).isOf(ModItems.NETHERITE_GILDED_BOOTS);
    }

    public static boolean isWearingGildedBoots(LivingEntity wearer){
        return wearer.getEquippedStack(EquipmentSlot.FEET).isOf(ModItems.NETHERITE_GILDED_BOOTS);
    }

    public static boolean isWearingTurtleArmor(LivingEntity wearer){
        return wearer.getEquippedStack(EquipmentSlot.HEAD).isOf(ModItems.NETHERITE_TURTLE_HELMET) &&
                wearer.getEquippedStack(EquipmentSlot.CHEST).isOf(ModItems.NETHERITE_TURTLE_CHESTPLATE) &&
                wearer.getEquippedStack(EquipmentSlot.LEGS).isOf(ModItems.NETHERITE_TURTLE_LEGGINGS) &&
                wearer.getEquippedStack(EquipmentSlot.FEET).isOf(ModItems.NETHERITE_TURTLE_BOOTS);
    }

    public static boolean isWearingTurtleHelmet(LivingEntity wearer){
        return wearer.getEquippedStack(EquipmentSlot.HEAD).isOf(ModItems.NETHERITE_TURTLE_HELMET);
    }
}
