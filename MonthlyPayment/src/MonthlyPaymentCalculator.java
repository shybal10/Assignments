/**
 * gets the payment status after each month
 * @author shybal
 * @version 1.0
 */
public class MonthlyPaymentCalculator {
    public static void main(String[] args) {
        CalculatePayment(100);
    }

    /**
     * calculate payment status after each month
     * @param monthlyPayment paid each month
     */
    private static void CalculatePayment(int monthlyPayment) {
        double balance = 1000;
        int i = 1;
        double totalPayments = 0;
        while (balance >= 0) {
            System.out.print("month: "+i+"\t");
            balance = balance + (balance * (1.5/100)) - monthlyPayment;
            totalPayments = totalPayments + monthlyPayment;
            System.out.print("balance: "+balance);
            System.out.println("\t\t\t\t total payments: "+totalPayments);
            i++;
        }
    }
}
