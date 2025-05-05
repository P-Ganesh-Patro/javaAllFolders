import java.util.Scanner;

public class WageCalculater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter The week day (From Monday to Sunday (1 to 7)):- ");
        int day = in.nextInt();
        System.out.print("Please Enter The Hours:- ");
        int hour = in.nextInt();

        int wageCalc = switch (day) {
            case 1, 2, 3 -> 200;
            case 4, 5 -> 400;
            case 6 -> 600;
            case 7 -> 800;
            default -> {
                System.out.println("Invalid day !! Please enter between 1 to 7...");
                yield 0;
            }

        };

        double totalWage = wageCalc * hour;

        if (totalWage > 2000) {
            totalWage += totalWage * 0.1;
        }

        System.out.println("Total wage:- " + totalWage);
        in.close();
    }
}
