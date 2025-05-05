import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;

public class CalendarClass {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 03);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));

        Date currentDate = new Date();
        // System.out.println(currentDate);
        long time = currentDate.getTime();

        // System.out.println(time);

        // SimpleDateFormat formatter = new SimpleDateFormat("EEEEEE, dd-MM-yyyy");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String dateFormatter = formatter.format(currentDate);
        System.out.println(dateFormatter);

        // DateFormat dateFormatShort = DateFormat.getDateInstance(DateFormat.SHORT);
        // DateFormat dateFormatLong = DateFormat.getDateInstance(DateFormat.LONG);
        // DateFormat dateFormatMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);
        // DateFormat dateFormatFull = DateFormat.getDateInstance(DateFormat.FULL);
        // System.out.println(dateFormatShort.format(currentDate));
        // System.out.println(dateFormatMedium.format(currentDate));
        // System.out.println(dateFormatLong.format(currentDate));
        // System.out.println(dateFormatFull.format(currentDate));

    }

}
