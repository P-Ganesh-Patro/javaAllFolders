import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerJ8 {
    // Consumer in java8
    public static void main(String[] args) {
        Consumer<String> consum = s -> System.out.println(s);
        consum.accept("ganesh");
        Consumer<List<Integer>> consumer1 = li -> {
            Iterator<Integer> al = li.iterator();
            while (al.hasNext()) {
                System.out.println(al.next());
            }
        };

        Consumer<List<Integer>> consumer2 = li -> {
            Iterator<Integer> al = li.iterator();
            while (al.hasNext()) {
                System.out.println(al.next() % 2 == 0);
            }
        };

        consumer1.andThen(consumer2).accept(Arrays.asList(
                20, 30, 21, 43, 54, 78));
        // List<Integer> al = Arrays.asList(10, 202, 342, 12, 12);
        // consumer1.accept(al);

    }
}
