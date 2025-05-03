package com.ft.mymods.integration.ae2;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

/**
 * AE2Items class is used to handle item-related logic for AE2 (Applied
 * Energistics 2) mod.
 * It retrieves the correct items, such as Nether Quartz Dust, for integration.
 */
public class AE2Items {
    /**
     * Returns an ItemStack for Nether Quartz Dust from Applied Energistics 2 (meta
     * 3).
     * 
     * @return The ItemStack for Nether Quartz Dust or ItemStack.EMPTY if the item
     *         is not found.
     */
    public static ItemStack quartzDust() {
        // Fetches the item for "material" from Applied Energistics 2 using its resource location
        Item item = Item.REGISTRY.getObject(new ResourceLocation("appliedenergistics2", "material"));

        // If the item is found, return an ItemStack with meta 3 (Nether Quartz Dust)
        return item != null ? new ItemStack(item, 1, 3) : ItemStack.EMPTY;

    }
}
