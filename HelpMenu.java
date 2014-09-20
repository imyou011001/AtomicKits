package me.imyou011001.AtomicKits;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpMenu implements CommandExecutor{
	
	public void onEnable() {
		
	}



public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	if(!(sender instanceof Player)) {
	sender.sendMessage(ChatColor.RED + "Only players may iniciate this command.");
}
	
	if(cmd.getName().equalsIgnoreCase("atomickits")) {
		Player p = (Player) sender;
		p.sendMessage(ChatColor.AQUA + "[AtomicKits] Version 1 by imyou011001.");
		p.sendMessage(ChatColor.AQUA + "[AtomicKits] Available commands: /atomickits /kits /kit");
	}
	return true;
}
}
