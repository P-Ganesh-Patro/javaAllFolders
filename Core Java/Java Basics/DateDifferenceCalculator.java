import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DateDifferenceCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            System.out.print("Please enter Starting date (DD-MM-YYYY): ");
            String startDateStr = in.nextLine();
            Date startDate = simpleDateFormat.parse(startDateStr);

            System.out.print("Please enter Ending date (DD-MM-YYYY): ");
            String endDateStr = in.nextLine();
            Date endDate = simpleDateFormat.parse(endDateStr);

            long diffInMillies = endDate.getTime() - startDate.getTime();
            long daysBetween = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

            System.out.println("Number of days between " + startDateStr + " and " + endDateStr + " is: " + daysBetween + " days.");

        } catch (Exception e) {
            System.out.println("Invalid date format! Please enter date in DD-MM-YYYY format.");
        }

        in.close();
    }
}
