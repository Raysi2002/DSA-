package Array_Data_Structure;

public class TrappedRainWater {
    public static int trappedRainWater(int[] arr){
        if(arr.length <= 2){
            return 0;
        }
        int n = arr.length;
//        {4, 2, 0, 6, 3, 2, 5};
//        Calculating left max boundry
        int[] leftMaxBoundry = new int[n];
        leftMaxBoundry[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMaxBoundry[i] = Math.max(arr[i], leftMaxBoundry[i-1]);
        }
//        Calculating right max boundry
        int[] rightMaxBoundry = new int[n];
        rightMaxBoundry[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMaxBoundry[i] = Math.max(arr[i], rightMaxBoundry[i+1]);
        }
//        Total trapped water
        int totalWaterTrapped = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMaxBoundry[i], rightMaxBoundry[i]);
            totalWaterTrapped += waterLevel - arr[i];
        }
        return totalWaterTrapped;
    }
    public static void main(String[] args) {
//        int[] arr = {1, 2};
//        int[] arr = {4, 2, 0, 6, 3, 2, 5};
//        int[] arr = {7, 6, 5, 4, 3, 2, 1};
//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedRainWater(arr));
    }
}
