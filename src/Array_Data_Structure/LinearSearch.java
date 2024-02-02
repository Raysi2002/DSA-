package Array_Data_Structure;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {12, 76, 2, 11, 9, 33, 90};
//        linearSearch(arr, 2);
        System.out.println(linearSearch(arr, 2));
    }
}
