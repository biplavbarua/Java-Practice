import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class DateClass {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(LocalDate.now().format(formatter));
        LocalDate parsedDate = LocalDate.parse("2025-01-01", formatter);
        System.out.println("Parsed Date: " + parsedDate);
    }
}