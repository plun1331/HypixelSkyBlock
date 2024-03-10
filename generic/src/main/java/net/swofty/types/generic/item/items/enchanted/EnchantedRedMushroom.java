package net.swofty.types.generic.item.items.enchanted;

import net.swofty.types.generic.item.ItemType;
import net.swofty.types.generic.item.impl.Enchanted;
import net.swofty.types.generic.item.impl.Sellable;
import net.swofty.types.generic.item.impl.SkyBlockRecipe;

import net.swofty.types.generic.item.impl.Craftable;
public class EnchantedRedMushroom implements Enchanted, Sellable, Craftable {
    @Override
    public double getSellValue() {
        return 1600;
    }

    @Override
    public SkyBlockRecipe<?> getRecipe() {
        return getStandardEnchantedRecipe(SkyBlockRecipe.RecipeType.FORAGING, ItemType.RED_MUSHROOM);
    }
}