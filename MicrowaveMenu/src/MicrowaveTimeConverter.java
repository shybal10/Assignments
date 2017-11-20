import java.util.Scanner;

public class MicrowaveTimeConverter {
    public static void main(String[] args) {
        System.out.print("enter cook time --> ");
        Scanner input = new Scanner(System.in);
        int time = input.nextInt();
        System.out.println("your time --> "+getMicrowaveTime(time));
    }
    private static String getMicrowaveTime(int time) {
        int minutesPlace = time / 100;
        int secondsPlace = time % 100;
        return minutesPlace + ":" + secondsPlace;
    }
}
