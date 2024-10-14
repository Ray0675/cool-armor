package net.raylirov.coolarmor.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.world.World;
import net.raylirov.coolarmor.utils.ArmorFilter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class ModPlayerEntity extends LivingEntity {
    protected ModPlayerEntity(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "updateTurtleHelmet", at = @At("HEAD"))
    private void injectUpdateTurtleHelmet(CallbackInfo ci) {
        if (ArmorFilter.isWearingTurtleHelmet(this) && !this.isSubmergedIn(FluidTags.WATER)){
            this.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 200, 0, false, false, true));
        }
        if (ArmorFilter.isWearingTurtleArmor(this) && this.isSubmergedIn(FluidTags.WATER)){
            this.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 100, 0, false, false, true));
        }


    }
}
