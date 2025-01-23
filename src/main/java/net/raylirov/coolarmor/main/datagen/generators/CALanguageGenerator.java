package net.raylirov.coolarmor.main.datagen.generators;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.main.datagen.providers.CATranslationKeyProvider;
import net.raylirov.coolarmor.main.datagen.providers.CATranslationKeyTypeProvider;

import java.util.HashMap;
import java.util.Map;

public class CALanguageGenerator extends LanguageProvider {

    private final String lang;
    private final Map<String, String> keyMap = new HashMap<>();

    public CALanguageGenerator(PackOutput output, String locale) {
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
            
            keyMap.put(CATranslationKeyProvider.tabsTranslationKeyFor(CoolArmor.MOD_ID + "_tab"), "Cool Armor");
            
            keyMap.put(CATranslationKeyProvider.advancementTranslationKeyFor("rdy_for_winter", CATranslationKeyTypeProvider.AdvancementKeySubType.TITLE), "Ready for Winter!");
            keyMap.put(CATranslationKeyProvider.advancementTranslationKeyFor("rdy_for_winter", CATranslationKeyTypeProvider.AdvancementKeySubType.DESCRIPTION), "Get a full suit of Winterized armor.");

            keyMap.put(CATranslationKeyProvider.advancementTranslationKeyFor("turtle_power", CATranslationKeyTypeProvider.AdvancementKeySubType.TITLE), "Turtle power!");
            keyMap.put(CATranslationKeyProvider.advancementTranslationKeyFor("turtle_power", CATranslationKeyTypeProvider.AdvancementKeySubType.DESCRIPTION), "Get a full suit of Shell armor.");

            keyMap.put(CATranslationKeyProvider.advancementTranslationKeyFor("gilded", CATranslationKeyTypeProvider.AdvancementKeySubType.TITLE), "Shiny!");
            keyMap.put(CATranslationKeyProvider.advancementTranslationKeyFor("gilded", CATranslationKeyTypeProvider.AdvancementKeySubType.DESCRIPTION), "Get a full suit of gilded armor.");

            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_tinted_helmet"), "Netherite tinted helmet");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("diamond_tinted_helmet"), "Diamond tinted helmet");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("golden_tinted_helmet"), "Golden tinted helmet");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("chainmail_tinted_helmet"), "Chainmail tinted helmet");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("iron_tinted_helmet"), "Iron tinted helmet");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("leather_tinted_helmet"), "Leather tinted helmet");

            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("iron_wooled_boots"), "Iron wooled boots");

            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_gilded_helmet"), "Gilded helmet");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_gilded_chestplate"), "Gilded chestplate");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_gilded_leggings"), "Gilded leggings");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_gilded_boots"), "Gilded boots");

            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_turtle_helmet"), "Shell helmet");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_turtle_chestplate"), "Shell chestplate");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_turtle_leggings"), "Shell leggings");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_turtle_boots"), "Shell boots");

            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_leathered_helmet"), "Winterized netherite helmet");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_leathered_chestplate"), "Winterized netherite chestplate");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_leathered_leggings"), "Winterized netherite leggings");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_leathered_boots"), "Winterized netherite boots");

            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("diamond_leathered_helmet"), "Winterized diamond helmet");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("diamond_leathered_chestplate"), "Winterized diamond chestplate");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("diamond_leathered_leggings"), "Winterized diamond leggings");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("diamond_leathered_boots"), "Winterized diamond boots");

            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("golden_leathered_helmet"), "Winterized golden helmet");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("golden_leathered_chestplate"), "Winterized golden chestplate");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("golden_leathered_leggings"), "Winterized golden leggings");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("golden_leathered_boots"), "Winterized golden boots");

            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("chainmail_leathered_helmet"), "Winterized chainmail helmet");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("chainmail_leathered_chestplate"), "Winterized chainmail chestplate");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("chainmail_leathered_leggings"), "Winterized chainmail leggings");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("chainmail_leathered_boots"), "Winterized chainmail boots");

            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("iron_leathered_helmet"), "Winterized iron helmet");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("iron_leathered_chestplate"), "Winterized iron chestplate");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("iron_leathered_leggings"), "Winterized iron leggings");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("iron_leathered_boots"), "Winterized iron boots");

            keyMap.put(CATranslationKeyProvider.upgradeTranslationKeyFor("leather_upgrade"), "Leather Upgrade");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.additions_slot_description"), "Add Leather");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.applies_to"), "All armor, except leather");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.base_slot_description"), "Add any armor, except leather");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.ingredients"), "Leather");

            keyMap.put(CATranslationKeyProvider.upgradeTranslationKeyFor("turtle_upgrade"), "Turtle Upgrade");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.additions_slot_description"), "Add scute or turtle shell");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.applies_to"), "Netherite armor");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.base_slot_description"), "Add netherite armor");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.ingredients"), "Scute, turtle shell");

            keyMap.put(CATranslationKeyProvider.upgradeTranslationKeyFor("gilded_upgrade"), "Gilded Upgrade");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.additions_slot_description"), "Add Gold Ingot");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.applies_to"), "Netherite armor");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.base_slot_description"), "Add netherite armor");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.ingredients"), "Gold Ingot");

            keyMap.put(CATranslationKeyProvider.upgradeTranslationKeyFor("wooled_upgrade"), "Wooled Upgrade");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.additions_slot_description"), "Add Wool");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.applies_to"), "Iron boots");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.base_slot_description"), "Add Iron boots");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.ingredients"), "Wool");

            keyMap.put(CATranslationKeyProvider.upgradeTranslationKeyFor("tinted_upgrade"), "Tinted Upgrade");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.additions_slot_description"), "Add amethyst shard");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.applies_to"), "Any helmet");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.base_slot_description"), "Add helmet");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.ingredients"), "Amethyst shard");

        }

        if (lang.equals("ru_ru")) {
            keyMap.put(CATranslationKeyProvider.tabsTranslationKeyFor(CoolArmor.MOD_ID + "_tab"), "Cool Armor");

            keyMap.put(CATranslationKeyProvider.advancementTranslationKeyFor("rdy_for_winter", CATranslationKeyTypeProvider.AdvancementKeySubType.TITLE), "К Зиме готов!");
            keyMap.put(CATranslationKeyProvider.advancementTranslationKeyFor("rdy_for_winter", CATranslationKeyTypeProvider.AdvancementKeySubType.DESCRIPTION), "Получите полный комплект утеплённой брони.");

            keyMap.put(CATranslationKeyProvider.advancementTranslationKeyFor("turtle_power", CATranslationKeyTypeProvider.AdvancementKeySubType.TITLE), "Черепашья мощь!");
            keyMap.put(CATranslationKeyProvider.advancementTranslationKeyFor("turtle_power", CATranslationKeyTypeProvider.AdvancementKeySubType.DESCRIPTION), "Получите полный комплект панцириевой брони.");

            keyMap.put(CATranslationKeyProvider.advancementTranslationKeyFor("gilded", CATranslationKeyTypeProvider.AdvancementKeySubType.TITLE), "Блестяще!");
            keyMap.put(CATranslationKeyProvider.advancementTranslationKeyFor("gilded", CATranslationKeyTypeProvider.AdvancementKeySubType.DESCRIPTION), "Получите полный комплект золочёной брони.");

            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_tinted_helmet"), "Незеритовый тонированный шлем");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("diamond_tinted_helmet"), "Алмазный тонированный шлем");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("golden_tinted_helmet"), "Золотой тонированный шлем");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("chainmail_tinted_helmet"), "Кольчужный тонированный шлем");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("iron_tinted_helmet"), "Железный тонированный шлем");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("leather_tinted_helmet"), "Кожаный тонированный шлем");

            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("iron_wooled_boots"), "Железные подкрадули");

            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_gilded_helmet"), "Золочёный шлем");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_gilded_chestplate"), "Золочёный нагрудник");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_gilded_leggings"), "Золочёные поножи");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_gilded_boots"), "Золоченые ботинки");

            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_turtle_helmet"), "Панцирный шлем");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_turtle_chestplate"), "Панцирный нагрудник");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_turtle_leggings"), "Панцирные поножи");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_turtle_boots"), "Панцирные ботинки");

            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_leathered_helmet"), "Утеплённый незеритовый шлем");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_leathered_chestplate"), "Утеплённый незеритовый нагрудник");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_leathered_leggings"), "Утеплённые незеритовые поножи");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("netherite_leathered_boots"), "Утеплённые незеритовые ботинки");

            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("diamond_leathered_helmet"), "Утеплённый алмазный шлем");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("diamond_leathered_chestplate"), "Утеплённый алмазный нагрудник");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("diamond_leathered_leggings"), "Утеплённые алмазные поножи");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("diamond_leathered_boots"), "Утеплённые алмазные ботинки");

            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("golden_leathered_helmet"), "Утеплённый золотой шлем");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("golden_leathered_chestplate"), "Утеплённый золотой нагрудник");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("golden_leathered_leggings"), "Утеплённые золотые поножи");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("golden_leathered_boots"), "Утеплённые золотые ботинки");

            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("chainmail_leathered_helmet"), "Утеплённый кольчужный шлем");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("chainmail_leathered_chestplate"), "Утеплённый кольчужный нагрудник");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("chainmail_leathered_leggings"), "Утеплённые кольчужные поножи");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("chainmail_leathered_boots"), "Утеплённые кольчужные ботинки");

            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("iron_leathered_helmet"), "Утеплённый железный шлем");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("iron_leathered_chestplate"), "Утеплённый железный нагрудник");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("iron_leathered_leggings"), "Утеплённые железные поножи");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("iron_leathered_boots"), "Утеплённые железные ботинки");

            keyMap.put(CATranslationKeyProvider.upgradeTranslationKeyFor("leather_upgrade"), "Кожаное улучшение");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.additions_slot_description"), "Поместите кожу");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.applies_to"), "Любой броне, кроме кожаной");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.base_slot_description"), "Поместите любую броню, кроме кожаной");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.ingredients"), "Кожа");

            keyMap.put(CATranslationKeyProvider.upgradeTranslationKeyFor("turtle_upgrade"), "Черепашье улучшение");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.additions_slot_description"), "Поместите щиток или черепаший панцирь");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.applies_to"), "Незеритовой броне");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.base_slot_description"), "Поместите незеритовый доспех");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.ingredients"), "Щиток, черепаший панцирь");

            keyMap.put(CATranslationKeyProvider.upgradeTranslationKeyFor("gilded_upgrade"), "Золочёное улучшение");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.additions_slot_description"), "Поместите золотой слиток");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.applies_to"), "Незеритовой броне");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.base_slot_description"), "Поместите незеритовый доспех");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.ingredients"), "Золотой слиток");

            keyMap.put(CATranslationKeyProvider.upgradeTranslationKeyFor("wooled_upgrade"), "Шерстяное улучшение");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.additions_slot_description"), "Поместите шерсть");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.applies_to"), "Железным ботинкам");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.base_slot_description"), "Поместите железные ботинки");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.ingredients"), "Шерсть");

            keyMap.put(CATranslationKeyProvider.upgradeTranslationKeyFor("tinted_upgrade"), "Тонированое улучшение");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.additions_slot_description"), "Поместите осколок аметиста");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.applies_to"), "Любому шлему");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.base_slot_description"), "Поместите шлем");
            keyMap.put(CATranslationKeyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.ingredients"), "Осколок аметиста");
        }
    }
}