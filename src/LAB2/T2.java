package LAB2;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class T2{
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        stringList.add("GTA Liberty City Stories");
        stringList.add("GTA BALLAD OF TONY");
        stringList.add("GTA China town");
        stringList.add("GTA Vice City");
        stringList.add("GTA San Andreas");
        stringList.add("GTA IV");
        stringList.add("GTA V");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display all elements");
            System.out.println("2. Display the largest string");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.println("All elements in the list:");
                    for (String s : stringList) {
                        System.out.println(s);
                    }
                    break;

                case 2:
                    if (!stringList.isEmpty()) {
                        String largestString = Collections.max(stringList);
                        System.out.println("Largest string: " + largestString);
                    } else {
                        System.out.println("The list is empty.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);
    }
}