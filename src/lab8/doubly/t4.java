package lab8.doubly;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    private Node head;

    public void insertUnsorted(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println(data + " inserted into Unsorted LinkedList.");
    }

    public void insertSorted(int data) {
        Node newNode = new Node(data);
        if (head == null || head.data >= data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.data < data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        System.out.println(data + " inserted into Sorted LinkedList.");
    }
    public void display() {
        if (head == null) {
            System.out.println("The LinkedList is empty.");
            return;
        }
        Node temp = head;
        System.out.println("LinkedList elements:");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void clear() {
        head = null;
        System.out.print("");
    }
}
class LinkedListExample {
    public static void main(String[] args) {
        LinkedList unsortedList = new LinkedList();
        LinkedList sortedList = new LinkedList();
        System.out.println("Unsorted LinkedList:");
        unsortedList.insertUnsorted(5);
        unsortedList.insertUnsorted(3);
        unsortedList.insertUnsorted(8);
        unsortedList.display();

        unsortedList.clear();
        System.out.println("\nSorted LinkedList:");
        sortedList.insertSorted(5);
        sortedList.insertSorted(3);
        sortedList.insertSorted(8);
        sortedList.display();
    }
}
