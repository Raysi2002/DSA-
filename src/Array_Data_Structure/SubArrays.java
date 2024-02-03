package Array_Data_Structure;

public class SubArrays {
    public static void printSubArrays(int[] arr){
        int totalSubArrays = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <=  end; k++) {
                    System.out.print(arr[k] + ", ");
//                    totalSubArrays++;
                }
                System.out.println();
                totalSubArrays++;
            }
            System.out.print("");
        }
        System.out.println( "Total sub arrays: " + totalSubArrays);
    }
    public static void main(String[] args) {
        int[] arr = {12, 23, 1, 8, 9};
        printSubArrays(arr);
    }
}
