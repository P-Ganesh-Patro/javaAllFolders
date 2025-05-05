import java.util.Arrays;
import java.util.Scanner;

public class FunctionReturnLargestNumber {
    public static void main(String[] args) {
        functionReturnLargestNumber();
    }
    static void functionReturnLargestNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The length Of The array:- ");
        int lengthOfArray = in.nextInt();
        System.out.println("please enter the values:- ");
        int[] arr = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
        in.close();
    }

}
