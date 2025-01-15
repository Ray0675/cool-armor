package net.raylirov.coolarmor.content.armor;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluids;
import net.raylirov.coolarmor.main.init.ModItems;
import net.raylirov.coolarmor.main.utils.ArmorHelper;
import org.jetbrains.annotations.NotNull;

public class EffectArmorItem extends ModArmorItem {

    public EffectArmorItem(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public void inventoryTick(@NotNull ItemStack item, @NotNull Level world, @NotNull Entity entity, int slotId, boolean isSelected) {
        if (entity instanceof LivingEntity) {
            if (((LivingEntity) entity).getItemBySlot(EquipmentSlot.HEAD).is(ModItems.NETHERITE_TURTLE_HELMET.get())) {
                if (!entity.isEyeInFluidType(Fluids.WATER.getFluidType())) {
                    ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 200, 0, false, false, true));
                } else if (ArmorHelper.inFullTurtleArmor((LivingEntity) entity)){
                    ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 100, 0, false, false, true));
                }
            }
        }
    }
}
