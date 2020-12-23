//Java program to convert String to long

import java.util.Scanner;

public class Task57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scanner.nextLine();
        System.out.println("The long value of string "+str+" is : "+strToLong(str));
    }
    public static long strToLong(String str) {
        long val = 0;
        try {
            val = Long.parseLong(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input.");
        }
        return val;
    }
}
