
import java.util.Scanner;

public class RandomNumbersArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter The Array of Elements:- ");
        int array[] = new int[10];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
            sum += array[i];

        }
        int average = sum / 10;

        System.out.println(average);

        for (int num : array) {
            if (num > average) {
                System.out.println("Number is greater than array of element:- " + num);
            }
        }
        in.close();
    }

}
