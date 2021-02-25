package fr.monocop.slowmode;

import java.io.File;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import fr.monocop.slowmode.commands.SlowchatCommand;
import fr.monocop.slowmode.listeners.SlowChatListener;
import fr.monocop.slowmode.util.SlowUtils;
import fr.monocop.slowmode.util.Utils;

public class Main extends JavaPlugin {
	public static Plugin plugin;
	public static String pluginVersion;

	public static String config_language;
	public static int config_version;
	public static boolean config_metrics;
	public static boolean config_updater;

	public static boolean outdated;

	@Override
	public void onEnable() {
		plugin = this;
		pluginVersion = getDescription().getVersion();
		saveDefaultConfig();
		config_version = getConfig().getInt("configversion");
		if (config_version == 2) {
			Utils.logToConsole(false, "Config is up to date!");
		} else {
			Utils.logToConsole(false,
					"Config is outdated! Renaming the old one to 'config_old.yml' and creating a updated one");
			File configFile = new File(plugin.getDataFolder(), "config.yml");
			File oldConfigFile = new File(plugin.getDataFolder(), "config_old.yml");
			if (oldConfigFile.exists()) {
				oldConfigFile.delete();
			}
			configFile.renameTo(oldConfigFile);
			saveDefaultConfig();
		}

		config_language = getConfig().getString("language");

		if (config_language.equalsIgnoreCase("en")) {
			Utils.logToConsole(false, "Setting language to EN (English)");
			Lang.english();
		} else if (config_language.equalsIgnoreCase("fr")) {
			Utils.logToConsole(false, "Setting language to FR (French)");
			Lang.french();
		} else {
			Utils.logToConsole(true, "Language '" + config_language + "' not found, setting language to FR (French)");
			Lang.french();
		}

		getServer().getPluginManager().registerEvents(new SlowChatListener(), this);
		SlowUtils.init();
		getCommand("slowchat").setExecutor(new SlowchatCommand());
		Utils.logToConsole(false, "Plugin enabled!");

	}

	@Override
	public void onDisable() {
		Utils.logToConsole(false, "Plugin disabled!");
	}

}
