//Java Program to swap two numbers using bitwise operator

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        swap(n,m);
    }
    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Swapped values are : "+ a +" and "+ b);
    }
}
