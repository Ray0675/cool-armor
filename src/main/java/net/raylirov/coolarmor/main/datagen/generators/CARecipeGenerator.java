package net.raylirov.coolarmor.main.datagen.generators;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.main.init.CAItems;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class CARecipeGenerator extends RecipeProvider implements IConditionBuilder {
    public CARecipeGenerator(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        leatherSmithing(consumer, Items.NETHERITE_HELMET, CAItems.NETHERITE_LEATHERED_HELMET.get());
        leatherSmithing(consumer, Items.NETHERITE_CHESTPLATE, CAItems.NETHERITE_LEATHERED_CHESTPLATE.get());
        leatherSmithing(consumer, Items.NETHERITE_LEGGINGS, CAItems.NETHERITE_LEATHERED_LEGGINGS.get());
        leatherSmithing(consumer, Items.NETHERITE_BOOTS, CAItems.NETHERITE_LEATHERED_BOOTS.get());

        leatherSmithing(consumer, Items.DIAMOND_HELMET, CAItems.DIAMOND_LEATHERED_HELMET.get());
        leatherSmithing(consumer, Items.DIAMOND_CHESTPLATE, CAItems.DIAMOND_LEATHERED_CHESTPLATE.get());
        leatherSmithing(consumer, Items.DIAMOND_LEGGINGS, CAItems.DIAMOND_LEATHERED_LEGGINGS.get());
        leatherSmithing(consumer, Items.DIAMOND_BOOTS, CAItems.DIAMOND_LEATHERED_BOOTS.get());

        leatherSmithing(consumer, Items.GOLDEN_HELMET, CAItems.GOLDEN_LEATHERED_HELMET.get());
        leatherSmithing(consumer, Items.GOLDEN_CHESTPLATE, CAItems.GOLDEN_LEATHERED_CHESTPLATE.get());
        leatherSmithing(consumer, Items.GOLDEN_LEGGINGS, CAItems.GOLDEN_LEATHERED_LEGGINGS.get());
        leatherSmithing(consumer, Items.GOLDEN_BOOTS, CAItems.GOLDEN_LEATHERED_BOOTS.get());

        leatherSmithing(consumer, Items.CHAINMAIL_HELMET, CAItems.CHAINMAIL_LEATHERED_HELMET.get());
        leatherSmithing(consumer, Items.CHAINMAIL_CHESTPLATE, CAItems.CHAINMAIL_LEATHERED_CHESTPLATE.get());
        leatherSmithing(consumer, Items.CHAINMAIL_LEGGINGS, CAItems.CHAINMAIL_LEATHERED_LEGGINGS.get());
        leatherSmithing(consumer, Items.CHAINMAIL_BOOTS, CAItems.CHAINMAIL_LEATHERED_BOOTS.get());

        leatherSmithing(consumer, Items.IRON_HELMET, CAItems.IRON_LEATHERED_HELMET.get());
        leatherSmithing(consumer, Items.IRON_CHESTPLATE, CAItems.IRON_LEATHERED_CHESTPLATE.get());
        leatherSmithing(consumer, Items.IRON_LEGGINGS, CAItems.IRON_LEATHERED_LEGGINGS.get());
        leatherSmithing(consumer, Items.IRON_BOOTS, CAItems.IRON_LEATHERED_BOOTS.get());

        netheriteSmithing(consumer, CAItems.DIAMOND_LEATHERED_HELMET.get(), RecipeCategory.COMBAT, CAItems.NETHERITE_LEATHERED_HELMET.get());
        netheriteSmithing(consumer, CAItems.DIAMOND_LEATHERED_CHESTPLATE.get(), RecipeCategory.COMBAT, CAItems.NETHERITE_LEATHERED_CHESTPLATE.get());
        netheriteSmithing(consumer, CAItems.DIAMOND_LEATHERED_LEGGINGS.get(), RecipeCategory.COMBAT, CAItems.NETHERITE_LEATHERED_LEGGINGS.get());
        netheriteSmithing(consumer, CAItems.DIAMOND_LEATHERED_BOOTS.get(), RecipeCategory.COMBAT, CAItems.NETHERITE_LEATHERED_BOOTS.get());

        netheriteSmithing(consumer, CAItems.DIAMOND_TINTED_HELMET.get(), RecipeCategory.COMBAT, CAItems.NETHERITE_TINTED_HELMET.get());

        turtleHelmetSmithing(consumer, CAItems.NETHERITE_TURTLE_HELMET.get());
        turtleSmithing(consumer, Items.NETHERITE_CHESTPLATE, CAItems.NETHERITE_TURTLE_CHESTPLATE.get());
        turtleSmithing(consumer, Items.NETHERITE_LEGGINGS, CAItems.NETHERITE_TURTLE_LEGGINGS.get());
        turtleSmithing(consumer, Items.NETHERITE_BOOTS, CAItems.NETHERITE_TURTLE_BOOTS.get());

        gildedSmithing(consumer, Items.NETHERITE_HELMET, CAItems.NETHERITE_GILDED_HELMET.get());
        gildedSmithing(consumer, Items.NETHERITE_CHESTPLATE, CAItems.NETHERITE_GILDED_CHESTPLATE.get());
        gildedSmithing(consumer, Items.NETHERITE_LEGGINGS, CAItems.NETHERITE_GILDED_LEGGINGS.get());
        gildedSmithing(consumer, Items.NETHERITE_BOOTS, CAItems.NETHERITE_GILDED_BOOTS.get());

        wooledSmithing(consumer, CAItems.IRON_WOOLED_BOOTS.get());

        tintedSmithing(consumer, Items.NETHERITE_HELMET, CAItems.NETHERITE_TINTED_HELMET.get());
        tintedSmithing(consumer, Items.DIAMOND_HELMET, CAItems.DIAMOND_TINTED_HELMET.get());
        tintedSmithing(consumer, Items.GOLDEN_HELMET, CAItems.GOLDEN_TINTED_HELMET.get());
        tintedSmithing(consumer, Items.CHAINMAIL_HELMET, CAItems.CHAINMAIL_TINTED_HELMET.get());
        tintedSmithing(consumer, Items.IRON_HELMET, CAItems.IRON_TINTED_HELMET.get());
        tintedSmithing(consumer, Items.LEATHER_HELMET, CAItems.LEATHER_TINTED_HELMET.get());


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.LEATHER_UPGRADE_SMITHING_TEMPLATE.get(), 2)
                .pattern("ASA")
                .pattern("ADA")
                .pattern("AAA")
                .define('S', CAItems.LEATHER_UPGRADE_SMITHING_TEMPLATE.get())
                .define('A', Items.DIAMOND)
                .define('D', Items.LEATHER)
                .unlockedBy(getHasName(CAItems.LEATHER_UPGRADE_SMITHING_TEMPLATE.get()), has(CAItems.LEATHER_UPGRADE_SMITHING_TEMPLATE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.TURTLE_UPGRADE_SMITHING_TEMPLATE.get(), 2)
                .pattern("ASA")
                .pattern("ADA")
                .pattern("AAA")
                .define('S', CAItems.TURTLE_UPGRADE_SMITHING_TEMPLATE.get())
                .define('A', Items.DIAMOND)
                .define('D', Items.SCUTE)
                .unlockedBy(getHasName(CAItems.TURTLE_UPGRADE_SMITHING_TEMPLATE.get()), has(CAItems.TURTLE_UPGRADE_SMITHING_TEMPLATE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.GILDED_UPGRADE_SMITHING_TEMPLATE.get(), 2)
                .pattern("ASA")
                .pattern("ADA")
                .pattern("AAA")
                .define('S', CAItems.GILDED_UPGRADE_SMITHING_TEMPLATE.get())
                .define('A', Items.DIAMOND)
                .define('D', Items.GOLD_INGOT)
                .unlockedBy(getHasName(CAItems.GILDED_UPGRADE_SMITHING_TEMPLATE.get()), has(CAItems.GILDED_UPGRADE_SMITHING_TEMPLATE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.TINTED_UPGRADE_SMITHING_TEMPLATE.get(), 2)
                .pattern("ASA")
                .pattern("ADA")
                .pattern("AAA")
                .define('S', CAItems.TINTED_UPGRADE_SMITHING_TEMPLATE.get())
                .define('A', Items.DIAMOND)
                .define('D', Items.AMETHYST_SHARD)
                .unlockedBy(getHasName(CAItems.TINTED_UPGRADE_SMITHING_TEMPLATE.get()), has(CAItems.TINTED_UPGRADE_SMITHING_TEMPLATE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.WOOLED_UPGRADE_SMITHING_TEMPLATE.get(), 2)
                .pattern("ASA")
                .pattern("ADA")
                .pattern("AAA")
                .define('S', CAItems.WOOLED_UPGRADE_SMITHING_TEMPLATE.get())
                .define('A', Items.DIAMOND)
                .define('D', ItemTags.WOOL)
                .unlockedBy(getHasName(CAItems.WOOLED_UPGRADE_SMITHING_TEMPLATE.get()), has(CAItems.WOOLED_UPGRADE_SMITHING_TEMPLATE.get()))
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

    protected static void leatherSmithing(Consumer<FinishedRecipe> consumer, Item ingredientItem, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(CAItems.LEATHER_UPGRADE_SMITHING_TEMPLATE.get()),
                Ingredient.of(ingredientItem),
                Ingredient.of(Items.LEATHER), RecipeCategory.COMBAT, result)
                .unlocks("has_leather",
                        has(Items.LEATHER))
                .save(consumer,
                        new ResourceLocation(CoolArmor.MOD_ID, "smithing/leathered/" + getItemName(result) + "_smithing"));
    }

    protected static void turtleSmithing(Consumer<FinishedRecipe> consumer, Item ingredientItem, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(CAItems.TURTLE_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(ingredientItem),
                        Ingredient.of(Items.SCUTE), RecipeCategory.COMBAT, result)
                .unlocks("has_scute",
                        has(Items.SCUTE))
                .save(consumer,
                        new ResourceLocation(CoolArmor.MOD_ID, "smithing/turtle/" + getItemName(result) + "_smithing"));
    }

    protected static void turtleHelmetSmithing(Consumer<FinishedRecipe> consumer, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(CAItems.TURTLE_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.NETHERITE_HELMET),
                        Ingredient.of(Items.TURTLE_HELMET), RecipeCategory.COMBAT, result)
                .unlocks("has_scute",
                        has(Items.TURTLE_HELMET))
                .save(consumer,
                        new ResourceLocation(CoolArmor.MOD_ID, "smithing/turtle/" + getItemName(result) + "_smithing"));
    }

    protected static void gildedSmithing(Consumer<FinishedRecipe> consumer, Item ingredientItem, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(CAItems.GILDED_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(ingredientItem),
                        Ingredient.of(Items.GOLD_INGOT), RecipeCategory.COMBAT, result)
                .unlocks("has_gold",
                        has(Items.GOLD_INGOT))
                .save(consumer,
                        new ResourceLocation(CoolArmor.MOD_ID, "smithing/gilded/" + getItemName(result) + "_smithing"));
    }

    protected static void wooledSmithing(Consumer<FinishedRecipe> consumer, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(CAItems.WOOLED_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_BOOTS),
                        Ingredient.of(ItemTags.WOOL), RecipeCategory.COMBAT, result)
                .unlocks("has_wool",
                        has(ItemTags.WOOL))
                .save(consumer,
                        new ResourceLocation(CoolArmor.MOD_ID, "smithing/wooled/" + getItemName(result) + "_smithing"));
    }

    protected static void tintedSmithing(Consumer<FinishedRecipe> consumer, Item ingredientItem, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(CAItems.TINTED_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(ingredientItem),
                        Ingredient.of(Items.AMETHYST_SHARD), RecipeCategory.COMBAT, result)
                .unlocks("has_amethyst_shard",
                        has(Items.AMETHYST_SHARD))
                .save(consumer,
                        new ResourceLocation(CoolArmor.MOD_ID, "smithing/tinted/" + getItemName(result) + "_smithing"));
    }

}
