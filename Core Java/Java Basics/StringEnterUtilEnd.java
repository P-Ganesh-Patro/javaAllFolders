
import java.util.*;

public class StringEnterUtilEnd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Name type 'END' to stop:- ");
        StringBuffer strWord = new StringBuffer();

        while (true) {
            String text = in.nextLine();
            if (text.equalsIgnoreCase("END")) {
                break;
            } else if (strWord.length() > 0) {
                strWord.append(" - ");
            }
            strWord.append(text);
        }

        System.out.println("names are " + strWord);

        in.close();

    }

}
