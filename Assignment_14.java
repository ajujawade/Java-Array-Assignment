//Java program to add two matrices of the same size.

import java.util.Scanner;

public class Assignment_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Size Of Array A : ");
        int col = scanner.nextInt();
        int row = scanner.nextInt();
        int sizeArr = col + row;

        int[][] arrayA = new int[col][row];

        System.out.println("Enter Elements of Array A : ");

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++){
                arrayA[i][j] = scanner.nextInt();
            }
        }

        int[][] arrayB = new int[col][row];

        System.out.println("Enter Elements of Array B : ");

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++){
                arrayB[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Elements in Array A : ");

        for (int i = 0; i<col; i++) {
            for (int j = 0; j < row  ; j++){
                System.out.print(arrayA[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Elements in Array B : ");

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row  ; j++){
                System.out.print(arrayB[i][j] + " ");
            }
            System.out.println();
        }

        int[][] sumMatrices = new int[col][row];

        System.out.println("Addition of Two Matrices : ");

        for (int i = 0; i < col; i++){
            for (int j = 0; j < row  ; j++){

                sumMatrices[i][j] = arrayA[i][j] + arrayB[i][j];
                System.out.print(sumMatrices[i][j] + " ");

            }

            System.out.println();

        }

        }
}

