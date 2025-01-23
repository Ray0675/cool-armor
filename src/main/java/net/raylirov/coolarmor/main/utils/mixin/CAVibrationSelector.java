package net.raylirov.coolarmor.main.utils.mixin;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.gameevent.vibrations.VibrationInfo;
import net.minecraft.world.level.gameevent.vibrations.VibrationSelector;
import net.raylirov.coolarmor.content.armor.CAArmorMaterials;
import net.raylirov.coolarmor.main.utils.ArmorHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VibrationSelector.class)
public class CAVibrationSelector {
    @Inject(method = "shouldReplaceVibration", at = @At("HEAD"), cancellable = true)
    void injectShouldReplaceVibration(final VibrationInfo vibration, final long tick, final CallbackInfoReturnable<Boolean> cir) {
        final Entity entity = vibration.entity();
        final GameEvent event = vibration.gameEvent();
        if (entity instanceof LivingEntity player) {
            if (ArmorHelper.isNeededArmorPiece(player.getItemBySlot(EquipmentSlot.FEET).getItem(), CAArmorMaterials.IRON_WOOLED)) {
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
