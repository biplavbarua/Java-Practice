import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class DateClass {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
    }
}