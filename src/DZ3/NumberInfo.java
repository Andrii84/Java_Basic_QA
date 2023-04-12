package DZ3;

import java.util.Scanner;

public class NumberInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        String evenOdd = (number % 2 == 0) ? "even" : "odd";
        String posNeg = (number >= 0) ? "positive" : "negative";
        String simpleCompound = isPrime(number) ? "simple" : "compound";

        System.out.println("The number is " + evenOdd + ", " + posNeg + ", and " + simpleCompound + ".");
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}