//Java String to Boolean

import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scanner.nextLine();
        System.out.println("The boolean value of string "+str+" is : "+bool(str));
    }
    public static boolean bool(String str) {
        boolean b = Boolean.parseBoolean(str);
        return b;
    }
}
