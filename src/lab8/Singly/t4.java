//package lab8.Singly;
//
//class NodeNew {
//    int data;
//    NodeNew next;
//
//    NodeNew(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//class SinglyLinkedList {
//    private NodeNew head;
//    public void insertAtBeginning(int data) {
//        NodeNew newNode = new NodeNew(data);
//        newNode.next = head;
//        head = newNode;
//    }
//    public void displayList() {
//        if (head == null) {
//            System.out.println("The list is empty.");
//            return;
//        }
//        NodeNew temp = head;
//        System.out.print("List: ");
//        while (temp != null) {
//           System.out.print(temp.data + " ," );
//            temp = temp.next;
//       }
//       System.out.print("null");
//        System.out.println("]");
//    }
//    public int findMiddle() {
//        if (head == null) {
//            throw new IllegalStateException("The list is empty.");
//        }
//        NodeNew slow = head;
//        NodeNew fast = head;
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        return slow.data;
//    }
//}
//
//class LinkedListOperations {
//    public static void main(String[] args) {
//        SinglyLinkedList list = new SinglyLinkedList();
//
//        list.insertAtBeginning(10);
//        list.insertAtBeginning(20);
//        list.insertAtBeginning(30);
//        list.insertAtBeginning(40);
//        list.insertAtBeginning(50);
//
//        list.displayList();
//
//        int middle = list.findMiddle();
//        System.out.println("Middle element: " + middle);
//    }
//}
