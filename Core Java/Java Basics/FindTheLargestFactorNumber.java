import java.util.Scanner;

public class FindTheLargestFactorNumber {

    public static void main(String[] args) {
        findTheLargestFactorNumber();
    }

    public static void findTheLargestFactorNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter The number:- ");
        int num = in.nextInt();
        int factNum = 0;
        for (int i = num / 2; i >= 1; i--) {
            if (num % i == 0) {
                factNum = i;
                break;
            }
        }
        System.out.println(factNum);
        in.close();

    }
}
