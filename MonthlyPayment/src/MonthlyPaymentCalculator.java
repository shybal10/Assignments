
/**
 * gets the payment status after each month
 * @author shybal
 * @version 1.0
 */
public class MonthlyPaymentCalculator {
    public static void main(String[] args) {
        // Math.random() * (MAX - MIN) + MIN
        CalculatePayment( Math.random() * 99 + 1);
    }

    /**
     * calculate payment status after each month
     * @param monthlyPayment paid each month
     */
    private static void CalculatePayment(double monthlyPayment) {
        double balance = 1000;
        int month = 1;
        System.out.println(monthlyPayment);
        double totalPayments = 0;
        while (balance >= 0) {
            System.out.print("month: "+month+"\t");
            balance = balance + (balance * (1.5/100)) - monthlyPayment;
            totalPayments = totalPayments + monthlyPayment;
            System.out.printf("balance: %.2f",balance);
            System.out.printf("\t\t\t\t total payments: %.2f",totalPayments);
            System.out.println();
            month++;
        }
    }
}
