//Java program for String to int conversion

import java.util.Scanner;

public class Task53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scanner.nextLine();
        System.out.println("The integer value of string "+str+" is : "+stringToInt(str));
    }
    public static int stringToInt(String str) {
        int val = 0;
        try {
            val = Integer.parseInt(str);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid String");
        }
        return val;
    }
}
