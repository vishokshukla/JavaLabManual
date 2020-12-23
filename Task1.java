//Java Program to Check Even or Odd Number

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(n%2 == 0)
            System.out.println("Entered no. " + n + " is even.");
        else
            System.out.println("Entered no. " + n + " is odd.");
    }
}
