import java.util.*;

public class TakingInputWithoutMentioningArraySize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        while(sc.hasNextInt()){
            arr.add(sc.nextInt());
        }
        int[] arr1 = new int[arr.size()];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr.get(i);
        }
        System.out.println(Arrays.toString(arr1));
    }
}
