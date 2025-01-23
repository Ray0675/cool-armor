package net.raylirov.coolarmor.main.utils.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SculkShriekerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.raylirov.coolarmor.content.armor.CAArmorMaterials;
import net.raylirov.coolarmor.main.utils.ArmorHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SculkShriekerBlock.class)
public class CASculkShriekerBlock {
    @Inject(at = @At("HEAD"), method = "stepOn", cancellable = true)
    public void injectStepOn(final Level world, final BlockPos pos, final BlockState state, final Entity entity, final CallbackInfo ci) {
        if (entity instanceof LivingEntity player) {
            if (ArmorHelper.isNeededArmorPiece(player.getItemBySlot(EquipmentSlot.FEET).getItem(), CAArmorMaterials.IRON_WOOLED)) {
                ci.cancel();
            }
        }
    }
}
