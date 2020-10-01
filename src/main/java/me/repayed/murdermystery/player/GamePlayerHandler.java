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

    public void addGamePlayer(GamePlayer gamePlayer) {
        this.gamePlayerSet.add(gamePlayer);
    }

    public Optional<GamePlayer> getGamePlayer(UUID uuid) {
        return this.gamePlayerSet.stream()
                .filter(gamePlayer -> gamePlayer.getUuid().equals(uuid))
                .findAny();
    }

    private void removePlayer(UUID uuid) {
        this.gamePlayerSet.removeIf(player -> player.getUuid().equals(uuid));
    }

    public void removePlayer(GamePlayer gamePlayer) {
        removePlayer(gamePlayer.getUuid());
    }


    public Set<GamePlayer> getGamePlayerSet() {
        return this.gamePlayerSet;
    }
}
