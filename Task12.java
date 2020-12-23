//Java Program to sort strings in alphabetical order

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter the no. of strings : ");
        int n = scanner1.nextInt();
        String[] str = new String[n];
        System.out.println("Enter the strings : ");
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            str[i] = scanner.nextLine();
        }
        System.out.println("The sorted strings are : ");
        sort(str);
    }
    public static void sort(String[] str) {
        for (int i = 0; i < str.length; i++) {
            for (int j = 1; j < str.length; j++) {
                if(str[j-1].compareTo(str[j])>0) {
                    String temp = str[j-1];
                    str[j-1] = str[j];
                    str[j] = temp;
                }
            }
        }
        for (String s : str) {
            System.out.println(s);
        }
    }
}
