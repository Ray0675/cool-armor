package net.raylirov.coolarmor.datagen.generators;

import com.mojang.datafixers.types.templates.Tag;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.init.ModItems;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends RecipeProvider implements IConditionBuilder {
    public ModRecipeGenerator(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        leatherSmithing(consumer, Items.NETHERITE_HELMET, RecipeCategory.COMBAT, ModItems.NETHERITE_LEATHERED_HELMET.get());
        leatherSmithing(consumer, Items.NETHERITE_CHESTPLATE, RecipeCategory.COMBAT, ModItems.NETHERITE_LEATHERED_CHESTPLATE.get());
        leatherSmithing(consumer, Items.NETHERITE_LEGGINGS, RecipeCategory.COMBAT, ModItems.NETHERITE_LEATHERED_LEGGINGS.get());
        leatherSmithing(consumer, Items.NETHERITE_BOOTS, RecipeCategory.COMBAT, ModItems.NETHERITE_LEATHERED_BOOTS.get());

        leatherSmithing(consumer, Items.DIAMOND_HELMET, RecipeCategory.COMBAT, ModItems.DIAMOND_LEATHERED_HELMET.get());
        leatherSmithing(consumer, Items.DIAMOND_CHESTPLATE, RecipeCategory.COMBAT, ModItems.DIAMOND_LEATHERED_CHESTPLATE.get());
        leatherSmithing(consumer, Items.DIAMOND_LEGGINGS, RecipeCategory.COMBAT, ModItems.DIAMOND_LEATHERED_LEGGINGS.get());
        leatherSmithing(consumer, Items.DIAMOND_BOOTS, RecipeCategory.COMBAT, ModItems.DIAMOND_LEATHERED_BOOTS.get());

        leatherSmithing(consumer, Items.GOLDEN_HELMET, RecipeCategory.COMBAT, ModItems.GOLDEN_LEATHERED_HELMET.get());
        leatherSmithing(consumer, Items.GOLDEN_CHESTPLATE, RecipeCategory.COMBAT, ModItems.GOLDEN_LEATHERED_CHESTPLATE.get());
        leatherSmithing(consumer, Items.GOLDEN_LEGGINGS, RecipeCategory.COMBAT, ModItems.GOLDEN_LEATHERED_LEGGINGS.get());
        leatherSmithing(consumer, Items.GOLDEN_BOOTS, RecipeCategory.COMBAT, ModItems.GOLDEN_LEATHERED_BOOTS.get());

        leatherSmithing(consumer, Items.CHAINMAIL_HELMET, RecipeCategory.COMBAT, ModItems.CHAINMAIL_LEATHERED_HELMET.get());
        leatherSmithing(consumer, Items.CHAINMAIL_CHESTPLATE, RecipeCategory.COMBAT, ModItems.CHAINMAIL_LEATHERED_CHESTPLATE.get());
        leatherSmithing(consumer, Items.CHAINMAIL_LEGGINGS, RecipeCategory.COMBAT, ModItems.CHAINMAIL_LEATHERED_LEGGINGS.get());
        leatherSmithing(consumer, Items.CHAINMAIL_BOOTS, RecipeCategory.COMBAT, ModItems.CHAINMAIL_LEATHERED_BOOTS.get());

        leatherSmithing(consumer, Items.IRON_HELMET, RecipeCategory.COMBAT, ModItems.IRON_LEATHERED_HELMET.get());
        leatherSmithing(consumer, Items.IRON_CHESTPLATE, RecipeCategory.COMBAT, ModItems.IRON_LEATHERED_CHESTPLATE.get());
        leatherSmithing(consumer, Items.IRON_LEGGINGS, RecipeCategory.COMBAT, ModItems.IRON_LEATHERED_LEGGINGS.get());
        leatherSmithing(consumer, Items.IRON_BOOTS, RecipeCategory.COMBAT, ModItems.IRON_LEATHERED_BOOTS.get());

        netheriteSmithing(consumer, ModItems.DIAMOND_LEATHERED_HELMET.get(), RecipeCategory.COMBAT, ModItems.NETHERITE_LEATHERED_HELMET.get());
        netheriteSmithing(consumer, ModItems.DIAMOND_LEATHERED_CHESTPLATE.get(), RecipeCategory.COMBAT, ModItems.NETHERITE_LEATHERED_CHESTPLATE.get());
        netheriteSmithing(consumer, ModItems.DIAMOND_LEATHERED_LEGGINGS.get(), RecipeCategory.COMBAT, ModItems.NETHERITE_LEATHERED_LEGGINGS.get());
        netheriteSmithing(consumer, ModItems.DIAMOND_LEATHERED_BOOTS.get(), RecipeCategory.COMBAT, ModItems.NETHERITE_LEATHERED_BOOTS.get());

        netheriteSmithing(consumer, ModItems.DIAMOND_TINTED_HELMET.get(), RecipeCategory.COMBAT, ModItems.NETHERITE_TINTED_HELMET.get());

        turtleHelmetSmithing(consumer, Items.NETHERITE_HELMET, RecipeCategory.COMBAT, ModItems.NETHERITE_TURTLE_HELMET.get());
        turtleSmithing(consumer, Items.NETHERITE_CHESTPLATE, RecipeCategory.COMBAT, ModItems.NETHERITE_TURTLE_CHESTPLATE.get());
        turtleSmithing(consumer, Items.NETHERITE_LEGGINGS, RecipeCategory.COMBAT, ModItems.NETHERITE_TURTLE_LEGGINGS.get());
        turtleSmithing(consumer, Items.NETHERITE_BOOTS, RecipeCategory.COMBAT, ModItems.NETHERITE_TURTLE_BOOTS.get());

        gildedSmithing(consumer, Items.NETHERITE_HELMET, RecipeCategory.COMBAT, ModItems.NETHERITE_GILDED_HELMET.get());
        gildedSmithing(consumer, Items.NETHERITE_CHESTPLATE, RecipeCategory.COMBAT, ModItems.NETHERITE_GILDED_CHESTPLATE.get());
        gildedSmithing(consumer, Items.NETHERITE_LEGGINGS, RecipeCategory.COMBAT, ModItems.NETHERITE_GILDED_LEGGINGS.get());
        gildedSmithing(consumer, Items.NETHERITE_BOOTS, RecipeCategory.COMBAT, ModItems.NETHERITE_GILDED_BOOTS.get());

        wooledSmithing(consumer, Items.IRON_BOOTS, RecipeCategory.COMBAT, ModItems.IRON_WOOLED_BOOTS.get());

        tintedSmithing(consumer, Items.NETHERITE_HELMET, RecipeCategory.COMBAT, ModItems.NETHERITE_TINTED_HELMET.get());
        tintedSmithing(consumer, Items.DIAMOND_HELMET, RecipeCategory.COMBAT, ModItems.DIAMOND_TINTED_HELMET.get());
        tintedSmithing(consumer, Items.GOLDEN_HELMET, RecipeCategory.COMBAT, ModItems.GOLDEN_TINTED_HELMET.get());
        tintedSmithing(consumer, Items.CHAINMAIL_HELMET, RecipeCategory.COMBAT, ModItems.CHAINMAIL_TINTED_HELMET.get());
        tintedSmithing(consumer, Items.IRON_HELMET, RecipeCategory.COMBAT, ModItems.IRON_TINTED_HELMET.get());
        tintedSmithing(consumer, Items.LEATHER_HELMET, RecipeCategory.COMBAT, ModItems.LEATHER_TINTED_HELMET.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LEATHER_UPGRADE_SMITHING_TEMPLATE.get(), 2)
                .pattern("ASA")
                .pattern("ADA")
                .pattern("AAA")
                .define('S', ModItems.LEATHER_UPGRADE_SMITHING_TEMPLATE.get())
                .define('A', Items.DIAMOND)
                .define('D', Items.LEATHER)
                .unlockedBy(getHasName(ModItems.LEATHER_UPGRADE_SMITHING_TEMPLATE.get()), has(ModItems.LEATHER_UPGRADE_SMITHING_TEMPLATE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TURTLE_UPGRADE_SMITHING_TEMPLATE.get(), 2)
                .pattern("ASA")
                .pattern("ADA")
                .pattern("AAA")
                .define('S', ModItems.TURTLE_UPGRADE_SMITHING_TEMPLATE.get())
                .define('A', Items.DIAMOND)
                .define('D', Items.SCUTE)
                .unlockedBy(getHasName(ModItems.TURTLE_UPGRADE_SMITHING_TEMPLATE.get()), has(ModItems.TURTLE_UPGRADE_SMITHING_TEMPLATE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GILDED_UPGRADE_SMITHING_TEMPLATE.get(), 2)
                .pattern("ASA")
                .pattern("ADA")
                .pattern("AAA")
                .define('S', ModItems.GILDED_UPGRADE_SMITHING_TEMPLATE.get())
                .define('A', Items.DIAMOND)
                .define('D', Items.GOLD_INGOT)
                .unlockedBy(getHasName(ModItems.GILDED_UPGRADE_SMITHING_TEMPLATE.get()), has(ModItems.GILDED_UPGRADE_SMITHING_TEMPLATE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TINTED_UPGRADE_SMITHING_TEMPLATE.get(), 2)
                .pattern("ASA")
                .pattern("ADA")
                .pattern("AAA")
                .define('S', ModItems.TINTED_UPGRADE_SMITHING_TEMPLATE.get())
                .define('A', Items.DIAMOND)
                .define('D', Items.AMETHYST_SHARD)
                .unlockedBy(getHasName(ModItems.TINTED_UPGRADE_SMITHING_TEMPLATE.get()), has(ModItems.TINTED_UPGRADE_SMITHING_TEMPLATE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WOOLED_UPGRADE_SMITHING_TEMPLATE.get(), 2)
                .pattern("ASA")
                .pattern("ADA")
                .pattern("AAA")
                .define('S', ModItems.WOOLED_UPGRADE_SMITHING_TEMPLATE.get())
                .define('A', Items.DIAMOND)
                .define('D', ItemTags.WOOL)
                .unlockedBy(getHasName(ModItems.WOOLED_UPGRADE_SMITHING_TEMPLATE.get()), has(ModItems.WOOLED_UPGRADE_SMITHING_TEMPLATE.get()))
                .save(consumer);
    }

    protected static void netheriteSmithing(@NotNull Consumer<FinishedRecipe> consumer, @NotNull Item ingredientItem, @NotNull RecipeCategory category, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.of(ingredientItem),
                Ingredient.of(Items.NETHERITE_INGOT), category, result)
                .unlocks("has_netherite_ingot",
                        has(Items.NETHERITE_INGOT))
                .save(consumer,
                        new ResourceLocation(CoolArmor.MOD_ID, "smithing/netherite/" + getItemName(result) + "_smithing"));
    }

    protected static void leatherSmithing(Consumer<FinishedRecipe> consumer, Item ingredientItem, RecipeCategory category, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.LEATHER_UPGRADE_SMITHING_TEMPLATE.get()),
                Ingredient.of(ingredientItem),
                Ingredient.of(Items.LEATHER), category, result)
                .unlocks("has_leather",
                        has(Items.LEATHER))
                .save(consumer,
                        new ResourceLocation(CoolArmor.MOD_ID, "smithing/leathered/" + getItemName(result) + "_smithing"));
    }

    protected static void turtleSmithing(Consumer<FinishedRecipe> consumer, Item ingredientItem, RecipeCategory category, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.TURTLE_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(ingredientItem),
                        Ingredient.of(Items.SCUTE), category, result)
                .unlocks("has_scute",
                        has(Items.SCUTE))
                .save(consumer,
                        new ResourceLocation(CoolArmor.MOD_ID, "smithing/turtle/" + getItemName(result) + "_smithing"));
    }

    protected static void turtleHelmetSmithing(Consumer<FinishedRecipe> consumer, Item ingredientItem, RecipeCategory category, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.TURTLE_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(ingredientItem),
                        Ingredient.of(Items.TURTLE_HELMET), category, result)
                .unlocks("has_scute",
                        has(Items.TURTLE_HELMET))
                .save(consumer,
                        new ResourceLocation(CoolArmor.MOD_ID, "smithing/turtle/" + getItemName(result) + "_smithing"));
    }

    protected static void gildedSmithing(Consumer<FinishedRecipe> consumer, Item ingredientItem, RecipeCategory category, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.GILDED_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(ingredientItem),
                        Ingredient.of(Items.GOLD_INGOT), category, result)
                .unlocks("has_gold",
                        has(Items.GOLD_INGOT))
                .save(consumer,
                        new ResourceLocation(CoolArmor.MOD_ID, "smithing/gilded/" + getItemName(result) + "_smithing"));
    }

    protected static void wooledSmithing(Consumer<FinishedRecipe> consumer, Item ingredientItem, RecipeCategory category, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.WOOLED_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(ingredientItem),
                        Ingredient.of(ItemTags.WOOL), category, result)
                .unlocks("has_wool",
                        has(ItemTags.WOOL))
                .save(consumer,
                        new ResourceLocation(CoolArmor.MOD_ID, "smithing/wooled/" + getItemName(result) + "_smithing"));
    }

    protected static void tintedSmithing(Consumer<FinishedRecipe> consumer, Item ingredientItem, RecipeCategory category, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.TINTED_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(ingredientItem),
                        Ingredient.of(Items.AMETHYST_SHARD), category, result)
                .unlocks("has_amethyst_shard",
                        has(Items.AMETHYST_SHARD))
                .save(consumer,
                        new ResourceLocation(CoolArmor.MOD_ID, "smithing/tinted/" + getItemName(result) + "_smithing"));
    }

}
