import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
// https://github.com/P-Ganesh-Patro/JavaCalendar-Date

public class DateFormatClass {
    public static void main(String[] args) {
        Date current = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd/MM/yyyy");
        String dateString = formatter.format(current);
        // System.out.println(dateString);

        // another way
        // Date date = new Date();
        DateFormat dateFormatFull = DateFormat.getDateInstance( DateFormat.FULL);
        DateFormat dateFormatShort = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat dateFormatMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat dateFormatLong = DateFormat.getDateInstance(DateFormat.LONG);

        System.out.println(dateFormatShort.format(current));
        System.out.println(dateFormatMedium.format(current));
        System.out.println(dateFormatLong.format(current));
        System.out.println(dateFormatFull.format(current));

    }
}
