package net.jorgefishkin.metallicexpansion.item;

import net.jorgefishkin.metallicexpansion.util.EnumMaterials;
import net.jorgefishkin.metallicexpansion.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class METoolTiers {
    public static final Tier CADMIUM = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL, 100, 6.0f, 1.0f, 12, () -> Ingredient.of(ModTags.getTagsFor(EnumMaterials.CADMIUM).INGOT));
    public static final Tier INDIUM = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL, 32, 10.0f, 0.0f, 30, () -> Ingredient.of(ModTags.getTagsFor(EnumMaterials.INDIUM).INGOT));
    public static final Tier PLATINUM = new SimpleTier(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1000, 8.0f, 3.0f, 14, () -> Ingredient.of(ModTags.getTagsFor(EnumMaterials.PLATINUM).INGOT));
}
