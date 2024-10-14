package net.raylirov.coolarmor.datagen.generators;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.init.ModItems;
import net.raylirov.coolarmor.loot.AddItemModifier;

public class ModGlobalLootModifiersGenerator extends GlobalLootModifierProvider {

    public ModGlobalLootModifiersGenerator(PackOutput output) {
        super(output, CoolArmor.MOD_ID);
    }
    @Override
    protected void start() {
        add("leather_upgrade_smithing_template_from_igloo", new AddItemModifier(new LootItemCondition[] {
            new LootTableIdCondition.Builder(new ResourceLocation("chests/igloo_chest")).build() },
                ModItems.LEATHER_UPGRADE_SMITHING_TEMPLATE.get()));

        add("turtle_upgrade_smithing_template_from_ruin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_big")).build() },
                ModItems.TURTLE_UPGRADE_SMITHING_TEMPLATE.get()));

        add("gilded_upgrade_smithing_template_from_bastion", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build() },
                ModItems.GILDED_UPGRADE_SMITHING_TEMPLATE.get()));

        add("tinted_upgrade_smithing_template_from_dragon", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/ender_dragon")).build() },
                ModItems.TINTED_UPGRADE_SMITHING_TEMPLATE.get()));

        add("wooled_upgrade_smithing_template_from_warden", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/warden")).build() },
                ModItems.WOOLED_UPGRADE_SMITHING_TEMPLATE.get()));
    }
}
