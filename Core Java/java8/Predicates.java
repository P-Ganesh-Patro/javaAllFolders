import java.io.BufferedReader;
import java.io.FileReader;
import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {
        Predicate<Double> predicate = marks -> marks > 600;
        try (BufferedReader br = new BufferedReader(new FileReader("studentList.txt"))) {
            String x;
            Double marks;
            while ((x = br.readLine()) != null) {
                String[] result = x.split(",");
                marks = Double.parseDouble(result[2]);
               if(predicate.test(marks)){
                System.out.println(result[1]);
               }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}