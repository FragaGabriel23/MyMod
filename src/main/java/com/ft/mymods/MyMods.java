package com.ft.mymods;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import com.ft.mymods.init.ModRecipes;

/**
 * Main mod class that serves as the entry point for the mod.
 * This class handles the initialization process of the mod and registers the
 * mod recipes.
 * 
 * @modid mymods
 * @name My Mods
 * @version 1.0
 */
@Mod(modid = "mymods", name = "My Mods", version = "1.0")
public class MyMods {
    public static final String MODID = "mymods";
    public static final String NAME = "My Mods";
    public static final String VERSION = "1.0";

    /**
     * Initialization method for the mod.
     * Registers all the mod recipes when the mod is initialized.
     * 
     * @param event The initialization event
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.register(); // Registers recipes for the mod
    }
}
