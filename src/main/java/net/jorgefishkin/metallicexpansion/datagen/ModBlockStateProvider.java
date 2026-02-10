package net.jorgefishkin.metallicexpansion.datagen;

import net.jorgefishkin.metallicexpansion.MetallicExpansion;
import net.jorgefishkin.metallicexpansion.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MetallicExpansion.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.INDIUM_BLOCK);
        blockWithItem(ModBlocks.PLATINUM_BLOCK);
        blockWithItem(ModBlocks.CADMIUM_BLOCK);

        blockWithItem(ModBlocks.RAW_INDIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_PLATINUM_BLOCK);
        blockWithItem(ModBlocks.RAW_CADMIUM_BLOCK);

        blockWithItem(ModBlocks.INDIUM_ORE);
        blockWithItem(ModBlocks.PLATINUM_ORE);
        blockWithItem(ModBlocks.CADMIUM_ORE);

        blockWithItem(ModBlocks.DEEPSLATE_INDIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_PLATINUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_CADMIUM_ORE);

        blockWithItem(ModBlocks.NETHERRACK_CADMIUM_ORE);

        blockWithItem(ModBlocks.END_STONE_INDIUM_ORE);
        blockWithItem(ModBlocks.END_STONE_PLATINUM_ORE);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock){
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
