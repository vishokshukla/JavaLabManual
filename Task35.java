//Java Program to Find HCF and LCM of Two Numbers

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two digits : ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println("The HCF of " + n + " and " + m + " is : " + HCF(n,m));
        System.out.println("The LCM of " + n + " and " + m + " is : " + LCM(n,m));
    }
    public static int HCF(int a, int b) {
        if(a == 0)
            return b;
        if(b == 0)
            return a;
        if(a == b)
            return a;
        if(a>b)
            return HCF(a-b, b);
        return HCF(a, b-a);
    }
    public static int LCM(int a, int b) {
        return ((a*b)/HCF(a,b));
    }
}
