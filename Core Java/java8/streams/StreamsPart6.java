package streams;

import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// sort
public class StreamsPart6 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 3, 21, 6, 43, 34, 3, 3);
        List<String> list1Str = Arrays.asList("ashok", "ganesh", "Harish", "john");
        List<String> list1Str1 = Arrays.asList("pranva", "gowtham", "abhishek reddy", "sagar");

        List<Integer> list1Sorted = new ArrayList<>();

        // sorted
        list1Sorted = list1.stream().distinct().sorted().collect(Collectors.toList()); // default asending
        list1Sorted = list1.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList()); // reverse-order
        // list1Str.stream().sorted().forEach(n -> System.out.print(n + " "));

        // list1Str.stream().sorted(Comparator.reverseOrder()).forEach(n ->
        // System.out.println(n));
        // System.out.println(list1Sorted);

        Set<String> fruits = new HashSet<>();
        fruits.add("mangos");
        fruits.add("appsle");
        fruits.add("mangso");
        fruits.add("appsle");
        fruits.add("orasnge");
        fruits.add("grasph");

        // anyMatch (any one)
        // boolean res = fruits.stream().anyMatch(n-> n.equals("Mango"));
        boolean res = fruits.stream().anyMatch(n -> n.startsWith("man"));
        // System.out.println(res);

        // allMatch

        boolean allMatch = fruits.stream().allMatch(n -> n.length() >= 6);
        // System.out.println(allMatch);

        // none match
        boolean noneMatch = fruits.stream().noneMatch(n -> n.startsWith("a"));
        // System.out.println(noneMatch);

        // findAny
        Optional<String> findAny = list1Str.stream().findAny();
        // System.out.println(findAny.get());

        // findFirst
        Optional<String> findFirst = list1Str.stream().findFirst();
        System.out.println(findFirst.get());

        // concatenating stream
        Stream<String> stream1 = list1Str1.stream();
        Stream<String> stream2 = list1Str1.stream();
        Stream.concat(stream1, stream2).forEach(n -> System.out.println(n));

    }

}
