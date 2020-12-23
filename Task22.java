//Java Program to Add Two Matrix Using Multi-dimensional Arrays

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimensions of first matrix : ");
        int rowMatrixOne = scanner.nextInt();
        int columnMatrixOne = scanner.nextInt();
        System.out.print("Enter the dimensions for second matrix : ");
        int rowMatrixTwo = scanner.nextInt();
        int columnMatrixTwo = scanner.nextInt();
        if(rowMatrixOne == rowMatrixTwo && columnMatrixOne == columnMatrixTwo) {
            System.out.print("Enter the elements of first array : ");
            int[][] matrixOne = new int[rowMatrixOne][columnMatrixOne];
            for(int i=0; i<rowMatrixOne; i++) {
                for(int j=0; j<columnMatrixOne; j++) {
                    matrixOne[i][j] = scanner.nextInt();
                }
            }
            System.out.print("Enter the elements of second array : ");
            int[][] matrixTwo = new int[rowMatrixTwo][columnMatrixTwo];
            for(int i=0; i<rowMatrixTwo; i++) {
                for(int j=0; j<columnMatrixTwo; j++) {
                    matrixTwo[i][j] = scanner.nextInt();
                }
            }
            int[][] resultMatrix = new int[rowMatrixOne][columnMatrixOne];
            for(int i=0; i<rowMatrixOne; i++) {
                for(int j=0; j<columnMatrixOne; j++) {
                    resultMatrix[i][j] = matrixOne[i][j] + matrixTwo[i][j];
                }
            }
            for (int i = 0; i< rowMatrixOne; i++) {
                for (int j = 0; j < columnMatrixOne; j++) {
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        else
            System.out.print("Matrices can't be added as dimensions are not same.");
    }
}
