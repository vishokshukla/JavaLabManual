//Java Program to convert binary to Decimal

import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        long n = scanner.nextLong();
        System.out.println("The decimal conversion of binary number "+n+" is : "+binToDec(n));
    }
    public static int binToDec(long num) {
        int decimalNumber = 0, i = 0;
        long remainder;
        while (num != 0)
        {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }
}
