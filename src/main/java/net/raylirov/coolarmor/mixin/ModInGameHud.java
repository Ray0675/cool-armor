package net.raylirov.coolarmor.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.util.Identifier;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.utils.ArmorFilter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value= EnvType.CLIENT)
@Mixin(InGameHud.class)
public abstract class ModInGameHud {
    private static final Identifier BLUR_THIRST = new Identifier(CoolArmor.MOD_ID,
            "textures/thirst/blur_thirst.png");
    MinecraftClient client = MinecraftClient.getInstance();
    private void renderOverlays(DrawContext context, Identifier texture, float opacity) {
        int width = client.getWindow().getScaledWidth();
        int height = client.getWindow().getScaledHeight();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(false);
        context.setShaderColor(1.0f, 1.0f, 1.0f, opacity);
        context.drawTexture(texture, 0, 0, -90, 0.0f, 0.0f, width, height, width, height);
        RenderSystem.depthMask(true);
        RenderSystem.enableDepthTest();
        context.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
    }

    @Inject(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/MinecraftClient;getLastFrameDuration()F", shift = At.Shift.BY, by = 2))
    public void render(DrawContext context, float tickDelta, CallbackInfo ci){
        if(MinecraftClient.getInstance().options.getPerspective().isFirstPerson() && ArmorFilter.isWearingAnyTintedHelmet()){
            this.renderOverlays(context, BLUR_THIRST, 5.0f);
        }
    }
}
