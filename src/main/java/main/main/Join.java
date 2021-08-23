package main.main;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {


    public Join() {
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        if (!Config.isHelpDisabled(e.getPlayer())) {
            Help.sendHelp(e.getPlayer());
        }

    }
}