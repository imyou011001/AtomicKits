package me.imyou011001.AtomicKits;



import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin implements Listener{

	public void onEnable() {
		PluginManager pm = Bukkit.getServer().getPluginManager();
		
		getCommand("atomickits").setExecutor(new HelpMenu());
		getCommand("kits").setExecutor(new Kits());
		getCommand("kit").setExecutor(new Core());
		getCommand("food").setExecutor(new Core());
		
		pm.registerEvents(new Soups(), this);
		pm.registerEvents(new ExplorerCompass(), this);
		pm.registerEvents(new BowserSword(), this);
		
		
	}


}
 

