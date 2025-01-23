package net.raylirov.coolarmor.content.armor;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.raylirov.coolarmor.main.utils.ArmorHelper;

public class LeatheredArmorItem extends CAArmorItem implements DyeableLeatherItem {
    public LeatheredArmorItem(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties);
    }
    public boolean canWalkOnPowderedSnow(ItemStack stack, LivingEntity wearer) {
        return ArmorHelper.isOneOfArmor(stack.getItem(), ArmorHelper.leatherBootsMaterials);
    }
}
