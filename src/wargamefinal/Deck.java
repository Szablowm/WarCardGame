package wargamefinal;

/**
 * This class +++Insert Description Here+++
 *
 * @author Matthew Szablowski
 */
public class Deck {
    private Card[] deck = new Card[52];
    private int topCard;

    Deck() {

        topCard = 0;

        for (int i = 0; i < deck.length; i++)
            deck[i] = new Card(i);

    }

    public void shuffle() {

        topCard = 0;

        for (int i = 0; i < 1000; i++) {
            int j = (int)(Math.random()*52);
            int k = (int)(Math.random()*52);
            Card tmpCard = deck[j];
            deck[j] = deck[k];
            deck[k] = tmpCard;
        } 
   }

    public Card dealCard() {
        Card theCard;
        if (topCard < deck.length) {
            theCard = deck[topCard];
            topCard++;
        }
        else
            theCard = null;

        return theCard;
    }
}
