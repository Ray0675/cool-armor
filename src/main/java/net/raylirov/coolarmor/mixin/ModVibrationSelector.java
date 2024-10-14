package net.raylirov.coolarmor.mixin;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.gameevent.vibrations.VibrationInfo;
import net.minecraft.world.level.gameevent.vibrations.VibrationSelector;
import net.raylirov.coolarmor.util.ArmorFilter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VibrationSelector.class)
public class ModVibrationSelector {
    @Inject(method = "shouldReplaceVibration", at = @At("HEAD"), cancellable = true)
    void injectShouldReplaceVibration(final VibrationInfo vibration, final long tick, final CallbackInfoReturnable<Boolean> cir) {
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
