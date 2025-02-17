package net.jorgefishkin.metallicexpansion.datagen;

import net.jorgefishkin.metallicexpansion.MetallicExpansionMod;
import net.jorgefishkin.metallicexpansion.block.ModBlocks;
import net.jorgefishkin.metallicexpansion.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MetallicExpansionMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModTags.Blocks.INDIUM_BLOCK)
                .add(ModBlocks.INDIUM_BLOCK.get());

        this.tag(ModTags.Blocks.RAW_INDIUM_BLOCK)
                .add(ModBlocks.RAW_INDIUM_BLOCK.get());

        this.tag(ModTags.Blocks.INDIUM_ORE)
                .add(ModBlocks.INDIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_INDIUM_ORE.get())
                .add(ModBlocks.END_STONE_INDIUM_ORE.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.INDIUM_BLOCK.get())
                .add(ModBlocks.RAW_INDIUM_BLOCK.get())
                .add(ModBlocks.INDIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_INDIUM_ORE.get())
                .add(ModBlocks.END_STONE_INDIUM_ORE.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.INDIUM_BLOCK.get())
                .add(ModBlocks.RAW_INDIUM_BLOCK.get())
                .add(ModBlocks.INDIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_INDIUM_ORE.get())
                .add(ModBlocks.END_STONE_INDIUM_ORE.get());
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
