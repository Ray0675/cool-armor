package net.raylirov.coolarmor;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.raylirov.coolarmor.main.init.CACreativeModTabs;
import net.raylirov.coolarmor.main.init.CAItems;
import net.raylirov.coolarmor.main.utils.loot.CALootModifiers;
import org.slf4j.Logger;

@Mod(CoolArmor.MOD_ID)
public class CoolArmor {
    public static final String MOD_ID = "coolarmor";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CoolArmor() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CACreativeModTabs.register(eventBus);
        CAItems.register(eventBus);
        CALootModifiers.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

}
