package net.raylirov.coolarmor.main.init;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.raylirov.coolarmor.CoolArmor;

public class CAItemTags {
    public static final TagKey<Item> NETHERITE_ARMOR_HELMET = CAItemTags.of("netherite_armor_helmet");
    public static final TagKey<Item> NETHERITE_ARMOR_CHESTPLATE = CAItemTags.of("netherite_armor_chestplate");
    public static final TagKey<Item> NETHERITE_ARMOR_LEGGINGS = CAItemTags.of("netherite_armor_leggings");
    public static final TagKey<Item> NETHERITE_ARMOR_BOOTS = CAItemTags.of("netherite_armor_boots");
    public static final TagKey<Item> IRON_ARMOR = CAItemTags.of("iron_armor");
    public static final TagKey<Item> DIAMOND_ARMOR = CAItemTags.of("diamond_armor");
    public static final TagKey<Item> LEATHERED_ARMOR_HELMET = CAItemTags.of("leathered_armor_helmet");
    public static final TagKey<Item> LEATHERED_ARMOR_CHESTPLATE = CAItemTags.of("leathered_armor_chestplate");
    public static final TagKey<Item> LEATHERED_ARMOR_LEGGINGS = CAItemTags.of("leathered_armor_leggings");
    public static final TagKey<Item> LEATHERED_ARMOR_BOOTS = CAItemTags.of("leathered_armor_boots");

    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(CoolArmor.MOD_ID, id));
    }
}
