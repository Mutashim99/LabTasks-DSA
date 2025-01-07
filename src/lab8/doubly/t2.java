package lab8.doubly;
import java.util.Deque;
import java.util.LinkedList;
class Student {
    String name;
    int rollNo;
    String grade;
    Student(String name, int rollNo, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;}
    @Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Grade: " + grade;
    }}
class StudentDoublyLinkedList {
    private Deque<Student> deque;
    public StudentDoublyLinkedList() {
        deque = new LinkedList<>();}
    public void insertAtFirst(String name, int rollNo, String grade) {
        deque.addFirst(new Student(name, rollNo, grade));
    }
    public void insertAtLast(String name, int rollNo, String grade) {
        deque.addLast(new Student(name, rollNo, grade));
    }
    public void displayList() {
        if (deque.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.println("Student Records:");
        for (Student student : deque) {
            System.out.println(student);
        }}}
class DoublyLinkedListDemo {
    public static void main(String[] args) {
        StudentDoublyLinkedList studentList = new StudentDoublyLinkedList();
        studentList.insertAtFirst("Mutashim", 99, "A+");
        studentList.insertAtLast("Izhar", 302, "A");
        studentList.insertAtFirst("Riyan", 75, "A+");
        studentList.insertAtLast("Shahzaib", 74, "A+");
        studentList.displayList();
    }
}
