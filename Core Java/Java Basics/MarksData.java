import java.io.*;
import java.util.Random;

public class MarksData {
    public static void main(String[] args) {
        String fileName = "marks.data";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            Random random = new Random();
            for (int i = 0; i < 20; i++) {
                int mark = random.nextInt(101);
                bw.write(mark + (i < 19 ? "," : ""));
            }

            System.out.println("Added 20 marks into :- " + fileName);

        } catch (IOException e) {
            System.out.println("Error:- " + e.getMessage());
        }
    }

}
