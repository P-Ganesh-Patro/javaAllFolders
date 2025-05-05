import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FIleDataToUpperCase {
    public static void main(String[] args) throws IOException {
        String textField = "TextUpperCase.txt";
        String textFieldPath = Files.readString(Path.of(textField)).toUpperCase();
        Files.writeString(Path.of(textField), textFieldPath);

        System.out.println("Conent is convert to uppercase...");

        try (BufferedReader fr = new BufferedReader(new FileReader(textField)) ){
            char i;
            while ((i = (char) fr.read()) != -1) {
                System.out.println(i);
            }
            fr.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
