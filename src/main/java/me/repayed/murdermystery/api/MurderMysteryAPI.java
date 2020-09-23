package me.repayed.murdermystery.api;

import me.repayed.murdermystery.player.GamePlayer;

import java.util.Collection;
import java.util.UUID;

public interface MurderMysteryAPI {

    Collection<GamePlayer> getGamePlayers();

    GamePlayer getGamePlayerByUUID(UUID uuid);
}
