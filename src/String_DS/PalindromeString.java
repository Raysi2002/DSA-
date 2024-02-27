package String_DS;
import java.util.Scanner;
public class PalindromeString {
    public static boolean isPalindrome(String str){
        String reverseString = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverseString += str.charAt(i);
        }
        return reverseString.compareTo(str) == 0;
    }
    public static boolean checkPalindrome(String str){
        StringBuffer sb = new StringBuffer(str);
        StringBuffer reverseString = sb.reverse();
        String tempString = reverseString.toString();
        if(tempString.compareTo(str) == 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check if palindrome or not: ");
        String str = sc.next();
        System.out.println(isPalindrome(str));
        System.out.println(checkPalindrome(str));
    }
}
