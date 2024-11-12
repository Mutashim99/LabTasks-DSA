package LAB2;

import java.util.ArrayList;
import java.util.Scanner;

class T5{
    public static void main(String[] args) {
        ArrayList<Integer> sortedList = new ArrayList<>();

        sortedList.add(2);
        sortedList.add(5);
        sortedList.add(8);
        sortedList.add(12);

        sortedList.add(16);
        sortedList.add(20);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        if (k > 0 && k <= sortedList.size()) {
            int kthSmallest = sortedList.get(k - 1);
            System.out.println("The " + k + "-th smallest element is: " +
                    kthSmallest);
        } else {
            System.out.println("Invalid value of k. Please enter a value between 1 and " + sortedList.size());
        }
    }
}