public class Employee1Imp {
    
    int a = 2;
    public void newMethod() {
        Employee1 emp1 = () -> {
            a = 3;
            return 20;
        };
        System.out.println(emp1.getEmpId());
    }
}
