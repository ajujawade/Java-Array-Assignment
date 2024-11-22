//Java program to add two matrices of the same size.

import java.util.Scanner;

public class Assignment_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Column Size of Array A : ");
        int col = scanner.nextInt();
        System.out.println("Enter Row Size of Array A : ");
        int row = scanner.nextInt();


        int[][] arrayA = new int[row][col];

        System.out.println("Enter Elements of Array A : ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++){
                arrayA[i][j] = scanner.nextInt();
            }
        }

        int[][] arrayB = new int[row][col];

        System.out.println("Enter Elements of Array B : ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++){
                arrayB[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Elements in Array A : ");

        for (int i = 0; i<row; i++) {
            for (int j = 0; j < col  ; j++){
                System.out.print(arrayA[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Elements in Array B : ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col  ; j++){
                System.out.print(arrayB[i][j] + " ");
            }
            System.out.println();
        }

        int[][] sumMatrices = new int[row][col];

        System.out.println("Addition of Two Matrices : ");

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col  ; j++){

                sumMatrices[i][j] = arrayA[i][j] + arrayB[i][j];
                System.out.print(sumMatrices[i][j] + " ");

            }

            System.out.println();

        }

        }
}

