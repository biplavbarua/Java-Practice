class Main{
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int n = 0;
        System.out.println("This is a while loop");
        while (n <= 10) {
            System.out.println(n);
            n++;
        }
        System.out.println("This is a do while loop");
        int m = 0;
        do {
            System.out.println(m);
            m++;
        } while (m <= 10);
    }
}