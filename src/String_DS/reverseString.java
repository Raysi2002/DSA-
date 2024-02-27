package String_DS;
import java.util.Scanner;
public class reverseString {
    public static String reverseString(String str){
        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString += str.charAt(i);
        }
        return reverseString;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.println(reverseString(str));
    }
}
