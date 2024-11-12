package LAB2;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

class T7{
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        Collections.sort(numbers);
        System.out.println("Sorted Vector: " + numbers);
        System.out.println("Smallest number: " + numbers.firstElement());
        System.out.println("Largest number: " + numbers.lastElement());
    }
}