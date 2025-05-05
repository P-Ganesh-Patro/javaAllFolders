import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        long[] arr = new long[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.round(Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        // for (long a : arr) {
        //     System.out.println(a);
        // }
        // int pos = Arrays.binarySearch(arr, 40);
        // if(pos > 0){
        //     System.out.println("i found: - " + pos);
        // }
        // System.out.println("did not found");

        System.out.println();
    }

}
