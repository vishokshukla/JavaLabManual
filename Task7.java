//Java Program to find quotient and remainder

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        System.out.print("Enter the dividend : ");
        int dividend = sc.nextInt();

        System.out.print("The quotient is " + number/dividend + " and the remainder is " + number%dividend + ".");

    }
}
