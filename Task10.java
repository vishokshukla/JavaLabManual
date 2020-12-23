//Java Program to find duplicate characters in a String

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = scanner.nextLine();
        System.out.print("The duplicate characters are : ");
        findDupli(str);
    }
    public static void findDupli(String str) {
        char[] ch = str.toCharArray();
        int count = 0;
        for(int i = 0; i<str.length();i++) {
            for (int j = i+1; j < str.length(); j++) {
                if(ch[i]==ch[j]) {
                    count++;
                    System.out.print(ch[j]+" ");
                }
            }
        }
        if(count==0)
            System.out.print("No characters are repeated.");
    }
}
