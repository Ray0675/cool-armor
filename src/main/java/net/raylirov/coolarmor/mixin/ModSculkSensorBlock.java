package net.raylirov.coolarmor.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SculkSensorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.raylirov.coolarmor.util.ArmorFilter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

@Mixin(SculkSensorBlock.class)
public class ModSculkSensorBlock {
    @Inject(method = "stepOn", at = @At("HEAD"), cancellable = true)
    public void injectStepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity, org.spongepowered.asm.mixin.injection.callback.CallbackInfo ci) {
        if (pEntity instanceof LivingEntity) {
            final LivingEntity pPlayer = (LivingEntity)pEntity;
            if (ArmorFilter.isWearingWooledBoots(pPlayer)) {
                ci.cancel();
            }
        }
    }
}

