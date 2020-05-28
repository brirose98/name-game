package elements;

import static org.junit.jupiter.api.Assertions.*;

class BowlTest {

    @org.junit.jupiter.api.Test
    void testAdd() {
        Game game = new Game();
        Name name = new Name("St Vincent DePaul");
        game.bowl.add(name);
            assertEquals(1, game.bowl.howManyNames());
        }

    @org.junit.jupiter.api.Test
    void testAdd2() {
        Game game = new Game();
        Name name = new Name("St Vincent DePaul");
        assertEquals(0, game.bowl.howManyNames());
    }

    @org.junit.jupiter.api.Test
    void testDrawName() {
        Game game = new Game();
        Name name = new Name("St Vincent DePaul");
        game.bowl.add(name);
        assertEquals(name, game.bowl.drawName());
    }
    @org.junit.jupiter.api.Test
    void testDrawName2() {
        Game game = new Game();
        Name name = new Name("St Vincent DePaul");
        assertThrows(IllegalArgumentException.class, () -> game.bowl.drawName());
    }
}