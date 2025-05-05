import java.io.*;
import java.util.*;

public class UniqueSortedNames {
    public static void main(String[] args) {
        String fileName = "names.txt";
        Set<String> nameSet = new TreeSet<String>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                nameSet.add(line.trim());
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        System.out.println("Unique names in sorted order:");
        for (String name : nameSet) {
            System.out.println(name);
        }
    }
}
