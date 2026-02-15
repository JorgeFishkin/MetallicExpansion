package net.jorgefishkin.metallicexpansion.datagen;

import net.jorgefishkin.metallicexpansion.MetallicExpansion;
import net.jorgefishkin.metallicexpansion.block.ModBlocks;
import net.jorgefishkin.metallicexpansion.util.EnumMaterials;
import net.jorgefishkin.metallicexpansion.util.ModTags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;

import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {

    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, MetallicExpansion.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        for (EnumMaterials m : EnumMaterials.values()) {
            ArrayList<DeferredBlock<Block>> oreList = m.getOreList();

            // General item tags
            tag(Tags.Items.RAW_MATERIALS)
                    .add(m.getRaw().get());
            tag(Tags.Items.INGOTS)
                    .add(m.getIngot().get());
            tag(Tags.Items.DUSTS)
                    .add(m.getDust().get());
            tag(Tags.Items.NUGGETS)
                    .add(m.getNugget().get());
            tag(Tags.Items.STORAGE_BLOCKS)
                    .add(m.getStorageBlock().asItem())
                    .add(m.getRawStorageBlock().asItem());

            for (DeferredBlock<Block> block : oreList) {
                tag(Tags.Items.ORES)
                        .add(block.asItem());
                tag(ModTags.getTagsFor(m).ORE_I)
                        .add(block.asItem());
                if(ModBlocks.isStoneOre(block))
                    tag(Tags.Items.ORES_IN_GROUND_STONE)
                            .add(block.asItem());
                if(ModBlocks.isDeepslateOre(block))
                    tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE)
                            .add(block.asItem());
                if(ModBlocks.isNetherOre(block))
                    tag(Tags.Items.ORES_IN_GROUND_NETHERRACK)
                            .add(block.asItem());
            }

            // Precise namespace item tags
            tag(ModTags.getTagsFor(m).RAW)
                    .add(m.getRaw().get());
            tag(ModTags.getTagsFor(m).INGOT)
                    .add(m.getIngot().get());
            tag(ModTags.getTagsFor(m).DUST)
                    .add(m.getDust().get());
            tag(ModTags.getTagsFor(m).NUGGET)
                    .add(m.getNugget().get());
            tag(ModTags.getTagsFor(m).STORAGE_I)
                    .add(m.getStorageBlock().asItem());
            tag(ModTags.getTagsFor(m).RAW_STORAGE_I)
                    .add(m.getRawStorageBlock().asItem());

            // Vanilla Tags
            tag(ItemTags.SWORDS)
                    .add(m.getSword().get());
            tag(ItemTags.PICKAXES)
                    .add(m.getPickaxe().get());
            tag(ItemTags.AXES)
                    .add(m.getAxe().get());
            tag(ItemTags.SHOVELS)
                    .add(m.getShovel().get());
            tag(ItemTags.HOES)
                    .add(m.getHoe().get());

            // NeoForge Tags
            tag(Tags.Items.MELEE_WEAPON_TOOLS)
                    .add(m.getSword().get())
                    .add(m.getAxe().get());

        }

    }
}
