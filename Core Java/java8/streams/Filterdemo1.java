package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filterdemo1 {
    public static void main(String[] args) {
        // ArrayList<Integer> al = new ArrayList<Integer>();
        // al.add(20);
        // al.add(23);
        // al.add(25);
        // al.add(21);
        // al.add(27);
        List<Integer> al = Arrays.asList(20, 30, 21, 53, 32, 12);
        List<Integer> evenNum = new ArrayList<Integer>();
        // evenNum = al.stream().filter(x-> x % 2 ==0 ).collect(Collectors.toList());
        // System.out.println(evenNum);

        // al.stream().filter(x -> x % 2 == 0).forEach(n -> System.out.print(n + " "));
        // al.stream().filter(x -> x % 2 == 0).forEach(System.out::print);
        /*
         * List<String> alStr = Arrays.asList("ganeshp", "lokesh", "manoj", "varma",
         * "saikran");
         * List<String> longNames = new ArrayList<String>();
         * alStr.stream().filter(str -> str.length() > 5 && str.length() <
         * 8).forEach(x->System.out.println(x));
         * alStr.stream().filter(str -> str.length() > 5 && str.length() <
         * 8).forEach(System.out::println);
         * 
         * longNames = alStr.stream().filter(str -> str.length() > 5 && str.length() <
         * 8).collect(Collectors.toList());
         * 
         * System.out.println(longNames);
         */
        List<String> nullStr = Arrays.asList("ganeshp", null, "lokesh", "manoj", null, "varma", "saikran");
        List<String> nullValues = new ArrayList<String>();
        nullValues = nullStr.stream().filter(x -> x != null).collect(Collectors.toList());
        System.out.println(nullValues);

    }

}
