//Java program to break integer into digits

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scanner.nextInt();
        String str = Integer.toString(n);
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        System.out.println("Digits are : ");
        for (char c : arr) {
            System.out.print(c + " ");
        }
    }
}
