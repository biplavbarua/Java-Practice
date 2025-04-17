import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "John Doe");
        employees.put(102, "Jane Smith");
        employees.put(103, "Emily Davis");

        System.out.println("Employee ID 102: " + employees.get(102));
        employees.remove(101);
        System.out.println("All Employees: " + employees);

        for (var entry: employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}