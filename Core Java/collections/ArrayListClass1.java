import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListClass1 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Harish", 30000.00, 123, "Full Time");
        Employee e2 = new Employee("John", 30000.00, 121, "Full Time");
        Employee e3 = new Employee("Naidu", 15000.00, 111, "Trainer");
        Employee e4 = new Employee("Pranav", 20000.00, 190, "Internship");
        Employee e5 = new Employee("Bishal", 13000.00, 110, "Trainer");
        ArrayList<Employee> emp = new ArrayList<Employee>();
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e5);
        emp.add(e4);
        Comparator<Employee> comparator = Comparator.comparing(Employee::getSalary).thenComparing(Employee::getEmployeeId);
        // System.out.println(comparator.reversed());
        emp.sort(comparator);
        ListIterator<Employee> empIterator = emp.listIterator();
        while (empIterator.hasNext()) {
            System.out.println(empIterator.next());
        }

        // for(Employee ele: emp){
        // System.out.println(ele.getName() + " - " + ele.getSalary());
        // }

    }

}

class Employee {
    String Name;
    double salary;
    int employeeId;

    public String getName() {
        return Name;
    }

    public double getSalary() {
        return salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public Employee(String name, double salary, int employeeId, String employeeType) {
        Name = name;
        this.salary = salary;
        this.employeeId = employeeId;
        this.employeeType = employeeType;
    }

    String employeeType;

    @Override
    public String toString() {
        return "Employee [Name=" + Name + ", salary=" + salary + ", employeeId=" + employeeId + ", employeeType="
                + employeeType + "]";
    }

}
