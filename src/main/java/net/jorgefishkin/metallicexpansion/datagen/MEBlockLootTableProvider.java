package net.jorgefishkin.metallicexpansion.datagen;

import net.jorgefishkin.metallicexpansion.block.MEBlocks;
import net.jorgefishkin.metallicexpansion.item.MEItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;


import java.util.Set;

public class MEBlockLootTableProvider extends BlockLootSubProvider {
    protected MEBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        // Building blocks
        dropSelf(MEBlocks.INDIUM_BLOCK.get());
        dropSelf(MEBlocks.CADMIUM_BLOCK.get());
        dropSelf(MEBlocks.PLATINUM_BLOCK.get());

        // Raw blocks
        dropSelf(MEBlocks.RAW_INDIUM_BLOCK.get());
        dropSelf(MEBlocks.RAW_CADMIUM_BLOCK.get());
        dropSelf(MEBlocks.RAW_PLATINUM_BLOCK.get());

        // Indium Ore drops
        add(MEBlocks.INDIUM_ORE.get(),
                block -> createOreDrop(MEBlocks.INDIUM_ORE.get(), MEItems.RAW_INDIUM.get()));
        add(MEBlocks.DEEPSLATE_INDIUM_ORE.get(),
                block -> createOreDrop(MEBlocks.DEEPSLATE_INDIUM_ORE.get(), MEItems.RAW_INDIUM.get()));
        add(MEBlocks.END_STONE_INDIUM_ORE.get(),
                block -> createOreDrop(MEBlocks.END_STONE_INDIUM_ORE.get(), MEItems.RAW_INDIUM.get()));


        // Cadmium Ore drops
        add(MEBlocks.CADMIUM_ORE.get(),
                block -> createOreDrop(MEBlocks.CADMIUM_ORE.get(), MEItems.RAW_CADMIUM.get()));
        add(MEBlocks.DEEPSLATE_CADMIUM_ORE.get(),
                block -> createOreDrop(MEBlocks.DEEPSLATE_CADMIUM_ORE.get(), MEItems.RAW_CADMIUM.get()));
        add(MEBlocks.NETHERRACK_CADMIUM_ORE.get(),
                block -> createOreDrop(MEBlocks.NETHERRACK_CADMIUM_ORE.get(), MEItems.RAW_CADMIUM.get()));

        //Platinum Ore drops
        add(MEBlocks.PLATINUM_ORE.get(),
                block -> createOreDrop(MEBlocks.PLATINUM_ORE.get(), MEItems.RAW_PLATINUM.get()));
        add(MEBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                block -> createOreDrop(MEBlocks.DEEPSLATE_PLATINUM_ORE.get(), MEItems.RAW_PLATINUM.get()));
        add(MEBlocks.END_STONE_PLATINUM_ORE.get(),
                block -> createOreDrop(MEBlocks.END_STONE_PLATINUM_ORE.get(), MEItems.RAW_PLATINUM.get()));


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return MEBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
