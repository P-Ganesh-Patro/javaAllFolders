import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BioPredConFunc {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPre = (a, b) -> {
            return a.length() == b;
        };
        System.out.println(biPre.test("manoj", 5));

        BiFunction<String, String, Integer> biF = (a, b) -> a.length() + b.toLowerCase().length();
        System.out.println(biF.apply("GANESH", "manoj"));

        BiConsumer<Integer, Integer> biCon = (x, y) -> System.out.println(x + y);
        biCon.accept(20, 43);

    }
}