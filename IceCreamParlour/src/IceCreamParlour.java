import java.util.Scanner;

public class IceCreamParlour {
    public static int[][] result = new int[50][2];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        int count = 0;
        while (count < testCases) {
            int dollars = input.nextInt();
            int totalFlavours = input.nextInt();
            int[] flavours = new int[totalFlavours];
            for (int j = 0; j < totalFlavours; j++) {
                flavours[j] = input.nextInt();
            }
            getIceCreamIndexes(flavours, dollars,count);
            count++;
        }
        for (int i = 0; i < testCases; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(IceCreamParlour.result[i][j]+"\t");
            System.out.println();
        }


    }
    private static void getIceCreamIndexes(int[] flavours, int dollars, int testCases) {
        int sumRemaining = dollars;
        for (int i = 0; i < flavours.length; i++) {
            sumRemaining = sumRemaining - flavours[i];
            for (int j = i+1; j < flavours.length; j++) {
                if (flavours[j] == sumRemaining) {
                    IceCreamParlour.result[testCases][0] = i+1;
                    IceCreamParlour.result[testCases][1] = j+1;
                    return;
                }
            }
        }
    }
}
