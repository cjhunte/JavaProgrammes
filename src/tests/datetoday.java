package tests;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public static class datetoday
{
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
            String formatted = format1.format(cal.getTime());
            System.out.println(formatted);
}
