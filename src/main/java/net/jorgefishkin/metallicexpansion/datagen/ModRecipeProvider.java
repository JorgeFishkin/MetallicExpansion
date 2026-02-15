package net.jorgefishkin.metallicexpansion.datagen;

import net.jorgefishkin.metallicexpansion.util.EnumMaterials;
import net.jorgefishkin.metallicexpansion.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        for(EnumMaterials m : EnumMaterials.values()) {
            String name = m.name().toLowerCase();

            // Storage Block
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, m.getStorageBlock())
                    .pattern("III")
                    .pattern("III")
                    .pattern("III")
                    .define('I', ModTags.getTagsFor(m).INGOT)
                    .unlockedBy("has_"+name+"_ingot", has(ModTags.getTagsFor(m).INGOT))
                    .save(recipeOutput, "metallicexpansion:"+name+"_block_from_"+name+"_ingot");

            // Raw Storage Block
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, m.getRawStorageBlock())
                    .pattern("RRR")
                    .pattern("RRR")
                    .pattern("RRR")
                    .define('R', ModTags.getTagsFor(m).RAW)
                    .unlockedBy("has_raw_"+name, has(ModTags.getTagsFor(m).RAW))
                    .save(recipeOutput, "metallicexpansion:raw_"+name+"_block_from_raw_"+name);

            // Ingot from Nuggets
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, m.getIngot())
                    .pattern("NNN")
                    .pattern("NNN")
                    .pattern("NNN")
                    .define('N', ModTags.getTagsFor(m).NUGGET)
                    .unlockedBy("has_"+name+"_nugget", has(ModTags.getTagsFor(m).NUGGET))
                    .save(recipeOutput, "metallicexpansion:"+name+"_ingot_from_"+name+"_nugget");

            // Ingots from Storage Block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, m.getIngot(), 9)
                    .requires(ModTags.getTagsFor(m).STORAGE_I)
                    .unlockedBy("has_"+name+"_block", has(ModTags.getTagsFor(m).STORAGE_I))
                    .save(recipeOutput, "metallicexpansion:"+name+"_ingot_from_block");

            // Raw Ore from Raw Storage Block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, m.getRaw(), 9)
                    .requires(ModTags.getTagsFor(m).RAW_STORAGE_I)
                    .unlockedBy("has_raw_"+name+"_block", has(ModTags.getTagsFor(m).RAW_STORAGE_I))
                    .save(recipeOutput, "metallicexpansion:raw_"+name+"_from_raw_block");

            // Nuggets from Ingot
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, m.getNugget(), 9)
                    .requires(ModTags.getTagsFor(m).INGOT)
                    .unlockedBy("has_"+name+"_ingot", has(ModTags.getTagsFor(m).INGOT))
                    .save(recipeOutput, "metallicexpansion:"+name+"_nugget_from_"+name+"_ingot");

            // Sword
            ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, m.getSword())
                    .pattern(" I ")
                    .pattern(" I ")
                    .pattern(" S ")
                    .define('I', ModTags.getTagsFor(m).INGOT)
                    .define('S', Tags.Items.RODS_WOODEN)
                    .unlockedBy("has_"+name+"_ingot", has(ModTags.getTagsFor(m).INGOT))
                    .save(recipeOutput);
            ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, m.getPickaxe())
                    .pattern("III")
                    .pattern(" S ")
                    .pattern(" S ")
                    .define('I', ModTags.getTagsFor(m).INGOT)
                    .define('S', Tags.Items.RODS_WOODEN)
                    .unlockedBy("has_"+name+"_ingot", has(ModTags.getTagsFor(m).INGOT))
                    .save(recipeOutput);
            ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, m.getAxe())
                    .pattern("II ")
                    .pattern("IS ")
                    .pattern(" S ")
                    .define('I', ModTags.getTagsFor(m).INGOT)
                    .define('S', Tags.Items.RODS_WOODEN)
                    .unlockedBy("has_"+name+"_ingot", has(ModTags.getTagsFor(m).INGOT))
                    .save(recipeOutput);
            ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, m.getShovel())
                    .pattern(" I ")
                    .pattern(" S ")
                    .pattern(" S ")
                    .define('I', ModTags.getTagsFor(m).INGOT)
                    .define('S', Tags.Items.RODS_WOODEN)
                    .unlockedBy("has_"+name+"_ingot", has(ModTags.getTagsFor(m).INGOT))
                    .save(recipeOutput);
            ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, m.getHoe())
                    .pattern("II ")
                    .pattern(" S ")
                    .pattern(" S ")
                    .define('I', ModTags.getTagsFor(m).INGOT)
                    .define('S', Tags.Items.RODS_WOODEN)
                    .unlockedBy("has_"+name+"_ingot", has(ModTags.getTagsFor(m).INGOT))
                    .save(recipeOutput);
        }
    }
}
