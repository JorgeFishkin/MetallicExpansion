package net.jorgefishkin.metallicexpansion.item;

import net.jorgefishkin.metallicexpansion.MetallicExpansionMod;
import net.jorgefishkin.metallicexpansion.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MetallicExpansionMod.MOD_ID);

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public static final RegistryObject<CreativeModeTab> METALLIC_EXPANSION_TAB = CREATIVE_MODE_TABS.register("metallicexpansion_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.INDIUM_INGOT.get())).title(Component.translatable("creativetab.metallicexpansion_tab")).displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.RAW_INDIUM.get());
                output.accept(ModItems.INDIUM_INGOT.get());
                output.accept(ModItems.INDIUM_NUGGET.get());
                output.accept(ModItems.INDIUM_DUST.get());

                output.accept(ModItems.RAW_PLATINUM.get());
                output.accept(ModItems.PLATINUM_INGOT.get());
                output.accept(ModItems.PLATINUM_NUGGET.get());
                output.accept(ModItems.PLATINUM_DUST.get());


                output.accept(ModItems.INDIUM_SWORD.get());
                output.accept(ModItems.INDIUM_PICKAXE.get());
                output.accept(ModItems.INDIUM_AXE.get());
                output.accept(ModItems.INDIUM_SHOVEL.get());
                output.accept(ModItems.INDIUM_HOE.get());

                output.accept(ModItems.PLATINUM_SWORD.get());
                output.accept(ModItems.PLATINUM_PICKAXE.get());
                output.accept(ModItems.PLATINUM_AXE.get());
                output.accept(ModItems.PLATINUM_SHOVEL.get());
                output.accept(ModItems.PLATINUM_HOE.get());


                output.accept(ModItems.INDIUM_HELMET.get());
                output.accept(ModItems.INDIUM_CHESTPLATE.get());
                output.accept(ModItems.INDIUM_LEGGINGS.get());
                output.accept(ModItems.INDIUM_BOOTS.get());

                output.accept(ModItems.PLATINUM_HELMET.get());
                output.accept(ModItems.PLATINUM_CHESTPLATE.get());
                output.accept(ModItems.PLATINUM_LEGGINGS.get());
                output.accept(ModItems.PLATINUM_BOOTS.get());


                output.accept(ModBlocks.INDIUM_BLOCK.get());
                output.accept(ModBlocks.RAW_INDIUM_BLOCK.get());
                output.accept(ModBlocks.INDIUM_ORE.get());
                output.accept(ModBlocks.DEEPSLATE_INDIUM_ORE.get());
                output.accept(ModBlocks.END_STONE_INDIUM_ORE.get());

                output.accept(ModBlocks.PLATINUM_BLOCK.get());
                output.accept(ModBlocks.RAW_PLATINUM_BLOCK.get());
                output.accept(ModBlocks.PLATINUM_ORE.get());
                output.accept(ModBlocks.DEEPSLATE_PLATINUM_ORE.get());
                output.accept(ModBlocks.END_STONE_PLATINUM_ORE.get());
            }).build());
}
