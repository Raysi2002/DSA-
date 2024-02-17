package Array_Data_Structure;

import java.util.*;
public class DiagonalSum {
    public static int diagonalSum(int[][] nums){
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (i != j)
//                    return 0;
//            }
//        }
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i == j)
                    leftDiagonalSum += nums[i][j];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                if(i+j == nums.length -1)
                    rightDiagonalSum += nums[i][j];
            }
        }
//        System.out.println("Right Diagonal Sum: " + rightDiagonalSum);
//        System.out.println("Left Diagonal Sum: " + leftDiagonalSum);
        return rightDiagonalSum + leftDiagonalSum;
//        System.out.println("Right Diagonal Sum: " + rightDiagonalSum);
//        System.out.println("Left Diagonal Sum: " + leftDiagonalSum);
    }
    public static void main(String[] args) {
        int[][] arr = {{2, 0, 0, 0, 9}, {0, 1, 2, 3, 4}, {0, 5, 6, 1, 2}, {0, 1, 2, 8, 9}, {4, 0, 4, 3, 2}};
        int[][] nums = {{1, 2}, {3, 4}, {4, 5}};
        System.out.println(nums.length);
//        System.out.println(arr.length);
//        System.out.println(diagonalSum(arr));
    }
}
