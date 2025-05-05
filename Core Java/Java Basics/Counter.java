public class Counter {
    int count;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    Counter() {
        count = 0;
    }

    Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        System.out.println("Initial count (c1): " + c1.getCount());

        c1.increment();
        System.out.println("After increment (c1): " + c1.getCount());

        c1.decrement();
        System.out.println("After decrement (c1): " + c1.getCount());

        Counter c2 = new Counter(10);
        System.out.println("Initial count (c2): " + c2.getCount());

        c2.increment();
        System.out.println("After increment (c2): " + c2.getCount());

        c2.decrement();
        System.out.println("After decrement (c2): " + c2.getCount());

        c2.increment();
        System.out.println("After another increment (c2): " + c2.getCount());
    }
}
