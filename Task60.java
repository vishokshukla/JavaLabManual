//Java program to print Pascal triangle

import java.util.Scanner;

public class Task60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = scanner.nextInt();
        printPascal(n);
    }
    public static void printPascal(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= i; j++)
                System.out.print(binomialCoeff(i, j)+" ");
            System.out.println();
        }
    }
    public static int binomialCoeff(int n, int m)
    {
        int res = 1;
        if (m > n - m)
            m = n - m;

        for (int i = 0; i < m; ++i)
        {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
}
