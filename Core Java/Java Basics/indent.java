
import java.text.SimpleDateFormat;

import java.util.Date;;
public class indent {
    public static void main(String[] args) {
        // String animalsNames= "\nCow\nDog\nCat";
        // System.out.println(animalsNames.indent(5));

        Date currentDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String todayDate = formatter.format(currentDate);
		System.out.println(currentDate);
		System.out.println(todayDate);

    }
    
}
                    