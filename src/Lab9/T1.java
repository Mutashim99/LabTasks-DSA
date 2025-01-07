package Lab9;

import java.util.Stack;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Yellow");
        stack.push("Green");
        stack.push("Orange");
        stack.push("Yellow");
        stack.push("Red");

        System.out.println("Original stack: " + stack);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the color of the ball to remove: ");
        String chosenColor = scanner.nextLine();

        Stack<String> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            String ball = stack.pop();
            if (!ball.equalsIgnoreCase(chosenColor)) {
                tempStack.push(ball);
            }
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        System.out.println("Updated stack: " + stack);

    }
}
