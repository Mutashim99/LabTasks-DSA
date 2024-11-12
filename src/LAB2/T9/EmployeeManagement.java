package LAB2.T9;

import java.util.HashSet;

class EmployeeManagement {
    private HashSet<Employee> employees = new HashSet<>();

    public boolean addEmployee(Employee employee) {
        if (employees.contains(employee)) {
            System.out.println("Employee already exists.");
            return false;
        } else {
            employees.add(employee);
            System.out.println("Employee added successfully.");
            return true;
        }
    }
    public boolean checkEmployee(Employee employee) {
        return employees.contains(employee);
    }
    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees in the record.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }
}