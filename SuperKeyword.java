class Parent {
    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void display() {
        super.display();
        System.out.println("Child class method");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}