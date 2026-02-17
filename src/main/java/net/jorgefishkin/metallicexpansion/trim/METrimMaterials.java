package net.jorgefishkin.metallicexpansion.trim;

import net.jorgefishkin.metallicexpansion.MetallicExpansion;
import net.jorgefishkin.metallicexpansion.item.MEItems;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;

import java.util.Map;

public class METrimMaterials {
    public static final ResourceKey<TrimMaterial> CADMIUM =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(MetallicExpansion.MODID, "cadmium"));
    public static final ResourceKey<TrimMaterial> INDIUM =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(MetallicExpansion.MODID, "indium"));
    public static final ResourceKey<TrimMaterial> PLATINUM =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(MetallicExpansion.MODID, "platinum"));

    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, CADMIUM, MEItems.CADMIUM_INGOT.get(), Style.EMPTY.withColor(TextColor.parseColor("#dcdcd7").getOrThrow()), 0.2F);
        register(context, INDIUM, MEItems.INDIUM_INGOT.get(), Style.EMPTY.withColor(TextColor.parseColor("#c5e1f6").getOrThrow()), 0.2F);
        register(context, PLATINUM, MEItems.PLATINUM_INGOT.get(), Style.EMPTY.withColor(TextColor.parseColor("#ebebef").getOrThrow()), 0.2F);
    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimKey, Item item, Style style, float itemModelIndex) {
        TrimMaterial trimmaterial = TrimMaterial.create(trimKey.location().getPath(), item, itemModelIndex,
                Component.translatable(Util.makeDescriptionId("trim_material", trimKey.location())).withStyle(style), Map.of());
        context.register(trimKey, trimmaterial);
    }
}
