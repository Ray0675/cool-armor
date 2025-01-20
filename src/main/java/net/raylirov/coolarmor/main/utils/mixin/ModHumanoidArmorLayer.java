package net.raylirov.coolarmor.main.utils.mixin;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.armortrim.ArmorTrim;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.raylirov.coolarmor.main.utils.ArmorHelper;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Unique;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.Objects;

@Mixin(HumanoidArmorLayer.class)
@OnlyIn(Dist.CLIENT)
public abstract class ModHumanoidArmorLayer<T extends LivingEntity, M extends HumanoidModel<T>, A extends HumanoidModel<T>> extends RenderLayer<T, M> {

    @Unique
    private final TextureAtlas cool_armor_forge_1_20_1$armorTrimAtlas;
    @Unique
    private static final Map<String, ResourceLocation> ARMOR_LOCATION_CACHE = Maps.newHashMap();

    public ModHumanoidArmorLayer(RenderLayerParent<T, M> pRenderer, A pInnerModel, A pOuterModel, ModelManager pModelManager) {
        super(pRenderer);
        this.cool_armor_forge_1_20_1$armorTrimAtlas = pModelManager.getAtlas(Sheets.ARMOR_TRIMS_SHEET);
    }
    
    /**
     * @author Ray_0675
     * @reason Да
     */
    @Overwrite
    private void renderArmorPiece(PoseStack pPoseStack, MultiBufferSource pBuffer, T pLivingEntity, EquipmentSlot pSlot, int pPackedLight, A pModel) {
        ItemStack itemstack = pLivingEntity.getItemBySlot(pSlot);
        Item $$9 = itemstack.getItem();
        if ($$9 instanceof ArmorItem armoritem) {
            if (armoritem.getEquipmentSlot() == pSlot) {
                this.getParentModel().copyPropertiesTo(pModel);
                this.cool_armor_forge_1_20_1$setPartVisibility(pModel, pSlot);
                net.minecraft.client.model.Model model = cool_armor_forge_1_20_1$getArmorModelHook(pLivingEntity, itemstack, pSlot, pModel);
                boolean flag = this.cool_armor_forge_1_20_1$usesInnerModel(pSlot);
                if (armoritem instanceof net.minecraft.world.item.DyeableLeatherItem) {
                    int i = ((net.minecraft.world.item.DyeableLeatherItem)armoritem).getColor(itemstack);
                    float f = (float)(i >> 16 & 255) / 255.0F;
                    float f1 = (float)(i >> 8 & 255) / 255.0F;
                    float f2 = (float)(i & 255) / 255.0F;

                    boolean currentMonth = ArmorHelper.getCurrentMonth();
                    boolean isDyed = itemstack.hasTag() && Objects.requireNonNull(itemstack.getTag()).contains("display") && itemstack.getTag().getCompound("display").contains("color");
                    boolean isHasTrim = itemstack.hasTag() && Objects.requireNonNull(itemstack.getTag()).contains("Trim");

                    if (!($$9 == Items.LEATHER_HELMET)) {
                        this.cool_armor_forge_1_20_1$renderModel(pPoseStack, pBuffer, pPackedLight, armoritem, model, flag, f, f1, f2, this.cool_armor_forge_1_20_1$getArmorResource(pLivingEntity, itemstack, pSlot, null));
                        this.cool_armor_forge_1_20_1$renderModel(pPoseStack, pBuffer, pPackedLight, armoritem, model, flag, 1.0F, 1.0F, 1.0F, this.cool_armor_forge_1_20_1$getArmorResource(pLivingEntity, itemstack, pSlot, "overlay"));
                    } else if (currentMonth && !isDyed && !isHasTrim) {
                        if (ArmorHelper.summer()) {
                            this.cool_armor_forge_1_20_1$renderModel(pPoseStack, pBuffer, pPackedLight, armoritem, model, flag, 1.0F, 1.0F, 1.0F, this.cool_armor_forge_1_20_1$getArmorResource(pLivingEntity, itemstack, pSlot, "sum"));
                        } else if (ArmorHelper.halloween()) {
                            this.cool_armor_forge_1_20_1$renderModel(pPoseStack, pBuffer, pPackedLight, armoritem, model, flag, 1.0F, 1.0F, 1.0F, this.cool_armor_forge_1_20_1$getArmorResource(pLivingEntity, itemstack, pSlot, "hal"));
                        } else if (ArmorHelper.xmas()) {
                            this.cool_armor_forge_1_20_1$renderModel(pPoseStack, pBuffer, pPackedLight, armoritem, model, flag, 1.0F, 1.0F, 1.0F, this.cool_armor_forge_1_20_1$getArmorResource(pLivingEntity, itemstack, pSlot, "xmas"));
                        } else {
                            this.cool_armor_forge_1_20_1$renderModel(pPoseStack, pBuffer, pPackedLight, armoritem, model, flag, f, f1, f2, this.cool_armor_forge_1_20_1$getArmorResource(pLivingEntity, itemstack, pSlot, null));
                            this.cool_armor_forge_1_20_1$renderModel(pPoseStack, pBuffer, pPackedLight, armoritem, model, flag, 1.0F, 1.0F, 1.0F, this.cool_armor_forge_1_20_1$getArmorResource(pLivingEntity, itemstack, pSlot, "overlay"));
                        }
                    } else {
                        this.cool_armor_forge_1_20_1$renderModel(pPoseStack, pBuffer, pPackedLight, armoritem, model, flag, f, f1, f2, this.cool_armor_forge_1_20_1$getArmorResource(pLivingEntity, itemstack, pSlot, null));
                        this.cool_armor_forge_1_20_1$renderModel(pPoseStack, pBuffer, pPackedLight, armoritem, model, flag, 1.0F, 1.0F, 1.0F, this.cool_armor_forge_1_20_1$getArmorResource(pLivingEntity, itemstack, pSlot, "overlay"));
                    }
                } else {
                    this.cool_armor_forge_1_20_1$renderModel(pPoseStack, pBuffer, pPackedLight, armoritem, model, flag, 1.0F, 1.0F, 1.0F, this.cool_armor_forge_1_20_1$getArmorResource(pLivingEntity, itemstack, pSlot, null));
                }

                ArmorTrim.getTrim(pLivingEntity.level().registryAccess(), itemstack).ifPresent((p_289638_) -> {
                    this.cool_armor_forge_1_20_1$renderTrim(armoritem.getMaterial(), pPoseStack, pBuffer, pPackedLight, p_289638_, model, flag);
                });
                if (itemstack.hasFoil()) {
                    this.cool_armor_forge_1_20_1$renderGlint(pPoseStack, pBuffer, pPackedLight, model);
                }

            }
        }
    }

