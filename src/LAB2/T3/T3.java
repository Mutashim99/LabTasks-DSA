package LAB2.T3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class T3 {
    public static void main(String[] args) {
        Comparator<Employee> com = new Comparator<Employee>(){
            @Override
            public int compare(Employee i, Employee j) {
                if(i.yearOfJoin > j.yearOfJoin){
                    return 1;
                }
                return -1;
            }
        };
        ArrayList<Employee> emps = new ArrayList<>();
        emps.add(new Employee(1,"Rayyan","Male",2020));
        emps.add(new Employee(2,"Izhar","Male",2018));
        emps.add(new Employee(3,"Mutashim","Male",2016));
        emps.add(new Employee(4,"Shahzaib","Male",2006));
        emps.add(new Employee(5,"Riyan","Male",2024));

        Collections.sort(emps,com);
        System.out.println(emps);
    }
}