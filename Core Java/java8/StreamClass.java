import java.util.Arrays;

public class StreamClass {
    public static void main(String[] args) {
        int[] array = {28,43,21,45,22};
        int sum= Arrays.stream(array).filter(x-> x% 2 == 0).sum();
        System.out.println(sum);
    }
}

