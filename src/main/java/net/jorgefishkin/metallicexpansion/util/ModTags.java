package net.jorgefishkin.metallicexpansion.util;

import net.jorgefishkin.metallicexpansion.MetallicExpansion;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.EnumMap;
import java.util.Map;


public class ModTags {
    private static final Map<EnumMaterials, MaterialTags> materials = new EnumMap<>(EnumMaterials.class);

    static
    {
        for(EnumMaterials m : EnumMaterials.values())
            materials.put(m, new ModTags.MaterialTags(m));
    }

    public static class Items {
        public static TagKey<Item> createItemTag(ResourceLocation location) {
            return ItemTags.create(location);
        }
    }

    public static class Blocks {
        public static TagKey<Block> createBlockTag(ResourceLocation location) {
            return BlockTags.create(location);
        }
    }

    public static MaterialTags getTagsFor(EnumMaterials material) {
        return materials.get(material);
    }

    // Thanks blusunrize from Immersive Engineering for showing a good way to keep track of tags
    public static class MaterialTags {
        public final TagKey<Item> RAW;
        public final TagKey<Item> INGOT;
        public final TagKey<Item> NUGGET;
        public final TagKey<Item> DUST;
        public final TagKey<Item> STORAGE_I;
        public final TagKey<Item> RAW_STORAGE_I;
        public final TagKey<Item> ORE_I;

        public final TagKey<Block> STORAGE;
        public final TagKey<Block> RAW_STORAGE;
        public final TagKey<Block> ORE;


        private MaterialTags(EnumMaterials m){
            String name = m.name().toLowerCase();

            // Precise Namespace Tags (i.e. c:ores/indium)
            RAW = Items.createItemTag(rawTag(name));
            INGOT = Items.createItemTag(ingotTag(name));
            NUGGET = Items.createItemTag(nuggetTag(name));
            DUST = Items.createItemTag(dustTag(name));
            STORAGE_I = Items.createItemTag(storageBlockTag(name));
            RAW_STORAGE_I = Items.createItemTag(rawBlockTag(name));
            ORE_I = Items.createItemTag(oreBlockTag(name));

            STORAGE = Blocks.createBlockTag(storageBlockTag(name));
            RAW_STORAGE = Blocks.createBlockTag(rawBlockTag(name));
            ORE = Blocks.createBlockTag(oreBlockTag(name));

        }
    }

    public static ResourceLocation mExpansionTag(String path) {
        return ResourceLocation.fromNamespaceAndPath(MetallicExpansion.MODID, path);
    }

    private static ResourceLocation cTag(String path) {
        return ResourceLocation.fromNamespaceAndPath("c", path);
    }

    public static ResourceLocation rawTag(String name) {
        return cTag("raw_materials/"+name);
    }

    public static ResourceLocation nuggetTag(String name) {
        return cTag("nuggets/"+name);
    }

    public static ResourceLocation dustTag(String name) {
        return cTag("dusts/"+name);
    }

    public static ResourceLocation ingotTag(String name) {
        return cTag("ingots/"+name);
    }

    public static ResourceLocation oreBlockTag(String name) {
        return cTag("ores/"+name);
    }

    public static ResourceLocation rawBlockTag(String name) {
        return cTag("storage_blocks/raw_"+name);
    }

    public static ResourceLocation storageBlockTag(String name) {
        return cTag("storage_blocks/"+name);
    }

}
