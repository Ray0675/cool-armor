package net.raylirov.coolarmor.events;

import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.EnderManAngerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.armor.ModArmorItem;
import net.raylirov.coolarmor.init.ModItems;
import net.raylirov.coolarmor.util.ArmorFilter;
import org.jetbrains.annotations.ApiStatus;

public class Events {
    @ApiStatus.Internal
    @Mod.EventBusSubscriber(modid = CoolArmor.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public class EnderManEventHandler {
        @SuppressWarnings("unused")
        @SubscribeEvent
        public static void onEnderManAngerEvent(final EnderManAngerEvent event) {
            Player player = event.getPlayer();
            EnderMan enderMan = event.getEntity();

            if (player.isCreative()){
                return;
            }

            for (ItemStack stack : player.getArmorSlots()) {
                Item item = stack.getItem();
                if (item instanceof ModArmorItem && ArmorFilter.isWearingAnyTintedHelmet(event)) {
                    event.setCanceled(true);
                }
            }
        }
    }

    @Mod.EventBusSubscriber(modid = CoolArmor.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class FMLCommonSetupEventHandler {
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

}
