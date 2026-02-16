package net.jorgefishkin.metallicexpansion.datagen;

import net.jorgefishkin.metallicexpansion.MetallicExpansion;
import net.jorgefishkin.metallicexpansion.block.MEBlocks;
import net.jorgefishkin.metallicexpansion.util.EnumMaterials;
import net.jorgefishkin.metallicexpansion.util.METags;
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

public class MEBlockTagProvider extends BlockTagsProvider {
    public MEBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MetallicExpansion.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(MEBlocks.INDIUM_BLOCK.get())
                .add(MEBlocks.CADMIUM_BLOCK.get())
                .add(MEBlocks.PLATINUM_BLOCK.get())
                .add(MEBlocks.RAW_INDIUM_BLOCK.get())
                .add(MEBlocks.RAW_CADMIUM_BLOCK.get())
                .add(MEBlocks.RAW_PLATINUM_BLOCK.get())
                .add(MEBlocks.INDIUM_ORE.get())
                .add(MEBlocks.DEEPSLATE_INDIUM_ORE.get())
                .add(MEBlocks.END_STONE_INDIUM_ORE.get())
                .add(MEBlocks.CADMIUM_ORE.get())
                .add(MEBlocks.DEEPSLATE_CADMIUM_ORE.get())
                .add(MEBlocks.NETHERRACK_CADMIUM_ORE.get())
                .add(MEBlocks.PLATINUM_ORE.get())
                .add(MEBlocks.DEEPSLATE_PLATINUM_ORE.get())
                .add(MEBlocks.END_STONE_PLATINUM_ORE.get());
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(MEBlocks.INDIUM_BLOCK.get())
                .add(MEBlocks.CADMIUM_BLOCK.get())
                .add(MEBlocks.RAW_INDIUM_BLOCK.get())
                .add(MEBlocks.RAW_CADMIUM_BLOCK.get())
                .add(MEBlocks.INDIUM_ORE.get())
                .add(MEBlocks.DEEPSLATE_INDIUM_ORE.get())
                .add(MEBlocks.CADMIUM_ORE.get())
                .add(MEBlocks.DEEPSLATE_CADMIUM_ORE.get())
                .add(MEBlocks.NETHERRACK_CADMIUM_ORE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(MEBlocks.END_STONE_INDIUM_ORE.get())
                .add(MEBlocks.PLATINUM_BLOCK.get())
                .add(MEBlocks.RAW_PLATINUM_BLOCK.get())
                .add(MEBlocks.PLATINUM_ORE.get())
                .add(MEBlocks.DEEPSLATE_PLATINUM_ORE.get())
                .add(MEBlocks.END_STONE_PLATINUM_ORE.get());

        for(EnumMaterials m : EnumMaterials.values()) {
            ArrayList<DeferredBlock<Block>> oreList = m.getOreList();

            // General block tags
            tag(Tags.Blocks.STORAGE_BLOCKS)
                    .add(m.getStorageBlock().get())
                    .add(m.getRawStorageBlock().get());

            for (DeferredBlock<Block> block : oreList) {
                tag(Tags.Blocks.ORES)
                        .add(block.get());
                tag(METags.getTagsFor(m).ORE)
                        .add(block.get());
                tag(Tags.Blocks.ORE_RATES_SINGULAR)
                        .add(block.get());
                if(MEBlocks.isStoneOre(block))
                    tag(Tags.Blocks.ORES_IN_GROUND_STONE)
                            .add(block.get());
                if(MEBlocks.isDeepslateOre(block))
                    tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
                            .add(block.get());
                if(MEBlocks.isNetherOre(block))
                    tag(Tags.Blocks.ORES_IN_GROUND_NETHERRACK)
                            .add(block.get());
            }

            // Precise namespace block tags
            tag(METags.getTagsFor(m).STORAGE)
                    .add(m.getStorageBlock().get());
            tag(METags.getTagsFor(m).RAW_STORAGE)
                    .add(m.getRawStorageBlock().get());

            // Vanilla Tags
            tag(BlockTags.BEACON_BASE_BLOCKS)
                    .add(m.getStorageBlock().get());

        }
    }
}
