package fr.monocop.slowmode.util;

import java.util.ArrayList;

import org.bukkit.Bukkit;

import fr.monocop.slowmode.Main;

public class SlowUtils {

	public static boolean slowmode;
	public static boolean pausemode;
	public static int slowtime;
	public static ArrayList<String> slowplayers;

	public static void init() {
		slowmode = false;
		pausemode = false;
		slowtime = 0;
		slowplayers = new ArrayList<String>();
		SlowUtils.slowplayers.clear();
	}

	public static void setSlow(final String name) {
		slowplayers.add(name);
		Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.plugin, new Runnable() {
			public void run() {
				slowplayers.remove(name);
			}
		}, 20L * slowtime);
	}

}
