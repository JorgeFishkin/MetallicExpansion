package net.jorgefishkin.metallicexpansion.block;

import net.jorgefishkin.metallicexpansion.MetallicExpansion;
import net.jorgefishkin.metallicexpansion.item.MEItems;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MEBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MetallicExpansion.MODID);

    // Storage Blocks
    public static final DeferredBlock<Block> INDIUM_BLOCK = registerBlock("indium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BELL)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL)
            )
    );

    public static final DeferredBlock<Block> PLATINUM_BLOCK = registerBlock("platinum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .instrument(NoteBlockInstrument.CHIME)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL)
            )
    );

    public static final DeferredBlock<Block> CADMIUM_BLOCK = registerBlock("cadmium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL)
            )
    );

    // Raw Blocks
    public static final DeferredBlock<Block> RAW_INDIUM_BLOCK = registerBlock("raw_indium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
            )
    );

    public static final DeferredBlock<Block> RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
            )
    );

    public static final DeferredBlock<Block> RAW_CADMIUM_BLOCK = registerBlock("raw_cadmium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.RAW_IRON)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
            )
    );

    // Ore
    public static final DeferredBlock<Block> INDIUM_ORE = registerBlock("indium_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)
            )
    );

    public static final DeferredBlock<Block> PLATINUM_ORE = registerBlock("platinum_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 6), BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 5.0F)
            )
    );

    public static final DeferredBlock<Block> CADMIUM_ORE = registerBlock("cadmium_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 2), BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)
            )
    );

    //Deepslate Ore
    public static final DeferredBlock<Block> DEEPSLATE_INDIUM_ORE = registerBlock("deepslate_indium_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DEEPSLATE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(4.5F, 4.5F)
                    .sound(SoundType.DEEPSLATE)
            )
    );

    public static final DeferredBlock<Block> DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 7),BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DEEPSLATE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(6.5F, 6.5F)
                    .sound(SoundType.DEEPSLATE)
            )
    );

    public static final DeferredBlock<Block> DEEPSLATE_CADMIUM_ORE = registerBlock("deepslate_cadmium_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DEEPSLATE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(4.5F, 4.5F)
                    .sound(SoundType.DEEPSLATE)
            )
    );

    // Netherrack Ore
    public static final DeferredBlock<Block> NETHERRACK_CADMIUM_ORE = registerBlock("netherrack_cadmium_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 3), BlockBehaviour.Properties.of()
                    .mapColor(MapColor.NETHER)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)
                    .sound(SoundType.NETHER_GOLD_ORE)
            )
    );

    // End Stone Ore
    public static final DeferredBlock<Block> END_STONE_INDIUM_ORE = registerBlock("end_stone_indium_ore",
            () -> new DropExperienceBlock(UniformInt.of(5, 8), BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 6.0F)
            )
    );
    public static final DeferredBlock<Block> END_STONE_PLATINUM_ORE = registerBlock("end_stone_platinum_ore",
            () -> new DropExperienceBlock(UniformInt.of(6, 10), BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
            )
    );

    public static boolean isStoneOre(DeferredBlock<Block> block) {
        return block.equals(CADMIUM_ORE)||block.equals(INDIUM_ORE)||block.equals(PLATINUM_ORE);
    }
    public static boolean isDeepslateOre(DeferredBlock<Block> block) {
        return block.equals(DEEPSLATE_CADMIUM_ORE)||block.equals(DEEPSLATE_INDIUM_ORE)||block.equals(DEEPSLATE_PLATINUM_ORE);
    }
    public static boolean isNetherOre(DeferredBlock<Block> block) {
        return block.equals(NETHERRACK_CADMIUM_ORE);
    }
    public static boolean isEndOre(DeferredBlock<Block> block) {
        return block.equals(END_STONE_INDIUM_ORE)||block.equals(END_STONE_PLATINUM_ORE);
    }


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
        MEItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }



    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
