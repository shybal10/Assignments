import java.util.Random;
import java.util.Scanner;

/**
 * a game where the user tries to correctly guess the random number generated by the computer
 * @author shybal
 * @version 1.0
 */
public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = Math.abs((1 + rand.nextInt()) % 10);
        int chances = 0;
        System.out.println("I am thinking of a number from 1 to 10.\n" +
                "You must guess what it is in three tries.\n" +
                "Enter a guess: ");
        startGame(number,chances);
    }

    /**
     * function that runs the game
     * @param number is the number generated by the computer
     * @param chances is the number of chances left
     */
    private static void startGame(int number,int chances) {
        while (chances != 3) {
            Scanner input = new Scanner(System.in);
            int yourGuess = input.nextInt();
            if (yourGuess == number) {
                System.out.println("RIGHT!\n" +
                        "You have won the game.");
                return;
            } else if (Math.abs(yourGuess - number) > 3) {
                chances++;
                System.out.println("cold");
            } else if (Math.abs(yourGuess - number) == 2) {
                chances++;
                System.out.println("warm");
            } else if (Math.abs(yourGuess - number) == 1) {
                chances++;
                System.out.println("hot");
            }
        }
        System.out.println("sorry you have lost all your chances :(");
    }
}
