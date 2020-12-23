//Java Program to calculate compound interest

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount : ");
        double p = sc.nextFloat();
        System.out.print("Enter the interest rate (Quarterly) : ");
        double r = sc.nextFloat();
        System.out.print("Enter the time span in quarter : ");
        double t = sc.nextFloat();
        double ci = CI(p, r, t);
        System.out.println("The compound interest for entered details is : " +CI(p, r, t));
    }

    private static double CI(double p, double r, double t) {
        double a = p*Math.pow((100+r)/100, t);
        return a-p;
    }
}
