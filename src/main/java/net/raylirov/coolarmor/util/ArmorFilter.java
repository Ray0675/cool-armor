package net.raylirov.coolarmor.util;

import net.minecraft.advancements.critereon.*;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.EnderManAngerEvent;
import net.minecraftforge.registries.RegistryObject;
import net.raylirov.coolarmor.armor.ModArmorMaterials;
import net.raylirov.coolarmor.init.ModItems;

public class ArmorFilter {

    public static boolean isWearingAnyTintedHelmet(final EnderManAngerEvent event){
        Player player = event.getPlayer();
        return player.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.NETHERITE_TINTED_HELMET.get()) ||
                player.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.DIAMOND_TINTED_HELMET.get()) ||
                player.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.GOLDEN_TINTED_HELMET.get()) ||
                player.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.CHAINMAIL_TINTED_HELMET.get()) ||
                player.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.IRON_TINTED_HELMET.get()) ||
                player.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.LEATHER_TINTED_HELMET.get());
    }

    public static boolean isWearingAnyTintedHelmet(){
        ItemStack item = Minecraft.getInstance().player.getItemBySlot(EquipmentSlot.HEAD);
        return item.is(ModItems.NETHERITE_TINTED_HELMET.get()) ||
                item.is(ModItems.DIAMOND_TINTED_HELMET.get()) ||
                item.is(ModItems.GOLDEN_TINTED_HELMET.get()) ||
                item.is(ModItems.CHAINMAIL_TINTED_HELMET.get()) ||
                item.is(ModItems.IRON_TINTED_HELMET.get()) ||
                item.is(ModItems.LEATHER_TINTED_HELMET.get());
    }

    public static boolean isWearingWooledBoots(LivingEntity wearer){
        return wearer.getItemBySlot(EquipmentSlot.FEET).is(ModItems.IRON_WOOLED_BOOTS.get());
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
    }
    // For advancements

    // For ModPlayer
    public static boolean isWearingNetheriteTurtleArmor(LivingEntity wearer){
        return wearer.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.NETHERITE_TURTLE_HELMET.get()) &&
                wearer.getItemBySlot(EquipmentSlot.CHEST).is(ModItems.NETHERITE_TURTLE_CHESTPLATE.get()) &&
                wearer.getItemBySlot(EquipmentSlot.LEGS).is(ModItems.NETHERITE_TURTLE_LEGGINGS.get()) &&
                wearer.getItemBySlot(EquipmentSlot.FEET).is(ModItems.NETHERITE_TURTLE_BOOTS.get());
    }

    public static boolean isWearingGildedBoots(LivingEntity wearer){
        return wearer.getItemBySlot(EquipmentSlot.FEET).is(ModItems.NETHERITE_GILDED_BOOTS.get());
    }
    // For ModPlayer

}
