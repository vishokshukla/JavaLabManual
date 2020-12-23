//Java Octal to Decimal conversion

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        System.out.println("The decimal conversion of octal no. "+n+" is : "+decimal(n));
    }
    public static int decimal(int n) {
        int decValue = 0;
        int base = 1;
        int temp = n;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
            decValue += last_digit * base;
            base = base * 8;
        }
        return decValue;
    }
}
