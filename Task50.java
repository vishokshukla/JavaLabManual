//Java Program to Convert Decimal to Binary

import java.util.Scanner;

public class Task50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scanner.nextInt();
        System.out.println("The binary conversion of decimal number "+n+" is : ");
        decToBin(n);
    }
    public static void decToBin(int n) {
        int[] binary = new int[40];
        int index = 0;
        while(n > 0){
            binary[index++] = n%2;
            n = n/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }
}
