import java.io.BufferedReader;
import java.io.FileReader;

public class FileMoreThan5Char {
    public static void main(String[] args) {
        String fileName = "/home/ganeswar/textFile.txt";
        try {
            BufferedReader fileRead = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = fileRead.readLine()) != null) {
                if (line.length() > 5) {
                    System.out.println(line);
                }
            }
            fileRead.close();

        } catch (Exception e) {
            System.out.println("Error:- " + e.getMessage());
        }

    }

}
