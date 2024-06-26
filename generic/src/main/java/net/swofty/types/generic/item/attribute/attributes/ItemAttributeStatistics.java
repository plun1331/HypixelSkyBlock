package net.swofty.types.generic.item.attribute.attributes;

import net.swofty.types.generic.item.attribute.ItemAttribute;
import net.swofty.types.generic.user.statistics.ItemStatistic;
import net.swofty.types.generic.user.statistics.ItemStatistics;

public class ItemAttributeStatistics extends ItemAttribute<ItemStatistics> {

    @Override
    public String getKey() {
        return "statistics";
    }

    @Override
    public ItemStatistics getDefaultValue() {
        return ItemStatistics.builder().build();
    }

    @Override
    public ItemStatistics loadFromString(String string) {
        String[] split = string.split(",");
        return ItemStatistics.builder()
                .with(ItemStatistic.DAMAGE, Math.max(Math.min(Double.parseDouble(split[0]), 1000D), 0D))
                .with(ItemStatistic.DEFENSE, Math.max(Math.min(Double.parseDouble(split[1]), 1000D), 0D))
                .with(ItemStatistic.HEALTH, Math.max(Math.min(Double.parseDouble(split[2]), 1000D), 0D))
                .with(ItemStatistic.INTELLIGENCE, Math.max(Math.min(Double.parseDouble(split[3]), 1000D), 0D))
                .with(ItemStatistic.STRENGTH, Math.max(Math.min(Double.parseDouble(split[4]), 1000D), 0D))
                .build();
    }

    @Override
    public String saveIntoString() {
        return this.value.get(ItemStatistic.DAMAGE) +
                "," +
                this.value.get(ItemStatistic.DEFENSE) +
                "," +
                this.value.get(ItemStatistic.HEALTH) +
                "," +
                this.value.get(ItemStatistic.INTELLIGENCE) +
                "," +
                this.value.get(ItemStatistic.STRENGTH) +
                "," +
                this.value.get(ItemStatistic.MINING_SPEED);
    }
}
