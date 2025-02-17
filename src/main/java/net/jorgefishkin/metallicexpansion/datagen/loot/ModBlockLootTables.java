package net.jorgefishkin.metallicexpansion.datagen.loot;

import net.jorgefishkin.metallicexpansion.block.ModBlocks;
import net.jorgefishkin.metallicexpansion.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;


import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.INDIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_INDIUM_BLOCK.get());

        this.add(ModBlocks.INDIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.INDIUM_ORE.get(), ModItems.RAW_INDIUM.get()));
        this.add(ModBlocks.DEEPSLATE_INDIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_INDIUM_ORE.get(), ModItems.RAW_INDIUM.get()));
        this.add(ModBlocks.END_STONE_INDIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.END_STONE_INDIUM_ORE.get(), ModItems.RAW_INDIUM.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
