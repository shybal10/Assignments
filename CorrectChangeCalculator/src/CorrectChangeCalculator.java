/**
 * returns the change in terms of dollars cents and dimes
 * @author shybal
 * @version
 */
public class CorrectChangeCalculator {
    public static void main(String[] args) {
        getChangeDue(563);
    }

    /**
     * gives the change interms of dollar, cents, nickel and dimes
     * @param totalCents is the total money
     */
    private static void getChangeDue(int totalCents) {
        int dollars = totalCents/100;
        int quarters = (totalCents - (dollars * 100))/25;
        int dimes = (totalCents - (dollars * 100) - (quarters * 25))/10;
        int nickel = (totalCents - (dollars * 100) - (quarters * 25) - (dimes * 10))/5;
        System.out.println("dollars:"+dollars+"\t"+"quarters:"+quarters+"\t"+"dimes:"+dimes+"\t"+"nickel:"+nickel);
    }
}
