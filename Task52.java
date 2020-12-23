//Java Program to find ASCII value of a character

import java.util.Scanner;

public class Task52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch = scanner.next().charAt(0);
        System.out.println("The ASCII value of "+ch+" is : "+(int) ch);
    }
}
