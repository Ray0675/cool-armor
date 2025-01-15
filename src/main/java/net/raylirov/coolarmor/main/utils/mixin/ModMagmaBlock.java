package net.raylirov.coolarmor.main.utils.mixin;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.block.MagmaBlock;
import net.raylirov.coolarmor.main.init.ModItems;
import net.raylirov.coolarmor.main.utils.ArmorHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(MagmaBlock.class)
public abstract class ModMagmaBlock {

    @Redirect(method = "stepOn", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/enchantment/EnchantmentHelper;hasFrostWalker(Lnet/minecraft/world/entity/LivingEntity;)Z"))
    public boolean stepOn(LivingEntity entity) {
        return ArmorHelper.isWearingNeededBoots(entity.getItemBySlot(EquipmentSlot.FEET), ModItems.NETHERITE_GILDED_BOOTS.get()) ||
                EnchantmentHelper.hasFrostWalker(entity);
    }

}
