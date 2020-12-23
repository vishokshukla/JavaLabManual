//Java hexadecimal to decimal conversion

import java.util.Scanner;

public class Task40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the hexadecimal number :  ");
        String str = scanner.nextLine();
        System.out.println("The decimal conversion of hexadecimal number "+str+" is : "+hexToDecimal(str));
    }
    public static int hexToDecimal(String str) {
        String digits = "0123456789ABCDEF";
        str = str.toUpperCase();
        int val = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
}
