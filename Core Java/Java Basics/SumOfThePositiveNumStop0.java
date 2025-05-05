import java.util.Scanner;

public class SumOfThePositiveNumStop0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter The Number:- ");
        int sum = 0;
        int c = 0;

        while (c != 1) {
            int num = in.nextInt();
            if (num > 0) {
                sum = sum + num;
            } else if (num == 0) {
                c++;
                break;
            }
        }
        System.out.println("Sum Of all digits:- " + sum);

        in.close();
    }
}
