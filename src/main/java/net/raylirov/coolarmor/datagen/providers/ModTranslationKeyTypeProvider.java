package net.raylirov.coolarmor.datagen.providers;

public enum ModTranslationKeyTypeProvider {
    ADVANCEMENT,
    ITEM,
    CREATIVETAB,
    UPGRADE;

    public interface TranslationKeySubType{}

    public enum AdvancementKeySubType implements TranslationKeySubType{
        TITLE,
        DESCRIPTION;
    }
}