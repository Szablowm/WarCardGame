package wargamefinal;

/**
 * This class +++Insert Description Here+++
 *
 * @author Matthew Szablowski
 */
public enum Suit {
    DIAMONDS("Diamonds", "D"),
    SPADES("Spades", "S"),
    CLUBS("Clubs", "C"),
    HEARTS("Hearts", "H");

    private String suitName;
    private String symbol;

    Suit(String suitName, String symbol) {
        this.suitName = suitName;
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public String getSuitName() {
        return this.suitName;
    }

    @Override
    public String toString() {
        return this.getSymbol();
    }

}
