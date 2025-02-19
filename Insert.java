public class Insert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.insert(5, " World");
        sb.insert(11, " Java");
        sb.insert(0, "Welcome ");
        sb.insert(7, 123);
        System.out.println(sb.toString());
    }
}