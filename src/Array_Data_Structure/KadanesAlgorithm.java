package Array_Data_Structure;
// Kadane's Algo is the fastest algorithm to find the maximum sum of sub array of an array
public class KadanesAlgorithm {
    public static void kadanesAlgo(int[] arr){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if(currentSum < 0){
                currentSum = 0;
            }
//            currentSum += arr[i];
            maxSum = Math.max(maxSum, currentSum);
        }
        if (maxSum == 0){
            for (int i = 0; i < arr.length; i++) {
                if(maxValue < arr[i])
                    maxValue = arr[i];
            }
            maxSum = maxValue;
        }
        System.out.println("Max sum of sub array: " + maxSum);
    }

    public static void main(String[] args) {
//        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] arr = {1,1,-2};
        kadanesAlgo(arr);
    }
}
