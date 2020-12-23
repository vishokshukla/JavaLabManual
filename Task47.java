//Java char to string conversion

import java.util.Scanner;

public class Task47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char ch = scanner.next().charAt(0);
        System.out.print("The string value of char "+ch+" is : "+ String.valueOf(ch));
    }
}
