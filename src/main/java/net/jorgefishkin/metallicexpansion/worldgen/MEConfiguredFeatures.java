package net.jorgefishkin.metallicexpansion.worldgen;

import net.jorgefishkin.metallicexpansion.MetallicExpansion;
import net.jorgefishkin.metallicexpansion.block.MEBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class MEConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CADMIUM_ORE_KEY = registerKey("cadmium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_CADMIUM_ORE_KEY = registerKey("nether_cadmium_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_INDIUM_ORE_KEY = registerKey("indium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_INDIUM_ORE_KEY = registerKey("end_indium_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PLATINUM_ORE_KEY = registerKey("platinum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_PLATINUM_ORE_KEY = registerKey("end_platinum_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endStoneReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldCadmiumOres = List.of(
                OreConfiguration.target(stoneReplaceables, MEBlocks.CADMIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, MEBlocks.DEEPSLATE_CADMIUM_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldIndiumOres = List.of(
                OreConfiguration.target(stoneReplaceables, MEBlocks.INDIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, MEBlocks.DEEPSLATE_INDIUM_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldPlatinumOres = List.of(
                OreConfiguration.target(stoneReplaceables, MEBlocks.PLATINUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, MEBlocks.DEEPSLATE_PLATINUM_ORE.get().defaultBlockState())
        );

        register(context, OVERWORLD_CADMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCadmiumOres, 6));
        register(context, NETHER_CADMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, MEBlocks.NETHERRACK_CADMIUM_ORE.get().defaultBlockState(), 9));

        register(context, OVERWORLD_INDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldIndiumOres, 4));
        register(context, END_INDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endStoneReplaceables, MEBlocks.END_STONE_INDIUM_ORE.get().defaultBlockState(), 5));

        register(context, OVERWORLD_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPlatinumOres, 4));
        register(context, END_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(endStoneReplaceables, MEBlocks.END_STONE_PLATINUM_ORE.get().defaultBlockState(), 3));

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name){
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MetallicExpansion.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
