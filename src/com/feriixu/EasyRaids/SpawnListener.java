package com.feriixu.EasyRaids;

import org.bukkit.entity.Raider;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.raid.RaidSpawnWaveEvent;

public class SpawnListener implements Listener {
	@EventHandler
	public void OnWaveSpawn(RaidSpawnWaveEvent event)
	{
		for (Raider r : event.getRaiders())
		{
			r.setGlowing(true);
		}
	}
}
