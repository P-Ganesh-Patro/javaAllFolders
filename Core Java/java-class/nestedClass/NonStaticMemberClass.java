package nestedClass;


public class NonStaticMemberClass {
    public class innerNonStaticClass{
     public void innerWelcome(){
        System.out.println("welcome inner non static member");
     }
    }

    public static void main(String[] args) {
        NonStaticMemberClass nons = new NonStaticMemberClass();
        NonStaticMemberClass.innerNonStaticClass nons1= nons.new innerNonStaticClass();
        nons1.innerWelcome();

    }

    
}
