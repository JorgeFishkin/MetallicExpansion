package net.jorgefishkin.metallicexpansion.datagen;

import net.jorgefishkin.metallicexpansion.MetallicExpansion;
import net.jorgefishkin.metallicexpansion.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MetallicExpansion.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.INDIUM_BLOCK.get())
                .add(ModBlocks.CADMIUM_BLOCK.get())
                .add(ModBlocks.PLATINUM_BLOCK.get())
                .add(ModBlocks.RAW_INDIUM_BLOCK.get())
                .add(ModBlocks.RAW_CADMIUM_BLOCK.get())
                .add(ModBlocks.RAW_PLATINUM_BLOCK.get())
                .add(ModBlocks.INDIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_INDIUM_ORE.get())
                .add(ModBlocks.END_STONE_INDIUM_ORE.get())
                .add(ModBlocks.CADMIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_CADMIUM_ORE.get())
                .add(ModBlocks.NETHERRACK_CADMIUM_ORE.get())
                .add(ModBlocks.PLATINUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_PLATINUM_ORE.get())
                .add(ModBlocks.END_STONE_PLATINUM_ORE.get());
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.INDIUM_BLOCK.get())
                .add(ModBlocks.CADMIUM_BLOCK.get())
                .add(ModBlocks.RAW_INDIUM_BLOCK.get())
                .add(ModBlocks.RAW_CADMIUM_BLOCK.get())
                .add(ModBlocks.INDIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_INDIUM_ORE.get())
                .add(ModBlocks.END_STONE_INDIUM_ORE.get())
                .add(ModBlocks.CADMIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_CADMIUM_ORE.get())
                .add(ModBlocks.NETHERRACK_CADMIUM_ORE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PLATINUM_BLOCK.get())
                .add(ModBlocks.RAW_PLATINUM_BLOCK.get())
                .add(ModBlocks.PLATINUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_PLATINUM_ORE.get())
                .add(ModBlocks.END_STONE_PLATINUM_ORE.get());

    }
}
