import java.io.BufferedWriter;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}

try (BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"))) {
    bw.write("Hello, World!");
    bw.newLine();
    bw.write("Java File Handling");
}

List <String> list = new ArrayList<>();