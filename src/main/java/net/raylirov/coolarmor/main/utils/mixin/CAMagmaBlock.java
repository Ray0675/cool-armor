package net.raylirov.coolarmor.main.utils.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.MagmaBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.raylirov.coolarmor.content.armor.CAArmorMaterials;
import net.raylirov.coolarmor.main.utils.ArmorHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MagmaBlock.class)
public abstract class CAMagmaBlock {
    @Inject(method = "stepOn", at = @At(value = "HEAD"), cancellable = true)
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity, CallbackInfo ci) {
        if (pEntity instanceof LivingEntity livingEntity) {
            if (livingEntity.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof ArmorItem boots && ArmorHelper.isNeededArmorPiece(boots, CAArmorMaterials.NETHERITE_GILDED)) {
                ci.cancel();
            }
        }
    }
}
