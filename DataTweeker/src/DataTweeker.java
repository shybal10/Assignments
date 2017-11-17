import java.util.Arrays;

/**
 * find new average PH levels after removing distant values
 * @author shybal
 * @version 1.0
 */
public class DataTweeker {
    public static void main(String[] args) {
        //int levelCount = 13;
        double[] acidLevels = {
                5.6, 6.2, 6.0, 5.5, 5.7, 6.1, 7.4, 5.5, 5.5, 6.3, 6.4, 4.0, 6.9
        };
        getAverages(acidLevels);
    }

    /**
     * returns the average PH levels
     * @param values array of PH levels
     */
    private static void getAverages(double[] values) {
        System.out.println("Average: "+ getAverage(values));
        double mostDistantValue = getMostDistantValue(values, getAverage(values));
        System.out.println("most distant value: "+ mostDistantValue);
        System.out.println(getNewAverage(values,mostDistantValue));
    }

    /**
     * finds the new average after removing the most distant value
     * @param values array of PH levels
     * @param mostDistantValue a double
     * @return the new average as array of doubles
     */
    private static double getNewAverage(double[] values, double mostDistantValue) {
        double newAverage = 0;
        Arrays.sort(values);
        int index = Arrays.binarySearch(values,mostDistantValue);
        for (int i = 0; i < values.length; i++) {
            if (i != index) {
                newAverage = newAverage + values[i];
            }
        }
        return newAverage/(values.length-1);
    }

    /**
     * finds the most distant PH level from the given list
     * @param values array of PH levels
     * @param average average of all the PH levels
     * @return the most distant PH level
     */
    private static double getMostDistantValue (double[] values,double average) {
        double distant = Math.abs(values[0] - average);
        double distantValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (Math.abs(values[i] - average) > distant) {
                distant = Math.abs(values[i] - average);
                distantValue = values[i];
            }
        }
        return distantValue;
    }

    /**
     * finds the average PH levels
     * @param values an array of PH values
     * @return the average value
     */
    private static double getAverage(double[] values) {
        double average = 0;
        for (int i = 0; i < values.length; i ++) {
            average = average + values[i];
        }
        return average / values.length;
    }
}
