package LAB6;

import java.util.Arrays;

public class T3 {
    public static void main(String[] args) {
        int[] arr = {3, 5, -1, 1,2,};
        int n = arr.length;
        int size = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                arr[size++] = arr[i];
            }
        }

        int[] positiveArray = new int[size];
        for (int i = 0; i < size; i++) {
            positiveArray[i] = arr[i];
        }

        Arrays.sort(positiveArray);

        int missing = findMissingPositive(positiveArray);
        System.out.println("The smallest positive integer that is missing is : " + missing);
    }

    private static int findMissingPositive(int[] sortedArray) {
        int left = 0, right = sortedArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (sortedArray[mid] == mid + 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left + 1;
    }
}

