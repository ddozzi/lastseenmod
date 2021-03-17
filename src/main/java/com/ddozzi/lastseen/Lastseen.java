package com.ddozzi.lastseen;

import com.ddozzi.lastseen.commands.LastseenCommand;
import com.ddozzi.lastseen.proxy.CommonProxy;

import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = "lastseenmod")

public class Lastseen {
	
    @Instance
    public static Lastseen instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPostInitializationEvent e) {
    }
    
    @EventHandler
    public static void init(FMLInitializationEvent e) {
        ClientCommandHandler.instance.registerCommand(new LastseenCommand());
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent e) {

    }
    

}
