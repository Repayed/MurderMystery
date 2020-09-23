package me.repayed.murdermystery.game;

import me.repayed.murdermystery.MurderMystery;

public class Game {

    enum StopReason {
        NATURAL,
        FORCED,
        PLAYER_LEFT
    }

    private final MurderMystery murderMystery;

    public Game(final MurderMystery murderMystery) {
        this.murderMystery = murderMystery;
    }


}
