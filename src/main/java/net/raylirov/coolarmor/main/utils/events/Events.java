package net.raylirov.coolarmor.main.utils.events;

import net.minecraft.client.color.item.ItemColor;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.client.event.RegisterGuiOverlaysEvent;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import net.minecraftforge.event.entity.living.EnderManAngerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.content.armor.LeatheredArmorItem;
import net.raylirov.coolarmor.content.armor.ModArmorItem;
import net.raylirov.coolarmor.content.armor.WooledArmorItem;
import net.raylirov.coolarmor.content.client.ThirstHudOverlay;
import net.raylirov.coolarmor.main.init.ModItems;
import net.raylirov.coolarmor.main.utils.ArmorHelper;
import org.jetbrains.annotations.ApiStatus;

public class Events {

    @ApiStatus.Internal
    @Mod.EventBusSubscriber(modid = CoolArmor.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class EnderManEventHandler {

        @SuppressWarnings("unused")
        @SubscribeEvent
        public static void onEnderManAngerEvent(final EnderManAngerEvent event) {
            Player player = event.getPlayer();
            EnderMan enderMan = event.getEntity();
            ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);

            if (player.isCreative()){
                return;
            }

            for (ItemStack stack : player.getArmorSlots()) {
                Item item = stack.getItem();
                if (item instanceof ModArmorItem && ArmorHelper.isWearingAnyTintedHelmet(helmet)) {
                    event.setCanceled(true);
                }
            }
        }
    }

    @Mod.EventBusSubscriber(modid = CoolArmor.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class FMLCommonSetupEventHandler {
        @SubscribeEvent
        public static void handle(FMLCommonSetupEvent event) {
            CauldronInteraction.WATER.put(ModItems.LEATHER_TINTED_HELMET.get(), CauldronInteraction.DYED_ITEM);

            CauldronInteraction.WATER.put(ModItems.IRON_WOOLED_BOOTS.get(), CauldronInteraction.DYED_ITEM);

            CauldronInteraction.WATER.put(ModItems.NETHERITE_LEATHERED_HELMET.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(ModItems.NETHERITE_LEATHERED_CHESTPLATE.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(ModItems.NETHERITE_LEATHERED_LEGGINGS.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(ModItems.NETHERITE_LEATHERED_BOOTS.get(), CauldronInteraction.DYED_ITEM);

            CauldronInteraction.WATER.put(ModItems.DIAMOND_LEATHERED_HELMET.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(ModItems.DIAMOND_LEATHERED_CHESTPLATE.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(ModItems.DIAMOND_LEATHERED_LEGGINGS.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(ModItems.DIAMOND_LEATHERED_BOOTS.get(), CauldronInteraction.DYED_ITEM);

            CauldronInteraction.WATER.put(ModItems.GOLDEN_LEATHERED_HELMET.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(ModItems.GOLDEN_LEATHERED_CHESTPLATE.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(ModItems.GOLDEN_LEATHERED_LEGGINGS.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(ModItems.GOLDEN_LEATHERED_BOOTS.get(), CauldronInteraction.DYED_ITEM);

            CauldronInteraction.WATER.put(ModItems.CHAINMAIL_LEATHERED_HELMET.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(ModItems.CHAINMAIL_LEATHERED_CHESTPLATE.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(ModItems.CHAINMAIL_LEATHERED_LEGGINGS.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(ModItems.CHAINMAIL_LEATHERED_BOOTS.get(), CauldronInteraction.DYED_ITEM);

            CauldronInteraction.WATER.put(ModItems.IRON_LEATHERED_HELMET.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(ModItems.IRON_LEATHERED_CHESTPLATE.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(ModItems.IRON_LEATHERED_LEGGINGS.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(ModItems.IRON_LEATHERED_BOOTS.get(), CauldronInteraction.DYED_ITEM);
        }
    }


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
