package net.swofty.types.generic.item.items.armor;

import net.minestom.server.color.Color;
import net.swofty.types.generic.item.SkyBlockItem;
import net.swofty.types.generic.item.impl.*;
import net.swofty.types.generic.user.statistics.ItemStatistic;
import net.swofty.types.generic.user.statistics.ItemStatistics;



public class FarmSuitHelmet implements CustomSkyBlockItem, StandardItem, LeatherColour, Sellable , NotFinishedYet {

    @Override
    public ItemStatistics getStatistics(SkyBlockItem instance) {
        return ItemStatistics.builder().with(ItemStatistic.DEFENSE, 15D).build();
    }

    @Override
    public Color getLeatherColour() {
        return new Color(0xFFFF00);
    }


    @Override
    public double getSellValue() {
        return 25;
    }

    @Override
    public StandardItemType getStandardItemType() {
        return StandardItemType.HELMET;
    }
}
