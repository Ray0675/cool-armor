package net.raylirov.coolarmor.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SculkShriekerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.raylirov.coolarmor.util.ArmorFilter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SculkShriekerBlock.class)
public class ModSculkShriekerBlock {
    @Inject(at = @At("HEAD"), method = "stepOn", cancellable = true)
    public void injectStepOn(final Level world, final BlockPos pos, final BlockState state, final Entity entity, final CallbackInfo ci) {
        if (entity instanceof LivingEntity) {
            final LivingEntity pPlayer = (LivingEntity)entity;
            if (ArmorFilter.isWearingWooledBoots(pPlayer)) {
                ci.cancel();
            }
        }
    }
}
