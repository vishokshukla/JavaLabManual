//Java Program to find GCD of two numbers

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println("The GCD of " + n + " and " + m + " is : " + GCD(n,m));
    }
    public static int GCD(int n, int m) {
        if(n == 0)
            return m;
        if(m == 0)
            return n;
        if(n == m)
            return n;
        if(n > m)
            return GCD(n-m, m);
        return GCD(n, m-n);
    }
}
