package net.jorgefishkin.metallicexpansion.item;

import net.jorgefishkin.metallicexpansion.util.EnumMaterials;
import net.jorgefishkin.metallicexpansion.util.METags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class METoolTiers {
    public static final Tier CADMIUM = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL, 100, 6.0f, 1.0f, 12, () -> Ingredient.of(METags.getTagsFor(EnumMaterials.CADMIUM).INGOT));
    public static final Tier INDIUM = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL, 32, 6.0f, 0.0f, 30, () -> Ingredient.of(METags.getTagsFor(EnumMaterials.INDIUM).INGOT));
    public static final Tier PLATINUM = new SimpleTier(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 500, 8.0f, 2.5f, 14, () -> Ingredient.of(METags.getTagsFor(EnumMaterials.PLATINUM).INGOT));
}
