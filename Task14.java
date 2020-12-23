//Java Program to perform bubble sort on Strings

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of strings : ");
        int n = scanner.nextInt();
        String[] str = new String[n];
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter Strings : ");
        for(int i = 0; i<n; i++) {
            str[i] = scanner1.nextLine();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if(str[j-1].compareToIgnoreCase(str[j])>0) {
                    String temp = str[j-1];
                    str[j-1] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("Sorted strings are : ");
        for (String s : str) {
            System.out.println(s+" ");
        }
    }
}
