package fr.monocop.slowmode.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import fr.monocop.slowmode.Lang;
import fr.monocop.slowmode.util.SlowUtils;

public class SlowchatCommand implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender.hasPermission("slowchat.use")) {
			if (args.length == 0 || args.length > 1) {
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Lang.SLOWCHAT_COMMAND_USAGE));
			} else {
				if (args[0].matches("^[0-9]+$")) {
					if (args[0].equals("0")) {
						SlowUtils.slowmode = false;
						SlowUtils.slowtime = 0;
						SlowUtils.slowplayers.clear();
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Lang.SLOWMODE_DISABLED));
						Bukkit.getServer().broadcastMessage(
								ChatColor.translateAlternateColorCodes('&', Lang.SERVER_IS_NO_LONGER_IN_SLOWMODE));
					} else {
						SlowUtils.slowmode = true;
						SlowUtils.slowtime = Integer.parseInt(args[0]);
						String message = Lang.SLOWMODE_ENABLED.replace("%a", "" + SlowUtils.slowtime);
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
						String broadcast = Lang.SERVER_IS_NOW_IN_SLOWMODE.replace("%a", "" + SlowUtils.slowtime);
						Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', broadcast));
					}
				} else if (args[0].equalsIgnoreCase("off")) {
					SlowUtils.slowmode = false;
					SlowUtils.slowtime = 0;
					SlowUtils.slowplayers.clear();
					sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Lang.SLOWMODE_DISABLED));
					Bukkit.getServer().broadcastMessage(
							ChatColor.translateAlternateColorCodes('&', Lang.SERVER_IS_NO_LONGER_IN_SLOWMODE));
				} else {
					sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Lang.SLOWCHAT_COMMAND_USAGE));
				}
			}
		} else {
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Lang.NO_PERMISSION));
		}
		return true;
	}

}
