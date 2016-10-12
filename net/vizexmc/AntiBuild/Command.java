package net.vizexmc.AntiBuild;

import org.bukkit.Sound;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command
  implements CommandExecutor
{
  public boolean onCommand(CommandSender cs, org.bukkit.command.Command cmd, String label, String[] args)
  {
    Player p = (Player)cs;
    if (cmd.getName().equalsIgnoreCase("antibuild")) {
      if (p.hasPermission("antibuild.command"))
      {
        if (AntiBuild.antibuild == 1)
        {
          p.sendMessage(AntiBuild.prefix + "�aAll Players can build now!");
          p.playSound(p.getLocation(), Sound.LEVEL_UP, 2.0F, 2.0F);
          AntiBuild.antibuild = 2;
        }
        else
        {
          p.sendMessage(AntiBuild.prefix + "�cAll Player cant build any more!");
          p.playSound(p.getLocation(), Sound.LEVEL_UP, 2.0F, 2.0F);
          AntiBuild.antibuild = 1;
        }
      }
      else {
        p.sendMessage(AntiBuild.prefix + "�cError: You have no Permissions to use this Command!");
      }
    }
    return true;
  }
}
