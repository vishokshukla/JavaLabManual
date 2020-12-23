//Java Program to check Palindrome string using Recursion

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = scanner.nextLine();
        if(isPalindrome(str))
            System.out.print("The string is palindrome.");
        else
            System.out.print("The string isn't palindrome.");
    }
    public static boolean isPalindrome(String str) {
        if(str.length() == 0 || str.length() == 1)
            return true;
        if(str.charAt(0)==str.charAt(str.length()-1))
            return isPalindrome(str.substring(1,str.length()-1));
        return false;
    }
}
