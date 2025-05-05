package javaPractive;

public class ThreadClass {

    public static void main(String[] args) {
        
        Thread t = new Thread();
        System.out.println(t.currentThread().getName());
        System.out.println(t.currentThread().getPriority());

    }
    
}
