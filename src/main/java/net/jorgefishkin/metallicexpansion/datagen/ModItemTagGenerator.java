package net.jorgefishkin.metallicexpansion.datagen;

import net.jorgefishkin.metallicexpansion.MetallicExpansionMod;
import net.jorgefishkin.metallicexpansion.block.ModBlocks;
import net.jorgefishkin.metallicexpansion.item.ModItems;
import net.jorgefishkin.metallicexpansion.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {


    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future, CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, MetallicExpansionMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModTags.Items.INDIUM_INGOT).add(ModItems.INDIUM_INGOT.get());

        this.tag(ModTags.Items.INDIUM_NUGGET).add(ModItems.INDIUM_NUGGET.get());

        this.tag(ModTags.Items.INDIUM_DUST).add(ModItems.INDIUM_DUST.get());

        this.tag(ModTags.Items.RAW_INDIUM).add(ModItems.RAW_INDIUM.get());

        this.tag(ModTags.Items.INDIUM_BLOCK).add(ModBlocks.INDIUM_BLOCK.get().asItem())
                .add(ModBlocks.RAW_INDIUM_BLOCK.get().asItem());

        this.tag(ModTags.Items.INDIUM_ORE).add(ModBlocks.INDIUM_ORE.get().asItem())
                .add(ModBlocks.DEEPSLATE_INDIUM_ORE.get().asItem())
                .add(ModBlocks.END_STONE_INDIUM_ORE.get().asItem());

    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
