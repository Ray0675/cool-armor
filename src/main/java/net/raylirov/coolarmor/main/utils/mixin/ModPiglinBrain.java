package net.raylirov.coolarmor.main.utils.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.raylirov.coolarmor.main.utils.ArmorHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PiglinBrain.class)
public abstract class ModPiglinBrain {

    @Inject(method = "wearsGoldArmor", at = @At("HEAD") , cancellable = true)
    private static void injectWearsGoldArmor(LivingEntity entity, CallbackInfoReturnable<Boolean> cir) {
        if (ArmorHelper.isWearingAnyGoldenArmor(entity)) {
            cir.setReturnValue(true);
        }
    }
}
