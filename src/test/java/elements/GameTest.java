package elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void testAddPlayer() {
        Game game = new Game();
        Name name = new Name();
        name.setName("Steven Universe");
        Player player = new Player(game, name);
        game.addPlayer(player);
        assertEquals(1, game.names.size());
    }

    @Test
    void testAddPlayer2() {
        Game game = new Game();
        assertEquals(0, game.names.size());
    }

    @Test
    void testGetPlayerName() {
        Game game = new Game();
        Name name = new Name();
        name.setName("Steven Universe");
        Player player = new Player(game, name);
        game.addPlayer(player);
        System.out.println(name.getName());
        assertEquals(game.getPlayerName(player), name);
    }

    @Test
    void testWinGame() {
        Game game = new Game();
        Name name = new Name();
        Name name2 = new Name();
        name.setName("Steven Universe");
        name2.setName("Pearl");
        Player player = new Player(game, name);
        Player player2 = new Player(game, name2);
        game.addPlayer(player);
        game.addPlayer(player2);
        player2.slaves += 1;
        assertEquals("Goodbye!", game.winGame(player2));

    }

}