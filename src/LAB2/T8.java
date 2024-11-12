package LAB2;

import java.util.Scanner;

class T8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int hashCode = input.hashCode();
        System.out.println("HashCode of \"" + input + "\": " + hashCode);
    }
}