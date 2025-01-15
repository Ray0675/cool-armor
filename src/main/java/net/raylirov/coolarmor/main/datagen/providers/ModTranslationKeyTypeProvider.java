package net.raylirov.coolarmor.main.datagen.providers;

public enum ModTranslationKeyTypeProvider {
    ADVANCEMENT,
    ITEM,
    CREATIVETAB,
    UPGRADE;

    public interface TranslationKeySubType{}

    public enum AdvancementKeySubType implements TranslationKeySubType{
        TITLE,
        DESCRIPTION
    }
}