//Java Program to check whether input character is vowel or consonant

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char ch = sc.next().charAt(0);
        if((65 <= ch && ch <= 90) || (97 <= ch && ch <= 122)) {
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
                System.out.println(ch + " is a vowel.");
            else
                System.out.println(ch + " is a consonant.");
        } else
            System.out.println(ch + " is not an alphabet.");
    }
}
