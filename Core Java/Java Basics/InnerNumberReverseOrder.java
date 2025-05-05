import java.util.*;

public interface InnerNumberReverseOrder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        reverseNumber(num);
        in.close();
    }

    public static void reverseNumber(long num) {
        long revreseNum = 0;
        while (num > 0) {
            long mod = num % 10;
            revreseNum = revreseNum * 10 + mod;
            num = num / 10;
        }
        System.out.println(revreseNum);

    }
}
