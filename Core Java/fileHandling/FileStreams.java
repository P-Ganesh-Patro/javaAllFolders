import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStreams {
    public static void main(String[] args) {
        try {

            FileOutputStream fileOutp = new FileOutputStream("dios.txt");
            String data = "good morning";
            byte[] toByte = data.getBytes();
            fileOutp.write(toByte);
            fileOutp.close();
            System.out.println("file is created...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
