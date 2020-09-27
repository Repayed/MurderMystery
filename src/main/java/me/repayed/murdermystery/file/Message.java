package me.repayed.murdermystery.file;

public enum Message {

    // TODO: everything

    PREFIX("messages.prefix"),

    NO_PERMISSION("messages.no-permission"),

    SET_LOBBY_LOCATION("messages."),
    SET_GAME_LOCATION("messages."),

    FORCE_START_GAME("messages."),
    FORCE_END_GAME("messages."),

    COMMAND_MENU("messages."),

    GAME_STARTED("messages."),
    GAME_ENDED("messages."),

    NOT_ENOUGH_PLAYERS("messages."),
    PLAYER_MURDERED("messages.");

    private String path;

    Message(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

}
