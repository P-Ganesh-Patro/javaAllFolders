import java.util.TreeSet;
import java.util.regex.Pattern;
import java.util.Scanner;

public class AcceptEnd45 {
    public static void main(String[] args) {

        TreeSet<String> stringSet = new TreeSet<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the word:- ");
        String word = in.nextLine();
        try {
            String checkString = "^[A-Z]{1}[a-z]{1}[0-9]{1}$";
            while (true) {
                if (Pattern.matches(checkString, word)) {
                    stringSet.add(word);
                } else if (word == "end") {                 
                    break;
                }

            }
            System.out.println(word);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        in.close();
    }
}