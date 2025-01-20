package net.raylirov.coolarmor.content.client;

import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.gui.overlay.IGuiOverlay;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.main.utils.ArmorHelper;

public class ThirstHudOverlay {
    public static final ResourceLocation BLUR_THIRST = new ResourceLocation(CoolArmor.MOD_ID,
            "textures/thirst/blur_thirst.png");

    public static final IGuiOverlay HUD_THIRST = ((gui, poseStack, partialTick, screenWidth, screenHeight) -> {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, BLUR_THIRST);
        assert Minecraft.getInstance().player != null;
        ItemStack helmet = Minecraft.getInstance().player.getItemBySlot(EquipmentSlot.HEAD);
        if(ArmorHelper.isWearingAnyTintedHelmet(helmet) && Minecraft.getInstance().options.getCameraType().isFirstPerson()){
            poseStack.blit(BLUR_THIRST, 0, 0, -90, 0, 0,
                    screenWidth, screenHeight, screenWidth, screenHeight);
        }
    });


}
