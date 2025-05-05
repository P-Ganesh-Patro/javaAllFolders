import java.io.*;
import java.util.*;

public class UniqueNames {
    public static void main(String[] args) {
        String file1 = "names1.txt";
        String file2 = "names2.txt";
        
        Set<String> seenNames = new HashSet<>(); 
        List<String> uniqueNames = new ArrayList<>(); 
        
        readNamesFromFile(file1, seenNames, uniqueNames);
        readNamesFromFile(file2, seenNames, uniqueNames);
        
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
    
    private static void readNamesFromFile(String fileName, Set<String> seenNames, List<String> uniqueNames) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!seenNames.contains(line)) { 
                    seenNames.add(line);
                    uniqueNames.add(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + fileName);
        }
    }
}
