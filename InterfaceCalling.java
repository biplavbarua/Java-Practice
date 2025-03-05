interface Callable {
    void call();
}

class Demo implements Callable {
    public void call() {
        System.out.println("Calling...");
    }
    public static void main(String[] args) {
        Callable d = new Demo();
        System.out.println((d instanceof Demo));
        System.out.println((d instanceof Callable));
    }
}