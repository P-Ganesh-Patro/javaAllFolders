public class FactoryEmployee {
    int bus_no;
    String emp_boards;

    public static void main(String[] args) {

        FactoryEmployeeparent emp1 = new FactoryEmployeeparent(102, "Ramesh", 20000);
        emp1.getEmployeeDetails();

    }

}
