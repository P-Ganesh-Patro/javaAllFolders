import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamExample {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("outputFile1.txt");
            FileReader fileReader = new FileReader("outputFile1.txt");
            int charData;
            while ((charData = fileReader.read()) != -1) {
                fileWriter.write(charData);
            }
            fileReader.close();
            fileWriter.close();
            System.out.println("data is copied..");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

}
