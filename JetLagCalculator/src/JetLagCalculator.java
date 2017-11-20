import java.util.Scanner;

public class JetLagCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of hours travelled");
        double hoursTravelled = input.nextDouble();
        System.out.println("enter the number of zones crossed");
        double zonesCrossed = input.nextDouble();
        System.out.println("enter the arrival time");
        int arrivalTime = input.nextInt();
        int arrivalCode = 0;
        if (arrivalTime < 12 && arrivalTime > 8) {
            arrivalCode = 4;
        }
        else if (arrivalTime < 18 && arrivalTime > 12) {
            arrivalCode = 2;
        }
        else if (arrivalTime < 22 && arrivalTime > 18) {
            arrivalCode = 0;
        } else if (( arrivalTime > 22 && arrivalTime < 24 )|| arrivalTime < 1) {
            arrivalCode = 1;
        } else if (arrivalTime < 8 && arrivalTime > 1) {
            arrivalCode = 3;
        }
        System.out.println("enter departure time");
        int departureTime = input.nextInt();
        int departureCode = 0;
        if (departureTime < 12 && departureTime > 8) {
            departureCode = 0;
        }
        else if (departureTime < 18 && departureTime > 12) {
            departureCode = 1;
        }
        else if (departureTime < 22 && departureTime > 18) {
            departureCode = 3;
        } else if (( departureTime > 22 && departureTime < 24 )|| departureTime < 1) {
            departureCode = 4;
        } else if (departureTime < 8 && departureTime > 1) {
            departureCode = 5;
        }
        System.out.println(getJetLag(hoursTravelled,zonesCrossed,departureCode,arrivalCode));
    }
    private static double getJetLag(double hours, double zonesCrossed, int departureCode, int arrivalCode) {
        return  (hours/2 + (zonesCrossed-3) + departureCode + arrivalCode)/10;
    }
}
