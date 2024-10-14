package net.raylirov.coolarmor.datagen.generators;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.datagen.providers.ModTranslationKeyTypeProvider;

import java.util.HashMap;
import java.util.Map;

import static net.raylirov.coolarmor.datagen.providers.ModTranslationKeyProvider.*;

public class ModLanguageGenerator extends LanguageProvider {

    private final String lang;
    private final Map<String, String> keyMap = new HashMap<>();

    public ModLanguageGenerator(PackOutput output, String locale) {
        super(output, CoolArmor.MOD_ID, locale);
        this.lang = locale;
    }

    @Override
    protected void addTranslations() {
        this.gatherKeyMapData();
        keyMap.forEach(this::add);
    }

    private void gatherKeyMapData(){
        if (lang.equals("en_us")) {
            keyMap.put(tabsTranslationKeyFor(CoolArmor.MOD_ID + "_tab"), "Cool Armor");
            
            keyMap.put(advancementTranslationKeyFor("rdy_for_winter", ModTranslationKeyTypeProvider.AdvancementKeySubType.TITLE), "Ready for Winter!");
            keyMap.put(advancementTranslationKeyFor("rdy_for_winter", ModTranslationKeyTypeProvider.AdvancementKeySubType.DESCRIPTION), "Get a full suit of Winterized armor.");

            keyMap.put(advancementTranslationKeyFor("turtle_power", ModTranslationKeyTypeProvider.AdvancementKeySubType.TITLE), "Turtle power!");
            keyMap.put(advancementTranslationKeyFor("turtle_power", ModTranslationKeyTypeProvider.AdvancementKeySubType.DESCRIPTION), "Get a full suit of Shell armor.");

            keyMap.put(advancementTranslationKeyFor("gilded", ModTranslationKeyTypeProvider.AdvancementKeySubType.TITLE), "Shiny!");
            keyMap.put(advancementTranslationKeyFor("gilded", ModTranslationKeyTypeProvider.AdvancementKeySubType.DESCRIPTION), "Get a full suit of gilded armor.");

            keyMap.put(itemTranslationKeyFor("netherite_tinted_helmet"), "Netherite tinted helmet");
            keyMap.put(itemTranslationKeyFor("diamond_tinted_helmet"), "Diamond tinted helmet");
            keyMap.put(itemTranslationKeyFor("golden_tinted_helmet"), "Golden tinted helmet");
            keyMap.put(itemTranslationKeyFor("chainmail_tinted_helmet"), "Chainmail tinted helmet");
            keyMap.put(itemTranslationKeyFor("iron_tinted_helmet"), "Iron tinted helmet");
            keyMap.put(itemTranslationKeyFor("leather_tinted_helmet"), "Leather tinted helmet");

            keyMap.put(itemTranslationKeyFor("iron_wooled_boots"), "Iron wooled boots");

            keyMap.put(itemTranslationKeyFor("netherite_gilded_helmet"), "Gilded helmet");
            keyMap.put(itemTranslationKeyFor("netherite_gilded_chestplate"), "Gilded chestplate");
            keyMap.put(itemTranslationKeyFor("netherite_gilded_leggings"), "Gilded leggings");
            keyMap.put(itemTranslationKeyFor("netherite_gilded_boots"), "Gilded boots");

            keyMap.put(itemTranslationKeyFor("netherite_turtle_helmet"), "Shell helmet");
            keyMap.put(itemTranslationKeyFor("netherite_turtle_chestplate"), "Shell chestplate");
            keyMap.put(itemTranslationKeyFor("netherite_turtle_leggings"), "Shell leggings");
            keyMap.put(itemTranslationKeyFor("netherite_turtle_boots"), "Shell boots");

            keyMap.put(itemTranslationKeyFor("netherite_leathered_helmet"), "Winterized netherite helmet");
            keyMap.put(itemTranslationKeyFor("netherite_leathered_chestplate"), "Winterized netherite chestplate");
            keyMap.put(itemTranslationKeyFor("netherite_leathered_leggings"), "Winterized netherite leggings");
            keyMap.put(itemTranslationKeyFor("netherite_leathered_boots"), "Winterized netherite boots");

            keyMap.put(itemTranslationKeyFor("diamond_leathered_helmet"), "Winterized diamond helmet");
            keyMap.put(itemTranslationKeyFor("diamond_leathered_chestplate"), "Winterized diamond chestplate");
            keyMap.put(itemTranslationKeyFor("diamond_leathered_leggings"), "Winterized diamond leggings");
            keyMap.put(itemTranslationKeyFor("diamond_leathered_boots"), "Winterized diamond boots");

            keyMap.put(itemTranslationKeyFor("golden_leathered_helmet"), "Winterized golden helmet");
            keyMap.put(itemTranslationKeyFor("golden_leathered_chestplate"), "Winterized golden chestplate");
            keyMap.put(itemTranslationKeyFor("golden_leathered_leggings"), "Winterized golden leggings");
            keyMap.put(itemTranslationKeyFor("golden_leathered_boots"), "Winterized golden boots");

            keyMap.put(itemTranslationKeyFor("chainmail_leathered_helmet"), "Winterized chainmail helmet");
            keyMap.put(itemTranslationKeyFor("chainmail_leathered_chestplate"), "Winterized chainmail chestplate");
            keyMap.put(itemTranslationKeyFor("chainmail_leathered_leggings"), "Winterized chainmail leggings");
            keyMap.put(itemTranslationKeyFor("chainmail_leathered_boots"), "Winterized chainmail boots");

            keyMap.put(itemTranslationKeyFor("iron_leathered_helmet"), "Winterized iron helmet");
            keyMap.put(itemTranslationKeyFor("iron_leathered_chestplate"), "Winterized iron chestplate");
            keyMap.put(itemTranslationKeyFor("iron_leathered_leggings"), "Winterized iron leggings");
            keyMap.put(itemTranslationKeyFor("iron_leathered_boots"), "Winterized iron boots");

            keyMap.put(upgradeTranslationKeyFor("leather_upgrade"), "Leather Upgrade");
            keyMap.put(itemTranslationKeyFor("smithing_template.leather_upgrade.additions_slot_description"), "Add Leather");
            keyMap.put(itemTranslationKeyFor("smithing_template.leather_upgrade.applies_to"), "All armor, except leather");
            keyMap.put(itemTranslationKeyFor("smithing_template.leather_upgrade.base_slot_description"), "Add any armor, except leather");
            keyMap.put(itemTranslationKeyFor("smithing_template.leather_upgrade.ingredients"), "Leather");

            keyMap.put(upgradeTranslationKeyFor("turtle_upgrade"), "Turtle Upgrade");
            keyMap.put(itemTranslationKeyFor("smithing_template.turtle_upgrade.additions_slot_description"), "Add scute");
            keyMap.put(itemTranslationKeyFor("smithing_template.turtle_upgrade.applies_to"), "Netherite armor");
            keyMap.put(itemTranslationKeyFor("smithing_template.turtle_upgrade.base_slot_description"), "Add netherite armor");
            keyMap.put(itemTranslationKeyFor("smithing_template.turtle_upgrade.ingredients"), "Scute");

            keyMap.put(upgradeTranslationKeyFor("gilded_upgrade"), "Gilded Upgrade");
            keyMap.put(itemTranslationKeyFor("smithing_template.gilded_upgrade.additions_slot_description"), "Add Gold");
            keyMap.put(itemTranslationKeyFor("smithing_template.gilded_upgrade.applies_to"), "Netherite armor");
            keyMap.put(itemTranslationKeyFor("smithing_template.gilded_upgrade.base_slot_description"), "Add netherite armor");
            keyMap.put(itemTranslationKeyFor("smithing_template.gilded_upgrade.ingredients"), "Gold");

            keyMap.put(upgradeTranslationKeyFor("wooled_upgrade"), "Wooled Upgrade");
            keyMap.put(itemTranslationKeyFor("smithing_template.wooled_upgrade.additions_slot_description"), "Add Wool");
            keyMap.put(itemTranslationKeyFor("smithing_template.wooled_upgrade.applies_to"), "Iron boots");
            keyMap.put(itemTranslationKeyFor("smithing_template.wooled_upgrade.base_slot_description"), "Add iron boots");
            keyMap.put(itemTranslationKeyFor("smithing_template.wooled_upgrade.ingredients"), "Wool");

            keyMap.put(upgradeTranslationKeyFor("tinted_upgrade"), "Tinted Upgrade");
            keyMap.put(itemTranslationKeyFor("smithing_template.tinted_upgrade.additions_slot_description"), "Add amethyst shard");
            keyMap.put(itemTranslationKeyFor("smithing_template.tinted_upgrade.applies_to"), "Netherite helmet");
            keyMap.put(itemTranslationKeyFor("smithing_template.tinted_upgrade.base_slot_description"), "Add netherite helmet");
            keyMap.put(itemTranslationKeyFor("smithing_template.tinted_upgrade.ingredients"), "Amethyst shard");

        }

        if (lang.equals("ru_ru")) {
            keyMap.put(tabsTranslationKeyFor(CoolArmor.MOD_ID + "_tab"), "Cool Armor");

            keyMap.put(advancementTranslationKeyFor("rdy_for_winter", ModTranslationKeyTypeProvider.AdvancementKeySubType.TITLE), "К Зиме готов!");
            keyMap.put(advancementTranslationKeyFor("rdy_for_winter", ModTranslationKeyTypeProvider.AdvancementKeySubType.DESCRIPTION), "Получите полный комплект утеплённой брони.");

            keyMap.put(advancementTranslationKeyFor("turtle_power", ModTranslationKeyTypeProvider.AdvancementKeySubType.TITLE), "Черепашья мощь!");
            keyMap.put(advancementTranslationKeyFor("turtle_power", ModTranslationKeyTypeProvider.AdvancementKeySubType.DESCRIPTION), "Получите полный комплект панцириевой брони.");

            keyMap.put(advancementTranslationKeyFor("gilded", ModTranslationKeyTypeProvider.AdvancementKeySubType.TITLE), "Блестяще!");
            keyMap.put(advancementTranslationKeyFor("gilded", ModTranslationKeyTypeProvider.AdvancementKeySubType.DESCRIPTION), "Получите полный комплект золочёной брони.");

            keyMap.put(itemTranslationKeyFor("netherite_tinted_helmet"), "Незеритовый тонированный шлем");
            keyMap.put(itemTranslationKeyFor("diamond_tinted_helmet"), "Алмазный тонированный шлем");
            keyMap.put(itemTranslationKeyFor("golden_tinted_helmet"), "Золотой тонированный шлем");
            keyMap.put(itemTranslationKeyFor("chainmail_tinted_helmet"), "Кольчужный тонированный шлем");
            keyMap.put(itemTranslationKeyFor("iron_tinted_helmet"), "Железный тонированный шлем");
            keyMap.put(itemTranslationKeyFor("leather_tinted_helmet"), "Кожаный тонированный шлем");

            keyMap.put(itemTranslationKeyFor("iron_wooled_boots"), "Железные подкрадули");

            keyMap.put(itemTranslationKeyFor("netherite_gilded_helmet"), "Золочёный шлем");
            keyMap.put(itemTranslationKeyFor("netherite_gilded_chestplate"), "Золочёный нагрудник");
            keyMap.put(itemTranslationKeyFor("netherite_gilded_leggings"), "Золочёные поножи");
            keyMap.put(itemTranslationKeyFor("netherite_gilded_boots"), "Золоченые ботинки");

            keyMap.put(itemTranslationKeyFor("netherite_turtle_helmet"), "Панцирный шлем");
            keyMap.put(itemTranslationKeyFor("netherite_turtle_chestplate"), "Панцирный нагрудник");
            keyMap.put(itemTranslationKeyFor("netherite_turtle_leggings"), "Панцирные поножи");
            keyMap.put(itemTranslationKeyFor("netherite_turtle_boots"), "Панцирные ботинки");

            keyMap.put(itemTranslationKeyFor("netherite_leathered_helmet"), "Утеплённый незеритовый шлем");
            keyMap.put(itemTranslationKeyFor("netherite_leathered_chestplate"), "Утеплённый незеритовый нагрудник");
            keyMap.put(itemTranslationKeyFor("netherite_leathered_leggings"), "Утеплённые незеритовые поножи");
            keyMap.put(itemTranslationKeyFor("netherite_leathered_boots"), "Утеплённые незеритовые ботинки");

            keyMap.put(itemTranslationKeyFor("diamond_leathered_helmet"), "Утеплённый алмазный шлем");
            keyMap.put(itemTranslationKeyFor("diamond_leathered_chestplate"), "Утеплённый алмазный нагрудник");
            keyMap.put(itemTranslationKeyFor("diamond_leathered_leggings"), "Утеплённые алмазные поножи");
            keyMap.put(itemTranslationKeyFor("diamond_leathered_boots"), "Утеплённые алмазные ботинки");

            keyMap.put(itemTranslationKeyFor("golden_leathered_helmet"), "Утеплённый золотой шлем");
            keyMap.put(itemTranslationKeyFor("golden_leathered_chestplate"), "Утеплённый золотой нагрудник");
            keyMap.put(itemTranslationKeyFor("golden_leathered_leggings"), "Утеплённые золотые поножи");
            keyMap.put(itemTranslationKeyFor("golden_leathered_boots"), "Утеплённые золотые ботинки");

            keyMap.put(itemTranslationKeyFor("chainmail_leathered_helmet"), "Утеплённый кольчужный шлем");
            keyMap.put(itemTranslationKeyFor("chainmail_leathered_chestplate"), "Утеплённый кольчужный нагрудник");
            keyMap.put(itemTranslationKeyFor("chainmail_leathered_leggings"), "Утеплённые кольчужные поножи");
            keyMap.put(itemTranslationKeyFor("chainmail_leathered_boots"), "Утеплённые кольчужные ботинки");

            keyMap.put(itemTranslationKeyFor("iron_leathered_helmet"), "Утеплённый железный шлем");
            keyMap.put(itemTranslationKeyFor("iron_leathered_chestplate"), "Утеплённый железный нагрудник");
            keyMap.put(itemTranslationKeyFor("iron_leathered_leggings"), "Утеплённые железные поножи");
            keyMap.put(itemTranslationKeyFor("iron_leathered_boots"), "Утеплённые железные ботинки");

            keyMap.put(upgradeTranslationKeyFor("leather_upgrade"), "Кожаное улучшение");
            keyMap.put(itemTranslationKeyFor("smithing_template.leather_upgrade.additions_slot_description"), "Поместите кожу");
            keyMap.put(itemTranslationKeyFor("smithing_template.leather_upgrade.applies_to"), "Любой броне, кроме кожаной");
            keyMap.put(itemTranslationKeyFor("smithing_template.leather_upgrade.base_slot_description"), "Поместите любую броню, кроме кожаной");
            keyMap.put(itemTranslationKeyFor("smithing_template.leather_upgrade.ingredients"), "Кожа");

            keyMap.put(upgradeTranslationKeyFor("turtle_upgrade"), "Черепашье улучшение");
            keyMap.put(itemTranslationKeyFor("smithing_template.turtle_upgrade.additions_slot_description"), "Поместите щиток");
            keyMap.put(itemTranslationKeyFor("smithing_template.turtle_upgrade.applies_to"), "Незеритовой броне");
            keyMap.put(itemTranslationKeyFor("smithing_template.turtle_upgrade.base_slot_description"), "Поместите незеритовый доспех");
            keyMap.put(itemTranslationKeyFor("smithing_template.turtle_upgrade.ingredients"), "Щиток");

            keyMap.put(upgradeTranslationKeyFor("gilded_upgrade"), "Золочёное улучшение");
            keyMap.put(itemTranslationKeyFor("smithing_template.gilded_upgrade.additions_slot_description"), "Поместите золото");
            keyMap.put(itemTranslationKeyFor("smithing_template.gilded_upgrade.applies_to"), "Незеритовой броне");
            keyMap.put(itemTranslationKeyFor("smithing_template.gilded_upgrade.base_slot_description"), "Поместите незеритовый доспех");
            keyMap.put(itemTranslationKeyFor("smithing_template.gilded_upgrade.ingredients"), "Золото");

            keyMap.put(upgradeTranslationKeyFor("wooled_upgrade"), "Шерстяное улучшение");
            keyMap.put(itemTranslationKeyFor("smithing_template.wooled_upgrade.additions_slot_description"), "Поместите шерсть");
            keyMap.put(itemTranslationKeyFor("smithing_template.wooled_upgrade.applies_to"), "Железным ботинкам");
            keyMap.put(itemTranslationKeyFor("smithing_template.wooled_upgrade.base_slot_description"), "Поместите железные ботинки");
            keyMap.put(itemTranslationKeyFor("smithing_template.wooled_upgrade.ingredients"), "Шерсть");

            keyMap.put(upgradeTranslationKeyFor("tinted_upgrade"), "Тонированое улучшение");
            keyMap.put(itemTranslationKeyFor("smithing_template.tinted_upgrade.additions_slot_description"), "Поместите осколок аметиста");
            keyMap.put(itemTranslationKeyFor("smithing_template.tinted_upgrade.applies_to"), "Незеритовому шлему");
            keyMap.put(itemTranslationKeyFor("smithing_template.tinted_upgrade.base_slot_description"), "Поместите незеритовый шлем");
            keyMap.put(itemTranslationKeyFor("smithing_template.tinted_upgrade.ingredients"), "Осколок аметиста");
        }
    }
}