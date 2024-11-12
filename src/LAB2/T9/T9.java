package LAB2.T9;

class T9 {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();

        Employee emp1 = new Employee(101, "Rayyan");
        Employee emp2 = new Employee(102,"Izhar");
        Employee emp3 = new Employee(101,"Rayyan");

        employeeManagement.addEmployee(emp1);
        employeeManagement.addEmployee(emp2);
        employeeManagement.addEmployee(emp3);

        System.out.println("Employee exists: " +
                employeeManagement.checkEmployee(emp1));

        System.out.println("All Employees:");
        employeeManagement.displayEmployees();
    }
}