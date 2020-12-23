//Java program to convert int to String

import java.util.Scanner;

public class Task54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scanner.nextInt();
        String str = String.valueOf(n);
        System.out.println("The string value of integer value "+n+" is : "+str);
    }
}
