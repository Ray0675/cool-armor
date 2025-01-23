package net.raylirov.coolarmor.content.armor;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.raylirov.coolarmor.main.utils.ArmorHelper;

public class CAArmorItem extends ArmorItem {
    public CAArmorItem(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties);
    }

    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer){
        return ArmorHelper.isOneOfArmor(stack.getItem(), ArmorHelper.goldenArmorMaterials);
    }
}
