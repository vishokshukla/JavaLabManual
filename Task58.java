//Java program to convert long to String

import java.util.Scanner;

public class Task58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a long value : ");
        long l = scanner.nextLong();
        System.out.println("The string value of long "+l+" is : "+String.valueOf(l));
    }
}
