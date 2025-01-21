package net.raylirov.coolarmor.main.utils.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.SculkSensorBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.raylirov.coolarmor.main.utils.ArmorHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SculkSensorBlock.class)
public abstract class CASculkSensorBlock {

    @Inject(method = "onSteppedOn", at = @At("HEAD"), cancellable = true)
    public void injectOnSteppedOn(World world, BlockPos pos, BlockState state, Entity entity, CallbackInfo ci) {
        if (entity instanceof LivingEntity) {
            final LivingEntity pPlayer = (LivingEntity)entity;
            if (ArmorHelper.isWearingWooledBoots(pPlayer)) {
                ci.cancel();
            }
        }
    }
}
