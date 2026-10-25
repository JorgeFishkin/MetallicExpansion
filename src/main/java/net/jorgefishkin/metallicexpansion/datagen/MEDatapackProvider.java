package net.jorgefishkin.metallicexpansion.datagen;

import net.jorgefishkin.metallicexpansion.MetallicExpansion;
import net.jorgefishkin.metallicexpansion.trim.METrimMaterials;
import net.jorgefishkin.metallicexpansion.worldgen.MEBiomeModifiers;
import net.jorgefishkin.metallicexpansion.worldgen.MEConfiguredFeatures;
import net.jorgefishkin.metallicexpansion.worldgen.MEPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class MEDatapackProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.TRIM_MATERIAL, METrimMaterials::bootstrap)
            .add(Registries.CONFIGURED_FEATURE, MEConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, MEPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, MEBiomeModifiers::bootstrap);

    public MEDatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(MetallicExpansion.MODID));
    }
}
