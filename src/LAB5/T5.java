package LAB5;

import java.util.Arrays;

public class T5 {
    public static void main(String[] args) {
        String[] words = {"Among Us", "FIFA", "Tomb Raider", "TEKKEN", "APEX", "VALO"};
        System.out.println("Unsorted Array (Strings): " + Arrays.toString(words));
        mergeSort(words);
        System.out.println("Sorted Array (Strings): " + Arrays.toString(words));
    }
    public static void mergeSort(String[] array) {
        if (array.length <= 1) {
            return;
        }
        int mid = array.length / 2;
        String[] left = Arrays.copyOfRange(array, 0, mid);
        String[] right = Arrays.copyOfRange(array, mid, array.length);
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }
    private static void merge(String[] array, String[] left, String[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
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

}
