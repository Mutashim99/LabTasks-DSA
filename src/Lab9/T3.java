package Lab9;

import java.util.Stack;

public class T3 {
    public static void main(String[] args) {
        int[] sequence = {10, 20, 30, 40, 50};
        Stack<Integer> stack = new Stack<>();
        for (int num : sequence) stack.push(num);
        System.out.println("Stack after pushing elements: " + stack);
        while (!stack.isEmpty()) System.out.println("Popped: " + stack.pop());
        if (stack.isEmpty()) System.out.println("The stack is empty.");
        else System.out.println("The stack is not empty.");
    }
}
