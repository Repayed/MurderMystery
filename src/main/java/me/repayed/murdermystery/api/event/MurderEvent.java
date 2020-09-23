package me.repayed.murdermystery.api.event;

import me.repayed.murdermystery.player.GamePlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class MurderEvent extends Event implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();
    private boolean isCancelled;

    private GamePlayer killer;
    private GamePlayer killedPlayer;

    public MurderEvent(GamePlayer killer, GamePlayer killedPlayer) {
        this.killer = killer;
        this.killedPlayer = killedPlayer;

        this.isCancelled = false;
    }

    public GamePlayer getKiller() {
        return this.killer;
    }

    public GamePlayer getKilledPlayer() {
        return this.killedPlayer;
    }

    @Override
    public boolean isCancelled() {
        return this.isCancelled;
    }

    @Override
    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }
}
