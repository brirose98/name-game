package elements;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class BowlTest {

    @org.junit.jupiter.api.Test
    void testAdd() {
        Game game= new Game();
        Name name = new Name("St Vincent DePaul");
        game.bowl.add(name);
        assertEquals(1, game.bowl.howManyNames());
        }

    @org.junit.jupiter.api.Test
    void testAdd2() {
        Bowl mockBowl = mock(Bowl.class);
        assertEquals(0, mockBowl.howManyNames());
    }

    @org.junit.jupiter.api.Test
    void testDrawName() {
        Bowl mockBowl = mock(Bowl.class);
        Name name = new Name("St Vincent DePaul");
        when(mockBowl.drawName()).thenReturn(name);
        assertEquals(name, mockBowl.drawName());
    }
    @org.junit.jupiter.api.Test
    void testDrawName2() {
        Game game = new Game();
        assertThrows(IllegalArgumentException.class, () -> game.bowl.drawName());
    }
}