package streams;

import java.util.Arrays;
import java.util.List;

public class ToArrayListStream {
    public static void main(String[] args) {

        List<String> reduceMet = Arrays.asList("A", "b", "c", "5", "4");
        Object arr[] = reduceMet.stream().toArray();
        
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }
}
