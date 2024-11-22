package LAB5;

import java.util.Scanner;

public class T6{

    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }
    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the list: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        mergeSort(numbers);
        System.out.print("Sorted: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
