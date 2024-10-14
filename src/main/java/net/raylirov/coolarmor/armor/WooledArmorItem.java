package net.raylirov.coolarmor.armor;

import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.DyeableArmorItem;

public class WooledArmorItem extends DyeableArmorItem implements WooledDyableItem {
    public WooledArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }
}
