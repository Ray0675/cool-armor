package net.raylirov.coolarmor;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.DyeableItem;
import net.minecraft.util.Identifier;
import net.raylirov.coolarmor.content.armor.WooledDyableItem;
import net.raylirov.coolarmor.main.init.ModItems;
import net.raylirov.coolarmor.main.utils.ArmorHelper;

public class CoolArmorClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        HudRenderCallback.EVENT.register((context, tickDeltaManager) -> {
            MinecraftClient client = MinecraftClient.getInstance();

            if (ArmorHelper.isWearingAnyTintedHelmet(client.player)) {
                final Identifier BLUR_THIRST = Identifier.of(CoolArmor.MOD_ID, "textures/thirst/blur_thirst.png");

                int width = client.getWindow().getScaledWidth();
                int height = client.getWindow().getScaledHeight();
                RenderSystem.disableDepthTest();
                RenderSystem.depthMask(false);
                RenderSystem.enableBlend();
                context.setShaderColor(1.0f, 1.0f, 1.0f, 5.0f);
                context.drawTexture(BLUR_THIRST, 0, 0, -90, 0.0f, 0.0f, width, height, width, height);
                RenderSystem.disableBlend();
                RenderSystem.depthMask(true);
                RenderSystem.enableDepthTest();
                context.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
            }

        });

        ColorProviderRegistry.ITEM.register(
                (stack, tintIndex) -> tintIndex > 0 ? -1 : ((DyeableItem) stack.getItem()).getColor(stack),
                ModItems.NETHERITE_LEATHERED_HELMET,
                ModItems.NETHERITE_LEATHERED_CHESTPLATE,
                ModItems.NETHERITE_LEATHERED_LEGGINGS,
                ModItems.NETHERITE_LEATHERED_BOOTS,

                ModItems.DIAMOND_LEATHERED_HELMET,
                ModItems.DIAMOND_LEATHERED_CHESTPLATE,
                ModItems.DIAMOND_LEATHERED_LEGGINGS,
                ModItems.DIAMOND_LEATHERED_BOOTS,

                ModItems.GOLDEN_LEATHERED_HELMET,
                ModItems.GOLDEN_LEATHERED_CHESTPLATE,
                ModItems.GOLDEN_LEATHERED_LEGGINGS,
                ModItems.GOLDEN_LEATHERED_BOOTS,

                ModItems.CHAINMAIL_LEATHERED_HELMET,
                ModItems.CHAINMAIL_LEATHERED_CHESTPLATE,
                ModItems.CHAINMAIL_LEATHERED_LEGGINGS,
                ModItems.CHAINMAIL_LEATHERED_BOOTS,

                ModItems.IRON_LEATHERED_HELMET,
                ModItems.IRON_LEATHERED_CHESTPLATE,
                ModItems.IRON_LEATHERED_LEGGINGS,
                ModItems.IRON_LEATHERED_BOOTS,

                ModItems.LEATHER_TINTED_HELMET
        );

        ColorProviderRegistry.ITEM.register(
                (stack, tintIndex) -> tintIndex > 0 ? -1 : ((WooledDyableItem) stack.getItem()).getColor(stack),
                ModItems.IRON_WOOLED_BOOTS
        );
    }
}
