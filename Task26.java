//Java Program to find Factorial of a number using Recursion

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the digit : ");
        int n = scanner.nextInt();
        int result = fact(n);
        System.out.println("The factorial of "+n+" is : "+result);
    }
    public static int fact(int digit) {
        if(digit==0 || digit == 1)
            return 1;
        return digit*fact(digit-1);
    }
}

