package net.jorgefishkin.metallicexpansion.item;

import net.jorgefishkin.metallicexpansion.MetallicExpansion;
import net.jorgefishkin.metallicexpansion.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MetallicExpansion.MODID);

    public static final Supplier<CreativeModeTab> METALLIC_EXPANSION_TAB = CREATIVE_MODE_TAB.register("metallic_expansion_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.INDIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.metallicexpansion.metallic_expansion"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAW_INDIUM);
                        output.accept(ModItems.INDIUM_INGOT);
                        output.accept(ModItems.INDIUM_DUST);
                        output.accept(ModItems.INDIUM_NUGGET);
                        output.accept(ModItems.RAW_CADMIUM);
                        output.accept(ModItems.CADMIUM_INGOT);
                        output.accept(ModItems.CADMIUM_DUST);
                        output.accept(ModItems.CADMIUM_NUGGET);
                        output.accept(ModItems.RAW_PLATINUM);
                        output.accept(ModItems.PLATINUM_INGOT);
                        output.accept(ModItems.PLATINUM_DUST);
                        output.accept(ModItems.PLATINUM_NUGGET);

                        output.accept(ModBlocks.RAW_INDIUM_BLOCK);
                        output.accept(ModBlocks.RAW_CADMIUM_BLOCK);
                        output.accept(ModBlocks.RAW_PLATINUM_BLOCK);

                        output.accept(ModBlocks.INDIUM_BLOCK);
                        output.accept(ModBlocks.CADMIUM_BLOCK);
                        output.accept(ModBlocks.PLATINUM_BLOCK);

                        output.accept(ModBlocks.INDIUM_ORE);
                        output.accept(ModBlocks.DEEPSLATE_INDIUM_ORE);
                        output.accept(ModBlocks.END_STONE_INDIUM_ORE);
                        output.accept(ModBlocks.CADMIUM_ORE);
                        output.accept(ModBlocks.DEEPSLATE_CADMIUM_ORE);
                        output.accept(ModBlocks.NETHERRACK_CADMIUM_ORE);
                        output.accept(ModBlocks.PLATINUM_ORE);
                        output.accept(ModBlocks.DEEPSLATE_PLATINUM_ORE);
                        output.accept(ModBlocks.END_STONE_PLATINUM_ORE);
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
