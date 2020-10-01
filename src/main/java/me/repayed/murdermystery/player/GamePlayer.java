package me.repayed.murdermystery.player;

import java.util.UUID;

public class GamePlayer {

    public enum Role {
        INVALID,
        SURVIVOR,
        DETECTIVE,
        MURDERER
    }

    private final UUID uuid;
    private boolean isPlaying;
    private Role role;

    public GamePlayer(UUID uuid) {
        this.uuid = uuid;
        this.isPlaying = false;
        this.role = Role.INVALID;
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return this.uuid.toString();
    }
}
