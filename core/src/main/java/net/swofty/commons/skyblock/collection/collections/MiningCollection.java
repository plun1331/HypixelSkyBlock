package net.swofty.commons.skyblock.collection.collections;

import net.minestom.server.item.Material;
import net.swofty.commons.skyblock.collection.CollectionCategory;
import net.swofty.commons.skyblock.item.ItemType;

import java.util.List;

public class MiningCollection extends CollectionCategory {
    @Override
    public Material getDisplayIcon() {
        return Material.STONE_PICKAXE;
    }

    @Override
    public String getName() {
        return "Mining";
    }

    @Override
    public ItemCollection[] getCollections() {
        return List.of(
                new ItemCollection(ItemType.COBBLESTONE,
                        new ItemCollectionReward(50),
                        new ItemCollectionReward(100),
                        new ItemCollectionReward(250)
                )
        ).toArray(ItemCollection[]::new);
    }
}