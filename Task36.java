//Java Program for Linear Search

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter digits : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to search : ");
        int x = scanner.nextInt();
        if(linearSearch(arr,x))
            System.out.println(x+" exist in array.");
        else
            System.out.println(x+ " doesn't exist in array.");
    }
    public static boolean linearSearch(int[] arr, int x) {
        boolean flag = false;
        for (int value : arr) {
            if (x == value) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
