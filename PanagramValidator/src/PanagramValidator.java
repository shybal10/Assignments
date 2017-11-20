import java.util.Scanner;

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
    private static boolean isPangram(String sentence) {
        for (char character = 'a'; character <= 'z'; character++) {
            if (sentence.indexOf(character) < 0)
                return false;
        }
        return true;
    }
}
