package com.feriixu.EasyRaids;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public static void main(String[] args) {
		
	}
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new SpawnListener(), this);
	}

}
