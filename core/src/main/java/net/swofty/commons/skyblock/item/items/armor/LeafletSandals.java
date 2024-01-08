package net.swofty.commons.skyblock.item.items.armor;

import net.minestom.server.color.Color;
import net.swofty.commons.skyblock.item.ItemType;
import net.swofty.commons.skyblock.item.MaterialQuantifiable;
import net.swofty.commons.skyblock.item.ReforgeType;
import net.swofty.commons.skyblock.item.SkyBlockItem;
import net.swofty.commons.skyblock.item.impl.*;
import net.swofty.commons.skyblock.item.impl.recipes.ShapedRecipe;
import net.swofty.commons.skyblock.user.statistics.ItemStatistic;
import net.swofty.commons.skyblock.user.statistics.ItemStatistics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeafletSandals implements CustomSkyBlockItem, Reforgable, ExtraRarityDisplay, LeatherColour, Sellable, Craftable {
    @Override
    public ItemStatistics getStatistics() {
        return ItemStatistics.builder().with(ItemStatistic.HEALTH, 15).build();
    }

    @Override
    public ReforgeType getReforgeType() {
        return ReforgeType.ARMOR;
    }

    @Override
    public String getExtraRarityDisplay() {
        return " BOOTS";
    }

    @Override
    public Color getLeatherColour() {
        return new Color(0x2DE35E);
    }

    @Override
    public double getSellValue() {
        return 10;
    }

    @Override
    public SkyBlockRecipe<?> getRecipe() {
        Map<Character, MaterialQuantifiable> ingredientMap = new HashMap<>();
        ingredientMap.put('L', new MaterialQuantifiable(ItemType.OAK_LEAVES, 1));
        ingredientMap.put(' ', new MaterialQuantifiable(ItemType.AIR, 1));
        List<String> pattern = List.of(
                "L L",
                "L L");

        return new ShapedRecipe(SkyBlockRecipe.RecipeType.FORAGING, new SkyBlockItem(ItemType.LEAFLET_SANDALS), ingredientMap, pattern);
    }
}