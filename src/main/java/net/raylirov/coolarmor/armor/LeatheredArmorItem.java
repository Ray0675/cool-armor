package net.raylirov.coolarmor.armor;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.raylirov.coolarmor.util.ArmorFilter;

public class LeatheredArmorItem extends ArmorItem implements DyeableLeatherItem {
    public LeatheredArmorItem(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties);
    }
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer){
        return this.material == ModArmorMaterials.GOLDEN_LEATHERED;
    }
    public boolean canWalkOnPowderedSnow(ItemStack stack, LivingEntity wearer) {
        return ArmorFilter.anyLeatheredBoots(stack);
    }
}
