package net.raylirov.coolarmor.main.datagen.providers;

public enum CATranslationKeyTypeProvider {
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