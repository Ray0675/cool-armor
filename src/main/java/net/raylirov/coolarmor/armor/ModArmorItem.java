package net.raylirov.coolarmor.armor;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;

public class ModArmorItem extends ArmorItem {
    public ModArmorItem(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties);
    }
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer){
        return this.material == ModArmorMaterials.NETHERITE_GILDED ||
                this.material == ModArmorMaterials.GOLDEN_TINTED;
    }
}
