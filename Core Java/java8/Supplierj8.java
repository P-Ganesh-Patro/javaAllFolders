import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Supplierj8 {
    public static void main(String[] args) {
        Supplier<Integer> supply = () -> {
            int a = 20;
            int b = 32;
            return a + b;
        };
        System.out.println(supply.get());

        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> func = (x) -> {
            int a = 10;
            int b = 20;
            return a + b + x;

        };
        Consumer<Integer> consum = (x) -> System.out.println(x);
        Supplier<Integer> suppli = () -> 14;

        if (predicate.test(suppli.get())) {
            consum.accept(func.apply(suppli.get()));

        }

    }

}
