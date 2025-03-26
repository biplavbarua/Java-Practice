import java.util.Date;
import java.util.Calendar;
public class DateClass {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 0);
        Date futureDate = calendar.getTime();
        System.out.println(futureDate);
    }
}