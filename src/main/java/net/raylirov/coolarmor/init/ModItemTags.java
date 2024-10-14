package net.raylirov.coolarmor.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.raylirov.coolarmor.CoolArmor;

public class ModItemTags {

    public static final TagKey<Item> NETHERITE_ARMOR_HELMET = newBind("netherite_armor_helmet");
    public static final TagKey<Item> NETHERITE_ARMOR_CHESTPLATE = newBind("netherite_armor_chestplate");
    public static final TagKey<Item> NETHERITE_ARMOR_LEGGINGS = newBind("netherite_armor_leggings");
    public static final TagKey<Item> NETHERITE_ARMOR_BOOTS = newBind("netherite_armor_boots");
    public static final TagKey<Item> IRON_ARMOR = newBind("iron_armor");
    public static final TagKey<Item> DIAMOND_ARMOR = newBind("diamond_armor");
    public static final TagKey<Item> LEATHERED_ARMOR_HELMET = newBind("leathered_armor_helmet");
    public static final TagKey<Item> LEATHERED_ARMOR_CHESTPLATE = newBind("leathered_armor_chestplate");
    public static final TagKey<Item> LEATHERED_ARMOR_LEGGINGS = newBind("leathered_armor_leggings");
    public static final TagKey<Item> LEATHERED_ARMOR_BOOTS = newBind("leathered_armor_boots");

    private static TagKey<Item> newBind(String pName) {
        return TagKey.create(Registries.ITEM, new ResourceLocation(CoolArmor.MOD_ID, pName));
    }
}


