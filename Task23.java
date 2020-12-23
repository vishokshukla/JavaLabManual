//Java Program to Reverse a number using for, while loop and recursion

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        System.out.println("The reverse of number "+n+" using while loop is : "+reverseWhile(n));
        System.out.println("The reverse of number "+n+" using for loop is : "+reverseFor(n));
        System.out.print("The reverse of number "+n+" using recursion is : ");
        reverseRecursion(n);
    }
    public static int reverseWhile(int n) {
        int reverse = 0;
        while( n != 0 )
        {
            reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10;
        }
        return reverse;
    }
    public static int reverseFor(int n) {
        int reverse = 0;
        for( ;n != 0; n/=10)
        {
            reverse = reverse * 10;
            reverse = reverse + n%10;
        }
        return reverse;
    }
    public static void reverseRecursion(int n) {
        if (n < 10) {
            System.out.print(n);
            return ;
        } else {
            System.out.print(n % 10);
            reverseRecursion(n / 10);
        }
    }
}
