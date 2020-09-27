package me.repayed.murdermystery.game;

import me.repayed.murdermystery.MurderMystery;
import me.repayed.murdermystery.player.GamePlayerHandler;

public class Game {

    public enum GameState {
        WAITING, STARTING, INGAME, ENDED
    }

    private final MurderMystery murderMystery;
    private final GamePlayerHandler gamePlayerHandler;

    public Game(final MurderMystery murderMystery) {
        this.murderMystery = murderMystery;
        this.gamePlayerHandler = this.murderMystery.getGamePlayerHandler();
    }


}
