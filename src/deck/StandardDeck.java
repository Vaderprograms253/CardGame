/**
 * author: Xavier Denson
 * 2/2/2022
 * StandardDeck.java
 * creates a standard 52 card deck
 */
package deck;

import cards.Card;
import cards.StandardCard;

/**
 * This class represents a standard 52 card deck
 */
public class StandardDeck extends Deck {
    /**
     * creates a standard 52-card deck with each combination of suits and ranks
     */
    public StandardDeck (){
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King", "Ace"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        for (int i = 0; i < suits.length ; i++) {
            for (int j = 0; j < ranks.length; j++) {
                StandardCard card = new StandardCard(ranks[j], suits[i]);
                super.addCard(card);
            }
        }
    }

    /**
     * hides Deck.dealTopCard method. retrieves card from parent class
     * calls dealTopCard method from parent class and cast Card to StandardCard object
     * @return card on top of deck
     */
    public StandardCard dealTopCard(){
        return (StandardCard) super.dealTopCard();
    }
}
