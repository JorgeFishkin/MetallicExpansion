package net.jorgefishkin.metallicexpansion.util;

import net.jorgefishkin.metallicexpansion.block.MEBlocks;
import net.jorgefishkin.metallicexpansion.item.MEItems;
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
            case CADMIUM -> MEItems.CADMIUM_INGOT;
            case INDIUM -> MEItems.INDIUM_INGOT;
            case PLATINUM -> MEItems.PLATINUM_INGOT;
        };
    }
    public DeferredItem<Item> getRaw(){
        return switch (this) {
            case CADMIUM -> MEItems.RAW_CADMIUM;
            case INDIUM -> MEItems.RAW_INDIUM;
            case PLATINUM -> MEItems.RAW_PLATINUM;
        };
    }
    public DeferredItem<Item> getNugget(){
        return switch (this) {
            case CADMIUM -> MEItems.CADMIUM_NUGGET;
            case INDIUM -> MEItems.INDIUM_NUGGET;
            case PLATINUM -> MEItems.PLATINUM_NUGGET;
        };
    }
    public DeferredItem<Item> getDust(){
        return switch (this) {
            case CADMIUM -> MEItems.CADMIUM_DUST;
            case INDIUM -> MEItems.INDIUM_DUST;
            case PLATINUM -> MEItems.PLATINUM_DUST;
        };
    }
    public DeferredItem<SwordItem> getSword(){
        return switch (this) {
            case CADMIUM -> MEItems.CADMIUM_SWORD;
            case INDIUM -> MEItems.INDIUM_SWORD;
            case PLATINUM -> MEItems.PLATINUM_SWORD;
        };
    }
    public DeferredItem<PickaxeItem> getPickaxe(){
        return switch (this) {
            case CADMIUM -> MEItems.CADMIUM_PICKAXE;
            case INDIUM -> MEItems.INDIUM_PICKAXE;
            case PLATINUM -> MEItems.PLATINUM_PICKAXE;
        };
    }
    public DeferredItem<AxeItem> getAxe(){
        return switch (this) {
            case CADMIUM -> MEItems.CADMIUM_AXE;
            case INDIUM -> MEItems.INDIUM_AXE;
            case PLATINUM -> MEItems.PLATINUM_AXE;
        };
    }
    public DeferredItem<ShovelItem> getShovel(){
        return switch (this) {
            case CADMIUM -> MEItems.CADMIUM_SHOVEL;
            case INDIUM -> MEItems.INDIUM_SHOVEL;
            case PLATINUM -> MEItems.PLATINUM_SHOVEL;
        };
    }
    public DeferredItem<HoeItem> getHoe(){
        return switch (this) {
            case CADMIUM -> MEItems.CADMIUM_HOE;
            case INDIUM -> MEItems.INDIUM_HOE;
            case PLATINUM -> MEItems.PLATINUM_HOE;
        };
    }
    public DeferredItem<ArmorItem> getHelmet(){
        return switch (this) {
            case CADMIUM -> MEItems.CADMIUM_HELMET;
            case INDIUM -> MEItems.INDIUM_HELMET;
            case PLATINUM -> MEItems.PLATINUM_HELMET;
        };
    }
    public DeferredItem<ArmorItem> getChestplate(){
        return switch (this) {
            case CADMIUM -> MEItems.CADMIUM_CHESTPLATE;
            case INDIUM -> MEItems.INDIUM_CHESTPLATE;
            case PLATINUM -> MEItems.PLATINUM_CHESTPLATE;
        };
    }
    public DeferredItem<ArmorItem> getLeggings(){
        return switch (this) {
            case CADMIUM -> MEItems.CADMIUM_LEGGINGS;
            case INDIUM -> MEItems.INDIUM_LEGGINGS;
            case PLATINUM -> MEItems.PLATINUM_LEGGINGS;
        };
    }
    public DeferredItem<ArmorItem> getBoots(){
        return switch (this) {
            case CADMIUM -> MEItems.CADMIUM_BOOTS;
            case INDIUM -> MEItems.INDIUM_BOOTS;
            case PLATINUM -> MEItems.PLATINUM_BOOTS;
        };
    }

    public DeferredBlock<Block> getStorageBlock(){
        return switch (this) {
            case CADMIUM -> MEBlocks.CADMIUM_BLOCK;
            case INDIUM -> MEBlocks.INDIUM_BLOCK;
            case PLATINUM -> MEBlocks.PLATINUM_BLOCK;
        };
    }
    public DeferredBlock<Block> getRawStorageBlock(){
        return switch (this) {
            case CADMIUM -> MEBlocks.RAW_CADMIUM_BLOCK;
            case INDIUM -> MEBlocks.RAW_INDIUM_BLOCK;
            case PLATINUM -> MEBlocks.RAW_PLATINUM_BLOCK;
        };
    }
    public DeferredBlock<Block> getOre(){
        return switch (this) {
            case CADMIUM -> MEBlocks.CADMIUM_ORE;
            case INDIUM -> MEBlocks.INDIUM_ORE;
            case PLATINUM -> MEBlocks.PLATINUM_ORE;
        };
    }
    public DeferredBlock<Block> getDeepslateOre(){
        return switch (this) {
            case CADMIUM -> MEBlocks.DEEPSLATE_CADMIUM_ORE;
            case INDIUM -> MEBlocks.DEEPSLATE_INDIUM_ORE;
            case PLATINUM -> MEBlocks.DEEPSLATE_PLATINUM_ORE;
        };
    }
    public ArrayList<DeferredBlock<Block>> getOreList(){
        ArrayList<DeferredBlock<Block>> oreList = new ArrayList<>();
        switch (this) {
            case CADMIUM:
                oreList.add(MEBlocks.CADMIUM_ORE);
                oreList.add(MEBlocks.DEEPSLATE_CADMIUM_ORE);
                oreList.add(MEBlocks.NETHERRACK_CADMIUM_ORE);
                break;
            case INDIUM:
                oreList.add(MEBlocks.INDIUM_ORE);
                oreList.add(MEBlocks.DEEPSLATE_INDIUM_ORE);
                oreList.add(MEBlocks.END_STONE_INDIUM_ORE);

                break;
            case PLATINUM:
                oreList.add(MEBlocks.PLATINUM_ORE);
                oreList.add(MEBlocks.DEEPSLATE_PLATINUM_ORE);
                oreList.add(MEBlocks.END_STONE_PLATINUM_ORE);
                break;
        }
        return oreList;

    }
}
