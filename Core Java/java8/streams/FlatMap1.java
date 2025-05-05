package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FlatMap1 {
    public static void main(String[] args) {
        /*
         * List<Integer> l1 = Arrays.asList(10, 20, 30, 40, 32);
         * List<Integer> l2 = Arrays.asList(11, 21, 31, 41, 33);
         * List<Integer> l3 = Arrays.asList(12, 22, 32, 42, 33);
         * List<Integer> l4 = Arrays.asList(13, 22, 33, 41, 34);
         * List<List<Integer>> finalList = Arrays.asList(l1, l2, l3, l4);
         * 
         * // map
         * List<Integer> l1Result = l1.stream().map(n -> n +
         * 10).collect(Collectors.toList());
         * System.out.println(l1Result);
         */

        // flatMap
        // List<Integer> fr = finalList.stream().flatMap(x -> x.stream().map(n -> n +
        // 2)).collect(Collectors.toList());
        // System.out.println("flat map:-" + fr);

        ///////////////////////////////////
        ///
        ///
        List<String> list1 = Arrays.asList("saikiran", "varma", "prasad");
        List<String> list2 = Arrays.asList("vamsi", "eswar", "hemanth");
        List<String> list3 = Arrays.asList("ganesh", "lokesh", "venky");

        List<List<String>> totalList = Arrays.asList(list1, list2, list3);

        // before java8
        for (List<String> el : totalList) {
            for (String name : el) {
                System.out.print(name + " ");
            }
        }

        // with java8 streams

        totalList.stream().flatMap(n -> n.stream().map(m->m + "r eddy ")).forEach(n -> System.out.println(n + " "));
        totalList.stream().flatMap(n -> n.stream()).forEach(System.out::println);
        

    }
}
