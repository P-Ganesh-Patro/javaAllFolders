package duke.choice;
// encapsulation

public class Employee {
    private String name;
    private int employeeId;
    private Double salary;

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmployeeId(191);
        emp.setName("saikiran");
        emp.setSalary(1098);

        System.out.println(emp.getEmployeeId());
        System.out.println(emp.getSalary());
        System.out.println(emp.getName());

    }
 
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("salary must be positive number...");
        }
    }
}