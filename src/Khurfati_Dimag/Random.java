package Khurfati_Dimag;
public class Random {
  public static String captchaGeneration(int k){
    String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890?&^%$#@!";
    String captcha = "";
    for(int i=0; i<k; i++){
      int rand = Math.ceil(Math.random() * 70);
      captcha += str.charAt(rand);
    }
    return captcha;
  }
  public static void main(String[] args){
    System.out.println(captchaGeneration(k));
  }
}
