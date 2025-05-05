public class PrintEvenNumber1To50 {
    public static void main(String[] args) {
        printEvenNumber1To50();
    }

    public static void printEvenNumber1To50() {
        System.out.print("print all even numbers from 1 to 50:- ");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }
}
