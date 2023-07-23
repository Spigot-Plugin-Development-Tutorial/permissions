package me.kodysimpson.permissions;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakerListener implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e){

        if (!e.getPlayer().hasPermission("permissions.blockbreak")){
            e.setCancelled(true);
        }

    }

}
