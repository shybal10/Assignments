import java.util.Scanner;

/**
 * class finds whether the sentence is a Panagram
 * a sentence is said to be a panagram if it includes all the letters of the alphabet
 * @author shybal
 * @version 1.0
 */
public class PanagramValidator {
    public static void main(String[] args) {
        System.out.println("enter the sentence to be checked");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        if (isPangram(sentence.toLowerCase())) {
            System.out.println("Pangram");
        } else {
            System.out.println("not a Pangram");
        }
    }

    /**
     * function checks whether the sentence is a panagram
     * @param sentence is the input string
     * @return true if the sentence is a panagram
     */
    private static boolean isPangram(String sentence) {
        for (char character = 'a'; character <= 'z'; character++) {
            if (sentence.indexOf(character) < 0)
                return false;
        }
        return true;
    }
}
