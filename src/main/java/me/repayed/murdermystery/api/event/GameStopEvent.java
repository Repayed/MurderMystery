package me.repayed.murdermystery.api.event;

import me.repayed.murdermystery.game.Game;
import me.repayed.murdermystery.game.cause.StopCause;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class GameStopEvent extends Event implements Cancellable {

    private final Game game;
    private final StopCause stopCause;

    private boolean isCancelled;

    private static final HandlerList HANDLER_LIST = new HandlerList();

    public GameStopEvent(Game game, StopCause stopCause) {
        this.game = game;
        this.stopCause = stopCause;
        this.isCancelled = false;
    }

    public Game getGame() {
        return this.game;
    }

    public StopCause getStopCause() {
        return this.stopCause;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    @Override
    public boolean isCancelled() {
        return this.isCancelled;
    }

    @Override
    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }
}


