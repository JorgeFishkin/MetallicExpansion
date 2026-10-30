package net.jorgefishkin.metallicexpansion.worldgen;

import net.jorgefishkin.metallicexpansion.MetallicExpansion;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class MEPlacedFeatures {
    public static final ResourceKey<PlacedFeature> OVERWORLD_CADMIUM_ORE_PLACED_KEY = registerKey("cadmium_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_CADMIUM_ORE_PLACED_KEY = registerKey("nether_cadmium_ore_placed");

    public static final ResourceKey<PlacedFeature> OVERWORLD_INDIUM_ORE_PLACED_KEY = registerKey("indium_ore_placed");
    public static final ResourceKey<PlacedFeature> END_INDIUM_ORE_PLACED_KEY = registerKey("end_indium_ore_placed");

    public static final ResourceKey<PlacedFeature> OVERWORLD_PLATINUM_ORE_PLACED_KEY = registerKey("platinum_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_PLATINUM_ORE_LOWER_PLACED_KEY = registerKey("platinum_ore_lower_placed");
    public static final ResourceKey<PlacedFeature> END_PLATINUM_ORE_PLACED_KEY = registerKey("end_platinum_ore_placed");


    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, OVERWORLD_CADMIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(MEConfiguredFeatures.OVERWORLD_CADMIUM_ORE_KEY),
                MEOrePlacement.commonOrePlacement(24, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(180))));
        register(context, NETHER_CADMIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(MEConfiguredFeatures.NETHER_CADMIUM_ORE_KEY),
                MEOrePlacement.commonOrePlacement(14, HeightRangePlacement.triangle(VerticalAnchor.absolute(3), VerticalAnchor.absolute(128))));

        register(context, OVERWORLD_INDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(MEConfiguredFeatures.OVERWORLD_INDIUM_ORE_KEY),
                MEOrePlacement.commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(60))));
        register(context, END_INDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(MEConfiguredFeatures.END_INDIUM_ORE_KEY),
                MEOrePlacement.commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(200))));

        register(context, OVERWORLD_PLATINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(MEConfiguredFeatures.OVERWORLD_PLATINUM_ORE_KEY),
                MEOrePlacement.commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.absolute(-38), VerticalAnchor.absolute(50))));
        register(context, OVERWORLD_PLATINUM_ORE_LOWER_PLACED_KEY, configuredFeatures.getOrThrow(MEConfiguredFeatures.OVERWORLD_PLATINUM_ORE_KEY),
                MEOrePlacement.commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-38))));
        register(context, END_PLATINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(MEConfiguredFeatures.END_PLATINUM_ORE_KEY),
                MEOrePlacement.commonOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(200))));

    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MetallicExpansion.MODID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
