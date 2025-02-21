package net.jorgefishkin.metallicexpansion.datagen;

import net.jorgefishkin.metallicexpansion.MetallicExpansionMod;
import net.jorgefishkin.metallicexpansion.block.ModBlocks;
import net.jorgefishkin.metallicexpansion.item.ModItems;
import net.jorgefishkin.metallicexpansion.util.ModTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> INDIUM_SMELTABLES = List.of(ModItems.RAW_INDIUM.get(), ModItems.INDIUM_DUST.get(), ModBlocks.INDIUM_ORE.get(), ModBlocks.DEEPSLATE_INDIUM_ORE.get(),
            ModBlocks.END_STONE_INDIUM_ORE.get());
    private static final List<ItemLike> PLATINUM_SMELTABLES = List.of(ModItems.RAW_PLATINUM.get(), ModItems.PLATINUM_DUST.get(), ModBlocks.PLATINUM_ORE.get(), ModBlocks.DEEPSLATE_PLATINUM_ORE.get(),
            ModBlocks.END_STONE_PLATINUM_ORE.get());
    private static final List<ItemLike> CADMIUM_SMELTABLES = List.of(ModItems.RAW_CADMIUM.get(), ModItems.CADMIUM_DUST.get(), ModBlocks.CADMIUM_ORE.get(), ModBlocks.DEEPSLATE_CADMIUM_ORE.get(),
            ModBlocks.NETHERRACK_CADMIUM_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {

        // Tools
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.INDIUM_SWORD.get())
                .pattern(" I ")
                .pattern(" I ")
                .pattern(" S ")
                .define('I', ModTags.Items.INDIUM_INGOT)
                .define('S', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_indium_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.INDIUM_INGOT.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PLATINUM_SWORD.get())
                .pattern(" I ")
                .pattern(" I ")
                .pattern(" S ")
                .define('I', ModTags.Items.PLATINUM_INGOT)
                .define('S', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_platinum_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.PLATINUM_INGOT.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.INDIUM_PICKAXE.get())
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .define('I', ModTags.Items.INDIUM_INGOT)
                .define('S', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_indium_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.INDIUM_INGOT.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PLATINUM_PICKAXE.get())
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .define('I', ModTags.Items.PLATINUM_INGOT)
                .define('S', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_platinum_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.PLATINUM_INGOT.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.INDIUM_AXE.get())
                .pattern("II ")
                .pattern("IS ")
                .pattern(" S ")
                .define('I', ModTags.Items.INDIUM_INGOT)
                .define('S', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_indium_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.INDIUM_INGOT.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PLATINUM_AXE.get())
                .pattern("II ")
                .pattern("IS ")
                .pattern(" S ")
                .define('I', ModTags.Items.PLATINUM_INGOT)
                .define('S', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_platinum_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.PLATINUM_INGOT.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.INDIUM_SHOVEL.get())
                .pattern(" I ")
                .pattern(" S ")
                .pattern(" S ")
                .define('I', ModTags.Items.INDIUM_INGOT)
                .define('S', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_indium_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.INDIUM_INGOT.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PLATINUM_SHOVEL.get())
                .pattern(" I ")
                .pattern(" S ")
                .pattern(" S ")
                .define('I', ModTags.Items.PLATINUM_INGOT)
                .define('S', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_platinum_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.PLATINUM_INGOT.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.INDIUM_HOE.get())
                .pattern("II ")
                .pattern(" S ")
                .pattern(" S ")
                .define('I', ModTags.Items.INDIUM_INGOT)
                .define('S', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_indium_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.INDIUM_INGOT.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PLATINUM_HOE.get())
                .pattern("II ")
                .pattern(" S ")
                .pattern(" S ")
                .define('I', ModTags.Items.PLATINUM_INGOT)
                .define('S', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_platinum_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.PLATINUM_INGOT.get()).build()))
                .save(consumer);

        // Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.INDIUM_HELMET.get())
                .pattern("III")
                .pattern("I I")
                .pattern("   ")
                .define('I', ModTags.Items.INDIUM_INGOT)
                .unlockedBy("has_indium_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.INDIUM_INGOT.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PLATINUM_HELMET.get())
                .pattern("III")
                .pattern("I I")
                .pattern("   ")
                .define('I', ModTags.Items.PLATINUM_INGOT)
                .unlockedBy("has_platinum_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.PLATINUM_INGOT.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.INDIUM_CHESTPLATE.get())
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .define('I', ModTags.Items.INDIUM_INGOT)
                .unlockedBy("has_indium_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.INDIUM_INGOT.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PLATINUM_CHESTPLATE.get())
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .define('I', ModTags.Items.PLATINUM_INGOT)
                .unlockedBy("has_platinum_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.PLATINUM_INGOT.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.INDIUM_LEGGINGS.get())
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .define('I', ModTags.Items.INDIUM_INGOT)
                .unlockedBy("has_indium_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.INDIUM_INGOT.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PLATINUM_LEGGINGS.get())
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .define('I', ModTags.Items.PLATINUM_INGOT)
                .unlockedBy("has_platinum_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.PLATINUM_INGOT.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.INDIUM_BOOTS.get())
                .pattern("   ")
                .pattern("I I")
                .pattern("I I")
                .define('I', ModTags.Items.INDIUM_INGOT)
                .unlockedBy("has_indium_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.INDIUM_INGOT.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PLATINUM_BOOTS.get())
                .pattern("   ")
                .pattern("I I")
                .pattern("I I")
                .define('I', ModTags.Items.PLATINUM_INGOT)
                .unlockedBy("has_platinum_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.PLATINUM_INGOT.get()).build()))
                .save(consumer);

        // Nugget to Ingot
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.INDIUM_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModTags.Items.INDIUM_NUGGET)
                .unlockedBy("has_indium_nugget", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.INDIUM_NUGGET.get()).build()))
                .save(consumer, "metallicexpansion:indium_nugget_to_ingot");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModTags.Items.PLATINUM_NUGGET)
                .unlockedBy("has_platinum_nugget", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.INDIUM_NUGGET.get()).build()))
                .save(consumer, "metallicexpansion:platinum_nugget_to_ingot");

        // Ingot to Nugget
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.INDIUM_NUGGET.get(), 9)
                .requires(ModTags.Items.INDIUM_INGOT)
                .unlockedBy("has_indium_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.INDIUM_INGOT.get()).build()))
                .save(consumer, "metallicexpansion:indium_ingot_to_nugget");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PLATINUM_NUGGET.get(), 9)
                .requires(ModTags.Items.PLATINUM_INGOT)
                .unlockedBy("has_platinum_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.INDIUM_INGOT.get()).build()))
                .save(consumer, "metallicexpansion:platinum_ingot_to_nugget");


        // Storage Blocks
        nineBlockStorageRecipes(consumer, RecipeCategory.MISC, ModItems.INDIUM_INGOT.get(), RecipeCategory.MISC, ModBlocks.INDIUM_BLOCK.get(),
                "metallicexpansion:indium_ingot", "indium", "metallicexpansion:indium_block", "indium");
        nineBlockStorageRecipes(consumer, RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), RecipeCategory.MISC, ModBlocks.PLATINUM_BLOCK.get(),
                "metallicexpansion:platinum_ingot", "platinum", "metallicexpansion:platinum_block", "platinum");

        nineBlockStorageRecipes(consumer, RecipeCategory.MISC, ModItems.RAW_INDIUM.get(), RecipeCategory.MISC, ModBlocks.RAW_INDIUM_BLOCK.get(),
                "metallicexpansion:raw_indium", "indium", "metallicexpansion:raw_indium_block", "indium");
        nineBlockStorageRecipes(consumer, RecipeCategory.MISC, ModItems.RAW_PLATINUM.get(), RecipeCategory.MISC, ModBlocks.RAW_PLATINUM_BLOCK.get(),
                "metallicexpansion:raw_platinum", "platinum", "metallicexpansion:raw_platinum_block", "platinum");


        // Smelting and Blasting
        oreSmelting(consumer, INDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.INDIUM_INGOT.get(), 0.25f, 200, "indium");
        oreBlasting(consumer, INDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.INDIUM_INGOT.get(), 0.25f, 100, "indium");
        oreSmelting(consumer, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), 0.35f, 200, "platinum");
        oreBlasting(consumer, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), 0.35f, 100, "platinum");
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike)).save(pFinishedRecipeConsumer, MetallicExpansionMod.MOD_ID + ":" +  getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
