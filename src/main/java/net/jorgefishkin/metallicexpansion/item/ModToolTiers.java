package net.jorgefishkin.metallicexpansion.item;

import net.jorgefishkin.metallicexpansion.MetallicExpansionMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {

    public static final Tier INDIUM = TierSortingRegistry.registerTier(
            new ForgeTier(1, 32, 10f, 0f, 30,
                    Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(ModItems.INDIUM_INGOT.get())),
                    new ResourceLocation(MetallicExpansionMod.MOD_ID, "indium"), List.of(Tiers.STONE), List.of(Tiers.IRON));

    public static final Tier PLATINUM = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1000, 8f, 3f, 14,
                    Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(ModItems.PLATINUM_INGOT.get())),
            new ResourceLocation(MetallicExpansionMod.MOD_ID, "platinum"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));

    public static final Tier CADMIUM = TierSortingRegistry.registerTier(
            new ForgeTier(1, 100, 6f, 1f, 12,
                    Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(ModItems.CADMIUM_INGOT.get())),
            new ResourceLocation(MetallicExpansionMod.MOD_ID, "cadmium"), List.of(Tiers.STONE), List.of(Tiers.IRON));
}
