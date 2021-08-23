package main.main;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Fireball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class Item2 implements Listener {
    public Item2() {
    }

    @EventHandler
    public void onItemUse(final PlayerInteractEvent e) {
        if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && e.getPlayer().getItemInHand().getType() == Material.FIREBALL && !Config.hasCooldown(e.getPlayer())) {
            Fireball f = (Fireball)e.getPlayer().launchProjectile(Fireball.class);
            f.setVelocity(f.getVelocity().multiply(5));
            f.setYield(4.0F);
            if (!e.getPlayer().getItemInHand().hasItemMeta() && e.getPlayer().getItemInHand().getItemMeta().hasDisplayName() && e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals("§4Infinite Fireball")) {
                if (e.getPlayer().getItemInHand().getAmount() > 1) {
                    e.getPlayer().getItemInHand().setAmount(e.getPlayer().getItemInHand().getAmount() - 1);
                } else {
                    e.getPlayer().setItemInHand((ItemStack)null);
                }
            }

            Config.setCooldown(e.getPlayer(), true);
            Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
                public void run() {
                    Config.setCooldown(e.getPlayer(), false);
                }
            }, 10L);
            e.setCancelled(true);
        }

    }
}
