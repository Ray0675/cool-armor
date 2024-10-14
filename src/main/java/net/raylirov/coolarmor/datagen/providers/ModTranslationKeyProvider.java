package net.raylirov.coolarmor.datagen.providers;

import net.raylirov.coolarmor.CoolArmor;

public abstract class ModTranslationKeyProvider {

    //ITEMS
    public static String itemTranslationKeyFor(String name) {
        return itmTranslationKeyFor(ModTranslationKeyTypeProvider.ITEM, name);
    }

    public static String itmTranslationKeyFor(ModTranslationKeyTypeProvider type, String name) {
        return itmTranslationKeyFor(type, null, name);
    }

    public static String itmTranslationKeyFor(ModTranslationKeyTypeProvider type, ModTranslationKeyTypeProvider.TranslationKeySubType subType, String name) {
        String key = type + "." + CoolArmor.MOD_ID + "." + name;
        return key.toLowerCase();
    }
    //ITEMS

    //ADVANCEMENT
    public static String advancementTranslationKeyFor(String advancementName, ModTranslationKeyTypeProvider.AdvancementKeySubType type) {
        return advtranslationKeyFor(ModTranslationKeyTypeProvider.ADVANCEMENT, type, advancementName);
    }

    public static String advtranslationKeyFor(ModTranslationKeyTypeProvider type, ModTranslationKeyTypeProvider.TranslationKeySubType subType, String name) {
        String key = CoolArmor.MOD_ID + "." + type + "." + (subType != null ? subType + "." : "") + name;
        return key.toLowerCase();
    }
    //ADVANCEMENT

    //CREATIVE_TAB
    public static String tabsTranslationKeyFor(String name) {
        return tabTranslationKeyFor(ModTranslationKeyTypeProvider.CREATIVETAB, name);
    }

    public static String tabTranslationKeyFor(ModTranslationKeyTypeProvider type, String name) {
        return tabTranslationKeyFor(type, null, name);
    }

    public static String tabTranslationKeyFor(ModTranslationKeyTypeProvider type, ModTranslationKeyTypeProvider.TranslationKeySubType subType, String name) {
        String key = type + "." + name;
        return key.toLowerCase();
    }
    //CREATIVE_TAB

    //UPGRADE
    public static String upgradeTranslationKeyFor(String name) {
        return upgrTranslationKeyFor(ModTranslationKeyTypeProvider.UPGRADE, name);
    }

    public static String upgrTranslationKeyFor(ModTranslationKeyTypeProvider type, String name) {
        return upgrTranslationKeyFor(type, null, name);
    }

    public static String upgrTranslationKeyFor(ModTranslationKeyTypeProvider type, ModTranslationKeyTypeProvider.TranslationKeySubType subType, String name) {
        String key = type + "." + CoolArmor.MOD_ID + "." + name;
        return key.toLowerCase();
    }
    //UPGRADE
}
