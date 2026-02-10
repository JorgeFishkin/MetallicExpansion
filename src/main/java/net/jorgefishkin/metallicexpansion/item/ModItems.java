package net.jorgefishkin.metallicexpansion.item;

import net.jorgefishkin.metallicexpansion.MetallicExpansion;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MetallicExpansion.MODID);

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

    /*
    // Tools
    public static final DeferredItem<Item> INDIUM_SWORD = ITEMS.register("indium_sword",
            () -> new SwordItem(ModToolTiers.INDIUM, 2, -2.4F, new Item.Properties().durability(32)));
    public static final DeferredItem<Item> CADMIUM_SWORD = ITEMS.register("cadmium_sword",
            () -> new SwordItem(ModToolTiers.CADMIUM, 2, -2.4F, new Item.Properties().durability(100)));
    public static final DeferredItem<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword",
            () -> new SwordItem(ModToolTiers.PLATINUM, 3, -2.4F, new Item.Properties().durability(1000)));

    public static final DeferredItem<Item> INDIUM_PICKAXE = ITEMS.register("indium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.INDIUM, 1, -2.8F, new Item.Properties().durability(32)));
    public static final DeferredItem<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PLATINUM, 2, -2.8F, new Item.Properties().durability(1000)));
    public static final DeferredItem<Item> CADMIUM_PICKAXE = ITEMS.register("cadmium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CADMIUM, 1, -2.8F, new Item.Properties().durability(100)));

    public static final DeferredItem<Item> INDIUM_AXE = ITEMS.register("indium_axe",
            () -> new AxeItem(ModToolTiers.INDIUM, 4, -3.0F, new Item.Properties().durability(32)));
    public static final DeferredItem<Item> PLATINUM_AXE = ITEMS.register("platinum_axe",
            () -> new AxeItem(ModToolTiers.PLATINUM, 5, -3.0F, new Item.Properties().durability(1000)));
    public static final DeferredItem<Item> CADMIUM_AXE = ITEMS.register("cadmium_axe",
            () -> new AxeItem(ModToolTiers.CADMIUM, 4, -3.0F, new Item.Properties().durability(100)));

    public static final DeferredItem<Item> INDIUM_SHOVEL = ITEMS.register("indium_shovel",
            () -> new ShovelItem(ModToolTiers.INDIUM, 1.5F, -3.0F, new Item.Properties().durability(32)));
    public static final DeferredItem<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel",
            () -> new ShovelItem(ModToolTiers.PLATINUM, 2.5F, -3.0F, new Item.Properties().durability(1000)));
    public static final DeferredItem<Item> CADMIUM_SHOVEL = ITEMS.register("cadmium_shovel",
            () -> new ShovelItem(ModToolTiers.CADMIUM, 1.5F, -3.0F, new Item.Properties().durability(100)));

    public static final DeferredItem<Item> INDIUM_HOE = ITEMS.register("indium_hoe",
            () -> new HoeItem(ModToolTiers.INDIUM, 1, 0.0F, new Item.Properties().durability(32)));
    public static final DeferredItem<Item> PLATINUM_HOE = ITEMS.register("platinum_hoe",
            () -> new HoeItem(ModToolTiers.PLATINUM, -3, 0.0F, new Item.Properties().durability(1000)));
    public static final DeferredItem<Item> CADMIUM_HOE = ITEMS.register("cadmium_hoe",
            () -> new HoeItem(ModToolTiers.CADMIUM, 0, 0.0F, new Item.Properties().durability(100)));

    // Armor
    public static final DeferredItem<Item> INDIUM_HELMET = ITEMS.register("indium_helmet",
            () -> new ArmorItem(ModArmorMaterials.INDIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_HELMET = ITEMS.register("platinum_helmet",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> CADMIUM_HELMET = ITEMS.register("cadmium_helmet",
            () -> new ArmorItem(ModArmorMaterials.CADMIUM, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final DeferredItem<Item> INDIUM_CHESTPLATE = ITEMS.register("indium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.INDIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> CADMIUM_CHESTPLATE = ITEMS.register("cadmium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CADMIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final DeferredItem<Item> INDIUM_LEGGINGS = ITEMS.register("indium_leggings",
            () -> new ArmorItem(ModArmorMaterials.INDIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> CADMIUM_LEGGINGS = ITEMS.register("cadmium_leggings",
            () -> new ArmorItem(ModArmorMaterials.CADMIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final DeferredItem<Item> INDIUM_BOOTS = ITEMS.register("indium_boots",
            () -> new ArmorItem(ModArmorMaterials.INDIUM, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_BOOTS = ITEMS.register("platinum_boots",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final DeferredItem<Item> CADMIUM_BOOTS = ITEMS.register("cadmium_boots",
            () -> new ArmorItem(ModArmorMaterials.CADMIUM, ArmorItem.Type.BOOTS, new Item.Properties()));
    */
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
