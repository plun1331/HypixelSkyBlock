package net.swofty.types.generic.item;

import lombok.Getter;
import net.minestom.server.item.Material;

import java.util.function.Supplier;

@Getter
public enum ItemDropChanger {
    STONE(Material.STONE, () -> new SkyBlockItem(ItemType.COBBLESTONE)),
    COBBLESTONE(Material.COBBLESTONE, () -> new SkyBlockItem(ItemType.COBBLESTONE)),
    OAK_WOOD(Material.OAK_WOOD, () -> new SkyBlockItem(ItemType.OAK_LOG)),
    COAL_ORE(Material.COAL_ORE, () -> new SkyBlockItem(ItemType.COAL)),
    GRASS_BLOCK(Material.GRASS_BLOCK, () -> new SkyBlockItem(ItemType.DIRT)),
    OAK_LEAVES(Material.OAK_LEAVES, () -> {
        if (Math.random() < 0.05) {
            return new SkyBlockItem(ItemType.DECORATION_APPLE);
        } else {
            int amount = (int) (Math.random() * 3) + 1;
            return new SkyBlockItem(ItemType.STICK, amount);
        }
    }),
    ;

    private final Material material;
    private final Supplier<SkyBlockItem> itemSupplier;

    ItemDropChanger(Material material, Supplier<SkyBlockItem> itemSupplier) {
        this.material = material;
        this.itemSupplier = itemSupplier;
    }

    public static ItemDropChanger get(Material material) {
        for (ItemDropChanger changer : values()) {
            if (changer.material == material) {
                return changer;
            }
        }

        return null;
    }
}
