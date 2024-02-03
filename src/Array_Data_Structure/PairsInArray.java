package Array_Data_Structure;

public class PairsInArray {
    //Finding all the possible pairs of an array
    public static void arrayPairs(int[] arr){
        int totalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] != arr[j]){
                    System.out.print( "(" + arr[i] + "," + arr[j] + ")" );
                    totalPairs++;
                }
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + totalPairs);
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 8, 0, 33};
        arrayPairs(arr);
    }
}
