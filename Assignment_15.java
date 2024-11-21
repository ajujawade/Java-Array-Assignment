// Java program to move all 0's to the end of an array.
// Maintain the relative order of the other (non-zero) array elements.

import java.util.Scanner;

public class Assignment_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Size Of Array");
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];

        System.out.println("Enter Elements of Array : ");

        for (int i = 0; i < sizeArray; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Elements in Array : ");

        for (int arr : array) {
            System.out.print(arr + " ");
        }


        int[] sortedArray = new int[sizeArray];
        int nonZeroCount = 0;

        //Copying the non-zero array in new array.

        for (int i = 0; i < sizeArray; i++) {
            if (array[i] != 0) {
                sortedArray[nonZeroCount++] = array[i];
            }
        }

        System.out.println("Sorted Array : " );

        for (int arr : sortedArray){
            System.out.println(arr + " ");
        }

        System.out.println(sortedArray[sizeArray - 1]);

        //Sorting the new non-zero array where zero is at the front.

//        for (int i = 0; i < sizeArray - 1; i++){
//            for (int j = 0; j < sizeArray - i - 1; j++) {
//
//                if (sortedArray[j] > sortedArray[j + 1]) {
//
//                    int temp = sortedArray[j];
//                    sortedArray[j] = sortedArray[j + 1];
//                    sortedArray[j + 1] = temp;
//
//                }
//            }
//        }

        for (int i = 0; i < nonZeroCount - 1; i++){
            for (int j = 0; j < nonZeroCount - i - 1; j++) {

                if (sortedArray[j] > sortedArray[j + 1]) {

                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;

                }
            }
        }

//        for (int i = nonZeroCount; i < sizeArray; i++){
//
//            sortedArray[nonZeroCount++] = 0 ;
//
//        }

        System.out.println();
        System.out.println("Sorted Array : " );

        for (int arr : sortedArray){
            System.out.print(arr + " ");
        }

    }

}
