import me.repayed.murdermystery.player.GamePlayer;
import me.repayed.murdermystery.player.GamePlayerHandler;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class GamePlayerTest {
    GamePlayerHandler gamePlayerHandler;
    final UUID uuid = UUID.fromString("d19aae94-ed94-4f68-8713-a705323d7695");

    @Before
    public void init() {
        this.gamePlayerHandler = new GamePlayerHandler();
    }

    @Test
    public void testPlayerDefaultRole() {
        GamePlayer gamePlayer = new GamePlayer(uuid);
        assertEquals("Test player default role", GamePlayer.Role.INVALID, gamePlayer.getRole());
    }

    @Test
    public void testAddPlayer() {
        gamePlayerHandler.addGamePlayer(new GamePlayer(this.uuid));
        assertEquals("Test set size", 1, gamePlayerHandler.getGamePlayerSet().size());
    }

    @Test
    public void testRemovePlayer() {
        GamePlayer gamePlayer = new GamePlayer(this.uuid);
        gamePlayerHandler.addGamePlayer(gamePlayer);

        gamePlayerHandler.removePlayer(gamePlayer);
        assertFalse("Test player removed", gamePlayerHandler.getGamePlayer(gamePlayer.getUuid()).isPresent());
    }

    @Test
    public void testPlayerPresent() {
        gamePlayerHandler.addGamePlayer(new GamePlayer(this.uuid));
        assertTrue("Test player present", gamePlayerHandler.getGamePlayer(this.uuid).isPresent());
    }

    @Test
    public void testPlayerMissing() {
        assertFalse("Test Missing Player", gamePlayerHandler.getGamePlayer(this.uuid).isPresent());
    }

}
