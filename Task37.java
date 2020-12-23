//Java Program for Binary Search

import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers in sorted way : ");
        for (int i = 0 ; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to search : ");
        int x = scanner.nextInt();
        int i = binarySearch(arr, x, 0, arr.length);
        if(i > -1)
            System.out.println(x+" exist in array at "+(i+1)+".");
        else
            System.out.println(x+" doesn't exist in array.");
    }
    public static int binarySearch(int[] arr, int x, int l, int h) {
        if( l <= h) {
            int mid = (l+h)/2;
            if(arr[mid] == x)
                return mid;
            if(x > arr[mid])
                return binarySearch(arr, x, mid+1, h);
            else
                return binarySearch(arr, x, l,mid-1);
        } else
            return -1;
    }
}
