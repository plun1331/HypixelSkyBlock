package net.swofty.commons.skyblock.user;

import lombok.Getter;
import lombok.Setter;
import net.minestom.server.item.Material;
import net.swofty.commons.skyblock.item.SkyBlockItem;

import java.util.HashMap;
import java.util.Map;

@Getter
public class SkyBlockInventory {

    @Setter
    private Map<Integer, SkyBlockItem> items = new HashMap<>();
    @Setter
    private SkyBlockItem helmet = new SkyBlockItem(Material.AIR);
    @Setter
    private SkyBlockItem chestplate = new SkyBlockItem(Material.AIR);
    @Setter
    private SkyBlockItem leggings = new SkyBlockItem(Material.AIR);
    @Setter
    private SkyBlockItem boots = new SkyBlockItem(Material.AIR);

    public SkyBlockInventory() {
    }
}