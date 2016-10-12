package net.vizexmc.AntiBuild;

import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class Listener
  implements org.bukkit.event.Listener
{
  @EventHandler
  public void onBreak(BlockBreakEvent e)
  {
    if (AntiBuild.antibuild == 2) {
      e.setCancelled(false);
    } else {
      e.setCancelled(true);
    }
  }
  
  @EventHandler
  public void onPlace(BlockPlaceEvent e)
  {
    if (AntiBuild.antibuild == 2) {
      e.setCancelled(false);
    } else {
      e.setCancelled(true);
    }
  }
  
  @EventHandler
  public void onDrop(PlayerDropItemEvent e)
  {
    if (AntiBuild.antibuild == 2) {
      e.setCancelled(false);
    } else {
      e.setCancelled(true);
    }
  }
  
  @EventHandler
  public void onPickUp(PlayerPickupItemEvent e)
  {
    if (AntiBuild.antibuild == 2) {
      e.setCancelled(false);
    } else {
      e.setCancelled(true);
    }
  }
}
