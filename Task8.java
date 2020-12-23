//Java Program to calculate power of a number

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        double number = scanner.nextFloat();
        System.out.print("Enter the power : ");
        int power = scanner.nextInt();
        double result = pow(number, power);
        System.out.print("The result is : " + result);
    }
    public static double pow(double number, int power) {
        double res = 1;
        for(int i = 0; i< power; i++) {
            res = res*number;
        }
        return res;
    }
}
