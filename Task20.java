//Java Program to sort an array in ascending order

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elments : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array in ascending order : ");
        sortAsc(arr);
    }
    public static void sortAsc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int x : arr) {
            System.out.println(x);
        }
    }
}
