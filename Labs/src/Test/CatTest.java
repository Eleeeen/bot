package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat c = new Cat("Plusha", "black", 15);

    @Test
    void testGetName() {
        assertEquals("Plushaa", c.getName());
    }

    @Test
    void testGetColor() {
        assertEquals("black", c.getColor());
    }

    @Test
    void testGetAge() {
        assertEquals(15, c.getAge());
    }

    @Test
    void testSetName() {

    }

    @Test
    void testSetColor() {
    }

    @Test
    void testSetAge() {
    }

}