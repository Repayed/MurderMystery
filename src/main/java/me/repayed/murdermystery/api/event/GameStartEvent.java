package me.repayed.murdermystery.api.event;

import me.repayed.murdermystery.game.Game;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class GameStartEvent extends Event implements Cancellable {

    private final Game game;
    private boolean isCancelled;

    private static final HandlerList HANDLER_LIST = new HandlerList();


    public GameStartEvent(Game game) {
        this.game = game;
        this.isCancelled = false;
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
