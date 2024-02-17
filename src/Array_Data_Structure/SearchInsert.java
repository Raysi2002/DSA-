package Array_Data_Structure;
public class SearchInsert {
    public static int searchInsert(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }
        int low = 0;
        int high = arr.length-1;
        int mid = (low+high)/2;
        while(low<high){
            if(arr[mid] <= target && arr[mid+1] >= target)
                return mid+1;
            else if(arr[mid] > target)
                high = mid;
            else
                low = mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }
}
