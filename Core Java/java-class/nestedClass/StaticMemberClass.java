package nestedClass;

class StaticMemberClass {

    public class nestedClass {
        int a = 10;
        public Object nestedClass1;

        public void welcome() {
            System.out.println("Welcome to nested class");
        }
    }

        static public class nestedClass1 {
            public void welcome1() {
                System.out.println("welcome1 to nested class");
            }
        }
        

        public void main(String[] args) {
            StaticMemberClass smc = new StaticMemberClass();
            StaticMemberClass.nestedClass ns = smc.new nestedClass();
            // StaticMemberClass.nestedClass.nestedClass1 ns1 = ns.new nestedClass1();
            StaticMemberClass.nestedClass1 ns1 = new StaticMemberClass.nestedClass1();
            ns1.welcome1();
            ns.welcome();

        }

    
}