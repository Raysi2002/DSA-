package Array_Data_Structure;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReversingArray { //Reversing an Array With Zero Space Complexity
    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start != end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 10, 12, 14, 16, 18, 20};
        reverseArray(arr);
    }
}
