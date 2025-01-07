//package lab8.Singly;
//
//class Student {
//    String name;
//    Student next;
//
//    Student(String name) {
//        this.name = name;
//        this.next = null;
//    }
//}
//
//class StudentLinkedList {
//    private Student head;
//
//
//    public void addStudent(String name) {
//        Student newStudent = new Student(name);
//        if (head == null) {
//            head = newStudent;
//        } else {
//            Student temp = head;
//            while (temp.next != null) {
//                temp = temp.next;
//            }
//            temp.next = newStudent;
//        }
//    }
//
//
//    public void viewList() {
//        if (head == null) {
//            System.out.println("The list is empty.");
//            return;
//        }
//        System.out.println("Student List:");
//        Student temp = head;
//        while (temp != null) {
//            System.out.println("Name: " + temp.name);
//            temp = temp.next;
//        }
//    }
//
//
//    public void insertAt(int position, String name) {
//        Student newStudent = new Student(name);
//        if (position == 1) {
//            newStudent.next = head;
//            head = newStudent;
//        } else {
//            Student temp = head;
//            for (int i = 1; i < position - 1 && temp != null; i++) {
//                temp = temp.next;
//            }
//            if (temp == null) {
//                System.out.println("Invalid position.");
//            } else {
//                newStudent.next = temp.next;
//                temp.next = newStudent;
//            }
//        }
//    }
//
//
//    public void searchStudent(String name) {
//        Student temp = head;
//        while (temp != null) {
//            if (temp.name.equals(name)) {
//                System.out.println("Student found: Name: " + temp.name);
//                return;
//            }
//            temp = temp.next;
//        }
//        System.out.println("Student not found.");
//    }
//
//
//    public void deleteStudent(String name) {
//        if (head == null) {
//            System.out.println("The list is empty.");
//            return;
//        }
//        if (head.name.equals(name)) {
//            head = head.next;
//            System.out.println("Student with name " + name + " deleted.");
//            return;
//        }
//        Student temp = head;
//        while (temp.next != null && !temp.next.name.equals(name)) {
//            temp = temp.next;
//        }
//        if (temp.next == null) {
//            System.out.println("Student not found.");
//        } else {
//            temp.next = temp.next.next;
//            System.out.println("Student with name " + name + " deleted.");
//        }
//    }
//}
//
//class StudentManagementSystem {
//    public static void main(String[] args) {
//        StudentLinkedList studentList = new StudentLinkedList();
//
//
//        studentList.addStudent("Mutashim");
//        studentList.addStudent("Izhar");
//        studentList.addStudent("Rayyan");
//        studentList.addStudent("Shahzaib");
//        studentList.addStudent("Riyan");
//        studentList.addStudent("Anas");
//        studentList.addStudent("Jazib");
//        studentList.addStudent("Ahmed");
//        studentList.addStudent("Ali");
//        studentList.addStudent("Zohaib");
//
//
//        System.out.println("Initial List:");
//        studentList.viewList();
//
//
//        System.out.println("\nInserting 'Hamza' at position 3...");
//        studentList.insertAt(3, "Hamza");
//        System.out.println("List after insertion:");
//        studentList.viewList();
//
//
//        System.out.println("\nSearching for 'Rayyan'...");
//        studentList.searchStudent("Rayyan");
//
//        System.out.println("\nSearching for 'Unknown'...");
//        studentList.searchStudent("Unknown");
//
//
//        System.out.println("\nDeleting 'Ali'...");
//        studentList.deleteStudent("Ali");
//        System.out.println("List after deletion:");
//        studentList.viewList();
//
//
//        System.out.println("\nDeleting 'Unknown'...");
//        studentList.deleteStudent("Unknown");
//    }
//}
