package net.raylirov.coolarmor.armor;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.raylirov.coolarmor.CoolArmor;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    NETHERITE_GILDED("netherite_gilded", 37, new int[]{ 3, 8, 6, 3 }, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f, () -> Ingredient.of(Items.NETHERITE_INGOT)),

    NETHERITE_TURTLE("netherite_turtle", 37, new int[]{ 3, 8, 6, 3 }, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f, () -> Ingredient.of(Items.NETHERITE_INGOT)),

    NETHERITE_TINTED("netherite_tinted", 37, new int[]{ 3, 8, 6, 3 }, 15,
    SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f, () -> Ingredient.of(Items.NETHERITE_INGOT)),
    DIAMOND_TINTED("diamond_tinted", 33, new int[]{ 3, 8, 6, 3 }, 10,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0f, 0.0f, () -> Ingredient.of(Items.DIAMOND)),
    GOLDEN_TINTED("golden_tinted", 7, new int[]{ 2, 5, 3, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_GOLD, 0.0f, 0.0f, () -> Ingredient.of(Items.GOLD_INGOT)),
    CHAINMAIL_TINTED("chainmail_tinted", 15, new int[]{ 2, 5, 4, 1 }, 12,
            SoundEvents.ARMOR_EQUIP_CHAIN, 0.0f, 0.0f, () -> Ingredient.of(Items.IRON_INGOT)),
    IRON_TINTED("iron_tinted", 15, new int[]{ 3, 6, 5, 2 }, 9,
            SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.of(Items.IRON_INGOT)),
    LEATHER_TINTED("leather_tinted", 5, new int[]{ 1, 3, 2, 1 }, 15,
            SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.of(Items.LEATHER)),

    NETHERITE_LEATHERED("netherite_leathered", 37, new int[]{ 3, 8, 6, 3 }, 15,
    SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f, () -> Ingredient.of(Items.NETHERITE_INGOT)),
    DIAMOND_LEATHERED("diamond_leathered", 33, new int[]{ 3, 8, 6, 3 }, 10,
    SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0f, 0.0f, () -> Ingredient.of(Items.DIAMOND)),
    GOLDEN_LEATHERED("golden_leathered", 7, new int[]{ 2, 5, 3, 1 }, 25,
    SoundEvents.ARMOR_EQUIP_GOLD, 0.0f, 0.0f, () -> Ingredient.of(Items.GOLD_INGOT)),
    CHAINMAIL_LEATHERED("chainmail_leathered", 15, new int[]{ 2, 5, 4, 1 }, 12,
    SoundEvents.ARMOR_EQUIP_CHAIN, 0.0f, 0.0f, () -> Ingredient.of(Items.IRON_INGOT)),
    IRON_LEATHERED("iron_leathered", 15, new int[]{ 3, 6, 5, 2 }, 9,
    SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.of(Items.IRON_INGOT)),

    IRON_WOOLED("iron_wooled", 15, new int[]{ 3, 6, 5, 2 }, 9,
    SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.of(Items.IRON_INGOT));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughtness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 15, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound, float toughtness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughtness = toughtness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return CoolArmor.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughtness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
