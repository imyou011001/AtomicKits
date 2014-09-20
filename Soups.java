package me.imyou011001.AtomicKits;


import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
 


public class Soups implements Listener {
 


@EventHandler
public void onClick(PlayerInteractEvent event) {
	 Player player = event.getPlayer();
	 ItemStack item = event.getItem();
	if (item.getType() == Material.MUSHROOM_SOUP) {
  if ((event.getAction() == Action.RIGHT_CLICK_AIR) || (event.getAction() == Action.RIGHT_CLICK_BLOCK)) {
     player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 100, 2));
     player.setFoodLevel(20);
        item.setType(Material.BOWL);
        player.playSound(player.getLocation(), Sound.BURP, 1, 1);
      }
    }
  }
}

