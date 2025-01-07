package lab8.doubly;

class Employee {
    String name;
    String designation;
    String department;
    String companyName;
    Employee next;
    Employee prev;

    Employee(String name, String designation, String department, String companyName) {
        this.name = name;
        this.designation = designation;
        this.department = department;
        this.companyName = companyName;
        this.next = null;
        this.prev = null;
    }}
class EmployeeDoublyLinkedList {
    private Employee head;
    public void insertAtBeginning(String name, String designation, String department, String companyName) {
        Employee newEmployee = new Employee(name, designation, department, companyName);
        if (head != null) {
            newEmployee.next = head;
            head.prev = newEmployee;
        }
        head = newEmployee;
    }
    public void insertAtEnd(String name, String designation, String department, String companyName) {
        Employee newEmployee = new Employee(name, designation, department, companyName);
        if (head == null) {
            head = newEmployee;
        } else {
            Employee temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newEmployee;
            newEmployee.prev = temp;
        }}
    public void insertAtPosition(int position, String name, String designation, String department, String companyName) {
        if (position <= 1 || head == null) {
            insertAtBeginning(name, designation, department, companyName);
            return;
        }
        Employee newEmployee = new Employee(name, designation, department, companyName);
        Employee temp = head;
        for (int i = 1; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp.next == null) {
            insertAtEnd(name, designation, department, companyName);
        } else {
            newEmployee.next = temp.next;
            newEmployee.prev = temp;
            temp.next.prev = newEmployee;
            temp.next = newEmployee;
        }}
    public void searchEmployee(String name) {
        Employee temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Employee Found:");
                System.out.println("Name: " + temp.name + ", Designation: " + temp.designation +
                        ", Department: " + temp.department + ", Company: " + temp.companyName);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Employee not found.");}
    public void displayList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;}
        Employee temp = head;
        while (temp != null) {
            System.out.println("Name: " + temp.name + ", Designation: " + temp.designation +
                    ", Department: " + temp.department + ", Company: " + temp.companyName);
            temp = temp.next;
        }}}
class EmployeeManagement {
    public static void main(String[] args) {
        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.insertAtBeginning("Mutashim", "Manager", "HR", "SystemsLimited");
        list.insertAtEnd("Izhar", "Developer", "IT", "SystemsLimited");
        list.insertAtPosition(2, "Riyan", "Designer", "Marketing", "SystemsLimited");
        System.out.println("Employee List:");
        list.displayList();
        list.searchEmployee("Mutashim");
        list.searchEmployee("Izhar");
    }
}
