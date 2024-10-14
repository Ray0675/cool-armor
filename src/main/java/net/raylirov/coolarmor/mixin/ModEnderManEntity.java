package net.raylirov.coolarmor.mixin;

import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.raylirov.coolarmor.utils.ArmorFilter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EndermanEntity.class)
public abstract class ModEnderManEntity {
    @Inject(method = "isPlayerStaring", at = @At("HEAD"), cancellable = true)
    void isPlayerStaring(PlayerEntity player, CallbackInfoReturnable<Boolean> cir) {
        if (ArmorFilter.isWearingAnyTintedHelmet()) {
            cir.setReturnValue(false);
        }
    }
}
