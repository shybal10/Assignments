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
        if(checkAnagramWithoutBruteForce(word1,word2)) {
            System.out.println("the words are Anagrams");
        } else {
            System.out.println("the words are not Anagrams");
        }
    }

    /**
     * checks if the words are Anagrams efficiently
     * @param word1 is an input string
     * @param word2 is an input string
     * @return true if they are Anagrams
     */
    private static boolean checkAnagramWithoutBruteForce(String  word1, String word2) {
        // todo: does not work for different frequencies of the same letter
        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                if (word2.indexOf(word1.charAt(i)) < 0 || word1.indexOf(word2.charAt(i)) < 0) {
                    return false;
                }
            }
            String shybal = "shybal";

            return true;
        }
        else {
            return false;
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
        histogramCountWord1 = generateHistogram(word1.toLowerCase());
        histogramCountWord2 = generateHistogram(word2.toLowerCase());
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
