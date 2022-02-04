/**
 * author: Xavier Denson
 * 2/2/2022
 * Deck.java
 * represents two groups of cards
 */
package deck;

import cards.Card;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class represents a dealer pile and discard pile of cards.
 * Cards are dealt from the dealer pile to the discard pile.
 */
public class Deck {
    private ArrayList<Card> dealerPile;
    private ArrayList<Card> discardPile;

    /**
     * creates a new Deck object
     */
    public Deck(){
        dealerPile = new ArrayList<>();
        discardPile = new ArrayList<>();
    }

    /**
     * adds a card to the dealer pile
     * @param card
     */
    public void addCard(Card card){
        dealerPile.add(card);
    }

    /**
     * moves all cards from discardPile to dealerPile and randomizes card positions
     */
    public void shuffle(){
        for (int i = 0; i < discardPile.size() ; i++) {
            int topCard = discardPile.size() - 1;
            dealerPile.add(discardPile.get(topCard));
        }
        Collections.shuffle(dealerPile);
    }

    /**
     * removes top card from dealer pile
     * @return top card from dealer pile
     */
    public Card dealTopCard(){

        int topCard = dealerPile.size() - 1;
        discardPile.add(dealerPile.get(topCard));
        dealerPile.remove(topCard);
        return discardPile.get(discardPile.size() - 1);
    }

    /**
     * counts the number of cards left in the dealer pile
     * @return number of cards in dealer pile
     */
    public int cardCount(){
        return dealerPile.size();
    }

    @Override
    public String toString() {
        StringBuilder cardString = new StringBuilder(cardCount() + " cards in deck\n******************\n");
        for (Card cards:dealerPile) {
            cardString.append(cards.toString()).append("\n");
        }
        cardString.append("\n").append(discardPile.size()).append(" Cards in discard\n********************\n");

        for (Card cards:discardPile) {
            cardString.append(cards.toString()).append("\n");
        }



        return cardString.toString();
    }
}
