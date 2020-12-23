//Java Program to check if a given number is perfect square

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        double n = scanner.nextFloat();
        double rt = Math.sqrt(n);
        if(Math.pow(rt,2) == n) {
            System.out.println("The number is perfect square.");
        }
        else
            System.out.println("The number is not perfect square.");
    }
}
