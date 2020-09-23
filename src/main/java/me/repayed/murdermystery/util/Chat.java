package me.repayed.murdermystery.util;

import me.repayed.murdermystery.MurderMystery;
import me.repayed.murdermystery.file.Message;
import org.bukkit.ChatColor;

public class Chat {

    private static String color(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public static String getFormattedMessage(final MurderMystery murderMystery, final Message message) {
        return color(murderMystery.getConfig().getString(message.getPath()));
    }
}
