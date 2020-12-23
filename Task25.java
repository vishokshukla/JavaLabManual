//Java Program to Reverse a String using Recursion

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        System.out.print("Enter the string : ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.print("Reverse of string "+str+" is : "+reverseString(str));
    }
    public static String reverseString(String str) {
        if( str.isEmpty()) {
            System.out.print("String is empty.");
            return str;
        }
        else
            return reverseString(str.substring(1))+str.charAt(0);
    }
}
