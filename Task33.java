//Java Program to find Largest of three numbers

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
         int a = scanner.nextInt();
         int b = scanner.nextInt();
         int c = scanner.nextInt();
         System.out.println("Largest of "+a+", "+b+" & "+c+" is : "+largest(a,b,c));
    }

    private static int largest(int a, int b, int c) {
        int temp = a > b ? a : b;
        return temp > c ? temp : c;
    }
}
