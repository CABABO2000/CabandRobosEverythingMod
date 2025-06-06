package net.cababo2000.cre;

import com.mojang.logging.LogUtils;
import net.cababo2000.cre.block.ModBlocks;
import net.cababo2000.cre.effect.ModEffects;
import net.cababo2000.cre.enchantment.ModEnchantments;
import net.cababo2000.cre.item.ModCreativeTabs;
import net.cababo2000.cre.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(c_r_e.MODID)
public class c_r_e
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "cre";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public c_r_e(FMLJavaModLoadingContext context)
    {
        ModItems.register(context.getModEventBus());
        ModBlocks.register(context.getModEventBus());
        ModCreativeTabs.register(context.getModEventBus());
        ModEnchantments.register(context.getModEventBus());
        ModEffects.register();

        IEventBus modEventBus = context.getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
