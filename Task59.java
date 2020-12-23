//Java Program to print Floyd’s triangle

import java.util.Scanner;

public class Task59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no. of row : ");
        int n = scanner.nextInt();
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + "   ");
                k++;
            }
            System.out.println();
        }
    }
}
