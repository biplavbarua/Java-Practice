import java.util.Scanner;

public class DigitSumMatcher {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N;
        
        System.out.print("Enter an integer N (1 <= N <= 10^6): ");
        N = scanner.nextInt();
        
        int sumOfDigits = 0;
        int numberOfDigits = 0;
        int temp = N;
        
        do {
            sumOfDigits += temp % 10;
            temp /= 10;
            numberOfDigits++;
        } while (temp > 0);
        
        if (sumOfDigits == numberOfDigits) {
            System.out.println("The number of digits in " + N + " matches the sum of its digits.");
        } else {
            System.out.println("The number of digits in " + N + " does not match the sum of its digits.");
        }
        scanner.close();
    }
}