public class Delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("This is a sample test.");
        sb.delete(5, 8);
        System.out.println(sb.toString());
    }
}