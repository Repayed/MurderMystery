package me.repayed.murdermystery.listener.connect;

import me.repayed.murdermystery.MurderMystery;
import me.repayed.murdermystery.game.Game;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerConnect implements Listener {

    private final MurderMystery murderMystery;
    private final Game game;

    public PlayerConnect(MurderMystery murderMystery) {
        this.murderMystery = murderMystery;
        this.game = murderMystery.getGame();
    }

    @EventHandler
    public void playerConnect(PlayerJoinEvent event) {
        Player player = event.getPlayer();


    }
}
