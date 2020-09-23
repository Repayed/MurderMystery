package me.repayed.murdermystery.player;

import java.util.HashSet;
import java.util.Set;

public class GamePlayerHandler {

    private final Set<GamePlayer> gamePlayerSet;

    public GamePlayerHandler() {
        this.gamePlayerSet = new HashSet<>();
    }
}
