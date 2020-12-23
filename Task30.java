//Java Program to find square root of a number without sqrt method

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the digit : ");
        int n = scanner.nextInt();
        System.out.println("The square root of "+n+" is : "+sqrt(n));
    }
    public static double sqrt(int number) {
        double temp;
        double sr = number / 2;
        do {
            temp = sr;
            sr = (temp + (number / temp)) / 2;
        } while ((temp - sr) != 0);
        return sr;
    }
}
