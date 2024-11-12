package LAB3;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you full Name: ");
        String name = sc.nextLine();
        int length = name.length();
        reverseName(name,length-1);
    }
    public static void reverseName(String name , int length){
        if(length == -1){
            return;
        }
        System.out.print(name.charAt(length));
        reverseName(name,length-1);
    }
}
