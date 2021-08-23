package main.main;



import org.bukkit.event.player.PlayerInteractEvent;

class Item implements Runnable {
    private final Object this$0;
    private final PlayerInteractEvent val$e;

    Item(Item var1, PlayerInteractEvent var2) {
        this.this$0 = var1;
        this.val$e = var2;
    }

    public void run() {
        Config.setCooldown(this.val$e.getPlayer(), false);
    }
}
