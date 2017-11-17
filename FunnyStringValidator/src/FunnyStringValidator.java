import java.util.Scanner;
public class FunnyStringValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalStrings = input.nextInt();
        String[] strings = new String[totalStrings];
        for (int i = 0; i < totalStrings; i++){
            strings[i] = input.next();
        }
        for (int i = 0; i < strings.length; i++) {
            if (isFunny(strings[i],getReverse(strings[i]))) {
                System.out.println("string is funny");
            } else {
                System.out.println("string is not funny");
            }
        }
    }
    private static boolean isFunny(String strings,String reverse) {
            for (int j = 1; j < strings.length(); j++) {
                if (Math.abs(strings.charAt(j) - strings.charAt(j-1)) != Math.abs(reverse.charAt(j) - reverse.charAt(j-1))) {
                    return false;
                }
            }
        return true;
    }
    private static String getReverse(String string) {
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse = reverse + string.charAt(i);
        }
        return reverse;
    }
}
