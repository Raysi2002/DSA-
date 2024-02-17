package SetsOperation;
import java.util.*;
public class BasicOperations {
    public static HashSet<Integer> intersection(Integer[] A, Integer[] B){
        HashSet<Integer> setA = new HashSet<Integer>();
        HashSet<Integer> setB = new HashSet<Integer>();
        setA.addAll(Arrays.asList(A));
        setB.addAll(Arrays.asList(B));
        HashSet<Integer> intersectionData = setA;
        intersectionData.retainAll(setB);
        return intersectionData;
    }
    public static void main(String[] args) {
        Integer[] A = {1, 2, 4, 5, 6, 7};
        Integer[] B = {1, 2, 4, 5, 6, 7};
//        int[] a = {1, 2, 4, 5, 6, 7};
//        int[] b = {1, 2, 4, 5, 6, 7};

        System.out.println(intersection(A, B));
    }
}
