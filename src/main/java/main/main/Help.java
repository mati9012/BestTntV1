package main.main;

import org.bukkit.entity.Player;

public class Help {
    public Help() {
    }

    public static void sendHelp(Player p) {
        p.sendMessage("§c--- BestTnT Help ---");
        p.sendMessage("");
        p.sendMessage("§cThis Plugin adds the TNT and Fireballs of Hypixel Bedwars");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("§cCommands:");
        p.sendMessage("§cNull");
    }
}
