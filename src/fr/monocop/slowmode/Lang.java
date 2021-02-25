package fr.monocop.slowmode;

public class Lang {
	public static String NO_PERMISSION;
	// -------------------------
	public static String SLOWMODE_ENABLED;
	public static String SLOWMODE_DISABLED;
	public static String CHAT_IS_IN_SLOWMODE;
	public static String SERVER_IS_NOW_IN_SLOWMODE;
	public static String SERVER_IS_NO_LONGER_IN_SLOWMODE;
	public static String SLOWCHAT_COMMAND_USAGE;
	// -------------------------
	public static String PAUSEMODE_ENABLED;
	public static String PAUSEMODE_DISABLED;
	public static String CHAT_IS_IN_PAUSEMODE;
	public static String SERVER_IS_NOW_IN_PAUSEMODE;
	public static String SERVER_IS_NO_LONGER_IN_PAUSEMODE;
	public static String PAUSECHAT_COMMAND_USAGE;

	public static void english() {
		NO_PERMISSION = "&cYou don't have permission.";

		SLOWMODE_ENABLED = "&aSlowMode enabled! Time between two messages: %a seconds";
		SLOWMODE_DISABLED = "&cSlowMode disabled!";
		CHAT_IS_IN_SLOWMODE = "&cThe chat is in slowmode! Please wait %a seconds between each messages!";
		SERVER_IS_NOW_IN_SLOWMODE = "&a[SlowChat] Server chat is now in slowmode! Time between each messages: %a seconds";
		SERVER_IS_NO_LONGER_IN_SLOWMODE = "&a[SlowChat] Server chat is no longer in slowmode!";
		SLOWCHAT_COMMAND_USAGE = "&a[SlowChat] Usage: /slowchat <time in seconds> OR /slowchat off";

		PAUSEMODE_ENABLED = "&aPauseMode enabled!";
		PAUSEMODE_DISABLED = "&cPauseMode disabled!";
		CHAT_IS_IN_PAUSEMODE = "&cThe chat is in pausemode! Only allowed players can speak!";
		SERVER_IS_NOW_IN_PAUSEMODE = "&a[SlowChat] Server chat is now in pausemode! Only allowed players can speak!";
		SERVER_IS_NO_LONGER_IN_PAUSEMODE = "&a[SlowChat] Server chat is no longer in pausemode!";
		PAUSECHAT_COMMAND_USAGE = "&a[SlowChat] Usage: /pausechat on/off";
	}

	public static void french() {
		NO_PERMISSION = "&cVous n'avez pas la permission de faire ceci.";

		SLOWMODE_ENABLED = "&aSlowMode activé! Temps entre deux messages: %a secondes";
		SLOWMODE_DISABLED = "&cSlowMode désactivé!";
		CHAT_IS_IN_SLOWMODE = "&cLe chat est en SlowMode! Vous devez attendre %a secondes entre chaque message!";
		SERVER_IS_NOW_IN_SLOWMODE = "&a[SlowChat] Le chat est désormais en SlowMode, temps entre deux messages: %a secondes";
		SERVER_IS_NO_LONGER_IN_SLOWMODE = "&a[SlowChat] Le chat n'est désormais plus en SlowMode!";
		SLOWCHAT_COMMAND_USAGE = "&a[SlowChat] Utilisation: /slowchat <temps en secondes> OU /slowchat off";

		PAUSEMODE_ENABLED = "&aPauseMode activé!";
		PAUSEMODE_DISABLED = "&cPauseMode désactivé!";
		CHAT_IS_IN_PAUSEMODE = "&cLe chat est en PauseMode! Seul les joueurs autorisés peuvent écrire!";
		SERVER_IS_NOW_IN_PAUSEMODE = "&a[SlowChat] Le chat est désormais en PauseMode, seul les joueurs autorisés peuvent écrire!";
		SERVER_IS_NO_LONGER_IN_PAUSEMODE = "&a[SlowChat] Le chat n'est désormais plus en PauseMode!";
		PAUSECHAT_COMMAND_USAGE = "&a[SlowChat] Utilisation: /pausechat on/off";

	}

}
