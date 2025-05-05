package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// distinct() , count, limit
public class StreamPart5 {
    public static void main(String[] args) {
        List<String> vechicleList = Arrays.asList("car", "bike", "bus", "car", "Truck");

        // distinct method
        List<String> distVechi = vechicleList.stream().distinct().collect(Collectors.toList());
        // System.out.println(distVechi);

        // count
        long count = vechicleList.stream().distinct().count();
        // System.out.println(count);

        // limit
        // vechicleList.stream().limit(vechicleList.size()).forEach(n ->
        // System.out.println(n));

        // count
        List<Integer> num = Arrays.asList(20, 32, 21, 23, 12, 42, 43, 42);
        long evenNum = num.stream().filter(n -> n % 2 == 0).count();
        System.out.println(evenNum);

        // min
        Optional<Integer> min = num.stream().min((a, b) -> a.compareTo(b));
        System.out.println(min.get());

        // min
        Optional<Integer> max = num.stream().max((a, b) -> a.compareTo(b));
        System.out.println(max.get());

        // reduce
        List<String> reduceMet = Arrays.asList("A", "b", "c", "5", "4");
        Optional<String> resultOfReduceMethod = reduceMet.stream().reduce((value, accumulater) -> {
            return value + accumulater;
        });
        System.out.println(resultOfReduceMethod.get());

        List<Integer> reduceMetNum = Arrays.asList(2, 2, 32, 12, 32, 3, 1);
        Optional<Integer> resultOfReduceNum = reduceMetNum.stream().reduce((value, accumulater) -> {
            return value + accumulater;
        });
        int numberReduce = reduceMetNum.stream().reduce(0, (a, b) -> a + b);
        System.out.println(numberReduce + " int");

    }

}
