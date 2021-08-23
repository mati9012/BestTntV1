package main.main;

import org.bukkit.entity.Player;

public class Help {
    public Help() {
    }

    public static void sendHelp(Player p) {
        p.sendMessage("§c--- HypixelTNT Help ---");
        p.sendMessage("");
        p.sendMessage("§cThis Plugin adds the TNT and Fireballs of Hypixel Bedwars");
        p.sendMessage("");
        p.sendMessage("§cTNT will be automaticly ignited when placed");
        p.sendMessage("§cRightclick while holding a fireball to shoot it");
        p.sendMessage("");
        p.sendMessage("§cCommands:");
        p.sendMessage("§c - /tnt (Adds an INFINITE TnT to your Inventory");
        p.sendMessage("§c - /fireball (Adds an INFINITE Fireball to your Inventory");
        p.sendMessage("§c - /hypixeltnt (Shows this help)");
        p.sendMessage("§c - Use /togglehelp to disable this help");
    }
}
