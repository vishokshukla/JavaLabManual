//Java program to convert Boolean to String

import java.util.Scanner;

public class Task44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the boolean value  :");
        boolean bool = scanner.nextBoolean();
        System.out.print("String value of boolean "+bool+" is : "+string(bool));
    }
    public static String string(boolean bool) {
        String str = String.valueOf(bool);
        return str;
    }
}
