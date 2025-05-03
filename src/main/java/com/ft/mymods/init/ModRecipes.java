package com.ft.mymods.init;

import com.ft.mymods.integration.ic2.IC2Recipes;

/**
 * ModRecipes class is responsible for registering all the mod's recipes.
 * It is used to encapsulate all the recipe registrations for better
 * organization.
 */
public class ModRecipes {
    /**
     * Registers all the recipes for the mod.
     * 
     * This method will call the necessary recipe registration methods for each mod
     * integration.
     */
    public static void register() {
        IC2Recipes.register(); // Registers recipes for IC2 integration
    }
}
