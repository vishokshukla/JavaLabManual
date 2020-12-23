//Java program to count vowels and consonants in a String

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = scanner.nextLine();
        int cVowel = 0;
        int cConsonant = 0;
        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' ||ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
                cVowel++;
            else
                cConsonant++;
        }
        System.out.print("String '" + str+"' has " + cVowel + " vowels and " + cConsonant + " consonant.");
    }
}
