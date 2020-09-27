package me.repayed.murdermystery;

import me.repayed.murdermystery.api.MurderMysteryAPI;
import me.repayed.murdermystery.game.Game;
import me.repayed.murdermystery.player.GamePlayer;
import me.repayed.murdermystery.player.GamePlayerHandler;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class MurderMystery extends JavaPlugin implements MurderMysteryAPI {

    private GamePlayerHandler gamePlayerHandler;
    private Game game;

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        /* put the game stuff first  */
        this.gamePlayerHandler = new GamePlayerHandler();
        this.game = new Game(this);

        registerCommands();
        registerListeners();
    }

    private void registerCommands() {

    }

    private void registerListeners() {

    }

    @Override
    public Game getGame() {
        return this.game;
    }

    @Override
    public Set<GamePlayer> getGamePlayers() {
        return this.gamePlayerHandler.getGamePlayerSet();
    }

    @Override
    public Optional<GamePlayer> getGamePlayerByUUID(UUID uuid) {
        return getGamePlayerHandler().getGamePlayer(uuid);
    }

    public GamePlayerHandler getGamePlayerHandler() {
        return gamePlayerHandler;
    }
}
