
class TrialError {
    /*
    * Create the method long power(int, int) here.
    */
    long power(int m, int n) {
        try {
            if (m < 0 || n < 0) {
                throw new Exception("n or p should not be negative.");
            }
            if (m == 0 || n == 0) {
                throw new Exception("n and p should not be zero.");
            }
        }

         catch (Exception e) {
         System.out.println("n or p should not be negative.");
         }
        return (long) Math.pow(m,n);
    }

}