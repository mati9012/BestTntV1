package main.main;

import java.util.ArrayList;
import java.util.Iterator;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.util.Vector;

public class Jumps implements Listener {
    public Jumps() {
    }

    @EventHandler
    public void onExplode(EntityExplodeEvent e) {
        Iterator var3 = (new ArrayList(e.blockList())).iterator();



        if (e.getEntity() instanceof TNTPrimed) {
            var3 = e.getEntity().getWorld().getEntities().iterator();

            while(true) {
                while(true) {
                    Vector v;
                    Entity entity;
                    label34:
                    do {
                        while(var3.hasNext()) {
                            entity = (Entity)var3.next();
                            if (entity.getLocation().distance(e.getEntity().getLocation()) < 10.0D) {
                                v = entity.getLocation().add(0.0D, 1.0D, 0.0D).toVector().subtract(e.getEntity().getLocation().toVector());
                                double l = v.length();
                                v.normalize();
                                v.multiply(4.0D / l);
                                continue label34;
                            }

                            boolean var10000 = e.getEntity() instanceof Fireball;
                        }

                        return;
                    } while(!(entity instanceof Player));

                    if (((Player)entity).getGameMode() != GameMode.SURVIVAL && ((Player)entity).getGameMode() != GameMode.ADVENTURE) {
                        entity.setVelocity(entity.getVelocity().add(v.divide(new Vector(3, 10, 3))));
                    } else {
                        entity.setVelocity(entity.getVelocity().add(v.divide(new Vector(1, 7, 1))));
                    }

                }
            }
        }
    }
}
