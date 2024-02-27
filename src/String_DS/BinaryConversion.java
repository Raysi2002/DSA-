package String_DS;
import java.util.Scanner;
public class BinaryConversion {
    public static String toBinary(int num){
        StringBuilder str = new StringBuilder();
        while(num != 0){
            int rem = 0;
            rem = num % 2;
            str.append(rem);
            num /= 2;
        }
        return str.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to convert into Binary: ");
        int num = sc.nextInt();
        System.out.println(toBinary(num));
    }
}
