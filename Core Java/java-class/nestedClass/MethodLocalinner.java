package nestedClass;

public class MethodLocalinner {
    public void localInnerClass() {
        class LocalinnerClass {
            public void welcomeLocalInner() {
                System.out.println("welcome local inner class");
            }
        }
        LocalinnerClass in = new LocalinnerClass();
        in.welcomeLocalInner();

    }

    public static void main(String[] args) {
        MethodLocalinner mlc = new MethodLocalinner();
        mlc.localInnerClass();

    }
}