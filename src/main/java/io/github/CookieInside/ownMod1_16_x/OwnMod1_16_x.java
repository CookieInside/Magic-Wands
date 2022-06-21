package io.github.CookieInside.ownMod1_16_x;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.CookieInside.ownMod1_16_x.core.init.Blockinit;
import io.github.CookieInside.ownMod1_16_x.core.init.Iteminit;
import io.github.CookieInside.ownMod1_16_x.world.OreGeneration;

@Mod(OwnMod1_16_x.MOD_ID)
public class OwnMod1_16_x {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "magicwandsby_cookieinside";

    public OwnMod1_16_x() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        
        Iteminit.ITEMS.register(bus);
        Blockinit.BLOCKS.register(bus);
        
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	
    }
}
