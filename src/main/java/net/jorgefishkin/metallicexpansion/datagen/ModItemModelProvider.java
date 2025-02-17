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
        simpleItem(ModItems.RAW_INDIUM);
        simpleItem(ModItems.INDIUM_NUGGET);
        simpleItem(ModItems.INDIUM_DUST);

        handheldItem(ModItems.INDIUM_SWORD);
        handheldItem(ModItems.INDIUM_PICKAXE);
        handheldItem(ModItems.INDIUM_AXE);
        handheldItem(ModItems.INDIUM_SHOVEL);
        handheldItem(ModItems.INDIUM_HOE);

        simpleItem(ModItems.INDIUM_HELMET);
        simpleItem(ModItems.INDIUM_CHESTPLATE);
        simpleItem(ModItems.INDIUM_LEGGINGS);
        simpleItem(ModItems.INDIUM_BOOTS);


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
