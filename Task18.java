//Java Program to Add the elements of an Array

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = scanner.nextInt();
        double[] arr = new double[n];
        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextFloat();
        }
        double sum = 0;
        for(int i =0; i<n;i++) {
            sum = sum + arr[i];
        }
        System.out.print("The sum of elements of array is : " + sum);
    }
}
