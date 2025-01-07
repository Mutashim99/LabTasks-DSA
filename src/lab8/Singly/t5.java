package lab8.Singly;

import java.util.Scanner;
class Person {
    String name;
    int age;
    double salary;
    Person next;
    Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.next = null;
    }}
class PersonLinkedList {
    private Person head;
    public void insertAt(int position, String name, int age, double salary) {
        Person newPerson = new Person(name, age, salary);
        if (position == 1) {
            newPerson.next = head;
            head = newPerson;
        } else {
            Person temp = head;
            for (int i = 1; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Invalid position.");
            } else {
                newPerson.next = temp.next;
                temp.next = newPerson;
            }}}
    public void deletePerson(String name) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        if (head.name.equals(name)) {
            head = head.next;
            System.out.println("Record with name " + name + " deleted.");
            return;
        }
        Person temp = head;
        while (temp.next != null && !temp.next.name.equals(name)) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Record not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Record with name " + name + " deleted.");
        }
    }
    public void displayList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Person temp = head;
        System.out.println("List of Persons:");
        while (temp != null) {
            System.out.println("Name: " + temp.name + ", Age: " + temp.age + ", Salary: " + temp.salary);
            temp = temp.next;
        }
    }
}
class LinkedListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonLinkedList personList = new PersonLinkedList();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter details for Person " + i);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            personList.insertAt(i, name, age, salary);
        }

        personList.displayList();

        System.out.println("\nInsert a new record at a specific position:");
        System.out.print("Enter position to insert: ");
        int position = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter age: ");
        int newAge = scanner.nextInt();
        System.out.print("Enter salary: ");
        double newSalary = scanner.nextDouble();
        personList.insertAt(position, newName, newAge, newSalary);

        System.out.println("\nUpdated List:");
        personList.displayList();

        scanner.nextLine();
        System.out.println("\nDelete a record by name:");
        System.out.print("Enter name to delete: ");
        String deleteName = scanner.nextLine();
        personList.deletePerson(deleteName);
        System.out.println("\nList after deletion:");
        personList.displayList();

    }
}
