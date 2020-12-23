//Java Program to reverse an array

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Reversed array is : ");
        reverseArray(array);
    }
    public static void reverseArray(int[] arr) {
        int j = arr.length-1;
        int i = 0;
        int temp = 0;
        while(i<j)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k : arr) {
            System.out.println(k+" ");
        }
    }
}
