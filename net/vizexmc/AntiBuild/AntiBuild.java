package net.vizexmc.AntiBuild;

import java.io.PrintStream;
import org.bukkit.Server;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class AntiBuild
  extends JavaPlugin
{
  public static int antibuild = 1;
  public static String prefix = "�7[�bhAntiBuild�7] ";
  
  public void onEnable()
  {
    System.out.println(" ");
    System.out.println("[hAntiBuild] activated!");
    System.out.println("[hAntiBuild] Developed by HapeDev!");
    System.out.println("[hAntiBuild] YouTube: BukkitHelp");
    System.out.println(" ");
    registerCommands();
    registerListener();
  }
  
  public void onDisable()
  {
    System.out.println(" ");
    System.out.println("[hAntiBuild] deactivated!");
    System.out.println("[hAntiBuild] Developed by HapeDev!");
    System.out.println("[hAntiBuild] YouTube: BukkitHelp");
    System.out.println(" ");
  }
  
  public void registerListener()
  {
    getServer().getPluginManager().registerEvents(new Listener(), this);
  }
  
  public void registerCommands()
  {
    getCommand("antibuild").setExecutor(new Command());
  }
}
