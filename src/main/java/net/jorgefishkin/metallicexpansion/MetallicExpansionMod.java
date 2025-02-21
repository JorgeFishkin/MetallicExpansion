package net.jorgefishkin.metallicexpansion;

import com.mojang.logging.LogUtils;
import net.jorgefishkin.metallicexpansion.block.ModBlocks;
import net.jorgefishkin.metallicexpansion.item.ModCreativeModeTabs;
import net.jorgefishkin.metallicexpansion.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MetallicExpansionMod.MOD_ID)
public class MetallicExpansionMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "metallicexpansion";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public MetallicExpansionMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.INDIUM_INGOT);
            event.accept(ModItems.RAW_INDIUM);
            event.accept(ModItems.INDIUM_NUGGET);
            event.accept(ModItems.INDIUM_DUST);

            event.accept(ModItems.PLATINUM_INGOT);
            event.accept(ModItems.RAW_PLATINUM);
            event.accept(ModItems.PLATINUM_NUGGET);
            event.accept(ModItems.PLATINUM_DUST);

            event.accept(ModItems.CADMIUM_INGOT);
            event.accept(ModItems.RAW_CADMIUM);
            event.accept(ModItems.CADMIUM_NUGGET);
            event.accept(ModItems.CADMIUM_DUST);
        }

        if(event.getTabKey() == CreativeModeTabs.COMBAT){
            event.accept(ModItems.INDIUM_SWORD);
            event.accept(ModItems.INDIUM_HELMET);
            event.accept(ModItems.INDIUM_CHESTPLATE);
            event.accept(ModItems.INDIUM_LEGGINGS);
            event.accept(ModItems.INDIUM_BOOTS);

            event.accept(ModItems.PLATINUM_SWORD);
            event.accept(ModItems.PLATINUM_HELMET);
            event.accept(ModItems.PLATINUM_CHESTPLATE);
            event.accept(ModItems.PLATINUM_LEGGINGS);
            event.accept(ModItems.PLATINUM_BOOTS);
        }

        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.accept(ModItems.INDIUM_SHOVEL);
            event.accept(ModItems.INDIUM_PICKAXE);
            event.accept(ModItems.INDIUM_AXE);
            event.accept(ModItems.INDIUM_HOE);

            event.accept(ModItems.PLATINUM_SHOVEL);
            event.accept(ModItems.PLATINUM_PICKAXE);
            event.accept(ModItems.PLATINUM_AXE);
            event.accept(ModItems.PLATINUM_HOE);
        }

        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS){
            event.accept(ModBlocks.INDIUM_ORE);
            event.accept(ModBlocks.DEEPSLATE_INDIUM_ORE);
            event.accept(ModBlocks.END_STONE_INDIUM_ORE);
            event.accept(ModBlocks.RAW_INDIUM_BLOCK);

            event.accept(ModBlocks.PLATINUM_ORE);
            event.accept(ModBlocks.DEEPSLATE_PLATINUM_ORE);
            event.accept(ModBlocks.END_STONE_PLATINUM_ORE);
            event.accept(ModBlocks.RAW_PLATINUM_BLOCK);
        }

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(ModBlocks.INDIUM_BLOCK);
            event.accept(ModBlocks.PLATINUM_BLOCK);


        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
