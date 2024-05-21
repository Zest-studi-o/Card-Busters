public class Exercise1 {
    public static void main(String[] args) {
        int[] player1Cards = {10, 6, 8, 9, 7, 12, 7};
        int[] player2Cards = {7, 6, 9, 5, 2, 8, 11};
        int player1Wins = 0;
        int player2Wins = 0;

        System.out.println("******play Card Busters!!!");

        for (int i = 0; i < 7; i++) {
            if (player1Cards[i] > player2Cards[i]) {
                System.out.println("Round No: " + (i + 1) + "- Player 1 wins the round: " +
                                   player1Cards[i] + " beats " + player2Cards[i]);
                player1Wins++;
            } else if (player1Cards[i] < player2Cards[i]) {
                System.out.println("Round No: " + (i + 1) + "- Player 2 wins the round: " +
                                   player2Cards[i] + " beats " + player1Cards[i]);
                player2Wins++;
            } else {
                System.out.println("Round No: " + (i + 1) + "- Tie! " +
                                   player1Cards[i] + " ties with " + player2Cards[i]);
            }
        }

        if (player1Wins > player2Wins) {
            System.out.println("Player One wins!! He won " + player1Wins + " rounds beating Player Two who won " +
                               player2Wins + " rounds!");
        } else if (player1Wins < player2Wins) {
            System.out.println("Player Two wins!! He won " + player2Wins + " rounds beating Player One who won " +
                               player1Wins + " rounds!");
        } else {
            System.out.println("It's a tie! Both players won the same number of rounds.");
        }

        System.out.println("Goodbye!");
    }
}