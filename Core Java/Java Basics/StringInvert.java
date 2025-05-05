
import java.util.Scanner;

public class StringInvert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter The word: ");

        StringBuffer strBuffer = new StringBuffer();
        String text = in.nextLine();

        for (char ch : text.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                strBuffer.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                strBuffer.append(Character.toUpperCase(ch));
            } else {
                strBuffer.append(ch);
            }
        }

        System.out.println("Inverted Case String: " + strBuffer.toString());
        in.close();
    }
}
