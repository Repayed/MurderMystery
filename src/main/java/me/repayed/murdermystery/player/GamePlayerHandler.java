package me.repayed.murdermystery.player;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class GamePlayerHandler {

    private final Set<GamePlayer> gamePlayerSet;

    public GamePlayerHandler() {
        this.gamePlayerSet = new HashSet<>();
    }

    public Optional<GamePlayer> getGamePlayer(UUID uuid) {
        return null;
    }

    public Set<GamePlayer> getGamePlayerSet() {
        return this.gamePlayerSet;
    }
}
