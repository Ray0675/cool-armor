package net.raylirov.coolarmor.main.utils.mixin;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.gameevent.vibrations.VibrationInfo;
import net.minecraft.world.level.gameevent.vibrations.VibrationSelector;
import net.raylirov.coolarmor.main.init.ModItems;
import net.raylirov.coolarmor.main.utils.ArmorHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VibrationSelector.class)
<<<<<<< Updated upstream:src/main/java/net/raylirov/coolarmor/main/utils/mixin/ModVibrationSelector.java
public class ModVibrationSelector {
    @Inject(method = "shouldReplaceVibration", at = @At("HEAD"), cancellable = true)
    void injectShouldReplaceVibration(final VibrationInfo vibration, final long tick, final CallbackInfoReturnable<Boolean> cir) {
=======
public abstract class CAVibrationSelector {

    @Inject(method = "shouldSelect", at = @At("HEAD"), cancellable = true)
    void injectShouldSelect(Vibration vibration, long tick, CallbackInfoReturnable<Boolean> cir){
>>>>>>> Stashed changes:src/main/java/net/raylirov/coolarmor/main/utils/mixin/CAVibrationSelector.java
        final Entity entity = vibration.entity();
        final GameEvent event = vibration.gameEvent();
        if (entity instanceof LivingEntity player) {
            if (ArmorHelper.isWearingNeededBoots(player.getItemBySlot(EquipmentSlot.FEET), ModItems.IRON_WOOLED_BOOTS.get())) {
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
