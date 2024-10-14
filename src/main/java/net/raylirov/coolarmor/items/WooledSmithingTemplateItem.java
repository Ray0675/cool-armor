package net.raylirov.coolarmor.items;

import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.raylirov.coolarmor.CoolArmor;

import java.util.List;

public class WooledSmithingTemplateItem extends SmithingTemplateItem {
    public WooledSmithingTemplateItem(Text appliesToText, Text ingredientsText, Text titleText, Text baseSlotDescriptionText, Text additionsSlotDescriptionText, List<Identifier> emptyBaseSlotTextures, List<Identifier> emptyAdditionsSlotTextures) {
        super(appliesToText, ingredientsText, titleText, baseSlotDescriptionText, additionsSlotDescriptionText, emptyBaseSlotTextures, emptyAdditionsSlotTextures);
    }

    private static final Formatting DESCRIPTION_FORMAT = Formatting.BLUE;
    private static final Formatting TITLE_FORMAT = Formatting.GRAY;
    private static final Text UPGRADE_BASE_SLOT_DESCRIPTION = Text.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.gilded_upgrade.base_slot_description");
    private static final Text UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Text.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.gilded_upgrade.additions_slot_description");
    private static final Text UPGRADE = Text.translatable("upgrade." + CoolArmor.MOD_ID + ".gilded_upgrade").formatted(TITLE_FORMAT);
    private static final Text UPGRADE_APPLIES_TO = Text.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.gilded_upgrade.applies_to").formatted(DESCRIPTION_FORMAT);
    private static final Text UPGRADE_INGREDIENTS = Text.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.gilded_upgrade.ingredients").formatted(DESCRIPTION_FORMAT);

    private static final Identifier EMPTY_SLOT_BOOTS = new Identifier("item/empty_armor_slot_boots");
    private static final Identifier EMPTY_SLOT_BLOCK = new Identifier(CoolArmor.MOD_ID,"item/empty_slot_block");


    private static List<Identifier> createUpgradeIconList() {
        return List.of(EMPTY_SLOT_BOOTS);
    }

    private static List<Identifier> createUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_BLOCK);
    }

    public static WooledSmithingTemplateItem createUpgradeTemplate() {
        return new WooledSmithingTemplateItem(UPGRADE_APPLIES_TO, UPGRADE_INGREDIENTS, UPGRADE, UPGRADE_BASE_SLOT_DESCRIPTION, UPGRADE_ADDITIONS_SLOT_DESCRIPTION, createUpgradeIconList(), createUpgradeMaterialList());
    }
}
