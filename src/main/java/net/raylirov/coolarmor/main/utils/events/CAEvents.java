package net.raylirov.coolarmor.main.utils.events;

import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
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
import net.raylirov.coolarmor.content.armor.WooledArmorItem;
import net.raylirov.coolarmor.content.client.CAThirstHudOverlay;
import net.raylirov.coolarmor.main.init.CAItems;
import net.raylirov.coolarmor.main.utils.ArmorHelper;
import org.jetbrains.annotations.ApiStatus;

public class CAEvents {

    @ApiStatus.Internal
    @Mod.EventBusSubscriber(modid = CoolArmor.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class EnderManEventHandler {

        @SuppressWarnings("unused")
        @SubscribeEvent
        public static void onEnderManAngerEvent(final EnderManAngerEvent event) {
            Player player = event.getPlayer();
            EnderMan enderMan = event.getEntity();
            Item helmet = player.getItemBySlot(EquipmentSlot.HEAD).getItem();

            if (player.isCreative()){
                return;
            }

            if (helmet instanceof ArmorItem && ArmorHelper.isOneOfArmor(helmet, ArmorHelper.tintedHelmetMaterials)) {
                event.setCanceled(true);
            }
        }
    }

    @Mod.EventBusSubscriber(modid = CoolArmor.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class FMLCommonSetupEventHandler {
        @SubscribeEvent
        public static void handle(FMLCommonSetupEvent event) {
            CauldronInteraction.WATER.put(CAItems.LEATHER_TINTED_HELMET.get(), CauldronInteraction.DYED_ITEM);

            CauldronInteraction.WATER.put(CAItems.IRON_WOOLED_BOOTS.get(), CauldronInteraction.DYED_ITEM);

            CauldronInteraction.WATER.put(CAItems.NETHERITE_LEATHERED_HELMET.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(CAItems.NETHERITE_LEATHERED_CHESTPLATE.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(CAItems.NETHERITE_LEATHERED_LEGGINGS.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(CAItems.NETHERITE_LEATHERED_BOOTS.get(), CauldronInteraction.DYED_ITEM);

            CauldronInteraction.WATER.put(CAItems.DIAMOND_LEATHERED_HELMET.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(CAItems.DIAMOND_LEATHERED_CHESTPLATE.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(CAItems.DIAMOND_LEATHERED_LEGGINGS.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(CAItems.DIAMOND_LEATHERED_BOOTS.get(), CauldronInteraction.DYED_ITEM);

            CauldronInteraction.WATER.put(CAItems.GOLDEN_LEATHERED_HELMET.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(CAItems.GOLDEN_LEATHERED_CHESTPLATE.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(CAItems.GOLDEN_LEATHERED_LEGGINGS.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(CAItems.GOLDEN_LEATHERED_BOOTS.get(), CauldronInteraction.DYED_ITEM);

            CauldronInteraction.WATER.put(CAItems.CHAINMAIL_LEATHERED_HELMET.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(CAItems.CHAINMAIL_LEATHERED_CHESTPLATE.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(CAItems.CHAINMAIL_LEATHERED_LEGGINGS.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(CAItems.CHAINMAIL_LEATHERED_BOOTS.get(), CauldronInteraction.DYED_ITEM);

            CauldronInteraction.WATER.put(CAItems.IRON_LEATHERED_HELMET.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(CAItems.IRON_LEATHERED_CHESTPLATE.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(CAItems.IRON_LEATHERED_LEGGINGS.get(), CauldronInteraction.DYED_ITEM);
            CauldronInteraction.WATER.put(CAItems.IRON_LEATHERED_BOOTS.get(), CauldronInteraction.DYED_ITEM);
        }
    }


    @Mod.EventBusSubscriber(modid = CoolArmor.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void handleItem(RegisterColorHandlersEvent.Item event) {
            event.register((itemStack, tintIndex) -> tintIndex > 0 ? -1 : ((LeatheredArmorItem) itemStack.getItem()).getColor(itemStack),
                    CAItems.NETHERITE_LEATHERED_HELMET.get(),
                    CAItems.NETHERITE_LEATHERED_CHESTPLATE.get(),
                    CAItems.NETHERITE_LEATHERED_LEGGINGS.get(),
                    CAItems.NETHERITE_LEATHERED_BOOTS.get(),

                    CAItems.DIAMOND_LEATHERED_HELMET.get(),
                    CAItems.DIAMOND_LEATHERED_CHESTPLATE.get(),
                    CAItems.DIAMOND_LEATHERED_LEGGINGS.get(),
                    CAItems.DIAMOND_LEATHERED_BOOTS.get(),

                    CAItems.GOLDEN_LEATHERED_HELMET.get(),
                    CAItems.GOLDEN_LEATHERED_CHESTPLATE.get(),
                    CAItems.GOLDEN_LEATHERED_LEGGINGS.get(),
                    CAItems.GOLDEN_LEATHERED_BOOTS.get(),

                    CAItems.CHAINMAIL_LEATHERED_HELMET.get(),
                    CAItems.CHAINMAIL_LEATHERED_CHESTPLATE.get(),
                    CAItems.CHAINMAIL_LEATHERED_LEGGINGS.get(),
                    CAItems.CHAINMAIL_LEATHERED_BOOTS.get(),

                    CAItems.IRON_LEATHERED_HELMET.get(),
                    CAItems.IRON_LEATHERED_CHESTPLATE.get(),
                    CAItems.IRON_LEATHERED_LEGGINGS.get(),
                    CAItems.IRON_LEATHERED_BOOTS.get(),

                    CAItems.LEATHER_TINTED_HELMET.get()
            );
            event.register((itemStack, tintIndex) -> tintIndex > 0 ? -1 : ((WooledArmorItem) itemStack.getItem()).getColor(itemStack),
                    CAItems.IRON_WOOLED_BOOTS.get()
            );
        }
        @SubscribeEvent
        public static void registerGuiOverlays(RegisterGuiOverlaysEvent event) {
            event.registerBelow(VanillaGuiOverlay.HOTBAR.id(),"thirst", CAThirstHudOverlay.HUD_THIRST);
        }
    }

}
