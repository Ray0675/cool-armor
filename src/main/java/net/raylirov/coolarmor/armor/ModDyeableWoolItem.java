package net.raylirov.coolarmor.armor;


import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.DyeableLeatherItem;
import net.minecraft.world.item.ItemStack;

public interface ModDyeableWoolItem extends DyeableLeatherItem {
    int DEFAULT_LEATHER_COLOR = 16777215;
    default int getColor(ItemStack pStack) {
        CompoundTag compoundtag = pStack.getTagElement("display");
        return compoundtag != null && compoundtag.contains("color", 99) ? compoundtag.getInt("color") : DEFAULT_LEATHER_COLOR;
    }
}