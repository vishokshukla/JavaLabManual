//Java binary to octal conversion

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        long n = scanner.nextLong();
        System.out.println("The octal conversion of binary number "+n+" is : "+binary(n));
    }
    public static int binary(long n) {
        int decNumber = 0, i = 0;
        while (n > 0) {
            decNumber += Math.pow(2, i++) * (n % 10);
            n /= 10;
        }
        return Task39.octal(decNumber);
    }
}
