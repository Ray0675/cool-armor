package net.raylirov.coolarmor.mixin;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.block.MagmaBlock;
import net.raylirov.coolarmor.util.ArmorFilter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(MagmaBlock.class)
public abstract class ModMagmaBlock {

    @Redirect(method = "stepOn", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/enchantment/EnchantmentHelper;hasFrostWalker(Lnet/minecraft/world/entity/LivingEntity;)Z"))
    public boolean stepOn(LivingEntity pPlayer) {
        return ArmorFilter.isWearingGildedBoots(pPlayer) ||
                EnchantmentHelper.hasFrostWalker(pPlayer);
    }

}
