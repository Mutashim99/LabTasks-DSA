package LAB3;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int number  = sc.nextInt();
        int AllNums = SumAll(number);
        System.out.println(AllNums);
    }
    public static int SumAll(int number){
        if(number == 0){
            return 0;
        }
        return number + SumAll(number-1);
    }
}