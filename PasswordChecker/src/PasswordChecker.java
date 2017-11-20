import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        validatePassword();
    }
    private static void validatePassword() {
        while (true) {
            boolean containsCapitalLetters = false;
            boolean containsSmallLetter = false;
            boolean containsNumbers = false;
            System.out.println("enter your password");
            Scanner input = new Scanner(System.in);
            String password = input.next();
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) >= (char) 65 && password.charAt(i) <= (char) 90) {
                    containsCapitalLetters = true;
                }
                if (password.charAt(i) >= (char) 97 && password.charAt(i) <= (char) 122) {
                    containsSmallLetter = true;
                }
                if (password.charAt(i) >= (char) 48 && password.charAt(i) <= (char) 57) {
                    containsNumbers = true;
                }
            }
            if (containsCapitalLetters && containsSmallLetter && containsNumbers) {
                System.out.println("Acceptable Password");
                return;
            }else {
                System.out.println("that password is not acceptable");
            }
        }
    }
}
