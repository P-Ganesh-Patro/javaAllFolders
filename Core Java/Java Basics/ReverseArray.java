import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("please enter 5 numbers:- ");
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        reverseNumber(arr);
        in.close();
    }

    public static void reverseNumber(int[] arr) { 
    
        int start = 0;
        int last = arr.length - 1;
        while (start < last) {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
        System.out.println(Arrays.toString(arr));
        

    }
}
