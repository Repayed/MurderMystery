package me.repayed.murdermystery.api;

import me.repayed.murdermystery.game.Game;
import me.repayed.murdermystery.player.GamePlayer;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface MurderMysteryAPI {

    Game getGame();

    Set<GamePlayer> getGamePlayers();

    Optional<GamePlayer> getGamePlayerByUUID(UUID uuid);
}
