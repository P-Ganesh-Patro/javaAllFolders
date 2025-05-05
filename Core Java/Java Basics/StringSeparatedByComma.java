
import java.util.Scanner;

public class StringSeparatedByComma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter The marks:- ");
        String marks = in.nextLine();

        String[] marksArray = marks.split(",");
        int total = 0;
        for (String mark : marksArray) {
            total += Integer.parseInt(mark.trim());

        }
        System.out.println("Total Marks:- " + total);

        in.close();

    }

}
