import java.util.Calendar;
import java.lang.String;
import java.util.TimeZone;

public class Calendar_class {
    public static void main(String[] args) {
        Calendar c1=Calendar.getInstance();
        System.out.println(c1.getTimeZone());


        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Kolkata"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
    }
}
 