//package lab8.Singly;
//
//import java.util.Scanner;
//
//class Node {
//    int rollNumber;
//    Node next;
//
//    Node(int rollNumber) {
//        this.rollNumber = rollNumber;
//        this.next = null;
//    }
//}
//
//class StudentLinkedList {
//    private Node head;
//
//    public void addStudent(int rollNumber) {
//        Node newNode = new Node(rollNumber);
//        if (head == null) {
//            head = newNode;
//        } else {
//            Node temp = head;
//            while (temp.next != null) {
//                temp = temp.next;
//            }
//            temp.next = newNode;
//        }
//        System.out.println("Roll number " + rollNumber + " added.");
//    }
//
//    public void deleteStudent(int rollNumber) {
//        if (head == null) {
//            System.out.println("The list is empty. No roll number to delete.");
//            return;
//        }
//        if (head.rollNumber == rollNumber) {
//            head = head.next;
//            System.out.println("Roll number " + rollNumber + " deleted.");
//            return;
//        }
//        Node temp = head;
//        while (temp.next != null && temp.next.rollNumber != rollNumber) {
//            temp = temp.next;
//        }
//        if (temp.next == null) {
//            System.out.println("Roll number " + rollNumber + " not found.");
//        } else {
//            temp.next = temp.next.next;
//            System.out.println("Roll number " + rollNumber + " deleted.");
//        }
//    }
//
//    public void displayStudents() {
//        if (head == null) {
//            System.out.println("The list is empty.");
//            return;
//        }
//        System.out.println("Roll numbers of students:");
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.rollNumber + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//}
//
//class StudentRollNumberList {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        StudentLinkedList studentList = new StudentLinkedList();
//
//        for (int i = 0; i < 3; i++) {
//            System.out.print("Enter roll number to add: ");
//            int rollNumber = scanner.nextInt();
//            studentList.addStudent(rollNumber);
//        }
//
//        System.out.println("Displaying all roll numbers:");
//        studentList.displayStudents();
//
//        System.out.print("Enter roll number to delete: ");
//        int deleteRoll = scanner.nextInt();
//        studentList.deleteStudent(deleteRoll);
//
//        System.out.println("Displaying all roll numbers after deletion:");
//        studentList.displayStudents();
//
//        scanner.close();
//    }
//}
