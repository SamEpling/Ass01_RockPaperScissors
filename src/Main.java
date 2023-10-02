import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String p1Guess = "";
        String p2Guess = "";
        String playAgain = "";
        boolean done = false;
        boolean gameDone = false;
        do {
            do {
                System.out.print("Player 1, please choose your move [RPS] : ");
                p1Guess = in.nextLine();
                if (p1Guess.equalsIgnoreCase("R") || p1Guess.equalsIgnoreCase("P") || p1Guess.equalsIgnoreCase("S"))  {
                    done = true;
                } else {
                    System.out.println("You entered " + p1Guess + " which is not a valid move.");
                }
            } while (!done);
            done = false;
            do {
                System.out.print("Player 2, please choose your move [RPS] : ");
                p2Guess = in.nextLine();
                if (p2Guess.equalsIgnoreCase("R") || p2Guess.equalsIgnoreCase("P") || p2Guess.equalsIgnoreCase("S"))  {
                    done = true;
                } else {
                    System.out.println("You entered " + p2Guess + " which is not a valid move.");
                }
            } while (!done);
            if (p1Guess.equalsIgnoreCase("R")) {
                if (p2Guess.equalsIgnoreCase("R")) {
                    System.out.println("Rock ties with Rock! It's a tie!");
                }
                if (p2Guess.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock! Player 2 wins!");
                }
                else {
                    System.out.println("Rock crushes Scissors! Player 1 wins!");
                }
            }
            else if (p1Guess.equalsIgnoreCase("P")) {
                if (p2Guess.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock, Player 1 wins");
                }
                else if (p2Guess.equalsIgnoreCase("P")) {
                    System.out.println("Paper ties with Paper! It's a tie!");
                }
                else {
                    System.out.println("Scissors cut Paper! Player 2 wins!");
                }
            }
            else {
                if (p2Guess.equalsIgnoreCase("R")) {
                    System.out.println("Rock crushes Scissors, Player 2 wins!");
                }
                else if (p2Guess.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cut Paper! Player 1 wins!");
                }
                else {
                    System.out.println("Scissors tie with Scissors! It's a tie!");
                }
            }
            done = false;
            do {
                System.out.print("Would you like to play again? [Y/N] :");
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("Y"))  {
                    done = true;
                }
                else if (playAgain.equalsIgnoreCase("N"))  {
                    done = true;
                    gameDone = true;
                }
                else {
                    System.out.println("You entered " + playAgain + " which is not a valid choice.");
                }
            } while (!done);
        } while (!gameDone);
    }
}