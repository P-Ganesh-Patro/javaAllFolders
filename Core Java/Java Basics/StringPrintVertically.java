import java.util.Scanner;

public class StringPrintVertically {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter The String:- ");
        String str = in.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            System.out.println(eachChar);
        }

        in.close();
    }

}
