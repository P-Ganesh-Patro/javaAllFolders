import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class AcceptString45 {
    public static void main(String[] args) {
        try {

            BufferedReader myFile = new BufferedReader(new FileReader("StringFile.txt"));
            StringBuilder content = new StringBuilder();
            String word;
            while ((word = myFile.readLine()) != null) {
                content.append(word.replaceAll("\\s+", " ")).append("\n");
            }

            myFile.close();

            BufferedWriter myFileWriter = new BufferedWriter(new FileWriter("StringFile.txt"));
            myFileWriter.write(content.toString().trim());
            System.out.println("File updated successfully...");

            myFileWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
