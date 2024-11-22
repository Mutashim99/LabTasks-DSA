package LAB6;
import java.util.Arrays;
public class T2 {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        Arrays.sort(numbers);
        int elementToSearch = 5;
        int index = Arrays.binarySearch(numbers, elementToSearch);
        if (index >= 0) {
            System.out.println("Element " + elementToSearch + " found at " + index);
        } else {
            System.out.println("Element " + elementToSearch + " not found.");
        }
    }
}
