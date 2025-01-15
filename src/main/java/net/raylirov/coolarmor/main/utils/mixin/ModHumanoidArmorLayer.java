package net.raylirov.coolarmor.main.utils.mixin;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.armortrim.ArmorTrim;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.raylirov.coolarmor.main.utils.ArmorHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.Objects;

@Mixin(HumanoidArmorLayer.class)
@OnlyIn(Dist.CLIENT)
public abstract class ModHumanoidArmorLayer<T extends LivingEntity, A extends HumanoidModel<T>> {

    @Unique
    private static final Map<String, ResourceLocation> ARMOR_LOCATION_CACHE = Maps.newHashMap();

    @Inject(method = "renderArmorPiece", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/DyeableLeatherItem;getColor(Lnet/minecraft/world/item/ItemStack;)I", shift = At.Shift.AFTER, by = 5), cancellable = true)
    private void renderArmorPiece(PoseStack pPoseStack, MultiBufferSource pBuffer, T pLivingEntity, EquipmentSlot pSlot, int pPackedLight, A pModel, CallbackInfo ci) {
        ItemStack itemstack = pLivingEntity.getItemBySlot(pSlot);
        ArmorItem armoritem = (ArmorItem) itemstack.getItem();

        if (itemstack.is(Items.LEATHER_HELMET)) {
            net.minecraft.client.model.Model model = net.minecraftforge.client.ForgeHooksClient.getArmorModel(pLivingEntity, itemstack, pSlot, pModel);
            int i = ((net.minecraft.world.item.DyeableLeatherItem)armoritem).getColor(itemstack);
            float f = (float)(i >> 16 & 255) / 255.0F;
            float f1 = (float)(i >> 8 & 255) / 255.0F;
            float f2 = (float)(i & 255) / 255.0F;
            boolean currentMonth = ArmorHelper.getCurrentMonth();
            boolean isDyed = itemstack.hasTag() && Objects.requireNonNull(itemstack.getTag()).contains("display") && itemstack.getTag().getCompound("display").contains("color");
            boolean isHasTrim = itemstack.hasTag() && Objects.requireNonNull(itemstack.getTag()).contains("Trim");
            if (currentMonth && !isDyed && !isHasTrim && !itemstack.hasFoil()) {
                if (ArmorHelper.summer()) {
                    this.cool_armor_1_20_1_dev$renderModel(pPoseStack, pBuffer, pPackedLight, model, false, 1.0F, 1.0F, 1.0F, this.cool_armor_1_20_1_dev$getArmorResource(pLivingEntity, itemstack, pSlot, "sum"));
                } else if (ArmorHelper.halloween()) {
                    this.cool_armor_1_20_1_dev$renderModel(pPoseStack, pBuffer, pPackedLight, model, false, 1.0F, 1.0F, 1.0F, this.cool_armor_1_20_1_dev$getArmorResource(pLivingEntity, itemstack, pSlot, "hal"));
                } else if (ArmorHelper.xmas()) {
                    this.cool_armor_1_20_1_dev$renderModel(pPoseStack, pBuffer, pPackedLight, model, false, 1.0F, 1.0F, 1.0F, this.cool_armor_1_20_1_dev$getArmorResource(pLivingEntity, itemstack, pSlot, "xmas"));
                } else {
                    this.cool_armor_1_20_1_dev$renderModel(pPoseStack, pBuffer, pPackedLight, model, false, f, f1, f2, this.cool_armor_1_20_1_dev$getArmorResource(pLivingEntity, itemstack, pSlot, null));
                    this.cool_armor_1_20_1_dev$renderModel(pPoseStack, pBuffer, pPackedLight, model, false, 1.0F, 1.0F, 1.0F, this.cool_armor_1_20_1_dev$getArmorResource(pLivingEntity, itemstack, pSlot, "overlay"));
                }
                ci.cancel();
            }
        }
    }

    @Unique
    private void cool_armor_1_20_1_dev$renderModel(PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight, net.minecraft.client.model.Model pModel, boolean pWithGlint, float pRed, float pGreen, float pBlue, ResourceLocation armorResource) {
        VertexConsumer vertexconsumer = pBuffer.getBuffer(RenderType.armorCutoutNoCull(armorResource));
        pModel.renderToBuffer(pPoseStack, vertexconsumer, pPackedLight, OverlayTexture.NO_OVERLAY, pRed, pGreen, pBlue, 1.0F);
    }

    @Unique
    public ResourceLocation cool_armor_1_20_1_dev$getArmorResource(net.minecraft.world.entity.Entity entity, ItemStack stack, EquipmentSlot slot, @Nullable String type) {
        ArmorItem item = (ArmorItem)stack.getItem();
        String texture = item.getMaterial().getName();
        String domain = "minecraft";
        int idx = texture.indexOf(':');
        if (idx != -1) {
            domain = texture.substring(0, idx);
            texture = texture.substring(idx + 1);
        }
        String s1 = String.format(java.util.Locale.ROOT, "%s:textures/models/armor/%s_layer_%d%s.png", domain, texture, 1, type == null ? "" : String.format(java.util.Locale.ROOT, "_%s", type));

        s1 = net.minecraftforge.client.ForgeHooksClient.getArmorTexture(entity, stack, s1, slot, type);
        ResourceLocation resourcelocation = ARMOR_LOCATION_CACHE.get(s1);

        if (resourcelocation == null) {
            resourcelocation = new ResourceLocation(s1);
            ARMOR_LOCATION_CACHE.put(s1, resourcelocation);
        }

        return resourcelocation;
    }

}
