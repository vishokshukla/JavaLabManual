//Java Program to Convert Decimal to Octal

import java.util.Scanner;

public class Task39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        System.out.println("The octal representation of deimal number "+n+" is : "+octal(n));
    }
    public static int octal(int n) {
        int rem;
        String octal="";
        char[] octalChars={'0','1','2','3','4','5','6','7'};
        while(n>0)
        {
            rem = n % 8;
            octal = octalChars[rem] + octal;
            n = n/8;
        }
        return Integer.parseInt(octal);
    }
}
