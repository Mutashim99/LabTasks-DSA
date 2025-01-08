package LAB10;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    StackUsingQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    void push(int x) {
        queue1.add(x);
    }

    int pop() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        int poppedElement = queue1.poll();
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return poppedElement;
    }

    int peek() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        int topElement = queue1.peek();
        queue2.add(queue1.poll());
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return topElement;
    }

    boolean isEmpty() {
        return queue1.isEmpty();
    }
}

class Main {
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
