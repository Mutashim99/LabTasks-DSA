package LAB2.T9;

import java.util.Objects;

public class Employee {
    int id;
    String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee9 = (Employee) o;
        return id == employee9.id && Objects.equals(name, employee9.name);
    }
    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }
}