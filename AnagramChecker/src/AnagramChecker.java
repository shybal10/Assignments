import java.util.Arrays;
import java.util.Scanner;
/**
 * identifies the Anagrams in the input
 * @author shybal
 * @version 1.0
 */
public class AnagramChecker {
    public static void main(String[] args) {
        System.out.println("enter the two words:");
        Scanner input = new Scanner(System.in);
        String word1 = input.next();
        String word2 = input.next();
        if(isAnangram(word1,word2)) {
            System.out.println("the words are Anagrams");
        } else {
            System.out.println("the words are not Anagrams");
        }
    }

    /**
     * checks if the inputs are Anagrams
     * @param word1 is an input string
     * @param word2 is an input string
     * @return true if they are Anagrams
     */
    private static boolean isAnangram(String word1, String word2) {
        int[] histogramCountWord1;
        int[] histogramCountWord2;
        histogramCountWord1 = generateHistogram(word1);
        histogramCountWord2 = generateHistogram(word2);
       // System.out.println(Arrays.toString(histogramCountWord1));
       // System.out.println(Arrays.toString(histogramCountWord2));
        return Arrays.equals(histogramCountWord1,histogramCountWord2);
    }

    /**
     * generates histograms for the each words
     * @param word is the input string
     * @return an array of integers
     */
    private static int[] generateHistogram(String word) {
        int[] histogramCountWord = new int[26];
//        todo: Brute force sucks...
        for (int i = 0; i < word.length(); i++) {
            int j = 0;
            for (char character = 'a'; character <= 'z'; character++ ) {
                if(word.charAt(i) == character) {
                    histogramCountWord[j]++;
                }
                j++;
            }
        }
        return histogramCountWord;

    }
}
