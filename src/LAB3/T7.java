package LAB3;

import java.util.ArrayList;
import java.util.List;

public class T7 {
    public static void main(String[] args) {
        int n = 10;
        List<Integer> arr = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            arr.add(0);
        }
        long result = fibonacci(n, arr);
        System.out.println("The " + n + "th term is: " + result);
    }
    public static Integer fibonacci(int n, List<Integer> arr) {
        if (n == 0) {
            return 0;}
        if (n == 1) {
            return 1;}
        if (arr.get(n) != 0) {
            return arr.get(n);}
        arr.set(n, fibonacci(n - 1, arr) + fibonacci(n - 2, arr));

        return arr.get(n);
    }
}