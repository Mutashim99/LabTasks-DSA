package lab8.Singly;


class Nodes {
    int data;
    Nodes next;
    Nodes(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedLists {
    private Nodes head;
    public boolean isEmpty() {
        return head == null;
    }
}

class CheckLinkedListEmpty {
    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
        if (list.isEmpty()) {
            System.out.println("The linked list is empty.");
        } else {
            System.out.println("The linked list is not empty.");
        }
    }
}
