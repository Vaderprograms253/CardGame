/**
 * author: Xavier Denson
 * 2/2/2022
 * Card.java
 * playing card in a card game
 */
package cards;

/**
 * This class represents a playing card in any type of card game
 */
public class Card {
    private String cardText;

    /**
     * creates a new card with description text
     * @param cardText
     */
    public Card(String cardText) {
        this.cardText = cardText;
    }

    /**
     *
     * @return returns description text
     */
    public String getCardText() {
        return cardText;
    }

    @Override
    public String toString() {
        return getCardText();
    }
}
