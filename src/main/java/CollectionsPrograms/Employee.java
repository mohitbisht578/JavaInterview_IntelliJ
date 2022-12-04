package CollectionsPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Employee {

    int id;
    public Employee(int id) {
        this.id = id;
    }

    //equals and hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


class Demo {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1);
        Employee emp2 = new Employee(1);

        Map<Employee, String> map1 = new HashMap<>();
        map1.put(emp1, "Jack");
        map1.put(emp2, "Jack");

        System.out.println(map1.size()); //2 -> make it to 1 size it should not add duplicate value
        System.out.println(map1.entrySet());

        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(i1, "one");
        map2.put(i2, "one");

        System.out.println(map2.size());  //1

        //Integer is wrapper class all the wrapper classess has already implemented the hashcode
        //and equals method into it
        //hashcode and equals method already been overridden to the wrapper classess
        //if two hashcode is same and their contents would be checked
        //if hashcode is same and content is same that would be a duplicate element

    }
}