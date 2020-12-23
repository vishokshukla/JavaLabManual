//Java Program to Calculate average of numbers using Array

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = scanner.nextInt();
        double[] arr = new double[n];
        System.out.print("Enter the values : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextFloat();
        }
        double sum = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            sum = sum + arr[i];
        }
        double avg = sum/n;
        System.out.print("Average of entered value is : " + avg);
    }
}
