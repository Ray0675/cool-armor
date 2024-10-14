package net.raylirov.coolarmor.utils;

import net.minecraft.block.cauldron.CauldronBehavior;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.init.ModItems;

public class ModCauldronBehaviors {
    public static void registerBehaviors() {

        CoolArmor.LOGGER.info("Registering Cauldron Behaviors for " + CoolArmor.MOD_ID);

        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.NETHERITE_LEATHERED_HELMET, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.NETHERITE_LEATHERED_CHESTPLATE, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.NETHERITE_LEATHERED_LEGGINGS, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.NETHERITE_LEATHERED_BOOTS, CauldronBehavior.CLEAN_DYEABLE_ITEM);

        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.DIAMOND_LEATHERED_HELMET, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.DIAMOND_LEATHERED_CHESTPLATE, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.DIAMOND_LEATHERED_LEGGINGS, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.DIAMOND_LEATHERED_BOOTS, CauldronBehavior.CLEAN_DYEABLE_ITEM);

        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.GOLDEN_LEATHERED_HELMET, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.GOLDEN_LEATHERED_CHESTPLATE, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.GOLDEN_LEATHERED_LEGGINGS, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.GOLDEN_LEATHERED_BOOTS, CauldronBehavior.CLEAN_DYEABLE_ITEM);

        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.CHAINMAIL_LEATHERED_HELMET, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.CHAINMAIL_LEATHERED_CHESTPLATE, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.CHAINMAIL_LEATHERED_LEGGINGS, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.CHAINMAIL_LEATHERED_BOOTS, CauldronBehavior.CLEAN_DYEABLE_ITEM);

        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.IRON_LEATHERED_HELMET, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.IRON_LEATHERED_CHESTPLATE, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.IRON_LEATHERED_LEGGINGS, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.IRON_LEATHERED_BOOTS, CauldronBehavior.CLEAN_DYEABLE_ITEM);

        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.LEATHER_TINTED_HELMET, CauldronBehavior.CLEAN_DYEABLE_ITEM);

        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(ModItems.IRON_WOOLED_BOOTS, CauldronBehavior.CLEAN_DYEABLE_ITEM);
    }
}
