//Java Program to print Armstrong numbers between a given range

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int l = scanner.nextInt();
        int h = scanner.nextInt();
        for (int i = l; i <= h; i++) {
            int sum = 0;
            int temp = i;
            while(temp!=0) {
                int rem = temp%10;
                sum = sum + (int) Math.pow(rem,3);
                temp = temp/10;
            }
            if(i == sum)
                System.out.println(i + " ");
        }
    }
}
