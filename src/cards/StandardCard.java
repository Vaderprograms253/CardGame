/**
 * author: Xavier Denson
 * 2/2/2022
 * StandardCard.java
 * Represents a standard playing card with suit and rank
 */
package cards;

/**
 * This class represents a standard playing card with a suit and rank.
 */
public class StandardCard extends Card {
    private String rank;
    private String suit;

    /**
     * creates a new card standard playing card with a rank and suit
     * @param rank
     * @param suit
     */
    public StandardCard(String rank, String suit){
       super(rank +" of " + suit);
       this.rank = rank;
       this.suit = suit;
    }

    /**
     * getter for rank of a standard playing card
     * @return rank of standard playing card
     */
    public String getRank() {
        return rank;
    }

    /**
     * getter for suit of a standard playing card
     * @return suit of standard playing card
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return super.getCardText();
    }
}
