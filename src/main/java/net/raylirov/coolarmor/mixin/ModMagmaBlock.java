package net.raylirov.coolarmor.mixin;

import net.minecraft.block.MagmaBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.raylirov.coolarmor.utils.ArmorFilter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(MagmaBlock.class)
public abstract class ModMagmaBlock {

    @Redirect(method = "onSteppedOn", at = @At(value = "INVOKE", target = "Lnet/minecraft/enchantment/EnchantmentHelper;hasFrostWalker(Lnet/minecraft/entity/LivingEntity;)Z"))
    public boolean redirectOnSteppedOn(LivingEntity entity) {
        return ArmorFilter.isWearingGildedBoots(entity) ||
                EnchantmentHelper.hasFrostWalker(entity);
    }
}
