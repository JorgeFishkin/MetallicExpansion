package net.jorgefishkin.metallicexpansion.item;

import net.jorgefishkin.metallicexpansion.MetallicExpansionMod;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MetallicExpansionMod.MOD_ID);

    // Ingots
    public static final RegistryObject<Item> INDIUM_INGOT = ITEMS.register("indium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties()));

    // Raw
    public static final RegistryObject<Item> RAW_INDIUM = ITEMS.register("raw_indium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties()));

    // Nuggets
    public static final RegistryObject<Item> INDIUM_NUGGET = ITEMS.register("indium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget",
            () -> new Item(new Item.Properties()));

    // Dust
    public static final RegistryObject<Item> INDIUM_DUST = ITEMS.register("indium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_DUST = ITEMS.register("platinum_dust",
            () -> new Item(new Item.Properties()));

    // Tools
    public static final RegistryObject<Item> INDIUM_SWORD = ITEMS.register("indium_sword",
            () -> new SwordItem(ModToolTiers.INDIUM, 2, 3, new Item.Properties().durability(32)));

    public static final RegistryObject<Item> INDIUM_PICKAXE = ITEMS.register("indium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.INDIUM, 1, 3, new Item.Properties().durability(32)));

    public static final RegistryObject<Item> INDIUM_AXE = ITEMS.register("indium_axe",
            () -> new AxeItem(ModToolTiers.INDIUM, 3, 3, new Item.Properties().durability(32)));

    public static final RegistryObject<Item> INDIUM_SHOVEL = ITEMS.register("indium_shovel",
            () -> new ShovelItem(ModToolTiers.INDIUM, 0, 3, new Item.Properties().durability(32)));

    public static final RegistryObject<Item> INDIUM_HOE = ITEMS.register("indium_hoe",
            () -> new HoeItem(ModToolTiers.INDIUM, 0, 3, new Item.Properties().durability(32)));

    // Armor
    public static final RegistryObject<Item> INDIUM_HELMET = ITEMS.register("indium_helmet",
            () -> new ArmorItem(ModArmorMaterials.INDIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> INDIUM_CHESTPLATE = ITEMS.register("indium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.INDIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> INDIUM_LEGGINGS = ITEMS.register("indium_leggings",
            () -> new ArmorItem(ModArmorMaterials.INDIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> INDIUM_BOOTS = ITEMS.register("indium_boots",
            () -> new ArmorItem(ModArmorMaterials.INDIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
