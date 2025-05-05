public class PrintThe15Table {
    public static void main(String[] args) {
        printThe15Table();
    }

    static void printThe15Table() {
        int num = 15;
        for (int i = 1; i <= 10; i++) {
            // System.out.println(num + " * " + i + " = " + num * i);
            System.out.printf("%d x %d = %d%n", num, i, num * i);
        }
    }
}
