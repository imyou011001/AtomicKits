package me.imyou011001.AtomicKits;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Kits implements CommandExecutor{
	
	public void onEnable() {
		
	}


	
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	if(!(sender instanceof Player)) {
		sender.sendMessage(ChatColor.RED + "Only players may iniciate this command.");
	}
	
	if(cmd.getName().equalsIgnoreCase("kits")) {
		Player p = (Player) sender;
		p.sendMessage(ChatColor.GREEN + "[AtomicKits] Available kits: /kit <fighter/archer/knight/bolt/astronaut/lumberjack/grandpa/explorer/bowser>");
	}
	return true;
}
}
