package Threads;

public class MainThread {
    public static void main(String[] args) {
        System.out.println("In Main...");
        ChildThread ct = new ChildThread();
        ct.start();

        System.out.println("In Main Thread...");
        for (int i = 0; i < 20; i++) {
            System.out.println("Main-> " + i);
        }
        ct.setPriority(Thread.MAX_PRIORITY);
        if (ct.getPriority() == Thread.MAX_PRIORITY) {
            System.out.println("Thread is max Priority");
        }
        System.out.println("end of main");
    }

}
