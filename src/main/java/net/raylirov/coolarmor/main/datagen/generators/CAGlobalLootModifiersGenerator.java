package net.raylirov.coolarmor.main.datagen.generators;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.main.init.CAItems;
import net.raylirov.coolarmor.main.utils.loot.CAAddItemModifier;

public class CAGlobalLootModifiersGenerator extends GlobalLootModifierProvider {

    public CAGlobalLootModifiersGenerator(PackOutput output) {
        super(output, CoolArmor.MOD_ID);
    }
    @Override
    protected void start() {
        add("leather_upgrade_smithing_template_from_igloo", new CAAddItemModifier(new LootItemCondition[] {
            new LootTableIdCondition.Builder(new ResourceLocation("chests/igloo_chest")).build() },
                CAItems.LEATHER_UPGRADE_SMITHING_TEMPLATE.get()));

        add("turtle_upgrade_smithing_template_from_ruin", new CAAddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_big")).build() },
                CAItems.TURTLE_UPGRADE_SMITHING_TEMPLATE.get()));

        add("gilded_upgrade_smithing_template_from_bastion", new CAAddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build() },
                CAItems.GILDED_UPGRADE_SMITHING_TEMPLATE.get()));

        add("tinted_upgrade_smithing_template_from_dragon", new CAAddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/ender_dragon")).build() },
                CAItems.TINTED_UPGRADE_SMITHING_TEMPLATE.get()));

        add("wooled_upgrade_smithing_template_from_warden", new CAAddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/warden")).build() },
                CAItems.WOOLED_UPGRADE_SMITHING_TEMPLATE.get()));
    }
}
