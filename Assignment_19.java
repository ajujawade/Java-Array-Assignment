//Java program to find the maximum product of two integers in a given array of integers.

import java.util.Scanner;

public class Assignment_19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Size Of Array");
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];

        System.out.println("Enter Elements of Array : ");

        for (int i = 0; i < sizeArray; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Elements in Array : ");

        for (int arr : array) {
            System.out.print(arr + " ");
        }

        int[] sortedArray = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            sortedArray[i] = array[i];
        }

        for (int i = 0; i < sizeArray - 1; i++) {
            for (int j = 0; j < sizeArray - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("Sorted Array is : ");

        for (int sorArr : sortedArray) {

            System.out.print(sorArr + " ");

        }

        System.out.println();

        System.out.println("Maximum Product of Two Integers : " + sortedArray[sizeArray - 2] * sortedArray[sizeArray - 1]);




    }

}
