package net.swofty.types.generic.mission.missions;

import net.minestom.server.event.Event;
import net.minestom.server.item.Material;
import net.swofty.types.generic.SkyBlockConst;
import net.swofty.types.generic.region.RegionType;
import net.swofty.types.generic.user.SkyBlockPlayer;
import net.swofty.types.generic.event.EventNodes;
import net.swofty.types.generic.event.EventParameters;
import net.swofty.types.generic.event.custom.CustomBlockBreakEvent;
import net.swofty.types.generic.mission.MissionData;
import net.swofty.types.generic.mission.SkyBlockMission;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@EventParameters(description = "Break log mission",
        node = EventNodes.CUSTOM,
        requireDataLoaded = false)
public class MissionBreakLog extends SkyBlockMission {
    @Override
    public Class<? extends Event> getEvent() {
        return CustomBlockBreakEvent.class;
    }

    @Override
    public void run(Event tempEvent) {
        CustomBlockBreakEvent event = (CustomBlockBreakEvent) tempEvent;
        Material material = event.getMaterial();
        MissionData data = event.getPlayer().getMissionData();

        if (!SkyBlockConst.isIslandServer()) return;

        if (data.isCurrentlyActive("break_log")
                && (material == Material.OAK_LOG || material == Material.OAK_WOOD)) {
            data.endMission("break_log");
        }
    }

    @Override
    public String getID() {
        return "break_log";
    }

    @Override
    public String getName() {
        return "Break a log";
    }

    @Override
    public Map<String, Object> onStart(SkyBlockPlayer player, MissionData.ActiveMission mission) {
        return new HashMap<>();
    }

    @Override
    public void onEnd(SkyBlockPlayer player, Map<String, Object> customData, MissionData.ActiveMission mission) {
        player.getMissionData().startMission(MissionCraftWorkbench.class);
    }

    @Override
    public Set<RegionType> getValidRegions() {
        return Collections.singleton(RegionType.PRIVATE_ISLAND);
    }
}
