import java.util.Scanner;
import java.io.FileReader;

public class FileRederDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the file Name:- ");
        String fileName = in.nextLine();

        try {
            FileReader fileReader = new FileReader(fileName);
            int ch;
            // while (true) {
            // ch = fileReader.read();
            // if (ch == -1) {
            // break;
            // }
            // System.out.println((char) ch);
            // }

            while ((ch = fileReader.read()) != -1) {
                System.out.println((char) ch);
            }
            fileReader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        in.close();

    }

}
