package net.raylirov.coolarmor.main.utils;

import net.minecraft.block.cauldron.CauldronBehavior;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.main.init.CAItems;

public class CACauldronBehaviors {
    public static void registerBehaviors() {

        CoolArmor.LOGGER.info("Registering Cauldron Behaviors for " + CoolArmor.MOD_ID);

        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.NETHERITE_LEATHERED_HELMET, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.NETHERITE_LEATHERED_CHESTPLATE, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.NETHERITE_LEATHERED_LEGGINGS, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.NETHERITE_LEATHERED_BOOTS, CauldronBehavior.CLEAN_DYEABLE_ITEM);

        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.DIAMOND_LEATHERED_HELMET, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.DIAMOND_LEATHERED_CHESTPLATE, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.DIAMOND_LEATHERED_LEGGINGS, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.DIAMOND_LEATHERED_BOOTS, CauldronBehavior.CLEAN_DYEABLE_ITEM);

        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.GOLDEN_LEATHERED_HELMET, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.GOLDEN_LEATHERED_CHESTPLATE, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.GOLDEN_LEATHERED_LEGGINGS, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.GOLDEN_LEATHERED_BOOTS, CauldronBehavior.CLEAN_DYEABLE_ITEM);

        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.CHAINMAIL_LEATHERED_HELMET, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.CHAINMAIL_LEATHERED_CHESTPLATE, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.CHAINMAIL_LEATHERED_LEGGINGS, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.CHAINMAIL_LEATHERED_BOOTS, CauldronBehavior.CLEAN_DYEABLE_ITEM);

        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.IRON_LEATHERED_HELMET, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.IRON_LEATHERED_CHESTPLATE, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.IRON_LEATHERED_LEGGINGS, CauldronBehavior.CLEAN_DYEABLE_ITEM);
        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.IRON_LEATHERED_BOOTS, CauldronBehavior.CLEAN_DYEABLE_ITEM);

        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.LEATHER_TINTED_HELMET, CauldronBehavior.CLEAN_DYEABLE_ITEM);

        CauldronBehavior.WATER_CAULDRON_BEHAVIOR.put(CAItems.IRON_WOOLED_BOOTS, CauldronBehavior.CLEAN_DYEABLE_ITEM);
    }
}
