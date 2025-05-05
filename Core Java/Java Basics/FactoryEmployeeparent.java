public class FactoryEmployeeparent {
    int emp_id;
    String employee_name;
    int salary;

     FactoryEmployeeparent(int emp_id, String employee_name, int salary) {
        this.emp_id = emp_id;
        this.employee_name = employee_name;
        this.salary = salary;
    }
    void getEmployeeDetails(){
        System.out.println(emp_id);
        System.out.println(employee_name);
        System.out.println(salary);
    }

}
