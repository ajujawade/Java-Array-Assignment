//Java program to compute the average value of an array of integers except the largest and smallest values.

import java.util.Scanner;

public class Assignment_16 {

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

        for (int i = 0; i < sizeArray; i++){
            sortedArray[i] = array[i];
        }

        for (int i = 0; i < sizeArray - 1; i++){
            for (int j = 0; j < sizeArray - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("Sorted Array is : " );

        for (int sorArr : sortedArray){

            System.out.print(sorArr + " ");

        }

        System.out.println();
        System.out.print ("Smallest Value in Array : " + sortedArray[0]);
        System.out.println();
        System.out.print ("Largest Value in Array : " + sortedArray[sizeArray - 1]);
        System.out.println();

        int total = 0;

        for (int i = 1; i < sizeArray - 1; i++){
            total += sortedArray[i];
        }

        double average = (double) total /(sizeArray - 2);

        System.out.println("Average of the Array except the largest and smallest values is : " + average);

    }
}
