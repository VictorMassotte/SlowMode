package fr.monocop.slowmode.util;

import org.bukkit.Bukkit;

public class Utils {
	public static void logToConsole(boolean severe, String msg) {
		if (severe) {
			Bukkit.getLogger().severe("[SlowChat] " + msg);
		} else {
			Bukkit.getLogger().info("[SlowChat] " + msg);
		}
	}

}
