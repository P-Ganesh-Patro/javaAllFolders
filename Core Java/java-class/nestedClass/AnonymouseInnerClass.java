package nestedClass;

public class AnonymouseInnerClass{
    public void show(){
        System.out.println("i am show method...");
    }
    public static void main(String[] args) {


        AnonymouseInnerClass ac = new AnonymouseInnerClass(){
            public void show(){
                System.out.println("i am show method... as a AnonymouseInnerClass");
            }
        };
        ac.show();
    }
}
