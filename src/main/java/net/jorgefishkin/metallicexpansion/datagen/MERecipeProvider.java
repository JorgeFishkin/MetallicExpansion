package net.jorgefishkin.metallicexpansion.datagen;

import net.jorgefishkin.metallicexpansion.util.EnumMaterials;
import net.jorgefishkin.metallicexpansion.util.METags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class MERecipeProvider extends RecipeProvider implements IConditionBuilder {
    public MERecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
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
                    .define('I', METags.getTagsFor(m).INGOT)
                    .unlockedBy("has_"+name+"_ingot", has(METags.getTagsFor(m).INGOT))
                    .save(recipeOutput, "metallicexpansion:"+name+"_block_from_"+name+"_ingot");

            // Raw Storage Block
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, m.getRawStorageBlock())
                    .pattern("RRR")
                    .pattern("RRR")
                    .pattern("RRR")
                    .define('R', METags.getTagsFor(m).RAW)
                    .unlockedBy("has_raw_"+name, has(METags.getTagsFor(m).RAW))
                    .save(recipeOutput, "metallicexpansion:raw_"+name+"_block_from_raw_"+name);

            // Ingot from Nuggets
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, m.getIngot())
                    .pattern("NNN")
                    .pattern("NNN")
                    .pattern("NNN")
                    .define('N', METags.getTagsFor(m).NUGGET)
                    .unlockedBy("has_"+name+"_nugget", has(METags.getTagsFor(m).NUGGET))
                    .save(recipeOutput, "metallicexpansion:"+name+"_ingot_from_"+name+"_nugget");

            // Ingots from Storage Block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, m.getIngot(), 9)
                    .requires(METags.getTagsFor(m).STORAGE_I)
                    .unlockedBy("has_"+name+"_block", has(METags.getTagsFor(m).STORAGE_I))
                    .save(recipeOutput, "metallicexpansion:"+name+"_ingot_from_block");

            // Raw Ore from Raw Storage Block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, m.getRaw(), 9)
                    .requires(METags.getTagsFor(m).RAW_STORAGE_I)
                    .unlockedBy("has_raw_"+name+"_block", has(METags.getTagsFor(m).RAW_STORAGE_I))
                    .save(recipeOutput, "metallicexpansion:raw_"+name+"_from_raw_block");

            // Nuggets from Ingot
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, m.getNugget(), 9)
                    .requires(METags.getTagsFor(m).INGOT)
                    .unlockedBy("has_"+name+"_ingot", has(METags.getTagsFor(m).INGOT))
                    .save(recipeOutput, "metallicexpansion:"+name+"_nugget_from_"+name+"_ingot");

            // Sword
            ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, m.getSword())
                    .pattern(" I ")
                    .pattern(" I ")
                    .pattern(" S ")
                    .define('I', METags.getTagsFor(m).INGOT)
                    .define('S', Tags.Items.RODS_WOODEN)
                    .unlockedBy("has_"+name+"_ingot", has(METags.getTagsFor(m).INGOT))
                    .save(recipeOutput);
            ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, m.getPickaxe())
                    .pattern("III")
                    .pattern(" S ")
                    .pattern(" S ")
                    .define('I', METags.getTagsFor(m).INGOT)
                    .define('S', Tags.Items.RODS_WOODEN)
                    .unlockedBy("has_"+name+"_ingot", has(METags.getTagsFor(m).INGOT))
                    .save(recipeOutput);
            ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, m.getAxe())
                    .pattern("II ")
                    .pattern("IS ")
                    .pattern(" S ")
                    .define('I', METags.getTagsFor(m).INGOT)
                    .define('S', Tags.Items.RODS_WOODEN)
                    .unlockedBy("has_"+name+"_ingot", has(METags.getTagsFor(m).INGOT))
                    .save(recipeOutput);
            ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, m.getShovel())
                    .pattern(" I ")
                    .pattern(" S ")
                    .pattern(" S ")
                    .define('I', METags.getTagsFor(m).INGOT)
                    .define('S', Tags.Items.RODS_WOODEN)
                    .unlockedBy("has_"+name+"_ingot", has(METags.getTagsFor(m).INGOT))
                    .save(recipeOutput);
            ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, m.getHoe())
                    .pattern("II ")
                    .pattern(" S ")
                    .pattern(" S ")
                    .define('I', METags.getTagsFor(m).INGOT)
                    .define('S', Tags.Items.RODS_WOODEN)
                    .unlockedBy("has_"+name+"_ingot", has(METags.getTagsFor(m).INGOT))
                    .save(recipeOutput);
            ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, m.getHelmet())
                    .pattern("III")
                    .pattern("I I")
                    .pattern("   ")
                    .define('I', METags.getTagsFor(m).INGOT)
                    .unlockedBy("has_"+name+"_ingot", has(METags.getTagsFor(m).INGOT))
                    .save(recipeOutput);
            ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, m.getChestplate())
                    .pattern("I I")
                    .pattern("III")
                    .pattern("III")
                    .define('I', METags.getTagsFor(m).INGOT)
                    .unlockedBy("has_"+name+"_ingot", has(METags.getTagsFor(m).INGOT))
                    .save(recipeOutput);
            ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, m.getLeggings())
                    .pattern("III")
                    .pattern("I I")
                    .pattern("I I")
                    .define('I', METags.getTagsFor(m).INGOT)
                    .unlockedBy("has_"+name+"_ingot", has(METags.getTagsFor(m).INGOT))
                    .save(recipeOutput);
            ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, m.getBoots())
                    .pattern("   ")
                    .pattern("I I")
                    .pattern("I I")
                    .define('I', METags.getTagsFor(m).INGOT)
                    .unlockedBy("has_"+name+"_ingot", has(METags.getTagsFor(m).INGOT))
                    .save(recipeOutput);
        }
    }
}
