package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMap {
    public static void main(String[] args) {
        Employee e1 = new Employee(10, "ganesh", 6000);
        Employee e2 = new Employee(11, "saikiran", 10000);
        Employee e3 = new Employee(12, "ram ", 30000);
        Employee e7 = new Employee(13, "manoj", 9000);
        Employee e6 = new Employee(14, "varma", 8000);
        Employee e5 = new Employee(15, "john", 10000);
        Employee e4 = new Employee(16, "mani", 7000);

        List<Integer> emp1 = new ArrayList<>();
        List<Employee> emp = Arrays.asList(e1, e2, e3, e4, e5, e6, e7);
        emp1 = emp.stream()
                .filter(e -> e.salary >= 8000)
                .map(e -> e.salary).collect(Collectors.toList());
        System.out.println(emp1);

    }

}

class Employee {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

}
