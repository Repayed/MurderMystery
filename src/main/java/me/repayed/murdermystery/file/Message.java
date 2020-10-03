package me.repayed.murdermystery.file;

public enum Message {

    PREFIX("messages.prefix"),
    NO_PERMISSION("messages.no-permission"),

    SET_LOBBY_LOCATION("messages.admin.set-lobby-location"),
    SET_GAME_LOCATION("messages.admin.set-game-location"),
    FORCE_START_GAME("messages.admin.force-started-game"),
    FORCE_END_GAME("messages.admin.force-ended-game"),
    COMMAND_MENU("messages.admin.command-menu"),

    GAME_STARTED("messages.game.game-started"),
    GAME_ENDED("messages.game.game-ended"),
    NOT_ENOUGH_PLAYERS("messages.game.not-enough-players"),
    PLAYER_MURDERED("messages.game.player-murdered"),

    PLAYER_CONNECTED("messages.connection.player-connected"),
    PLAYER_DISCONNECTED("messages.connection.player-disconnected");

    private String path;

    Message(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

}
