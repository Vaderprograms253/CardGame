package cards;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class tests methods in the Card class
 */
public class CardTest {

    @Test
    public void getCardText() {
        StandardCard card = new StandardCard("King","Spades");
        assertEquals("King of Spades", card.getCardText());
        StandardCard card1 = new StandardCard("5","Hearts");
        assertEquals("5 of Hearts", card1.getCardText());
        SetCard setCard = new SetCard("square", 3, "dashed", "green");
        assertEquals("dashed-green square 3", setCard.getCardText());
        SetCard setCard1= new SetCard("circle", 5, "dotted", "red");
        assertEquals("dotted-red circle 5", setCard1.getCardText());
    }
}