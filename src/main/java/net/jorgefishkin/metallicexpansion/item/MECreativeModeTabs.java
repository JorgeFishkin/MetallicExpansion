package net.jorgefishkin.metallicexpansion.item;

import net.jorgefishkin.metallicexpansion.MetallicExpansion;
import net.jorgefishkin.metallicexpansion.block.MEBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MECreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MetallicExpansion.MODID);

    public static final Supplier<CreativeModeTab> METALLIC_EXPANSION_TAB = CREATIVE_MODE_TAB.register("metallic_expansion_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(MEItems.INDIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.metallicexpansion.metallic_expansion"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(MEItems.RAW_INDIUM);
                        output.accept(MEItems.INDIUM_INGOT);
                        output.accept(MEItems.INDIUM_DUST);
                        output.accept(MEItems.INDIUM_NUGGET);
                        output.accept(MEItems.RAW_CADMIUM);
                        output.accept(MEItems.CADMIUM_INGOT);
                        output.accept(MEItems.CADMIUM_DUST);
                        output.accept(MEItems.CADMIUM_NUGGET);
                        output.accept(MEItems.RAW_PLATINUM);
                        output.accept(MEItems.PLATINUM_INGOT);
                        output.accept(MEItems.PLATINUM_DUST);
                        output.accept(MEItems.PLATINUM_NUGGET);

                        output.accept(MEItems.INDIUM_SWORD);
                        output.accept(MEItems.INDIUM_SHOVEL);
                        output.accept(MEItems.INDIUM_PICKAXE);
                        output.accept(MEItems.INDIUM_AXE);
                        output.accept(MEItems.INDIUM_HOE);

                        output.accept(MEItems.CADMIUM_SWORD);
                        output.accept(MEItems.CADMIUM_SHOVEL);
                        output.accept(MEItems.CADMIUM_PICKAXE);
                        output.accept(MEItems.CADMIUM_AXE);
                        output.accept(MEItems.CADMIUM_HOE);

                        output.accept(MEItems.PLATINUM_SWORD);
                        output.accept(MEItems.PLATINUM_SHOVEL);
                        output.accept(MEItems.PLATINUM_PICKAXE);
                        output.accept(MEItems.PLATINUM_AXE);
                        output.accept(MEItems.PLATINUM_HOE);

                        output.accept(MEItems.INDIUM_HELMET);
                        output.accept(MEItems.INDIUM_CHESTPLATE);
                        output.accept(MEItems.INDIUM_LEGGINGS);
                        output.accept(MEItems.INDIUM_BOOTS);

                        output.accept(MEItems.CADMIUM_HELMET);
                        output.accept(MEItems.CADMIUM_CHESTPLATE);
                        output.accept(MEItems.CADMIUM_LEGGINGS);
                        output.accept(MEItems.CADMIUM_BOOTS);

                        output.accept(MEItems.PLATINUM_HELMET);
                        output.accept(MEItems.PLATINUM_CHESTPLATE);
                        output.accept(MEItems.PLATINUM_LEGGINGS);
                        output.accept(MEItems.PLATINUM_BOOTS);

                        output.accept(MEBlocks.RAW_INDIUM_BLOCK);
                        output.accept(MEBlocks.RAW_CADMIUM_BLOCK);
                        output.accept(MEBlocks.RAW_PLATINUM_BLOCK);

                        output.accept(MEBlocks.INDIUM_BLOCK);
                        output.accept(MEBlocks.CADMIUM_BLOCK);
                        output.accept(MEBlocks.PLATINUM_BLOCK);

                        output.accept(MEBlocks.INDIUM_ORE);
                        output.accept(MEBlocks.DEEPSLATE_INDIUM_ORE);
                        output.accept(MEBlocks.END_STONE_INDIUM_ORE);
                        output.accept(MEBlocks.CADMIUM_ORE);
                        output.accept(MEBlocks.DEEPSLATE_CADMIUM_ORE);
                        output.accept(MEBlocks.NETHERRACK_CADMIUM_ORE);
                        output.accept(MEBlocks.PLATINUM_ORE);
                        output.accept(MEBlocks.DEEPSLATE_PLATINUM_ORE);
                        output.accept(MEBlocks.END_STONE_PLATINUM_ORE);
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
