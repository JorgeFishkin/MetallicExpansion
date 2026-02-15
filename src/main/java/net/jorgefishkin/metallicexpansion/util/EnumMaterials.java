package net.jorgefishkin.metallicexpansion.util;

import net.jorgefishkin.metallicexpansion.block.ModBlocks;
import net.jorgefishkin.metallicexpansion.item.ModItems;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.ArrayList;

public enum EnumMaterials {
    INDIUM,
    CADMIUM,
    PLATINUM;

    public DeferredItem<Item> getIngot(){
        return switch (this) {
            case CADMIUM -> ModItems.CADMIUM_INGOT;
            case INDIUM -> ModItems.INDIUM_INGOT;
            case PLATINUM -> ModItems.PLATINUM_INGOT;
        };
    }
    public DeferredItem<Item> getRaw(){
        return switch (this) {
            case CADMIUM -> ModItems.RAW_CADMIUM;
            case INDIUM -> ModItems.RAW_INDIUM;
            case PLATINUM -> ModItems.RAW_PLATINUM;
        };
    }
    public DeferredItem<Item> getNugget(){
        return switch (this) {
            case CADMIUM -> ModItems.CADMIUM_NUGGET;
            case INDIUM -> ModItems.INDIUM_NUGGET;
            case PLATINUM -> ModItems.PLATINUM_NUGGET;
        };
    }
    public DeferredItem<Item> getDust(){
        return switch (this) {
            case CADMIUM -> ModItems.CADMIUM_DUST;
            case INDIUM -> ModItems.INDIUM_DUST;
            case PLATINUM -> ModItems.PLATINUM_DUST;
        };
    }
    public DeferredItem<SwordItem> getSword(){
        return switch (this) {
            case CADMIUM -> ModItems.CADMIUM_SWORD;
            case INDIUM -> ModItems.INDIUM_SWORD;
            case PLATINUM -> ModItems.PLATINUM_SWORD;
        };
    }
    public DeferredItem<PickaxeItem> getPickaxe(){
        return switch (this) {
            case CADMIUM -> ModItems.CADMIUM_PICKAXE;
            case INDIUM -> ModItems.INDIUM_PICKAXE;
            case PLATINUM -> ModItems.PLATINUM_PICKAXE;
        };
    }
    public DeferredItem<AxeItem> getAxe(){
        return switch (this) {
            case CADMIUM -> ModItems.CADMIUM_AXE;
            case INDIUM -> ModItems.INDIUM_AXE;
            case PLATINUM -> ModItems.PLATINUM_AXE;
        };
    }
    public DeferredItem<ShovelItem> getShovel(){
        return switch (this) {
            case CADMIUM -> ModItems.CADMIUM_SHOVEL;
            case INDIUM -> ModItems.INDIUM_SHOVEL;
            case PLATINUM -> ModItems.PLATINUM_SHOVEL;
        };
    }
    public DeferredItem<HoeItem> getHoe(){
        return switch (this) {
            case CADMIUM -> ModItems.CADMIUM_HOE;
            case INDIUM -> ModItems.INDIUM_HOE;
            case PLATINUM -> ModItems.PLATINUM_HOE;
        };
    }

    public DeferredBlock<Block> getStorageBlock(){
        return switch (this) {
            case CADMIUM -> ModBlocks.CADMIUM_BLOCK;
            case INDIUM -> ModBlocks.INDIUM_BLOCK;
            case PLATINUM -> ModBlocks.PLATINUM_BLOCK;
        };
    }
    public DeferredBlock<Block> getRawStorageBlock(){
        return switch (this) {
            case CADMIUM -> ModBlocks.RAW_CADMIUM_BLOCK;
            case INDIUM -> ModBlocks.RAW_INDIUM_BLOCK;
            case PLATINUM -> ModBlocks.RAW_PLATINUM_BLOCK;
        };
    }
    public DeferredBlock<Block> getOre(){
        return switch (this) {
            case CADMIUM -> ModBlocks.CADMIUM_ORE;
            case INDIUM -> ModBlocks.INDIUM_ORE;
            case PLATINUM -> ModBlocks.PLATINUM_ORE;
        };
    }
    public DeferredBlock<Block> getDeepslateOre(){
        return switch (this) {
            case CADMIUM -> ModBlocks.DEEPSLATE_CADMIUM_ORE;
            case INDIUM -> ModBlocks.DEEPSLATE_INDIUM_ORE;
            case PLATINUM -> ModBlocks.DEEPSLATE_PLATINUM_ORE;
        };
    }
    public ArrayList<DeferredBlock<Block>> getOreList(){
        ArrayList<DeferredBlock<Block>> oreList = new ArrayList<>();
        switch (this) {
            case CADMIUM:
                oreList.add(ModBlocks.CADMIUM_ORE);
                oreList.add(ModBlocks.DEEPSLATE_CADMIUM_ORE);
                oreList.add(ModBlocks.NETHERRACK_CADMIUM_ORE);
                break;
            case INDIUM:
                oreList.add(ModBlocks.INDIUM_ORE);
                oreList.add(ModBlocks.DEEPSLATE_INDIUM_ORE);
                oreList.add(ModBlocks.END_STONE_INDIUM_ORE);

                break;
            case PLATINUM:
                oreList.add(ModBlocks.PLATINUM_ORE);
                oreList.add(ModBlocks.DEEPSLATE_PLATINUM_ORE);
                oreList.add(ModBlocks.END_STONE_PLATINUM_ORE);
                break;
        }
        return oreList;

    }
}
