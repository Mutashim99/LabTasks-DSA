package LAB5;

public class T1 {
    public static void selectionSortWithLocations(int[] array) {
        int n = array.length;
        for (int k = 0; k < n - 1; k++) {
            int loc = k;
            for (int j = k + 1; j < n; j++) {
                if (array[j] < array[loc]) {
                    loc = j;
                }
            }
            int temp = array[k];
            array[k] = array[loc];
            array[loc] = temp;
        }
    }
    public static void printArrayWithLocations(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Value: " + array[i] + " | Location: " + i);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {77,5,1,99,0,-8};
        selectionSortWithLocations(array);

        System.out.println("Sorted Array:");
        printArrayWithLocations(array);
    }
}
