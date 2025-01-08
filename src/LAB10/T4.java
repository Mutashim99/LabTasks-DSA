package LAB10;

import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

class Garage {
    int capacity;
    Stack<String> stack;
    Map<String, Integer> movedCars;

    Garage(int capacity) {
        this.capacity = capacity;
        stack = new Stack<>();
        movedCars = new HashMap<>();
    }

    void carArrives(String licensePlate) {
        if (stack.size() < capacity) {
            stack.push(licensePlate);
            movedCars.putIfAbsent(licensePlate, 0);
            System.out.println("Car " + licensePlate + " arrived. Room available in garage.");
        } else {
            System.out.println("Car " + licensePlate + " arrived. No room in garage. Car leaves.");
        }
    }
    void carDeparts(String licensePlate) {
        if (stack.contains(licensePlate)) {
            Stack<String> tempStack = new Stack<>();
            int moves = 0;
            while (!stack.isEmpty() && !stack.peek().equals(licensePlate)) {
                tempStack.push(stack.pop());
                moves++;
            }

            if (!stack.isEmpty() && stack.peek().equals(licensePlate)) {
                stack.pop();
            }

            // Restore the cars back to the stack
            while (!tempStack.isEmpty()) {
                stack.push(tempStack.pop());
            }

            movedCars.put(licensePlate, moves);
            System.out.println("Car " + licensePlate + " departed. Car was moved " + moves + " times.");
        } else {
            System.out.println("Car " + licensePlate + " not in the garage.");
        }
    }
}

class CarGarage {
    public static void main(String[] args) {
        Garage garage = new Garage(3);

        garage.carArrives("ABC123");
        garage.carArrives("XYZ456");
        garage.carArrives("LMN789");
        garage.carArrives("PQR101");

        garage.carDeparts("ABC123");
        garage.carDeparts("XYZ456");
        garage.carDeparts("LMN789");
    }
}
