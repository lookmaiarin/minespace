package net.bbrooker.minespace;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class MineSpace extends JavaPlugin implements Listener {

	
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(this, this);
		
		getLogger().info("== MinespaceCore Trying to Activate ==");
		getLogger().info("== MinespaceCore Actvated Completed ==");

		
		
	        
		}
	
	public void onDisable(){
		getLogger().info("== DEACTIVATE MINESPACECORE PLUGIN ==");
		getLogger().info("== COMPLETELY DISABLE MINESPACECORE ! ==");

	}
	
	
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("minespace")) { 

			sender.sendMessage(ChatColor.RED + "[" + ChatColor.AQUA + "MINESPACE" + ChatColor.RED + "]" + ChatColor.GOLD + "Minespace Version 0.10B");
			
			return true;
		
		} else if (cmd.getName().equalsIgnoreCase("ms spawn")) {
			
		
			
			if (!(sender instanceof Player)) {
			
				sender.sendMessage("This command can only be run by a player.");
			
			} else {
				
				Player player = (Player) sender;
				
				if (player.hasPermission("minespace.spawn")) {
						
					player.teleport(player.getWorld().getSpawnLocation());
					player.sendMessage(ChatColor.BLUE + "[" + ChatColor.AQUA + "MINESPACE" + ChatColor.BLUE + "]" + ChatColor.DARK_PURPLE + "Return to spawn");
				
				} else {
				
					sender.sendMessage(ChatColor.DARK_RED + "[" + ChatColor.RED + "MINESPACE" + ChatColor.DARK_RED + "]" + ChatColor.RED + "You don't have permission to perform this command");
					}
			}
			return true;
		}
		return false;
	}

	
	
	
	
	
}
