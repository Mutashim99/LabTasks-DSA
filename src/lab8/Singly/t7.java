package lab8.Singly;

class Node {
    int rollNumber;
    Node next;

    Node(int rollNumber) {
        this.rollNumber = rollNumber;
        this.next = null;
    }
}

class StudentLinkedList {
    private Node head;

    public void addStudent(int rollNumber) {
        Node newNode = new Node(rollNumber);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void appendList(StudentLinkedList otherList) {
        if (head == null) {
            head = otherList.head;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = otherList.head;
        }
    }

    public int countStudents() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void displayStudents() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.rollNumber + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

 class ManageStudentGroups {
    public static void main(String[] args) {
        StudentLinkedList group1 = new StudentLinkedList();
        StudentLinkedList group2 = new StudentLinkedList();

        group1.addStudent(99);
        group1.addStudent(302);
        group1.addStudent(95);

        group2.addStudent(75);
        group2.addStudent(74);
        group2.addStudent(87);

        System.out.println("Group 1:");
        group1.displayStudents();

        System.out.println("Group 2:");
        group2.displayStudents();

        group1.appendList(group2);

        System.out.println("Final list after appending Group 2 to Group 1:");
        group1.displayStudents();

        System.out.println("Total number of students in the final list: " + group1.countStudents());
    }
}
