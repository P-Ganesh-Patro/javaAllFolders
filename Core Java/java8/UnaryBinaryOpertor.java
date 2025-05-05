import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryOpertor {
    public static void main(String[] args) {
        UnaryOperator<Integer> unOper = (x) -> x + 20 * 2;
        System.out.println(unOper.apply(2));
        UnaryOperator<String> unOper1 = x-> x.substring(0,5).toLowerCase();
        System.out.println(unOper1.apply("GanesH"));
        BinaryOperator<String> binaryOpt = (a,b)-> a.toLowerCase() + " " + b.toUpperCase();
        System.out.println(binaryOpt.apply("ganesh", "patro"));



    }
}