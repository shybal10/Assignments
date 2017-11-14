import java.util.Scanner;

/**
 * creates a beautiful string
 * @author shybal
 * @version 1.0
 */
public class BeautifulStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        String string = input.next();
        System.out.println(getTotalMods(string));
    }

    /**
     * finds the number of modifications required to make a beautiful string
     * @param string of given length
     * @return number of modifications
     */
    private static int getTotalMods(String string) {
        return (string.length() - string.replaceAll("010", "").length()/3);
    }
}
