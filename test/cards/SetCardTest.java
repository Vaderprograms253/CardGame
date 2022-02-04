package cards;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

/**
 * This class test getters in SetCard class
 */
public class SetCardTest {
    SetCard setCard = new SetCard("circle", 4, "dashed", "blue");
    SetCard setCard1= new SetCard("square", 5, "dotted", "orange");
    SetCard setCard2 = new SetCard("oval", 3, "spaced", "green");


    @Test
    public void getShape() {
        assertEquals("circle", setCard.getShape());
        assertEquals("square", setCard1.getShape());
        assertEquals("oval", setCard2.getShape());

    }

    @Test
    public void getNumber() {
        assertEquals(4, setCard.getNumber());
        assertEquals(5, setCard1.getNumber());
        assertEquals(3, setCard2.getNumber());

    }

    @Test
    public void getShading() {
        assertEquals("dashed", setCard.getShading());
        assertEquals("dotted", setCard1.getShading());
        assertEquals("spaced", setCard2.getShading());


    }

    @Test
    public void getColor() {
        assertEquals("blue", setCard.getColor());
        assertEquals("orange", setCard1.getColor());
        assertEquals("green", setCard2.getColor());

    }
}