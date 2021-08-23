package main.main;
import org.bukkit.entity.Player;

public class Config {
    static Main pl;

    static {
        pl = Main.getPlugin();
    }

    public Config() {
    }

    public static void setCooldown(Player p, boolean b) {
        pl.getConfig().set(p.getName() + ".FireballCooldown", b);
        pl.saveConfig();
    }

    public static boolean hasCooldown(Player p) {
        return pl.getConfig().getBoolean(p.getName() + ".FireballCooldown");
    }

    public static void setHelp(Player p, boolean b) {
        pl.getConfig().set(p.getName() + ".getHelp", b);
        pl.saveConfig();
    }

    public static boolean isHelpDisabled(Player p) {
        return pl.getConfig().getBoolean(p.getName() + ".getHelp");
    }
}
