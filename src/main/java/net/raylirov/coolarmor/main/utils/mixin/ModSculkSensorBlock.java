package net.raylirov.coolarmor.main.utils.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SculkSensorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.raylirov.coolarmor.main.init.ModItems;
import net.raylirov.coolarmor.main.utils.ArmorHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

@Mixin(SculkSensorBlock.class)
public class ModSculkSensorBlock {
    @Inject(method = "stepOn", at = @At("HEAD"), cancellable = true)
    public void injectStepOn(Level world, BlockPos pos, BlockState state, Entity entity, org.spongepowered.asm.mixin.injection.callback.CallbackInfo ci) {
        if (entity instanceof LivingEntity player) {
            if (ArmorHelper.isWearingNeededBoots(player.getItemBySlot(EquipmentSlot.FEET), ModItems.IRON_WOOLED_BOOTS.get())) {
                ci.cancel();
            }
        }
    }
}

