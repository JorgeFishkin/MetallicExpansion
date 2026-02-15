package net.jorgefishkin.metallicexpansion.datagen;

import net.jorgefishkin.metallicexpansion.MetallicExpansion;
import net.jorgefishkin.metallicexpansion.item.ModItems;

import net.minecraft.data.PackOutput;

import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;


public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MetallicExpansion.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.INDIUM_INGOT.get());
        basicItem(ModItems.PLATINUM_INGOT.get());
        basicItem(ModItems.CADMIUM_INGOT.get());

        basicItem(ModItems.RAW_INDIUM.get());
        basicItem(ModItems.RAW_PLATINUM.get());
        basicItem(ModItems.RAW_CADMIUM.get());

        basicItem(ModItems.INDIUM_NUGGET.get());
        basicItem(ModItems.PLATINUM_NUGGET.get());
        basicItem(ModItems.CADMIUM_NUGGET.get());

        basicItem(ModItems.INDIUM_DUST.get());
        basicItem(ModItems.PLATINUM_DUST.get());
        basicItem(ModItems.CADMIUM_DUST.get());

        handheldItem(ModItems.INDIUM_SWORD.get());
        handheldItem(ModItems.INDIUM_PICKAXE.get());
        handheldItem(ModItems.INDIUM_AXE.get());
        handheldItem(ModItems.INDIUM_SHOVEL.get());
        handheldItem(ModItems.INDIUM_HOE.get());

        handheldItem(ModItems.PLATINUM_SWORD.get());
        handheldItem(ModItems.PLATINUM_PICKAXE.get());
        handheldItem(ModItems.PLATINUM_AXE.get());
        handheldItem(ModItems.PLATINUM_SHOVEL.get());
        handheldItem(ModItems.PLATINUM_HOE.get());

        handheldItem(ModItems.CADMIUM_SWORD.get());
        handheldItem(ModItems.CADMIUM_PICKAXE.get());
        handheldItem(ModItems.CADMIUM_AXE.get());
        handheldItem(ModItems.CADMIUM_SHOVEL.get());
        handheldItem(ModItems.CADMIUM_HOE.get());
        /*
        basicItem(ModItems.INDIUM_HELMET.get());
        basicItem(ModItems.INDIUM_CHESTPLATE.get());
        basicItem(ModItems.INDIUM_LEGGINGS.get());
        basicItem(ModItems.INDIUM_BOOTS.get());

        basicItem(ModItems.PLATINUM_HELMET.get());
        basicItem(ModItems.PLATINUM_CHESTPLATE.get());
        basicItem(ModItems.PLATINUM_LEGGINGS.get());
        basicItem(ModItems.PLATINUM_BOOTS.get());

        basicItem(ModItems.CADMIUM_HELMET.get());
        basicItem(ModItems.CADMIUM_CHESTPLATE.get());
        basicItem(ModItems.CADMIUM_LEGGINGS.get());
        basicItem(ModItems.CADMIUM_BOOTS.get());*/


    }


}
