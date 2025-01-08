package LAB10;

class QueueUsingArray {
    static class Queue {
        int[] arr;
        int front, rear, size, capacity;

        Queue(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue is full, cannot enqueue.");
                return;
            }
            rear = (rear + 1) % capacity;
            arr[rear] = data;
            size++;
        }

        void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty, cannot dequeue.");
                return;
            }
            System.out.println("Dequeued: " + arr[front]);
            front = (front + 1) % capacity;
            size--;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
            return arr[front];
        }

        boolean isEmpty() {
            return size == 0;
        }

        boolean isFull() {
            return size == capacity;
        }

        int size() {
            return size;
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }
            System.out.print("Queue: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();

        System.out.println("Peek: " + queue.peek());

        queue.dequeue();
        queue.dequeue();

        queue.display();

        System.out.println("Size: " + queue.size());

        queue.enqueue(60);
        queue.display();

        queue.enqueue(70);
    }
}
