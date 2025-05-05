import java.util.Scanner;

public class Display5NumberInputTotalAvg {
    public static void main(String[] args) {

        display5NumberInputTotalAvg();
    }

    public static void display5NumberInputTotalAvg() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter The Input:- ");
        int total = 0;
        int num;
        for (int i = 0; i < 5; i++) {
            num = in.nextInt();
            total = total + num;
        }
        int avgTotal = total / 5;

        System.out.println(avgTotal);
        in.close();

    }
}
