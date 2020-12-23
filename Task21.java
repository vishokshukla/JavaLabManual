//Java Program to convert char Array to String

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] ch;
        System.out.print("Enter length of array : ");
        int n = scanner.nextInt();
        ch = new char[n];
        System.out.println("Enter characters : ");
        for (int i = 0; i < n; i++) {
            ch[i] = scanner.next().charAt(0);
        }
        String str = "";
        for (int i = 0; i < n; i++) {
            str = str+ch[i];
        }
        System.out.println("Entered string is : "+str);
    }
}
