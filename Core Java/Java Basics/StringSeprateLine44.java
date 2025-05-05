import java.util.Scanner;

public class StringSeprateLine44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the Word:- ");
        String word = in.nextLine();
        String[] wordArray = word.split(" ");
        for (String ele : wordArray) {
            System.out.println(ele);

        }
        in.close();

    }

}
