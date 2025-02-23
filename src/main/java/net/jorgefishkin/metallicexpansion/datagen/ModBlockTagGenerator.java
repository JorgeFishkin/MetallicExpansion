package net.jorgefishkin.metallicexpansion.datagen;

import net.jorgefishkin.metallicexpansion.MetallicExpansionMod;
import net.jorgefishkin.metallicexpansion.block.ModBlocks;
import net.jorgefishkin.metallicexpansion.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.concurrent.CompletableFuture;


public class ModBlockTagGenerator extends BlockTagsProvider {
    public static final List<Block> INDIUM_BLOCKS = List.of(ModBlocks.INDIUM_BLOCK.get(), ModBlocks.RAW_INDIUM_BLOCK.get(), ModBlocks.INDIUM_ORE.get(), ModBlocks.DEEPSLATE_INDIUM_ORE.get(), ModBlocks.END_STONE_INDIUM_ORE.get());
    public static final List<Block> PLATINUM_BLOCKS = List.of(ModBlocks.PLATINUM_BLOCK.get(), ModBlocks.RAW_PLATINUM_BLOCK.get(), ModBlocks.PLATINUM_ORE.get(), ModBlocks.DEEPSLATE_PLATINUM_ORE.get(), ModBlocks.END_STONE_PLATINUM_ORE.get());
    public static final List<Block> CADMIUM_BLOCKS = List.of(ModBlocks.CADMIUM_BLOCK.get(), ModBlocks.RAW_CADMIUM_BLOCK.get(), ModBlocks.CADMIUM_ORE.get(), ModBlocks.DEEPSLATE_CADMIUM_ORE.get(), ModBlocks.NETHERRACK_CADMIUM_ORE.get());

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MetallicExpansionMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.tag(ModTags.Blocks.INDIUM_BLOCK)
                .add(ModBlocks.INDIUM_BLOCK.get());
        this.tag(ModTags.Blocks.PLATINUM_BLOCK)
                .add(ModBlocks.PLATINUM_BLOCK.get());
        this.tag(ModTags.Blocks.CADMIUM_BLOCK)
                .add(ModBlocks.CADMIUM_BLOCK.get());

        this.tag(ModTags.Blocks.RAW_INDIUM_BLOCK)
                .add(ModBlocks.RAW_INDIUM_BLOCK.get());
        this.tag(ModTags.Blocks.RAW_PLATINUM_BLOCK)
                .add(ModBlocks.RAW_PLATINUM_BLOCK.get());
        this.tag(ModTags.Blocks.RAW_CADMIUM_BLOCK)
                .add(ModBlocks.RAW_CADMIUM_BLOCK.get());

        this.tag(ModTags.Blocks.INDIUM_ORE)
                .add(ModBlocks.INDIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_INDIUM_ORE.get())
                .add(ModBlocks.END_STONE_INDIUM_ORE.get());
        this.tag(ModTags.Blocks.PLATINUM_ORE)
                .add(ModBlocks.PLATINUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_PLATINUM_ORE.get())
                .add(ModBlocks.END_STONE_PLATINUM_ORE.get());
        this.tag(ModTags.Blocks.CADMIUM_ORE)
                .add(ModBlocks.CADMIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_CADMIUM_ORE.get())
                .add(ModBlocks.NETHERRACK_CADMIUM_ORE.get());


        INDIUM_BLOCKS.stream().forEach(this.tag(BlockTags.MINEABLE_WITH_PICKAXE)::add);
        PLATINUM_BLOCKS.stream().forEach(this.tag(BlockTags.MINEABLE_WITH_PICKAXE)::add);
        CADMIUM_BLOCKS.stream().forEach(this.tag(BlockTags.MINEABLE_WITH_PICKAXE)::add);

        INDIUM_BLOCKS.stream().forEach(this.tag(BlockTags.NEEDS_STONE_TOOL)::add);
        CADMIUM_BLOCKS.stream().forEach(this.tag(BlockTags.NEEDS_STONE_TOOL)::add);
        PLATINUM_BLOCKS.stream().forEach(this.tag(BlockTags.NEEDS_DIAMOND_TOOL)::add);
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
