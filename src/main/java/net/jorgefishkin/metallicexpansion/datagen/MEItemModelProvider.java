package net.jorgefishkin.metallicexpansion.datagen;

import net.jorgefishkin.metallicexpansion.MetallicExpansion;
import net.jorgefishkin.metallicexpansion.item.MEItems;

import net.minecraft.data.PackOutput;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.LinkedHashMap;


public class MEItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }
    public MEItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MetallicExpansion.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(MEItems.INDIUM_INGOT.get());
        basicItem(MEItems.PLATINUM_INGOT.get());
        basicItem(MEItems.CADMIUM_INGOT.get());

        basicItem(MEItems.RAW_INDIUM.get());
        basicItem(MEItems.RAW_PLATINUM.get());
        basicItem(MEItems.RAW_CADMIUM.get());

        basicItem(MEItems.INDIUM_NUGGET.get());
        basicItem(MEItems.PLATINUM_NUGGET.get());
        basicItem(MEItems.CADMIUM_NUGGET.get());

        basicItem(MEItems.INDIUM_DUST.get());
        basicItem(MEItems.PLATINUM_DUST.get());
        basicItem(MEItems.CADMIUM_DUST.get());

        handheldItem(MEItems.INDIUM_SWORD.get());
        handheldItem(MEItems.INDIUM_PICKAXE.get());
        handheldItem(MEItems.INDIUM_AXE.get());
        handheldItem(MEItems.INDIUM_SHOVEL.get());
        handheldItem(MEItems.INDIUM_HOE.get());

        handheldItem(MEItems.PLATINUM_SWORD.get());
        handheldItem(MEItems.PLATINUM_PICKAXE.get());
        handheldItem(MEItems.PLATINUM_AXE.get());
        handheldItem(MEItems.PLATINUM_SHOVEL.get());
        handheldItem(MEItems.PLATINUM_HOE.get());

        handheldItem(MEItems.CADMIUM_SWORD.get());
        handheldItem(MEItems.CADMIUM_PICKAXE.get());
        handheldItem(MEItems.CADMIUM_AXE.get());
        handheldItem(MEItems.CADMIUM_SHOVEL.get());
        handheldItem(MEItems.CADMIUM_HOE.get());

        trimmedArmorItem(MEItems.INDIUM_HELMET);
        trimmedArmorItem(MEItems.INDIUM_CHESTPLATE);
        trimmedArmorItem(MEItems.INDIUM_LEGGINGS);
        trimmedArmorItem(MEItems.INDIUM_BOOTS);

        trimmedArmorItem(MEItems.PLATINUM_HELMET);
        trimmedArmorItem(MEItems.PLATINUM_CHESTPLATE);
        trimmedArmorItem(MEItems.PLATINUM_LEGGINGS);
        trimmedArmorItem(MEItems.PLATINUM_BOOTS);

        trimmedArmorItem(MEItems.CADMIUM_HELMET);
        trimmedArmorItem(MEItems.CADMIUM_CHESTPLATE);
        trimmedArmorItem(MEItems.CADMIUM_LEGGINGS);
        trimmedArmorItem(MEItems.CADMIUM_BOOTS);


    }

    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(DeferredItem<ArmorItem> itemDeferredItem) {
        final String MOD_ID = MetallicExpansion.MODID;

        if(itemDeferredItem.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemDeferredItem.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace()  + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemDeferredItem.getId().getPath()));
            });
        }
    }

}
