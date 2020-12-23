//Java char to int conversion

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char ch = scanner.next().charAt(0);
        System.out.print("The integer value of character "+ch+" is : " + (int) (ch));
    }
}
