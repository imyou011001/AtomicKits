package me.imyou011001.AtomicKits;





import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class ExplorerCompass implements Listener{
	
	public void onEnable() {
		
	}



@EventHandler
public void onInteract(PlayerInteractEvent e) {
	Player p = e.getPlayer();
	if(p.getInventory().getItemInHand().getType() == Material.COMPASS) {
	for(Player player : Bukkit.getOnlinePlayers()) {
		p.teleport(player.getLocation());
		}
	}
}
}
