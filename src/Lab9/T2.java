package Lab9;

import java.util.Stack;

public class T2 {
    public static void main(String[] args) {
        String expression = "6+1*9+5";
        System.out.println("Expression: " + expression);
        System.out.println("Result: " + evaluate(expression));
    }

    public static int evaluate(String expression) {
        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                operandStack.push(ch - '0');
            } else if (ch == '+' || ch == '*') {
                while (!operatorStack.isEmpty() && precedence(ch) <= precedence(operatorStack.peek())) {
                    processStacks(operandStack, operatorStack);
                }
                operatorStack.push(ch);
            }
        }

        while (!operatorStack.isEmpty()) {
            processStacks(operandStack, operatorStack);
        }

        return operandStack.pop();
    }

    private static int precedence(char operator) {
        if (operator == '*') return 2;
        if (operator == '+') return 1;
        return 0;
    }

    private static void processStacks(Stack<Integer> operandStack, Stack<Character> operatorStack) {
        int b = operandStack.pop();
        int a = operandStack.pop();
        char operator = operatorStack.pop();
        if (operator == '+') operandStack.push(a + b);
        else if (operator == '*') operandStack.push(a * b);
    }
}
