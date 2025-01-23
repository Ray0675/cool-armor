package net.raylirov.coolarmor.main.datagen.providers;

import net.raylirov.coolarmor.CoolArmor;

public abstract class CATranslationKeyProvider {

    //ITEMS
    public static String itemTranslationKeyFor(String name) {
        return itmTranslationKeyFor(CATranslationKeyTypeProvider.ITEM, name);
    }

    public static String itmTranslationKeyFor(CATranslationKeyTypeProvider type, String name) {
        String key = type + "." + CoolArmor.MOD_ID + "." + name;
        return key.toLowerCase();
    }

    //ITEMS

    //ADVANCEMENT
    public static String advancementTranslationKeyFor(String advancementName, CATranslationKeyTypeProvider.AdvancementKeySubType type) {
        return advtranslationKeyFor(CATranslationKeyTypeProvider.ADVANCEMENT, type, advancementName);
    }

    public static String advtranslationKeyFor(CATranslationKeyTypeProvider type, CATranslationKeyTypeProvider.TranslationKeySubType subType, String name) {
        String key = CoolArmor.MOD_ID + "." + type + "." + (subType != null ? subType + "." : "") + name;
        return key.toLowerCase();
    }

    //ADVANCEMENT

    //CREATIVE_TAB
    public static String tabsTranslationKeyFor(String name) {
        return tabTranslationKeyFor(CATranslationKeyTypeProvider.CREATIVETAB, name);
    }

    public static String tabTranslationKeyFor(CATranslationKeyTypeProvider type, String name) {
        String key = type + "." + name;
        return key.toLowerCase();
    }
    //CREATIVE_TAB

    //UPGRADE
    public static String upgradeTranslationKeyFor(String name) {
        return upgrTranslationKeyFor(CATranslationKeyTypeProvider.UPGRADE, name);
    }

    public static String upgrTranslationKeyFor(CATranslationKeyTypeProvider type, String name) {
        String key = type + "." + CoolArmor.MOD_ID + "." + name;
        return key.toLowerCase();
    }
    //UPGRADE
}
