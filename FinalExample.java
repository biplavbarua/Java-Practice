class Example {
    final int value = 10;
    
    final void display() {
        System.out.println("Final method cannot be overridden.");
    }
}

public class FinalExample {
    public static void main (String[] args) {
        Example obj = new Example();
        obj.display();
        System.out.println("Final variable: " + obj.value);
    }
}