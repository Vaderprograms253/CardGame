package cards;

import deck.Deck;
import deck.StandardDeck;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class tests getters in the StandardCard class
 */
public class StandardCardTest {
    StandardCard card = new StandardCard("Ace","Spades");
    StandardCard card2 = new StandardCard("6", "Hearts");


    @Test
    public void getRank() {
        assertEquals("Ace", card.getRank());
        assertEquals("6", card2.getRank());
    }

    @Test
    public void getSuit() {
        assertEquals("Spades", card.getSuit());
        assertEquals("Hearts", card2.getSuit());
    }
}