    @Unique
    protected void cool_armor_forge_1_20_1$setPartVisibility(A pModel, EquipmentSlot pSlot) {
        pModel.setAllVisible(false);
        switch (pSlot) {
            case HEAD:
                pModel.head.visible = true;
                pModel.hat.visible = true;
                break;
            case CHEST:
                pModel.body.visible = true;
                pModel.rightArm.visible = true;
                pModel.leftArm.visible = true;
                break;
            case LEGS:
                pModel.body.visible = true;
                pModel.rightLeg.visible = true;
                pModel.leftLeg.visible = true;
                break;
            case FEET:
                pModel.rightLeg.visible = true;
                pModel.leftLeg.visible = true;
        }

    }

    @Unique
    private void cool_armor_forge_1_20_1$renderModel(PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight, ArmorItem pArmorItem, net.minecraft.client.model.Model pModel, boolean pWithGlint, float pRed, float pGreen, float pBlue, ResourceLocation armorResource) {
        VertexConsumer vertexconsumer = pBuffer.getBuffer(RenderType.armorCutoutNoCull(armorResource));
        pModel.renderToBuffer(pPoseStack, vertexconsumer, pPackedLight, OverlayTexture.NO_OVERLAY, pRed, pGreen, pBlue, 1.0F);
    }

    @Unique
    private void cool_armor_forge_1_20_1$renderTrim(ArmorMaterial pArmorMaterial, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight, ArmorTrim pTrim, net.minecraft.client.model.Model pModel, boolean pInnerTexture) {
        TextureAtlasSprite textureatlassprite = this.cool_armor_forge_1_20_1$armorTrimAtlas.getSprite(pInnerTexture ? pTrim.innerTexture(pArmorMaterial) : pTrim.outerTexture(pArmorMaterial));
        VertexConsumer vertexconsumer = textureatlassprite.wrap(pBuffer.getBuffer(Sheets.armorTrimsSheet()));
        pModel.renderToBuffer(pPoseStack, vertexconsumer, pPackedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
    }

    @Unique
    private void cool_armor_forge_1_20_1$renderGlint(PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight, net.minecraft.client.model.Model pModel) {
        pModel.renderToBuffer(pPoseStack, pBuffer.getBuffer(RenderType.armorEntityGlint()), pPackedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
    }

    @Unique
    private boolean cool_armor_forge_1_20_1$usesInnerModel(EquipmentSlot pSlot) {
        return pSlot == EquipmentSlot.LEGS;
    }

    @Unique
    protected net.minecraft.client.model.Model cool_armor_forge_1_20_1$getArmorModelHook(T entity, ItemStack itemStack, EquipmentSlot slot, A model) {
        return net.minecraftforge.client.ForgeHooksClient.getArmorModel(entity, itemStack, slot, model);
    }

    @Unique
    public ResourceLocation cool_armor_forge_1_20_1$getArmorResource(net.minecraft.world.entity.Entity entity, ItemStack stack, EquipmentSlot slot, @Nullable String type) {
        String s1 = cool_armor_forge_1_20_1$getString(stack, slot, type);

        s1 = net.minecraftforge.client.ForgeHooksClient.getArmorTexture(entity, stack, s1, slot, type);
        ResourceLocation resourcelocation = ARMOR_LOCATION_CACHE.get(s1);

        if (resourcelocation == null) {
            resourcelocation = new ResourceLocation(s1);
            ARMOR_LOCATION_CACHE.put(s1, resourcelocation);
        }

        return resourcelocation;
    }

    @Unique
    private @NotNull String cool_armor_forge_1_20_1$getString(ItemStack stack, EquipmentSlot slot, @org.jetbrains.annotations.Nullable String type) {
        ArmorItem item = (ArmorItem) stack.getItem();
        String texture = item.getMaterial().getName();
        String domain = "minecraft";
        int idx = texture.indexOf(':');
        if (idx != -1) {
            domain = texture.substring(0, idx);
            texture = texture.substring(idx + 1);
        }
        return String.format(java.util.Locale.ROOT, "%s:textures/models/armor/%s_layer_%d%s.png", domain, texture, (cool_armor_forge_1_20_1$usesInnerModel(slot) ? 2 : 1), type == null ? "" : String.format(java.util.Locale.ROOT, "_%s", type));
    }
}
