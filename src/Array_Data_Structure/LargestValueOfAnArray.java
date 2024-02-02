package Array_Data_Structure;

public class LargestValueOfAnArray {
    public static int largestValue(int[] arr){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(largest < arr[i])
                largest = arr[i];
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 1, -22, -333, 999};
        System.out.println(largestValue(arr));
    }
}
