package net.jorgefishkin.metallicexpansion.datagen;

import net.jorgefishkin.metallicexpansion.MetallicExpansion;
import net.jorgefishkin.metallicexpansion.trim.METrimMaterials;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class MEDatapackProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.TRIM_MATERIAL, METrimMaterials::bootstrap);

    public MEDatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(MetallicExpansion.MODID));
    }
}
