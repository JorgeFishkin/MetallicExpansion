package net.jorgefishkin.metallicexpansion.block;

import net.jorgefishkin.metallicexpansion.MetallicExpansion;
import net.jorgefishkin.metallicexpansion.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MetallicExpansion.MODID);

    // Storage Blocks
    public static final DeferredBlock<Block> INDIUM_BLOCK = registerBlock("indium_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PLATINUM_BLOCK = registerBlock("platinum_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CADMIUM_BLOCK = registerBlock("cadmium_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK).requiresCorrectToolForDrops()));

    // Raw Blocks
    public static final DeferredBlock<Block> RAW_INDIUM_BLOCK = registerBlock("raw_indium_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_GOLD_BLOCK).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> RAW_CADMIUM_BLOCK = registerBlock("raw_cadmium_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_COPPER_BLOCK).requiresCorrectToolForDrops()));

    // Ore
    public static final DeferredBlock<Block> INDIUM_ORE = registerBlock("indium_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PLATINUM_ORE = registerBlock("platinum_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 6), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CADMIUM_ORE = registerBlock("cadmium_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 2), BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_ORE).requiresCorrectToolForDrops()));

    //Deepslate Ore
    public static final DeferredBlock<Block> DEEPSLATE_INDIUM_ORE = registerBlock("deepslate_indium_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_GOLD_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 7),BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DEEPSLATE_CADMIUM_ORE = registerBlock("deepslate_cadmium_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_COPPER_ORE).requiresCorrectToolForDrops()));

    // Netherrack Ore
    public static final DeferredBlock<Block> NETHERRACK_CADMIUM_ORE = registerBlock("netherrack_cadmium_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 3), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));

    // End Stone Ore
    public static final DeferredBlock<Block> END_STONE_INDIUM_ORE = registerBlock("end_stone_indium_ore",
            () -> new DropExperienceBlock(UniformInt.of(5, 8), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> END_STONE_PLATINUM_ORE = registerBlock("end_stone_platinum_ore",
            () -> new DropExperienceBlock(UniformInt.of(6, 10), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).requiresCorrectToolForDrops()));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }



    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
