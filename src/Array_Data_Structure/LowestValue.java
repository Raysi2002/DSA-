package Array_Data_Structure;

public class LowestValue {
    public static int lowestValue(int[] arr){
        int lowest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(lowest > arr[i])
                lowest = arr[i];
        }
        return lowest;
    }
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 1, -22, -333, 999};
        System.out.println(lowestValue(arr));
    }
}
