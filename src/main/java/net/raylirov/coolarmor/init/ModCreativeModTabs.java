package net.raylirov.coolarmor.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.raylirov.coolarmor.CoolArmor;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CoolArmor.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COOL_ITEMS_TAB = CREATIVE_MODE_TABS.register(CoolArmor.MOD_ID + "_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NETHERITE_GILDED_HELMET.get()))
                    .title(Component.translatable("creativetab." + CoolArmor.MOD_ID + "_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.WOOLED_UPGRADE_SMITHING_TEMPLATE.get());

                        pOutput.accept(ModItems.IRON_WOOLED_BOOTS.get());

                        pOutput.accept(ModItems.TINTED_UPGRADE_SMITHING_TEMPLATE.get());

                        pOutput.accept(ModItems.NETHERITE_TINTED_HELMET.get());
                        pOutput.accept(ModItems.DIAMOND_TINTED_HELMET.get());
                        pOutput.accept(ModItems.GOLDEN_TINTED_HELMET.get());
                        pOutput.accept(ModItems.CHAINMAIL_TINTED_HELMET.get());
                        pOutput.accept(ModItems.IRON_TINTED_HELMET.get());
                        pOutput.accept(ModItems.LEATHER_TINTED_HELMET.get());

                        pOutput.accept(ModItems.GILDED_UPGRADE_SMITHING_TEMPLATE.get());

                        pOutput.accept(ModItems.NETHERITE_GILDED_HELMET.get());
                        pOutput.accept(ModItems.NETHERITE_GILDED_CHESTPLATE.get());
                        pOutput.accept(ModItems.NETHERITE_GILDED_LEGGINGS.get());
                        pOutput.accept(ModItems.NETHERITE_GILDED_BOOTS.get());

                        pOutput.accept(ModItems.TURTLE_UPGRADE_SMITHING_TEMPLATE.get());

                        pOutput.accept(ModItems.NETHERITE_TURTLE_HELMET.get());
                        pOutput.accept(ModItems.NETHERITE_TURTLE_CHESTPLATE.get());
                        pOutput.accept(ModItems.NETHERITE_TURTLE_LEGGINGS.get());
                        pOutput.accept(ModItems.NETHERITE_TURTLE_BOOTS.get());

                        pOutput.accept(ModItems.LEATHER_UPGRADE_SMITHING_TEMPLATE.get());

                        pOutput.accept(ModItems.NETHERITE_LEATHERED_HELMET.get());
                        pOutput.accept(ModItems.NETHERITE_LEATHERED_CHESTPLATE.get());
                        pOutput.accept(ModItems.NETHERITE_LEATHERED_LEGGINGS.get());
                        pOutput.accept(ModItems.NETHERITE_LEATHERED_BOOTS.get());

                        pOutput.accept(ModItems.DIAMOND_LEATHERED_HELMET.get());
                        pOutput.accept(ModItems.DIAMOND_LEATHERED_CHESTPLATE.get());
                        pOutput.accept(ModItems.DIAMOND_LEATHERED_LEGGINGS.get());
                        pOutput.accept(ModItems.DIAMOND_LEATHERED_BOOTS.get());

                        pOutput.accept(ModItems.GOLDEN_LEATHERED_HELMET.get());
                        pOutput.accept(ModItems.GOLDEN_LEATHERED_CHESTPLATE.get());
                        pOutput.accept(ModItems.GOLDEN_LEATHERED_LEGGINGS.get());
                        pOutput.accept(ModItems.GOLDEN_LEATHERED_BOOTS.get());

                        pOutput.accept(ModItems.CHAINMAIL_LEATHERED_HELMET.get());
                        pOutput.accept(ModItems.CHAINMAIL_LEATHERED_CHESTPLATE.get());
                        pOutput.accept(ModItems.CHAINMAIL_LEATHERED_LEGGINGS.get());
                        pOutput.accept(ModItems.CHAINMAIL_LEATHERED_BOOTS.get());

                        pOutput.accept(ModItems.IRON_LEATHERED_HELMET.get());
                        pOutput.accept(ModItems.IRON_LEATHERED_CHESTPLATE.get());
                        pOutput.accept(ModItems.IRON_LEATHERED_LEGGINGS.get());
                        pOutput.accept(ModItems.IRON_LEATHERED_BOOTS.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
