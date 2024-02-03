package Array_Data_Structure;
// Kadane's Algo is the fastest algorithm to find the maximum sum of sub array of an array
public class KadanesAlgorithm {
    public static void kadanesAlgo(int[] arr){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(currentSum < 0){
                currentSum = 0;
            }
            currentSum += arr[i];
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Max sum of sub array: " + maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {-2, -3, -4, -5, -7, 9, -3, -2, -7, -1};
        kadanesAlgo(arr);
    }
}
