package me.repayed.murdermystery;

import me.repayed.murdermystery.api.MurderMysteryAPI;
import me.repayed.murdermystery.database.mongo.Mongo;
import me.repayed.murdermystery.game.Game;
import me.repayed.murdermystery.player.GamePlayer;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collection;
import java.util.UUID;

public class MurderMystery extends JavaPlugin implements MurderMysteryAPI {

    private Game game;

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        /*
        put the game stuff first
         */
//        Mongo mongo = new Mongo(this);
        this.game = new Game(this);

        registerCommands();
        registerListeners();
    }

    private void registerCommands() {

    }

    private void registerListeners() {

    }

    @Override
    public Collection<GamePlayer> getGamePlayers() {
        return null;
    }

    @Override
    public GamePlayer getGamePlayerByUUID(UUID uuid) {
        return null;
    }
}
