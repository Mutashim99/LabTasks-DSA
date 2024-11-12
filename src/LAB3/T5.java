package LAB3;

public class T5 {
    public static void main(String[] args) {
        int n = 8;
        long factorial = factorial(n);
        System.out.println("The factorial of " + n + " is: " + factorial);
    }

    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}