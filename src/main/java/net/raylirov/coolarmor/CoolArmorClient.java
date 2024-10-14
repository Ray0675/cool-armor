package net.raylirov.coolarmor;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.item.DyeableItem;
import net.raylirov.coolarmor.armor.WooledDyableItem;
import net.raylirov.coolarmor.init.ModItems;

public class CoolArmorClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
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
