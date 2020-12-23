//Java long to int conversion

import java.util.Scanner;

public class Task48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the long number : ");
        long n = scanner.nextLong();
        System.out.println("The integer value of long value "+n+" is : "+ (int)n);
    }
}
