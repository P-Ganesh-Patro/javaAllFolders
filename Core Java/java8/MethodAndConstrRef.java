import java.util.Arrays;
import java.util.List;

public class MethodAndConstrRef {
    public static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> al = Arrays.asList("ganesh", "varma", "sagar");
        al.forEach(MethodAndConstrRef::print); // method reference

        al.forEach(x -> System.out.println(x)); // lambda experssion
    }

}
