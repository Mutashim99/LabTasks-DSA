package Lab9;

import java.util.Stack;

public class T6 {
    public static void main(String[] args) {
        String infixExpression = "3 + 5 * (2 - 8)";
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Evaluation Result: " + evaluateInfix(infixExpression));
    }

    public static int evaluateInfix(String expression) {
        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();
        expression = expression.replaceAll("\\s+", "");

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
                operandStack.push(num);
            } else if (ch == '(') {
                operatorStack.push(ch);
            } else if (ch == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    processStacks(operandStack, operatorStack);
                }
                operatorStack.pop();
            } else if (isOperator(ch)) {
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

    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    public static int precedence(char operator) {
        return switch (operator) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            default -> 0;
        };
    }

    public static void processStacks(Stack<Integer> operandStack, Stack<Character> operatorStack) {
        int b = operandStack.pop();
        int a = operandStack.pop();
        char operator = operatorStack.pop();
        switch (operator) {
            case '+': operandStack.push(a + b); break;
            case '-': operandStack.push(a - b); break;
            case '*': operandStack.push(a * b); break;
            case '/': operandStack.push(a / b); break;
        }
    }
}
