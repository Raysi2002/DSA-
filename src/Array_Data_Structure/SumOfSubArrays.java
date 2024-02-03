package Array_Data_Structure;

public class SumOfSubArrays {
    public static void SubArrays(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
//            int totalSum = 0;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int totalSum = 0;
                for (int k = start; k < end; k++) {
                    totalSum += arr[k];
//                    System.out.print(arr[k] + ",");
                }
                if (maxSum < totalSum){
                    maxSum = totalSum;
                }
                if (minSum > totalSum){
                    minSum = totalSum;
                }
                System.out.print("");
                System.out.println("Total Sum : " + totalSum);
            }
        }
        System.out.println("Max of sub array is: " + maxSum);
        System.out.println("Min sum of sub array is : " + minSum);
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, -3, 2, 9, 10};
        SubArrays(arr);
    }
}
