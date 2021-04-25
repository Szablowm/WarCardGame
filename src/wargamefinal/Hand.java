package wargamefinal;

/**
 * This class +++Insert Description Here+++
 *
 * @author Matthew Szablowski
 */
import java.util.ArrayList;
import java.util.List;

/**
 * This class +++Insert Description Here+++
 *
 * @author Matthew Szablowski
 */
public class Hand {

    private List<Card> cards; //players individual cards

    public Hand() {
        this.cards = new ArrayList<Card>();
    }

    public void mergeHand(Hand other) {
        for (Card c : other.cards) {
            this.addCardToBottom(c);
        }
    }

    public List<Card> take(int numCards) {
        if (numCards > this.handSize()) {
            return null;
        }

        List<Card> out = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            out.add(this.cards.remove(this.handSize() - 1));
        }

        return out;
    }

    public void addCardToTop(Card c) {
        if (c == null) {
            throw new NullPointerException("Can't add a null card to a cards.");
        }
        cards.add(c);
    }

    public void addCardsToTop(List<Card> cds) {
        this.cards.addAll(cds);
    }

    public void addCardToBottom(Card c) {
        cards.add(0, c);
    }

    public Card removeCardFromTop() {
        if (handSize() < 1) {
            return null;
        }
        return cards.remove(handSize() - 1);
    }

    public Card removeCardFromBottom() {
        if (handSize() < 1) {
            return null;
        }
        return cards.remove(0);
    }

    public int handSize() {
        return cards.size();
    }

}