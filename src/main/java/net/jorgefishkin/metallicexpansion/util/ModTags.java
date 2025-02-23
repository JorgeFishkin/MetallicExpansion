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
        public static final TagKey<Item> PLATINUM_INGOT = forgeTag("ingots/platinum");
        public static final TagKey<Item> CADMIUM_INGOT = forgeTag("ingots/cadmium");

        public static final TagKey<Item> INDIUM_NUGGET = forgeTag("nuggets/indium");
        public static final TagKey<Item> PLATINUM_NUGGET = forgeTag("nuggets/platinum");
        public static final TagKey<Item> CADMIUM_NUGGET = forgeTag("nuggets/cadmium");

        public static final TagKey<Item> INDIUM_DUST = forgeTag("dusts/indium");
        public static final TagKey<Item> PLATINUM_DUST = forgeTag("dusts/platinum");
        public static final TagKey<Item> CADMIUM_DUST = forgeTag("dusts/cadmium");

        public static final TagKey<Item> RAW_INDIUM = forgeTag("raw_materials/indium");
        public static final TagKey<Item> RAW_PLATINUM = forgeTag("raw_materials/platinum");
        public static final TagKey<Item> RAW_CADMIUM = forgeTag("raw_materials/cadmium");

        public static final TagKey<Item> INDIUM_BLOCK = forgeTag("storage_blocks/indium");
        public static final TagKey<Item> PLATINUM_BLOCK = forgeTag("storage_blocks/platinum");
        public static final TagKey<Item> CADMIUM_BLOCK = forgeTag("storage_blocks/cadmium");

        public static final TagKey<Item> INDIUM_ORE = forgeTag("ores/indium");
        public static final TagKey<Item> PLATINUM_ORE = forgeTag("ores/platinum");
        public static final TagKey<Item> CADMIUM_ORE = forgeTag("ores/cadmium");

        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(MetallicExpansionMod.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name){
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Blocks{
        public static final TagKey<Block> INDIUM_BLOCK = forgeTag("storage_blocks/indium");
        public static final TagKey<Block> PLATINUM_BLOCK = forgeTag("storage_blocks/platinum");
        public static final TagKey<Block> CADMIUM_BLOCK = forgeTag("storage_blocks/cadmium");

        public static final TagKey<Block> RAW_INDIUM_BLOCK = forgeTag("storage_blocks/raw_indium");
        public static final TagKey<Block> RAW_PLATINUM_BLOCK = forgeTag("storage_blocks/raw_platinum");
        public static final TagKey<Block> RAW_CADMIUM_BLOCK = forgeTag("storage_blocks/raw_cadmium");

        public static final TagKey<Block> INDIUM_ORE = forgeTag("ores/indium");
        public static final TagKey<Block> PLATINUM_ORE = forgeTag("ores/platinum");
        public static final TagKey<Block> CADMIUM_ORE = forgeTag("ores/cadmium");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(MetallicExpansionMod.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
