//Java int to long conversion

import java.util.Scanner;

public class Task49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer value : ");
        int n = scanner.nextInt();
        System.out.println("The long value of integer value "+n+" is : "+(long)n);
    }
}
