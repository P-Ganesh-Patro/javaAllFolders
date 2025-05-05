import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File1 {
    public static void main(String[] args) {

        // create a file

        File myFile = new File("file1.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        // write a file
        try (
                FileWriter myFileWriter = new FileWriter("file1.txt")) {
            myFileWriter.write("this is ganesh from srikakulam... Ap \nhey India");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // read file
        File myFileReader = new File("myOwnFile.txt");
        try {
            Scanner sc = new Scanner(myFileReader);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);

            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // delete file
        // File myDeleteFile = new File("myOwnFile.txt");
        // if (myDeleteFile.delete()) {
        //     System.out.println("file deleted.. " + myDeleteFile.getName());
        // } else {
        //     System.out.println("File is not deleted...");
        // }

    }
}
