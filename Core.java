package me.imyou011001.AtomicKits;



import java.util.Arrays;
import java.util.HashMap;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class Core implements CommandExecutor{
	
	public void onEnable() {
		
	}

    public HashMap<String, Long> cooldowns = new HashMap<String, Long>();

public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    int cooldownTime = 20;
    if(cooldowns.containsKey(sender.getName())) {
        long secondsLeft = ((cooldowns.get(sender.getName())/1000)+cooldownTime) - (System.currentTimeMillis()/1000);
        if(secondsLeft>0) {
            sender.sendMessage(ChatColor.RED + "You may not use a kit for another " + secondsLeft + " seconds.");
            return true;
        }
    }
    cooldowns.put(sender.getName(), System.currentTimeMillis());

	if(cmd.getName().equalsIgnoreCase("kit")) {
		Player p = (Player) sender;
		if(args.length == 0) {
		p.sendMessage(ChatColor.DARK_RED + " "  + ChatColor.BOLD + "=========== Incorrect Usage ===========");
		
		p.sendMessage(ChatColor.GOLD  + " "  + ChatColor.BOLD + "[AtomicKits] Usgae: /kit <kit> use /kits to view available kits.");
		
		p.sendMessage(ChatColor.DARK_RED + " "  + ChatColor.BOLD + "=========== Incorrect Usage ===========");
		
		}
		
		else if(args[0].equalsIgnoreCase("fighter")) {
			p.sendMessage(ChatColor.AQUA + " "  + ChatColor.BOLD + "=========== Kit Spawned ===========");
			
			p.sendMessage(ChatColor.GREEN + " "  + ChatColor.BOLD + "[AtomicKits] Enjoy kit Fighter!");
			
			p.sendMessage(ChatColor.AQUA + " "  + ChatColor.BOLD + "=========== Kit Spawned ===========");
			p.removePotionEffect(PotionEffectType.SPEED);
			p.removePotionEffect(PotionEffectType.FAST_DIGGING);
			p.removePotionEffect(PotionEffectType.JUMP);
			p.removePotionEffect(PotionEffectType.SLOW);
			p.removePotionEffect(PotionEffectType.SLOW_DIGGING);
			p.getInventory().clear();
			p.getInventory().addItem(new ItemStack(Material.IRON_SWORD));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
			p.getInventory().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
		}
		
		else if(args[0].equalsIgnoreCase("archer")) {
		p.sendMessage(ChatColor.AQUA + " "  + ChatColor.BOLD + "=========== Kit Spawned ===========");
			
			p.sendMessage(ChatColor.GREEN + " "  + ChatColor.BOLD + "[AtomicKits] Enjoy kit Archer!");
			
			p.sendMessage(ChatColor.AQUA + " "  + ChatColor.BOLD + "=========== Kit Spawned ===========");
			
			p.removePotionEffect(PotionEffectType.SPEED);
			p.removePotionEffect(PotionEffectType.FAST_DIGGING);
			p.removePotionEffect(PotionEffectType.JUMP);
			p.removePotionEffect(PotionEffectType.SLOW);
			p.removePotionEffect(PotionEffectType.SLOW_DIGGING);
			p.getInventory().clear();
			p.getInventory().addItem(new ItemStack(Material.BOW));
			p.getInventory().addItem(new ItemStack(Material.ARROW, 64));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
			}
		
		else if(args[0].equalsIgnoreCase("knight")) {
		p.sendMessage(ChatColor.AQUA + " "  + ChatColor.BOLD + "=========== Kit Spawned ===========");
			
			p.sendMessage(ChatColor.GREEN + " "  + ChatColor.BOLD + "[AtomicKits] Enjoy kit Knight!");
			
			p.sendMessage(ChatColor.AQUA + " "  + ChatColor.BOLD + "=========== Kit Spawned ===========");
			
			p.removePotionEffect(PotionEffectType.SPEED);
			p.removePotionEffect(PotionEffectType.FAST_DIGGING);
			p.removePotionEffect(PotionEffectType.JUMP);
			p.removePotionEffect(PotionEffectType.SLOW);
			p.removePotionEffect(PotionEffectType.SLOW_DIGGING);
			p.getInventory().clear();
			p.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));
			p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100000, 1));
			p.getInventory().addItem(new ItemStack(Material.BOW));
			p.getInventory().addItem(new ItemStack(Material.ARROW, 64));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
			p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
	
			}
		
		else if(args[0].equalsIgnoreCase("bolt")) {
		p.sendMessage(ChatColor.AQUA + " "  + ChatColor.BOLD + "=========== Kit Spawned ===========");
			
			p.sendMessage(ChatColor.GREEN + " "  + ChatColor.BOLD + "[AtomicKits] Enjoy kit Bolt!");
			
			p.sendMessage(ChatColor.AQUA + " "  + ChatColor.BOLD + "=========== Kit Spawned ===========");
			p.removePotionEffect(PotionEffectType.SPEED);
			p.removePotionEffect(PotionEffectType.FAST_DIGGING);
			p.removePotionEffect(PotionEffectType.JUMP);
			p.removePotionEffect(PotionEffectType.SLOW);
			p.removePotionEffect(PotionEffectType.SLOW_DIGGING);
			p.getInventory().clear();
			p.getInventory().addItem(new ItemStack(Material.IRON_SWORD));
			p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100000, 1));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().setBoots(new ItemStack(Material.GOLD_BOOTS));

			}
		
		else if(args[0].equalsIgnoreCase("astronaut")) {
		p.sendMessage(ChatColor.AQUA + " "  + ChatColor.BOLD + "=========== Kit Spawned ===========");
			
			p.sendMessage(ChatColor.GREEN + " "  + ChatColor.BOLD + "[AtomicKits] Enjoy kit Astronaut!");
			
			p.sendMessage(ChatColor.AQUA + " "  + ChatColor.BOLD + "=========== Kit Spawned ===========");
			p.removePotionEffect(PotionEffectType.SPEED);
			p.removePotionEffect(PotionEffectType.FAST_DIGGING);
			p.removePotionEffect(PotionEffectType.JUMP);
			p.removePotionEffect(PotionEffectType.SLOW);
			p.removePotionEffect(PotionEffectType.SLOW_DIGGING);
			p.getInventory().clear();
			p.getInventory().addItem(new ItemStack(Material.IRON_SWORD));
			p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 100000, 3));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().setHelmet(new ItemStack(Material.GLASS));
			p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));

			}
		
		else if(args[0].equalsIgnoreCase("lumberjack")) {
		p.sendMessage(ChatColor.AQUA + " "  + ChatColor.BOLD + "=========== Kit Spawned ===========");
			
			p.sendMessage(ChatColor.GREEN + " "  + ChatColor.BOLD + "[AtomicKits] Enjoy kit LumberJack!");
			
			p.sendMessage(ChatColor.AQUA + " "  + ChatColor.BOLD + "=========== Kit Spawned ===========");
			p.removePotionEffect(PotionEffectType.SPEED);
			p.removePotionEffect(PotionEffectType.FAST_DIGGING);
			p.removePotionEffect(PotionEffectType.JUMP);
			p.removePotionEffect(PotionEffectType.SLOW);
			p.removePotionEffect(PotionEffectType.SLOW_DIGGING);
			p.getInventory().clear();
			p.getInventory().addItem(new ItemStack(Material.IRON_AXE));
			p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 100000, 1));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
			p.getInventory().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
			
	
			}
		
		else if(args[0].equalsIgnoreCase("grandpa")) {
		p.sendMessage(ChatColor.AQUA + " "  + ChatColor.BOLD + "=========== Kit Spawned ===========");
			
			p.sendMessage(ChatColor.GREEN + " "  + ChatColor.BOLD + "[AtomicKits] Enjoy kit Grandpa!");
			
			p.sendMessage(ChatColor.AQUA + " "  + ChatColor.BOLD + "=========== Kit Spawned ===========");
			p.removePotionEffect(PotionEffectType.SPEED);
			p.removePotionEffect(PotionEffectType.FAST_DIGGING);
			p.removePotionEffect(PotionEffectType.JUMP);
			p.removePotionEffect(PotionEffectType.SLOW);
			p.removePotionEffect(PotionEffectType.SLOW_DIGGING);
			p.getInventory().clear();
			ItemStack stick = new ItemStack(Material.STICK);
			ItemMeta itemMeta = stick.getItemMeta();
			itemMeta.setDisplayName("Get off my lawn!");
			itemMeta.setLore(Arrays.asList(ChatColor.RED + "Grandpa's", ChatColor.GREEN + "Deadly", ChatColor.GOLD + "Cane"));
			stick.setItemMeta(itemMeta);
			itemMeta.getDisplayName();
			stick.addUnsafeEnchantment(Enchantment.KNOCKBACK, 6);
			stick.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
			p.getInventory().addItem(stick);
			p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100000, 3));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));

			}
		
		else if(args[0].equalsIgnoreCase("explorer")) {
		p.sendMessage(ChatColor.AQUA + " "  + ChatColor.BOLD + "=========== Kit Spawned ===========");
			
			p.sendMessage(ChatColor.GREEN + " "  + ChatColor.BOLD + "[AtomicKits] Enjoy kit Explorer!");
			
			p.sendMessage(ChatColor.AQUA + " "  + ChatColor.BOLD + "=========== Kit Spawned ===========");
			p.removePotionEffect(PotionEffectType.SPEED);
			p.removePotionEffect(PotionEffectType.FAST_DIGGING);
			p.removePotionEffect(PotionEffectType.JUMP);
			p.removePotionEffect(PotionEffectType.SLOW);
			p.removePotionEffect(PotionEffectType.SLOW_DIGGING);
			p.getInventory().clear();
			p.getInventory().addItem(new ItemStack(Material.IRON_SWORD));
			p.getInventory().addItem(new ItemStack(Material.COMPASS));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			p.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));

			}
			
		else if(args[0].equalsIgnoreCase("bowser")) {
		p.sendMessage(ChatColor.AQUA + " "  + ChatColor.BOLD + "=========== Kit Spawned ===========");
			
			p.sendMessage(ChatColor.GREEN + " "  + ChatColor.BOLD + "[AtomicKits] Enjoy kit Bowser!");
			
			p.sendMessage(ChatColor.AQUA + " "  + ChatColor.BOLD + "=========== Kit Spawned ===========");
					p.removePotionEffect(PotionEffectType.SPEED);
					p.removePotionEffect(PotionEffectType.FAST_DIGGING);
					p.removePotionEffect(PotionEffectType.JUMP);
					p.removePotionEffect(PotionEffectType.SLOW);
					p.removePotionEffect(PotionEffectType.SLOW_DIGGING);
					p.getInventory().clear();
					p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100000, 1));
					p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 100000, 1));
					ItemStack sword = new ItemStack(Material.STONE_SWORD);
					sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
					sword.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
					p.getInventory().addItem(sword);
					p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
					p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
					p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
					p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
					p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
					p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
					p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
					p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
					p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
					p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
					p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
					p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
					p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
					p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
					p.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
					p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
			}

		

		}
	
    
	if(cmd.getName().equalsIgnoreCase("food")) {
		Player p = (Player) sender;
		p.sendMessage(ChatColor.AQUA + " "  + ChatColor.BOLD + "=========== Soups ===========");
		
		p.sendMessage(ChatColor.GREEN + " "  + ChatColor.BOLD + "[AtomicKits] Soups refilled!");
		
		p.sendMessage(ChatColor.AQUA + " "  + ChatColor.BOLD + "=========== Soups ===========");
		p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
		p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
		p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
		p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
		p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
		p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
		p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
		p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
		p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
		p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
		p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
		p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
		p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
		p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	
	

	
}
{
		


}
return true;
}
}
