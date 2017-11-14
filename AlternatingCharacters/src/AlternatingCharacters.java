import java.util.Arrays;
import java.util.Scanner;
/**
 * identifies the minimun number of deletions required for alternating character strings
 * @author Shybal Ibrahim
 * @version 1.0
 */

public class AlternatingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalStrings = input.nextInt();
        String[] words = new String[totalStrings];
        for (int i = 0; i < totalStrings; i++) {
            words[i] = input.next();
        }
        System.out.println(Arrays.toString(getAlternatingCharacterCount(totalStrings,words)));
    }

    /**
     * finds the alternating characters in the string
     * @param total number of strings given to the methods
     * @param words are the strings given to the method
     * @return the number of deletions required in each string
     */
    private static int[] getAlternatingCharacterCount(int total, String[] words) {
        int[] count = new int[total];
        int len;
        for (int i = 0; i < total; i++) {
            len = words[i].length()-1;
            for (int j = 0; j < len; j++) { //the character and the next character are checked
                if (words[i].charAt(j) == words[i].charAt(j+1)) {
                    count[i]+= 1;
                }
            }
        }
        return count;
    }
}
