import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) {

        try {
            // FileWriter createFile = new FileWriter("Lucentt.txt");
            // createFile.write("this is created File...");
            // createFile.close();
            // System.out.println("file created success..");
            FileReader fileReader = new FileReader("Lucentt.txt");
            int byteData;
            while ((byteData = fileReader.read()) != -1) {
                System.out.print((char) byteData + " ");

            }
            fileReader.close();
            System.out.println("file reading success...");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
