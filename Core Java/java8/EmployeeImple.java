public class EmployeeImple {
    public static void main(String[] args) {
        // anonymous inner class
        Employee emp = new Employee() {

            @Override
            public int getSalary() {
                return 6000;
            }

            @Override
            public String getRole() {
                return "software engineer";
            }
        };

        System.out.println(emp.getSalary());
        System.out.println(emp.getRole());
    }

}
