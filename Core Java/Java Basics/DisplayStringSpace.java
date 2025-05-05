import java.util.Scanner;

public class DisplayStringSpace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter The String:- ");
        String str = in.nextLine();

        System.out.print("Spaces Positions are:- ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                System.out.print(i + " ");
            }
            System.out.println();

        }
        in.close();
    }

}
