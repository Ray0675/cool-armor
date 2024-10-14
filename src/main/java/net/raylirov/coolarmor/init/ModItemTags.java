package net.raylirov.coolarmor.init;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.raylirov.coolarmor.CoolArmor;

public class ModItemTags {
    public static final TagKey<Item> NETHERITE_ARMOR_HELMET = ModItemTags.of("netherite_armor_helmet");
    public static final TagKey<Item> NETHERITE_ARMOR_CHESTPLATE = ModItemTags.of("netherite_armor_chestplate");
    public static final TagKey<Item> NETHERITE_ARMOR_LEGGINGS = ModItemTags.of("netherite_armor_leggings");
    public static final TagKey<Item> NETHERITE_ARMOR_BOOTS = ModItemTags.of("netherite_armor_boots");
    public static final TagKey<Item> IRON_ARMOR = ModItemTags.of("iron_armor");
    public static final TagKey<Item> DIAMOND_ARMOR = ModItemTags.of("diamond_armor");
    public static final TagKey<Item> LEATHERED_ARMOR_HELMET = ModItemTags.of("leathered_armor_helmet");
    public static final TagKey<Item> LEATHERED_ARMOR_CHESTPLATE = ModItemTags.of("leathered_armor_chestplate");
    public static final TagKey<Item> LEATHERED_ARMOR_LEGGINGS = ModItemTags.of("leathered_armor_leggings");
    public static final TagKey<Item> LEATHERED_ARMOR_BOOTS = ModItemTags.of("leathered_armor_boots");

    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(CoolArmor.MOD_ID, id));
    }
}
