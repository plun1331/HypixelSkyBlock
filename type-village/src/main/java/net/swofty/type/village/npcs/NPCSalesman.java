package net.swofty.type.village.npcs;

import net.minestom.server.coordinate.Pos;
import net.swofty.types.generic.entity.npc.NPCParameters;
import net.swofty.types.generic.entity.npc.SkyBlockNPC;

public class NPCSalesman extends SkyBlockNPC {

    public NPCSalesman() {
        super(new NPCParameters() { //different name and skin for each season
            @Override
            public String[] holograms() {
                return new String[]{"§9Salesman", "§e§lCLICK"};
            }

            @Override
            public String signature() { //easter skin
                return "w/C2jc1wq0NjyU8tkGeubVpSGHSqlkz3suFEiSzsjyGaob5OacAJENebvaWaLVVK9QJybvHhVmhInJ+kN0SUXQk8hr6+vnAlSpdCyDdgomn5SQtF9CUla/rfM9KXV06zwUBfa5Lm0U/GBO7u+SEFCLjXkj8gs3sHPd7/8nCQm/N0HJe6lLcVu07sTkH2rvRJn4pHB2oYCdwd8QTetKYtZD0BmE0dfp8IO0JspyuuQVl1AaIebAqPTpQqP8/z2TAPuEVL7dY65yX0jfziSxLLSXIFJTh+OXcJttmAoH09MojLYFnddH41WZMYEku0sqtUcZd3Vw9iyYW5vF79rGbUJ2Fcq3Iydy7Be0jY3yhrhY6r2Kz4wyiVkjL9+fCb9suf7lkUKL/yjfLMEOqh2wmCsDEU9r+pW0YDCBE0754hLdi6YB8hqKwBZ61m1G33bMYmPi+F7danTAPInL0q/bX7R5Vo4c/ajfc1TEfda5FBx4ec4MhjGMTzmJ8Z7I/P09aunOnRe2KNG3wnfGLmZgUj12pXQeaAeGoICNcYyeDjxAyugjDTvMRo673RMR5jR//g/hZZeFLpe1d6jLe5ZTnJFB5Qqj+1qHk56K4iVVyj3zkh4oR4IzWUplqQGNb5cGPEcIsT9qWIL2hoacnvwdE8HfiShc9CYrf/iu5UVVs5EDQ=";
            }

            @Override
            public String texture() { //easter skin
                return "ewogICJ0aW1lc3RhbXAiIDogMTYxODY1NTk1Mjg1NiwKICAicHJvZmlsZUlkIiA6ICJkMGI4MjE1OThmMTE0NzI1ODBmNmNiZTliOGUxYmU3MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJqYmFydHl5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzUyMGEzN2I1ZDA3OWViNzlkODdlZDVlZGEyY2Y5NWE1YWU3NjEwNjJlYjA5NDk5ZWYzMzA3ODQxMDg4M2NhNzIiCiAgICB9CiAgfQp9";
            }

            @Override
            public Pos position() {
                return new Pos(7, 70, -85, 25, 0);
            }

            @Override
            public boolean looking() {
                return true;
            }
        });
    }

    @Override
    public void onClick(PlayerClickNPCEvent e) {
        e.player().sendMessage("§cThis Feature is not there yet. §aOpen a Pull request at https://github.com/Swofty-Developments/HypixelSkyBlock to get it added quickly!");
    }

}
