import java.util.Arrays;
import java.util.Scanner;

/**
 * class helps identify the negative sub arrays in a
 * given list
 * @author shybal
 * @version 1.0
 */
public class NegativeSubarrayFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter array length");
        int arrayLength = input.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("the elements of the array are: ");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = input.nextInt() ;
        }
        System.out.println("the elements of the array are");
        System.out.println(Arrays.toString(array));
        System.out.print("the number of negative sub arrays: ");
        System.out.println(getNegSubArrays(array,arrayLength));
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int i = scan.nextInt();
        double d = scan.nextDouble();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    /**
     * finds the number of negative sub arrays
     * @param array the given list of elements
     * @param length the length of the array
     * @return the number of negative sub arrays
     */
    private static int getNegSubArrays(int[] array, int length) {
        int sum;
        int count = 0;
        for (int i = 0; i < length; i++) {
            sum = 0;
            for (int j = i; j < length; j++) {  //checks the list wrt "i"
                sum = sum + array[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        return count;
    }

}
