package net.raylirov.coolarmor.mixin;

import net.minecraft.tags.FluidTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.raylirov.coolarmor.init.ModItems;
import net.raylirov.coolarmor.util.ArmorFilter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Player.class)
public abstract class ModPlayer extends LivingEntity {
    protected ModPlayer(EntityType<? extends LivingEntity> entityType, Level level) {
        super(entityType, level);
    }

    @Inject(method = "turtleHelmetTick", at = @At("HEAD"))
    private void injectturtleHelmetTick(CallbackInfo ci) {

        if (this.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.NETHERITE_TURTLE_HELMET.get()) && !this.isEyeInFluid(FluidTags.WATER)) {
            this.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 200, 0, false, false, true));
        }
        if (ArmorFilter.isWearingNetheriteTurtleArmor(this) &&
                this.isEyeInFluid(FluidTags.WATER)) {
            this.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 100, 0, false, false, true));
        }
    }
}
