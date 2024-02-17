package Array_Data_Structure.ArraySortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minPos] > arr[j])
                    minPos = j;
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
