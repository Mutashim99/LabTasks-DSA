package LAB3;

import java.util.Scanner;

public class T9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean result = isPalindrome(str);
        if(result == true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }}
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;}
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;}
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}