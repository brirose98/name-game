package elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void testName() {
        Game game = new Game();
        Name name = new Name();
        name.setName("sir blue demon");
        Player one = new Player(game, name);
        assertEquals(name.getName(), one.name());
    }

    @Test
    void testNameGuessed() {
        Game game = new Game();
        Name name = new Name();
        name.setName("St Vincent DePaul");
        Player one = new Player(game,name);
        one.nameGuessed = true;
        assertEquals(true, one.nameGuessed());
    }

    @Test
    void testSlaves() {
        Game game = new Game();
        Name name = new Name();
        name.setName("St Vincent DePaul");
        Player one = new Player(game, name);
        one.slaves += 1;
        assertEquals(1, one.slaves());
    }

    @Test
    void testGuessPlayerName() {
        Game game = new Game();
        Name name = new Name();
        Name name2 = new Name();
        name2.setName("Dibs");
        name.setName("St Vincent DePaul");
        Player one = new Player(game, name);
        Player two = new Player(game, name2);
        game.addPlayer(one);
        game.addPlayer(two);
        assertEquals(true, two.guessPlayerName(one,name));
    }
    @Test
    void testGuessPlayerName2() {
        Game game = new Game();
        Name name = new Name();
        Name name2 = new Name();
        Name name3 = new Name();
        name3.setName("fake name");
        name2.setName("Dibs");
        name.setName("St Vincent DePaul");
        Player one = new Player(game, name);
        Player two = new Player(game, name2);
        game.addPlayer(one);
        game.addPlayer(two);
        assertEquals(false, two.guessPlayerName(one,name3));
    }
}