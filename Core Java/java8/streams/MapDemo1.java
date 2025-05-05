package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("active5g scooty", "Active3g scooty", "R15", "Access 125");
        List<String> vehiclesUpperCase = new ArrayList<>();
        List<Integer> vehiclesLength = new ArrayList<>();
        List<Integer> numberMul = new ArrayList<>();

        // without java8
        // for (String ele : vehicles) {
        // System.out.print(ele.toUpperCase() + " ");
        // }
        // for(String ele: vehicles){
        // vehiclesLength.add(ele.length());
        // }
        // with java8 stream
        vehiclesUpperCase = vehicles.stream().map(vehiclesName -> vehiclesName.toUpperCase())
                .collect(Collectors.toList());
        vehiclesLength = vehicles.stream().map(vehiclesLen -> vehiclesLen.length()).collect(Collectors.toList());
        // System.out.println(vehiclesUpperCase);
        System.out.println(vehiclesLength);
        // numberMul = vehiclesLength.stream().map(num-> num *
        // 3).collect(Collectors.toList());
        // System.out.println(numberMul);
        vehiclesLength.stream().map(n -> n * 3).forEach(n -> System.out.print(n + " "));

    }
}
