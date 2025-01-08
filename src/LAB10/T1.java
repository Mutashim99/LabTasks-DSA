package LAB10;

class T1 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node front, rear;

        Queue() {
            front = rear = null;
        }

        void enqueue(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        void dequeue() {
            if (front == null) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.println("Dequeued: " + front.data);
            front = front.next;
            if (front == null) {
                rear = null;
            }
        }

        void display() {
            if (front == null) {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = front;
            System.out.print("Queue: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display();

        queue.dequeue();
        queue.dequeue();

        queue.display();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
