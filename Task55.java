//Java program for string to double conversion

import java.util.Scanner;

public class Task55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scanner.nextLine();
        System.out.println("The double value of string "+str+" is : "+strDouble(str));
    }
    public static double strDouble(String str) {
        double val = 0;
        try {
            val = Double.parseDouble(str);
        } catch (NumberFormatException e){
            System.out.println("Invalid Input.");
        }
        return val;
    }
}
