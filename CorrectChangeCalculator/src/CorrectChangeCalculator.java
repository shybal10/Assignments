/**
 * returns the change in terms of moneyAvailable cents and dimes
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
        int moneyAvailable = totalCents/100;
        int quarters = (totalCents - (moneyAvailable * 100))/25;
        int dimes = (totalCents - (moneyAvailable * 100) - (quarters * 25))/10;
        int nickel = (totalCents - (moneyAvailable * 100) - (quarters * 25) - (dimes * 10))/5;
        System.out.println("moneyAvailable:"+moneyAvailable+"\t"+"quarters:"+quarters+"\t"+"dimes:"+dimes+"\t"+"nickel:"+nickel);
    }
}
