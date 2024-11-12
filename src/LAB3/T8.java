package LAB3;

public class T8 {
    public static void main(String[] args) {
        int num = 12345678;
        int digits = countDigits(num);
        System.out.println("The number of digits in " + num + " is: " + digits);
    }
    public static int countDigits(int n) {
        if (n ==0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }
}