public class Append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append( " World");
        sb.append( 123);
        System.out.println(sb.toString());
    }
}