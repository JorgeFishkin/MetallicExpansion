package net.jorgefishkin.metallicexpansion.util;

import net.jorgefishkin.metallicexpansion.MetallicExpansionMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Items{
        public static final TagKey<Item> INDIUM_INGOT = forgeTag("ingots/indium");

        public static final TagKey<Item> INDIUM_NUGGET = forgeTag("nuggets/indium");

        public static final TagKey<Item> INDIUM_DUST = forgeTag("dusts/indium");

        public static final TagKey<Item> RAW_INDIUM = forgeTag("raw_materials/indium");

        public static final TagKey<Item> INDIUM_BLOCK = forgeTag("storage_blocks/indium");
        public static final TagKey<Item> RAW_INDIUM_BLOCK = forgeTag("storage_blocks/raw_indium");
        public static final TagKey<Item> INDIUM_ORE = forgeTag("ores/indium");

        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(MetallicExpansionMod.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name){
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Blocks{
        public static final TagKey<Block> INDIUM_BLOCK = forgeTag("storage_blocks/indium");
        public static final TagKey<Block> RAW_INDIUM_BLOCK = forgeTag("storage_blocks/raw_indium");
        public static final TagKey<Block> INDIUM_ORE = forgeTag("ores/indium");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(MetallicExpansionMod.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
