//Java Program to reverse words in a String

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scanner.nextLine();
        reversedWord(str);
    }
    public static void reversedWord(String str) {
        String[] words = str.split(" ");
        String reversedString = "";
        for (String word : words) {
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println("Reversed words in string "+str+" are : "+reversedString);
    }
}
