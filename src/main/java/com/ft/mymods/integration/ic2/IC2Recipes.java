package com.ft.mymods.integration.ic2;

import com.ft.mymods.integration.ae2.AE2Items;

import ic2.api.recipe.IRecipeInput;
import ic2.api.recipe.Recipes;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * IC2Recipes class is responsible for handling all the IC2-related recipes.
 * This includes recipes involving IC2 machines like the macerator.
 */
public class IC2Recipes {
    /**
     * Registers all the IC2 recipes.
     * It includes adding recipes to various IC2 machines such as the macerator.
     */
    public static void register() {
        // MACERATOR
        registerQuartzToDust();
    }

    /**
     * Registers the recipe for converting Minecraft Quartz into Nether Quartz Dust
     * in the IC2 Macerator.
     * 
     * Quartz is the input (minecraft:quartz) and the output is Nether Quartz Dust
     * (appliedenergistics2:material meta 3).
     */
    public static void registerQuartzToDust() {
        ItemStack inputStack = new ItemStack(Items.QUARTZ); // Quartz - minecraft:quartz
        ItemStack output = AE2Items.quartzDust(); // Nether Quartz Dust - appliedenergistics2:material meta 3

        // Create a recipe input object based on the ItemStack
        IRecipeInput input = Recipes.inputFactory.forStack(inputStack);

        // Register the recipe in the IC2 macerator
        if (output != null) {
            Recipes.macerator.addRecipe(input, null, false, output);
        }
    }
}
