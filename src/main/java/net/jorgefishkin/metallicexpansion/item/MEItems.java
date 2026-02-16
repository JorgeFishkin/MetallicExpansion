package net.jorgefishkin.metallicexpansion.item;

import net.jorgefishkin.metallicexpansion.MetallicExpansion;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MEItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MetallicExpansion.MODID);

    // Materials //

    // Ingots
    public static final DeferredItem<Item> INDIUM_INGOT = ITEMS.register("indium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CADMIUM_INGOT = ITEMS.register("cadmium_ingot",
            () -> new Item(new Item.Properties()));

    // Raw
    public static final DeferredItem<Item> RAW_INDIUM = ITEMS.register("raw_indium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_CADMIUM = ITEMS.register("raw_cadmium",
            () -> new Item(new Item.Properties()));

    // Nuggets
    public static final DeferredItem<Item> INDIUM_NUGGET = ITEMS.register("indium_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CADMIUM_NUGGET = ITEMS.register("cadmium_nugget",
            () -> new Item(new Item.Properties()));

    // Dust
    public static final DeferredItem<Item> INDIUM_DUST = ITEMS.register("indium_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_DUST = ITEMS.register("platinum_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CADMIUM_DUST = ITEMS.register("cadmium_dust",
            () -> new Item(new Item.Properties()));


    // Tools //

    // Swords
    public static final DeferredItem<SwordItem> INDIUM_SWORD = ITEMS.register("indium_sword",
            () -> new SwordItem(METoolTiers.INDIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(METoolTiers.INDIUM, 3, -2.4f))));
    public static final DeferredItem<SwordItem> CADMIUM_SWORD = ITEMS.register("cadmium_sword",
            () -> new SwordItem(METoolTiers.CADMIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(METoolTiers.CADMIUM, 3, -2.4f))));
    public static final DeferredItem<SwordItem> PLATINUM_SWORD = ITEMS.register("platinum_sword",
            () -> new SwordItem(METoolTiers.PLATINUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(METoolTiers.PLATINUM, 3, -2.4f))));

    // Pickaxes
    public static final DeferredItem<PickaxeItem> INDIUM_PICKAXE = ITEMS.register("indium_pickaxe",
            () -> new PickaxeItem(METoolTiers.INDIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(METoolTiers.INDIUM, 1.0f, -2.8f))));
    public static final DeferredItem<PickaxeItem> CADMIUM_PICKAXE = ITEMS.register("cadmium_pickaxe",
            () -> new PickaxeItem(METoolTiers.CADMIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(METoolTiers.CADMIUM, 1.0f, -2.8f))));
    public static final DeferredItem<PickaxeItem> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe",
            () -> new PickaxeItem(METoolTiers.PLATINUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(METoolTiers.PLATINUM, 1.0f, -2.8f))));

    // Axes
    public static final DeferredItem<AxeItem> INDIUM_AXE = ITEMS.register("indium_axe",
            () -> new AxeItem(METoolTiers.INDIUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(METoolTiers.INDIUM, 6.0f, -2.9f))));
    public static final DeferredItem<AxeItem> CADMIUM_AXE = ITEMS.register("cadmium_axe",
            () -> new AxeItem(METoolTiers.CADMIUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(METoolTiers.CADMIUM, 5.0f, -3.0f))));
    public static final DeferredItem<AxeItem> PLATINUM_AXE = ITEMS.register("platinum_axe",
            () -> new AxeItem(METoolTiers.PLATINUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(METoolTiers.PLATINUM, 6.0f, -2.8f))));

    // Shovels
    public static final DeferredItem<ShovelItem> INDIUM_SHOVEL = ITEMS.register("indium_shovel",
            () -> new ShovelItem(METoolTiers.INDIUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(METoolTiers.INDIUM, 2.5f, -3.0f))));
    public static final DeferredItem<ShovelItem> CADMIUM_SHOVEL = ITEMS.register("cadmium_shovel",
            () -> new ShovelItem(METoolTiers.CADMIUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(METoolTiers.CADMIUM, 2.5f, -3.0f))));
    public static final DeferredItem<ShovelItem> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel",
            () -> new ShovelItem(METoolTiers.PLATINUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(METoolTiers.PLATINUM, 2.5f, -3.0f))));

    // Hoes
    public static final DeferredItem<HoeItem> INDIUM_HOE = ITEMS.register("indium_hoe",
            () -> new HoeItem(METoolTiers.INDIUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(METoolTiers.INDIUM, -1.0f, -2.0f))));
    public static final DeferredItem<HoeItem> CADMIUM_HOE = ITEMS.register("cadmium_hoe",
            () -> new HoeItem(METoolTiers.CADMIUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(METoolTiers.CADMIUM, -1.0f, -2.0f))));
    public static final DeferredItem<HoeItem> PLATINUM_HOE = ITEMS.register("platinum_hoe",
            () -> new HoeItem(METoolTiers.PLATINUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(METoolTiers.PLATINUM, -1.0f, -2.0f))));



    // Armor //

    // Helmets
    public static final DeferredItem<ArmorItem> INDIUM_HELMET = ITEMS.register("indium_helmet",
            () -> new ArmorItem(MEArmorMaterials.INDIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(6))));
    public static final DeferredItem<ArmorItem> CADMIUM_HELMET = ITEMS.register("cadmium_helmet",
            () -> new ArmorItem(MEArmorMaterials.CADMIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(14))));
    public static final DeferredItem<ArmorItem> PLATINUM_HELMET = ITEMS.register("platinum_helmet",
            () -> new ArmorItem(MEArmorMaterials.PLATINUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(25))));

    // Chestplates
    public static final DeferredItem<ArmorItem> INDIUM_CHESTPLATE = ITEMS.register("indium_chestplate",
            () -> new ArmorItem(MEArmorMaterials.INDIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(6))));
    public static final DeferredItem<ArmorItem> CADMIUM_CHESTPLATE = ITEMS.register("cadmium_chestplate",
            () -> new ArmorItem(MEArmorMaterials.CADMIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(14))));
    public static final DeferredItem<ArmorItem> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate",
            () -> new ArmorItem(MEArmorMaterials.PLATINUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(25))));

    // Leggings
    public static final DeferredItem<ArmorItem> INDIUM_LEGGINGS = ITEMS.register("indium_leggings",
            () -> new ArmorItem(MEArmorMaterials.INDIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(6))));
    public static final DeferredItem<ArmorItem> CADMIUM_LEGGINGS = ITEMS.register("cadmium_leggings",
            () -> new ArmorItem(MEArmorMaterials.CADMIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(14))));
    public static final DeferredItem<ArmorItem> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings",
            () -> new ArmorItem(MEArmorMaterials.PLATINUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(25))));

    // Boots
    public static final DeferredItem<ArmorItem> INDIUM_BOOTS = ITEMS.register("indium_boots",
            () -> new ArmorItem(MEArmorMaterials.INDIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(6))));
    public static final DeferredItem<ArmorItem> CADMIUM_BOOTS = ITEMS.register("cadmium_boots",
            () -> new ArmorItem(MEArmorMaterials.CADMIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(14))));
    public static final DeferredItem<ArmorItem> PLATINUM_BOOTS = ITEMS.register("platinum_boots",
            () -> new ArmorItem(MEArmorMaterials.PLATINUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(25))));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
