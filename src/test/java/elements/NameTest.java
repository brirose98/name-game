package elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    @Test
    void setName() {
      Name name = new Name();
      name.setName("Mickey Mouse");
      assertEquals("Mickey Mouse",name.getName());
    }
    @Test
    void setName2() {
        Name name = new Name();
        name.setName("");
        assertEquals("",name.getName());
    }
    @Test
    void getName() {
        Name name = new Name();
        name.setName("Mickey Mouse");
        System.out.println(name.toString());
        assertEquals("Mickey Mouse",name.getName());
    }

    @Test
    void length() {
        Name name = new Name();
        name.setName("Obama");
        assertEquals(5, name.length());
    }
    @Test
    void length2() {
        Name name = new Name();
        name.setName("");
        assertEquals(0, name.length());
    }
    @Test
    void getLetter() {
        Name name = new Name();
        name.setName("Jane Doe");
        assertEquals('e', name.getLetter(3));

    }
    @Test
    void getLetter2() {
        Name name = new Name();
        name.setName("");
        assertThrows(IndexOutOfBoundsException.class, () -> name.getLetter(3));
    }

    @Test
    void testEquals() {
        Name name = new Name();
        name.setName("Princess Peach");
        assertTrue(name.name.equals("Princess Peach"));
    }

    @Test
    void testEquals2() {
        Name name = new Name();
        name.setName("Princess Peach");
        assertFalse(name.name.equals("Princess peach"));
    }

    @Test
    void testEquals3() {
        Name name = new Name();
        name.setName("Princess Peach");
        assertFalse(name.name.equals("Princess Beach"));
    }

}