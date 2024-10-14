package net.raylirov.coolarmor;

import net.fabricmc.api.ModInitializer;

import net.raylirov.coolarmor.init.ModItemGroup;
import net.raylirov.coolarmor.init.ModItems;
import net.raylirov.coolarmor.utils.ModCauldronBehaviors;
import net.raylirov.coolarmor.utils.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoolArmor implements ModInitializer {
	public static final String MOD_ID = "coolarmor";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroup();
		ModItems.registerModItems();
		ModLootTableModifiers.modifyLootTables();
		ModCauldronBehaviors.registerBehaviors();
	}
}