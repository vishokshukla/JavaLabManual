//Java program to convert double to String

import java.util.Scanner;

public class Task56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a float value : ");
        double d = scanner.nextDouble();
        String str = String.valueOf(d);
        System.out.println("The string value of double "+d+" is : "+str);
    }
}
