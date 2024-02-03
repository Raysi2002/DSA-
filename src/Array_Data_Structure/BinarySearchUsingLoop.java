package Array_Data_Structure;

public class BinarySearchUsingLoop {
    public static int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length;
//        int mid = (low + high) / 2;
        for (int i = low; i < high; i++) {
            int mid = (low + high) / 2;
            if(arr[mid] == key)
                return mid;
            else if(arr[mid] > key)
                high = mid;
            else if(arr[mid] < key)
                low = mid ;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(arr, 9));
    }
}
