package wargamefinal;

/**
 * This class Matthew Szablowski
 *
 * @author Matthew Szablowski
 */
public class WarGameFinal {
    public static void main(String[] args) {
      
        Card[][] hands = new Card[2][1];
        Deck myDeck = new Deck();

        for (int i = 0; i < 53; i++) {
            System.out.printf("\n Round %s of The War \n", i);

            for (int c = 0; c < 1; c++)
                for (int player = 0; player < hands.length; player++)
                    hands[player][c] = myDeck.dealCard();

            for (int player = 0; player < hands.length; player++) {
                System.out.printf("Player %d: ", player);
                printHand(hands[player]);

                int player1;
                int player2;

                if (player1.getValue() > player2.getValue())
                    System.out.println("Player One Wins The War");
                else if (player2.getValue() > player1.getValue())
                    System.out.println("Player Two Wins The War");
               else
                    System.out.println("The War Is A Tie");
    }

}
    }
}