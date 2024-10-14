package net.raylirov.coolarmor.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.raylirov.coolarmor.CoolArmor;

public class ModBlockTags {
    private ModBlockTags() {}
    private static TagKey<Block> create(String pName) {
        return TagKey.create(Registries.BLOCK, new ResourceLocation(CoolArmor.MOD_ID, pName));
    }
}
