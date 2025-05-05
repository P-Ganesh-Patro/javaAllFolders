package java8;

interface Parent {
    default void sayHi() {
        System.out.println("say Hii.....");
    }
}

class Child implements Parent {

    @Override
    public void sayHi() {
        System.out.println("say hello Good morning..");
    };

};

public class LambdaExperssion{
    public static void main(String[] args) {
        Parent p = new Child();
        p.sayHi();

    }
}
