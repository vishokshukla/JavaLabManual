//Java Program to convert decimal to hexadecimal

import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the decimal number : ");
        int n = scanner.nextInt();
        System.out.println("The hexadecimal conversion of decimal number "+n+" is : "+decToHex(n));
    }
    public static String decToHex(int n) {
        int rem;
        String hex="";
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(n>0)
        {
            rem = n % 16;
            hex = hexchars[rem] + hex;
            n = n / 16;
        }
        return hex;
    }
}
