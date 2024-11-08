package Lab4;

public class T5 {
    public static void main(String[] args) {
        int[] array1 = {2,4,6,8,10};
        int[] array2 = {8,10,12,14};

        int[] uniqueArray = mergeRemoveDupes(array1, array2);

        System.out.println("Merged array with unique values:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeRemoveDupes(int[] array1, int[] array2) {
        int[] tempArray = new int[array1.length + array2.length];
        int size = 0;

        for (int num : array1) {
            if (!isDuplicate(tempArray, size, num)) {
                tempArray[size++] = num;
            }
        }
        for (int num : array2) {
            if (!isDuplicate(tempArray, size, num)) {
                tempArray[size++] = num;
            }
        }
        int[] uniqueArray = new int[size];
        for (int i = 0; i < size; i++) {
            uniqueArray[i] = tempArray[i];
        }

        return uniqueArray;
    }
    public static boolean isDuplicate(int[] array, int size, int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
