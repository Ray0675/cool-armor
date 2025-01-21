package net.raylirov.coolarmor;

import net.fabricmc.api.ModInitializer;

import net.raylirov.coolarmor.main.init.CAItemGroup;
import net.raylirov.coolarmor.main.init.CAItems;
import net.raylirov.coolarmor.main.utils.CACauldronBehaviors;
import net.raylirov.coolarmor.main.utils.CALootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoolArmor implements ModInitializer {
	public static final String MOD_ID = "coolarmor";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CAItemGroup.registerItemGroup();
		CAItems.registerModItems();
		CALootTableModifiers.modifyLootTables();
		CACauldronBehaviors.registerBehaviors();
	}
}