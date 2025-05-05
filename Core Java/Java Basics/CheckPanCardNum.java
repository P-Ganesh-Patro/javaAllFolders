
import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckPanCardNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter The Pan Number:- ");
        String panNumber = in.nextLine().toUpperCase();
        boolean result = panNumberValidation(panNumber);
        if (result) {
            System.out.println(panNumber + " is valid Pan Number");
        } else {
            System.out.println(panNumber + " is not valid Pan Number");
        }
        in.close();
    }

    public static boolean panNumberValidation(String panNumber) {

        String checkPanNumber = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$";

        return Pattern.matches(checkPanNumber, panNumber);

    }
}
