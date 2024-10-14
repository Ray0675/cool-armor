package net.raylirov.coolarmor.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.event.GameEvent;
import net.minecraft.world.event.listener.Vibration;
import net.minecraft.world.event.listener.VibrationSelector;
import net.raylirov.coolarmor.utils.ArmorFilter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VibrationSelector.class)
public abstract class ModVibrationSelector {

    @Inject(method = "shouldSelect", at = @At("HEAD"), cancellable = true)
    void injectShouldSelect(Vibration vibration, long tick, CallbackInfoReturnable<Boolean> cir){
        final Entity entity = vibration.entity();
        final GameEvent event = vibration.gameEvent();
        if (entity instanceof LivingEntity) {
            final LivingEntity pPlayer = (LivingEntity)entity;
            if (ArmorFilter.isWearingWooledBoots(pPlayer)) {
                if (event.equals(GameEvent.HIT_GROUND)) {
                    cir.setReturnValue(false);
                }
                if (event.equals(GameEvent.SWIM)) {
                    cir.setReturnValue(false);
                }
                if (event.equals(GameEvent.STEP)) {
                    cir.setReturnValue(false);
                }
                if (event.equals(GameEvent.ENTITY_DAMAGE)) {
                    cir.setReturnValue(false);
                }
            }
        }
    }
}
