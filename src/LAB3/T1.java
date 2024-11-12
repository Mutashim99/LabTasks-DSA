package LAB3;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("ENter any Number: ");
        int Number = inp.nextInt();
        reverseNew(Number);
    }

    public static int reverseNew(int k){
        if(k==0){
            return 1;
        }
        System.out.println(k);
        return reverseNew(k-1);
    }
}