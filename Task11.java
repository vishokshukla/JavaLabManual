//Java Program to check Palindrome String

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) == str.charAt(str.length()-i-1))
                flag = true;
            else
                flag = false;
        }
        if (flag)
            System.out.print("String is palindrome.");
        else
            System.out.print("Not palindrome.");
    }
}
