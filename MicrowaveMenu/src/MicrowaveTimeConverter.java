import java.util.Scanner;

/**
 * converts the microwave timer set into a readable format
 */
public class MicrowaveTimeConverter {
    public static void main(String[] args) {
        System.out.print("enter cook time --> ");
        Scanner input = new Scanner(System.in);
        int time = input.nextInt();
        System.out.println("your time --> "+getMicrowaveTime(time));
    }

    /**
     * function that performs the formatting
     * @param time is the non- formatted time as int
     * @return formatted time as string
     */
    private static String getMicrowaveTime(int time) {
        int minutesPlace = time / 100;
        int secondsPlace = time % 100;
        return minutesPlace + ":" + secondsPlace;
    }
}
