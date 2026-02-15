package net.jorgefishkin.metallicexpansion.datagen;

import net.jorgefishkin.metallicexpansion.MetallicExpansion;
import net.jorgefishkin.metallicexpansion.block.ModBlocks;
import net.jorgefishkin.metallicexpansion.util.EnumMaterials;
import net.jorgefishkin.metallicexpansion.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
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
                .add(ModBlocks.CADMIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_CADMIUM_ORE.get())
                .add(ModBlocks.NETHERRACK_CADMIUM_ORE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.END_STONE_INDIUM_ORE.get())
                .add(ModBlocks.PLATINUM_BLOCK.get())
                .add(ModBlocks.RAW_PLATINUM_BLOCK.get())
                .add(ModBlocks.PLATINUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_PLATINUM_ORE.get())
                .add(ModBlocks.END_STONE_PLATINUM_ORE.get());

        for(EnumMaterials m : EnumMaterials.values()) {
            ArrayList<DeferredBlock<Block>> oreList = m.getOreList();

            // General block tags
            tag(Tags.Blocks.STORAGE_BLOCKS)
                    .add(m.getStorageBlock().get())
                    .add(m.getRawStorageBlock().get());

            for (DeferredBlock<Block> block : oreList) {
                tag(Tags.Blocks.ORES)
                        .add(block.get());
                tag(ModTags.getTagsFor(m).ORE)
                        .add(block.get());
                tag(Tags.Blocks.ORE_RATES_SINGULAR)
                        .add(block.get());
                if(ModBlocks.isStoneOre(block))
                    tag(Tags.Blocks.ORES_IN_GROUND_STONE)
                            .add(block.get());
                if(ModBlocks.isDeepslateOre(block))
                    tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
                            .add(block.get());
                if(ModBlocks.isNetherOre(block))
                    tag(Tags.Blocks.ORES_IN_GROUND_NETHERRACK)
                            .add(block.get());
            }

            // Precise namespace block tags
            tag(ModTags.getTagsFor(m).STORAGE)
                    .add(m.getStorageBlock().get());
            tag(ModTags.getTagsFor(m).RAW_STORAGE)
                    .add(m.getRawStorageBlock().get());

            // Vanilla Tags
            tag(BlockTags.BEACON_BASE_BLOCKS)
                    .add(m.getStorageBlock().get());

        }
    }
}
