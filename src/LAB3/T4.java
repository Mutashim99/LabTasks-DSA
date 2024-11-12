package LAB3;

public class T4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = sumArray(arr, arr.length);
        System.out.println("The sum is: " + sum);
    }
    public static int sumArray(int[] array, int n) {
        if (n <= 0) {
            return 0;}
        return array[n -1] + sumArray(array, n -1);
    }
}