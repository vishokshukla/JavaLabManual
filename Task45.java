//Java int to char conversion

import java.util.Scanner;

public class Task45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scanner.nextInt();
        System.out.print("The character value of number "+n+" is : "+ (char)(n));
    }
}
