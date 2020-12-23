// Java Program to add two binary numbers

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two binary number : ");
        long b1 = sc.nextLong();
        long b2 = sc.nextLong();
        int i = 0, carry = 0;
        int[] sum = new int[10];
        long temp1 = b1;
        long temp2 = b2;
        while (b1 != 0 || b2 != 0)
        {
            sum[i++] = (int)((b1 % 10 + b2 % 10 + carry) % 2);
            carry = (int)((b1 % 10 + b2 % 10 + carry) / 2);
            b1 = b1 / 10;
            b2 = b2 / 10;
        }
        if (carry != 0) {
            sum[i++] = carry;
        }
        --i;
        System.out.print("Sum of binary numbers "+temp1+" and "+temp2+" is : ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
    }
}
