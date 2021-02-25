package fr.monocop.slowmode.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import fr.monocop.slowmode.Lang;
import fr.monocop.slowmode.Main;
import fr.monocop.slowmode.util.SlowUtils;

public class SlowChatListener implements Listener {

	@EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = false)
	public void onPlayerChat(AsyncPlayerChatEvent event) {
		Player player = event.getPlayer();
		String name = player.getName();
		if (SlowUtils.pausemode) {
			if (!player.hasPermission("slowchat.bypass.pause")) {
				event.setCancelled(true);
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', Lang.CHAT_IS_IN_PAUSEMODE));
			}
		} else if (SlowUtils.slowmode) {
			if (!player.hasPermission("slowchat.bypass")) {
				if (SlowUtils.slowplayers.contains(name)) {
					String message = Lang.CHAT_IS_IN_SLOWMODE.replace("%a", "" + SlowUtils.slowtime);
					player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
					event.setCancelled(true);
				} else {
					SlowUtils.setSlow(name);
				}
			}
		}
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		if (player.isOp() && Main.outdated) {
			player.sendMessage(
					"SlowChat is outdated! You are using " + Main.pluginVersion + " but the latest version is ");
		}
	}

}
