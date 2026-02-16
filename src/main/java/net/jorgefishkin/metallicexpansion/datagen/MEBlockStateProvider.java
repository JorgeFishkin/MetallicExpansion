package net.jorgefishkin.metallicexpansion.datagen;

import net.jorgefishkin.metallicexpansion.MetallicExpansion;
import net.jorgefishkin.metallicexpansion.block.MEBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class MEBlockStateProvider extends BlockStateProvider {
    public MEBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MetallicExpansion.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(MEBlocks.INDIUM_BLOCK);
        blockWithItem(MEBlocks.PLATINUM_BLOCK);
        blockWithItem(MEBlocks.CADMIUM_BLOCK);

        blockWithItem(MEBlocks.RAW_INDIUM_BLOCK);
        blockWithItem(MEBlocks.RAW_PLATINUM_BLOCK);
        blockWithItem(MEBlocks.RAW_CADMIUM_BLOCK);

        blockWithItem(MEBlocks.INDIUM_ORE);
        blockWithItem(MEBlocks.PLATINUM_ORE);
        blockWithItem(MEBlocks.CADMIUM_ORE);

        blockWithItem(MEBlocks.DEEPSLATE_INDIUM_ORE);
        blockWithItem(MEBlocks.DEEPSLATE_PLATINUM_ORE);
        blockWithItem(MEBlocks.DEEPSLATE_CADMIUM_ORE);

        blockWithItem(MEBlocks.NETHERRACK_CADMIUM_ORE);

        blockWithItem(MEBlocks.END_STONE_INDIUM_ORE);
        blockWithItem(MEBlocks.END_STONE_PLATINUM_ORE);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock){
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
