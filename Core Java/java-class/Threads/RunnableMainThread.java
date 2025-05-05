package Threads;

public class RunnableMainThread {
    public static void main(String[] args) {
        RunnableChildClass rc = new RunnableChildClass();
        Thread th = new Thread(rc);
        th.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main-> " + i);
        }
    }

}
