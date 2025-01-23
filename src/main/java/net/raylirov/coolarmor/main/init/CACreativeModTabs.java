package net.raylirov.coolarmor.main.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.raylirov.coolarmor.CoolArmor;

public class CACreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CoolArmor.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COOL_ITEMS_TAB = CREATIVE_MODE_TABS.register(CoolArmor.MOD_ID + "_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(CAItems.NETHERITE_GILDED_HELMET.get()))
                    .title(Component.translatable("creativetab." + CoolArmor.MOD_ID + "_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(CAItems.WOOLED_UPGRADE_SMITHING_TEMPLATE.get());

                        pOutput.accept(CAItems.IRON_WOOLED_BOOTS.get());

                        pOutput.accept(CAItems.TINTED_UPGRADE_SMITHING_TEMPLATE.get());

                        pOutput.accept(CAItems.NETHERITE_TINTED_HELMET.get());
                        pOutput.accept(CAItems.DIAMOND_TINTED_HELMET.get());
                        pOutput.accept(CAItems.GOLDEN_TINTED_HELMET.get());
                        pOutput.accept(CAItems.CHAINMAIL_TINTED_HELMET.get());
                        pOutput.accept(CAItems.IRON_TINTED_HELMET.get());
                        pOutput.accept(CAItems.LEATHER_TINTED_HELMET.get());

                        pOutput.accept(CAItems.GILDED_UPGRADE_SMITHING_TEMPLATE.get());

                        pOutput.accept(CAItems.NETHERITE_GILDED_HELMET.get());
                        pOutput.accept(CAItems.NETHERITE_GILDED_CHESTPLATE.get());
                        pOutput.accept(CAItems.NETHERITE_GILDED_LEGGINGS.get());
                        pOutput.accept(CAItems.NETHERITE_GILDED_BOOTS.get());

                        pOutput.accept(CAItems.TURTLE_UPGRADE_SMITHING_TEMPLATE.get());

                        pOutput.accept(CAItems.NETHERITE_TURTLE_HELMET.get());
                        pOutput.accept(CAItems.NETHERITE_TURTLE_CHESTPLATE.get());
                        pOutput.accept(CAItems.NETHERITE_TURTLE_LEGGINGS.get());
                        pOutput.accept(CAItems.NETHERITE_TURTLE_BOOTS.get());

                        pOutput.accept(CAItems.LEATHER_UPGRADE_SMITHING_TEMPLATE.get());

                        pOutput.accept(CAItems.NETHERITE_LEATHERED_HELMET.get());
                        pOutput.accept(CAItems.NETHERITE_LEATHERED_CHESTPLATE.get());
                        pOutput.accept(CAItems.NETHERITE_LEATHERED_LEGGINGS.get());
                        pOutput.accept(CAItems.NETHERITE_LEATHERED_BOOTS.get());

                        pOutput.accept(CAItems.DIAMOND_LEATHERED_HELMET.get());
                        pOutput.accept(CAItems.DIAMOND_LEATHERED_CHESTPLATE.get());
                        pOutput.accept(CAItems.DIAMOND_LEATHERED_LEGGINGS.get());
                        pOutput.accept(CAItems.DIAMOND_LEATHERED_BOOTS.get());

                        pOutput.accept(CAItems.GOLDEN_LEATHERED_HELMET.get());
                        pOutput.accept(CAItems.GOLDEN_LEATHERED_CHESTPLATE.get());
                        pOutput.accept(CAItems.GOLDEN_LEATHERED_LEGGINGS.get());
                        pOutput.accept(CAItems.GOLDEN_LEATHERED_BOOTS.get());

                        pOutput.accept(CAItems.CHAINMAIL_LEATHERED_HELMET.get());
                        pOutput.accept(CAItems.CHAINMAIL_LEATHERED_CHESTPLATE.get());
                        pOutput.accept(CAItems.CHAINMAIL_LEATHERED_LEGGINGS.get());
                        pOutput.accept(CAItems.CHAINMAIL_LEATHERED_BOOTS.get());

                        pOutput.accept(CAItems.IRON_LEATHERED_HELMET.get());
                        pOutput.accept(CAItems.IRON_LEATHERED_CHESTPLATE.get());
                        pOutput.accept(CAItems.IRON_LEATHERED_LEGGINGS.get());
                        pOutput.accept(CAItems.IRON_LEATHERED_BOOTS.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
