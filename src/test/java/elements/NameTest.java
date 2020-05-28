package elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    @Test
    void setName() {
      Name name = new Name("Mickey Mouse");
      assertEquals("Mickey Mouse",name.name);
    }
    @Test
    void setName2() {
        Name name = new Name("");
        assertEquals("",name.name);
    }


    @Test
    void length() {
        Name name = new Name("Obama");
        assertEquals(5, name.length());
    }
    @Test
    void length2() {
        Name name = new Name("");
        assertEquals(0, name.length());
    }
    @Test
    void getLetter() {
        Name name = new Name("Jane Doe");
        assertEquals('e', name.getLetter(3));

    }
    @Test
    void getLetter2() {
        Name name = new Name("");
        assertThrows(IndexOutOfBoundsException.class, () -> name.getLetter(3));
    }

    @Test
    void testEquals() {
        Name name = new Name("Princess Peach");
        assertTrue(name.name.equals("Princess Peach"));
    }

    @Test
    void testEquals2() {
        Name name = new Name("Princess Peach");
        assertFalse(name.name.equals("Princess peach"));
    }

    @Test
    void testEquals3() {
        Name name = new Name("Princess Peach");
        assertFalse(name.name.equals("Princess Beach"));
    }

}