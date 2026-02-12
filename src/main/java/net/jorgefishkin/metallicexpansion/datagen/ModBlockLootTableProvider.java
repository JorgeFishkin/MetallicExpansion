package net.jorgefishkin.metallicexpansion.datagen;

import net.jorgefishkin.metallicexpansion.block.ModBlocks;
import net.jorgefishkin.metallicexpansion.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;


import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        // Building blocks
        dropSelf(ModBlocks.INDIUM_BLOCK.get());
        dropSelf(ModBlocks.CADMIUM_BLOCK.get());
        dropSelf(ModBlocks.PLATINUM_BLOCK.get());

        // Raw blocks
        dropSelf(ModBlocks.RAW_INDIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_CADMIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_PLATINUM_BLOCK.get());

        // Indium Ore drops
        add(ModBlocks.INDIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.INDIUM_ORE.get(), ModItems.RAW_INDIUM.get()));
        add(ModBlocks.DEEPSLATE_INDIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_INDIUM_ORE.get(), ModItems.RAW_INDIUM.get()));
        add(ModBlocks.END_STONE_INDIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.END_STONE_INDIUM_ORE.get(), ModItems.RAW_INDIUM.get()));


        // Cadmium Ore drops
        add(ModBlocks.CADMIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.CADMIUM_ORE.get(), ModItems.RAW_CADMIUM.get()));
        add(ModBlocks.DEEPSLATE_CADMIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_CADMIUM_ORE.get(), ModItems.RAW_CADMIUM.get()));
        add(ModBlocks.NETHERRACK_CADMIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.NETHERRACK_CADMIUM_ORE.get(), ModItems.RAW_CADMIUM.get()));

        //Platinum Ore drops
        add(ModBlocks.PLATINUM_ORE.get(),
                block -> createOreDrop(ModBlocks.PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get()));
        add(ModBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get()));
        add(ModBlocks.END_STONE_PLATINUM_ORE.get(),
                block -> createOreDrop(ModBlocks.END_STONE_PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get()));


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
