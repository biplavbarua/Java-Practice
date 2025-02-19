public class Replace {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder ("Hello, how are you?");
        sb.replace(7, 10, "Who");
        sb.replace(13, sb.length(), "doing");
        System.out.println(sb.toString());
    }
}