package net.jorgefishkin.metallicexpansion.datagen;

import net.jorgefishkin.metallicexpansion.MetallicExpansionMod;
import net.jorgefishkin.metallicexpansion.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output,  ExistingFileHelper existingFileHelper) {
        super(output, MetallicExpansionMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.INDIUM_INGOT);
        simpleItem(ModItems.PLATINUM_INGOT);
        simpleItem(ModItems.CADMIUM_INGOT);

        simpleItem(ModItems.RAW_INDIUM);
        simpleItem(ModItems.RAW_PLATINUM);
        simpleItem(ModItems.RAW_CADMIUM);

        simpleItem(ModItems.INDIUM_NUGGET);
        simpleItem(ModItems.PLATINUM_NUGGET);
        simpleItem(ModItems.CADMIUM_NUGGET);

        simpleItem(ModItems.INDIUM_DUST);
        simpleItem(ModItems.PLATINUM_DUST);
        simpleItem(ModItems.CADMIUM_DUST);

        handheldItem(ModItems.INDIUM_SWORD);
        handheldItem(ModItems.INDIUM_PICKAXE);
        handheldItem(ModItems.INDIUM_AXE);
        handheldItem(ModItems.INDIUM_SHOVEL);
        handheldItem(ModItems.INDIUM_HOE);

        handheldItem(ModItems.PLATINUM_SWORD);
        handheldItem(ModItems.PLATINUM_PICKAXE);
        handheldItem(ModItems.PLATINUM_AXE);
        handheldItem(ModItems.PLATINUM_SHOVEL);
        handheldItem(ModItems.PLATINUM_HOE);

        handheldItem(ModItems.CADMIUM_SWORD);
        handheldItem(ModItems.CADMIUM_PICKAXE);
        handheldItem(ModItems.CADMIUM_AXE);
        handheldItem(ModItems.CADMIUM_SHOVEL);
        handheldItem(ModItems.CADMIUM_HOE);

        simpleItem(ModItems.INDIUM_HELMET);
        simpleItem(ModItems.INDIUM_CHESTPLATE);
        simpleItem(ModItems.INDIUM_LEGGINGS);
        simpleItem(ModItems.INDIUM_BOOTS);

        simpleItem(ModItems.PLATINUM_HELMET);
        simpleItem(ModItems.PLATINUM_CHESTPLATE);
        simpleItem(ModItems.PLATINUM_LEGGINGS);
        simpleItem(ModItems.PLATINUM_BOOTS);

        simpleItem(ModItems.CADMIUM_HELMET);
        simpleItem(ModItems.CADMIUM_CHESTPLATE);
        simpleItem(ModItems.CADMIUM_LEGGINGS);
        simpleItem(ModItems.CADMIUM_BOOTS);


    }


    // Credits to Kaupenjoe
    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MetallicExpansionMod.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(MetallicExpansionMod.MOD_ID, "item/" + item.getId().getPath()));
    }


}
