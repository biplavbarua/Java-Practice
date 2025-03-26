import java.time.LocalDateTime;
import java.time.ZonedDateTime;

class DateClass {
    public static void main(String[] args) {
        LocalDateTime abc = LocalDateTime.now();
        System.out.println(abc);
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);
    }
}