package net.raylirov.coolarmor.events;

import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.client.event.RegisterGuiOverlaysEvent;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.armor.LeatheredArmorItem;
import net.raylirov.coolarmor.armor.WooledArmorItem;
import net.raylirov.coolarmor.client.ThirstHudOverlay;
import net.raylirov.coolarmor.init.ModItems;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = CoolArmor.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void handleItem(RegisterColorHandlersEvent.Item event) {
            event.register(new ItemColor() {
                               public int getColor(ItemStack itemStack, int tintIndex) {
                                   return tintIndex > 0 ? -1 : ((LeatheredArmorItem) itemStack.getItem()).getColor(itemStack);
                               }},

                    ModItems.NETHERITE_LEATHERED_HELMET.get(),
                    ModItems.NETHERITE_LEATHERED_CHESTPLATE.get(),
                    ModItems.NETHERITE_LEATHERED_LEGGINGS.get(),
                    ModItems.NETHERITE_LEATHERED_BOOTS.get(),

                    ModItems.DIAMOND_LEATHERED_HELMET.get(),
                    ModItems.DIAMOND_LEATHERED_CHESTPLATE.get(),
                    ModItems.DIAMOND_LEATHERED_LEGGINGS.get(),
                    ModItems.DIAMOND_LEATHERED_BOOTS.get(),

                    ModItems.GOLDEN_LEATHERED_HELMET.get(),
                    ModItems.GOLDEN_LEATHERED_CHESTPLATE.get(),
                    ModItems.GOLDEN_LEATHERED_LEGGINGS.get(),
                    ModItems.GOLDEN_LEATHERED_BOOTS.get(),

                    ModItems.CHAINMAIL_LEATHERED_HELMET.get(),
                    ModItems.CHAINMAIL_LEATHERED_CHESTPLATE.get(),
                    ModItems.CHAINMAIL_LEATHERED_LEGGINGS.get(),
                    ModItems.CHAINMAIL_LEATHERED_BOOTS.get(),

                    ModItems.IRON_LEATHERED_HELMET.get(),
                    ModItems.IRON_LEATHERED_CHESTPLATE.get(),
                    ModItems.IRON_LEATHERED_LEGGINGS.get(),
                    ModItems.IRON_LEATHERED_BOOTS.get(),

                    ModItems.LEATHER_TINTED_HELMET.get()
            );

            event.register(new ItemColor() {
                               public int getColor(ItemStack itemStack, int tintIndex) {
                                   return tintIndex > 0 ? -1 : ((WooledArmorItem) itemStack.getItem()).getColor(itemStack);
                               }},
                    ModItems.IRON_WOOLED_BOOTS.get()
            );
        }

        @SubscribeEvent
        public static void registerGuiOverlays(RegisterGuiOverlaysEvent event) {
          event.registerBelow(VanillaGuiOverlay.HOTBAR.id(),"thirst", ThirstHudOverlay.HUD_THIRST);
        }

    }
}
