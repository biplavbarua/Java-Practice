import java.util.ArrayDeque;
public class DequeAsStack {
    public static void main(String[] args) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        String str = "Hello";

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}