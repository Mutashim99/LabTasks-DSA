//package lab8.Singly;
//class Node {
//    int data;
//    Nodes next;
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//class LinkedList {
//    private Nodes head;
//    public void addNode(int data) {
//        Nodes newNodes = new Nodes(data);
//        if (head == null) {
//            head = newNodes;
//        } else {
//            Nodes temp = head;
//            while (temp.next != null) {
//                temp = temp.next;
//            }
//            temp.next = newNodes;
//        }
//    }
//    public void printList() {
//        Nodes temp = head;
//        System.out.print("[");
//        while (temp != null) {
//            System.out.print(temp.data + " ," );
//            temp = temp.next;
//        }
//        System.out.print("null");
//        System.out.println("]");
//    }
//    public Nodes getHead() {
//        return head;
//    }
//    public static LinkedLists mergeLists(Nodes head1, Nodes head2) {
//        if (head1 == null || head2 == null) {
//            throw new IllegalArgumentException("Both linked lists must have equal size and be non-empty.");
//        }
//        LinkedLists mergedList = new LinkedLists();
//        Nodes pointer1 = head1;
//        Nodes pointer2 = head2;
//        while (pointer1 != null && pointer2 != null) {
//            mergedList.addNode(pointer1.data);
//            mergedList.addNode(pointer2.data);
//            pointer1 = pointer1.next;
//            pointer2 = pointer2.next;
//        }
//        if (pointer1 != null || pointer2 != null) {
//            throw new IllegalArgumentException("The two linked lists must have the same size.");
//        }
//        return mergedList;
//    }
//}
// class MergeEqualLinkedLists {
//    public static void main(String[] args) {
//        LinkedLists list1 = new LinkedLists();
//        LinkedLists list2 = new LinkedLists();
//        list1.addNode(99);
//        list1.addNode(95);
//        list1.addNode(320);
//        list2.addNode(75);
//        list2.addNode(87);
//        list2.addNode(74);
//        System.out.println("List 1:");
//        list1.printList();
//        System.out.println("List 2:");
//        list2.printList();
//        LinkedLists mergedList = LinkedLists.mergeLists(list1.getHead(), list2.getHead());
//        System.out.println("Merged List:");
//        mergedList.printList();
//    }
//}
