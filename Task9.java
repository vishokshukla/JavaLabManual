//Java Program to Convert char to String and String to Char

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a char : ");
        char ch = scanner.next().charAt(0);
        System.out.println("The string value of character "+ch+" is : "+charToString(ch));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("The characters in string "+str+" are : ");
        stringToChar(str);
    }
    public static String charToString(char ch) {
        return String.valueOf(ch);
    }
    public static void stringToChar(String str) {
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        for (char c : ch) {
            System.out.println(c);
        }
    }
}
