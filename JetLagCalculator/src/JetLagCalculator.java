import java.util.Scanner;

/**
 * calculates the JetLag suffered by a passenger based on the formulae of the aviation department
 * @author shybal
 * @version 1.0
 */
public class JetLagCalculator {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int arrivalTime = getArrivalTime();
        int departureTime = getDepartureTme();
        System.out.println(getJetLag(getHoursTravelled(),getZonesCrossed(),generateDepartureCode(departureTime),generateArrivalCode(arrivalTime)));
    }

    /**
     * finds the number of days of jet lag suffered
     * @param hours is the total number of hours travelled by the passenger
     * @param zonesCrossed is the number of zones crossed by the passenger
     * @param departureCode is the code generated based on departure time
     * @param arrivalCode is the code generated based on the arrival time
     * @return the number of days in double format
     */
    private static double getJetLag(double hours, double zonesCrossed, int departureCode, int arrivalCode) {
        return  (hours/2 + (zonesCrossed-3) + departureCode + arrivalCode)/10;
    }

    /**
     * calculates and generates an arrival code
     * @param arrivalTime of the passenger as int
     * @return the generated arrival code
     */
    private static int generateArrivalCode(int arrivalTime) {
        if (arrivalTime < 12 && arrivalTime >= 8) {
            return  4;
        }
        else if (arrivalTime < 18 && arrivalTime >= 12) {
            return  2;
        }
        else if (arrivalTime < 22 && arrivalTime >= 18) {
            return  0;
        } else if (( arrivalTime >= 22 && arrivalTime <= 24 )|| arrivalTime < 1) {
            return  1;
        } else  {
            return  3;
        }
    }

    /**
     * calculates and generates a departure code
     * @param departureTime of the passenger as int
     * @return the generated departure code
     */
    private static int generateDepartureCode(int departureTime) {
        if (departureTime < 12 && departureTime >= 8) {
            return  0;
        }
        else if (departureTime < 18 && departureTime >= 12) {
            return  1;
        }
        else if (departureTime < 22 && departureTime >= 18) {
            return  3;
        } else if (( departureTime >= 22 && departureTime <= 24 )|| departureTime < 1) {
            return 4;
        } else  {
            return 5;
        }
    }

    /**
     * @return the number of hours traveled by passenger as double
     */
    private static double getHoursTravelled() {
        System.out.println("enter the number of hours travelled");
        return input.nextDouble();
    }

    /**
     * @return the number of zones crossed by the passenger as double
     */
    private static double getZonesCrossed() {
        System.out.println("enter the number of zones crossed");
        return  input.nextDouble();
    }

    /**
     * @return the arrival time of the passenger as int
     */
    private static int getArrivalTime() {
        System.out.println("enter the arrival time");
        return input.nextInt();
    }

    /**
     * @return the departure time of the passenger as int
     */
    private static int getDepartureTme() {
        System.out.println("enter departure time");
        return input.nextInt();
    }
}
