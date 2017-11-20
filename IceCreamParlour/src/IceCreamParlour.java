import java.util.Scanner;

/**
 * class finds the ice creams that can be bought with the money available
 * @author shybal
 * @version 1.0
 */
public class IceCreamParlour {
    public static int[][] result = new int[50][2];  // stores the results of the test cases
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        int count = 0;
        while (count < testCases) {
            int moneyAvailable = input.nextInt();
            int totalFlavours = input.nextInt();
            int[] flavourPrice = new int[totalFlavours];
            for (int j = 0; j < totalFlavours; j++) {
                flavourPrice[j] = input.nextInt();
            }
            getIceCreamIndexes(flavourPrice, moneyAvailable,count);
            count++;
        }
        for (int i = 0; i < testCases; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(IceCreamParlour.result[i][j]+"\t");
            System.out.println();
        }
    }

    /**
     * finds the ice cream indexes of the ice creams that can be bought
     * @param flavourPrice is the cost of each ice cream avaiilable
     * @param moneyAvailable is the money left after buying an ice cream
     * @param testCases number of test cases asked for
     */
    private static void getIceCreamIndexes(int[] flavourPrice, int moneyAvailable, int testCases) {
        int sumRemaining = moneyAvailable;
        for (int i = 0; i < flavourPrice.length; i++) {
            sumRemaining = sumRemaining - flavourPrice[i];
            for (int j = i+1; j < flavourPrice.length; j++) {
                if (flavourPrice[j] == sumRemaining) {
                    IceCreamParlour.result[testCases][0] = i+1;
                    IceCreamParlour.result[testCases][1] = j+1;
                    return;
                }
            }
        }
    }
}
