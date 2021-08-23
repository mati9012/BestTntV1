package main.main;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {


    public static Main getPlugin() {
        return null;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(new Demage(), this);
        this.getServer().getPluginManager().registerEvents(new Join(), this);
        this.getServer().getPluginManager().registerEvents(new Item2(), this);
        this.getServer().getPluginManager().registerEvents(new Jumps(), this);


        }






    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
