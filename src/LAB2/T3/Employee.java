package LAB2.T3;

public class Employee implements Comparable<Employee> {
    int id;
    String name;
    String gender;
    int yearOfJoin;

    Employee(int id,String name,String gender,int year){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.yearOfJoin = year;
    }

    @Override
    public String toString() {
        return
                "yearOfJoin=" + yearOfJoin;
    }
    public int compareTo(Employee that){
        if(this.yearOfJoin > that.yearOfJoin)
            return 1;
        else
            return -1;
    }
}