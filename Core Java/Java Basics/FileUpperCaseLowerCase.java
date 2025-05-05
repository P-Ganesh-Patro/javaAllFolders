import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class FileUpperCaseLowerCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fileName = "/home/ganeswar/textFile.txt";
        // file create
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            System.out.println("please enter the message to file:- ");
            String words = in.nextLine();
            fos.write(words.getBytes());

            fos.close();
            System.out.println("File saved..");

        } catch (Exception e) {
            System.out.println("Error:- " + e.getMessage());
        }

        // read file
        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        try {
            FileReader fis = new FileReader(fileName);
            int i;
            while (true) {
                i = fis.read();
                if (i == -1) {
                    break;
                }
                char eachEle = (char) i;

                if (Character.isUpperCase(eachEle)) {
                    upperCaseCount++;
                } else if (Character.isLowerCase(eachEle)) {
                    lowerCaseCount++;
                } else {
                    continue;
                }

            }
            fis.close();
            System.out.println("uppercase:-" + upperCaseCount);
            System.out.println("lowercase:- " + lowerCaseCount);

        } catch (Exception e) {
            System.out.println("Error:- " + e.getMessage());
        }
        in.close();

    }

}
