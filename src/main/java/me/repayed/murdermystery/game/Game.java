package me.repayed.murdermystery.game;

import me.repayed.murdermystery.MurderMystery;
import me.repayed.murdermystery.player.GamePlayerHandler;

public class Game {

    public enum GameState {
        WAITING, STARTING, INGAME, ENDED, FROZEN
    }

    private final MurderMystery murderMystery;
    private final GamePlayerHandler gamePlayerHandler;

    private GameState gameState;

    private static final int MINIMUM_START_PLAYER_COUNT = 2;
    private static final int MAXIMUM_PLAYER_COUNT = 8;

    public Game(MurderMystery murderMystery) {
        this.murderMystery = murderMystery;
        this.gamePlayerHandler = this.murderMystery.getGamePlayerHandler();
    }

    public boolean shouldGameStart() {
        return gamePlayerHandler.getGamePlayerSet().size() >= MINIMUM_START_PLAYER_COUNT;
    }

    public void startGameCountdown() {

    }

    public GameState getGameState() {
        return this.gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }


}
