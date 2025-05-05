import java.io.*;

public class MarksTextFoultTolerance {
    public static void main(String[] args) {
        String fileName = "marks.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {

                String[] marksArray = line.split(",");
                int totalMarks = 0;

                for (String mark : marksArray) {
                    try {
                        totalMarks += Integer.parseInt(mark.trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Error:- " + lineNumber + " " + mark);
                    }
                }
                System.out.println("Total marks for line " + lineNumber + ": " + totalMarks);

                lineNumber++;
            }

        } catch (Exception e) {
            System.out.println("error:- " + e.getMessage());
        }

    }
}