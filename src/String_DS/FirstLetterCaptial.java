package String_DS;

public class FirstLetterCaptial {

    public static void main(String[] args) {
        String str = "hello this is aashish ray from cse";
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            String c = "";
            newStr = String.valueOf(Character.toUpperCase(str.charAt(i)));
        }
        System.out.println(newStr);
    }
}
