/**
 * get a set of possible combinations
 * @author shybal
 * @version 1.0
 */
public class Combinations {
    public static void main(String[] args) {
        System.out.println(getPossibleCombinations(15,5));
    }

    /**
     * get the number of possible combinations from the iven sets
     * @param m is the number of elements in set 1
     * @param n is the number of elements in set 2
     * @return the number of possible combination
     */
    private static int getPossibleCombinations(int m, int n) {
        if (m < 0) {
            return 0;
        }
        else if (n < 0) {
            return 0;
        }
        else if (n == 0) {
            return 1;
        }
        else return getPossibleCombinations(m-1,n-1) + getPossibleCombinations(m-1,n);
    }
}
