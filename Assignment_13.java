//Java program to find the second-smallest element in an array.

import java.util.Scanner;

public class Assignment_13 {

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
            System.out.println(arr);
        }

        if (sizeArray > 1) {
            for (int i = 0; i < sizeArray - 1; i++) {
                for (int j = 0; j < sizeArray - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }else{
            System.out.println("Please Create an Array Of Size Greater than 1 to Find Second-Smallest Value !");
        }

        if (sizeArray >1) {
            System.out.println("Second-Smallest Element in Array is : " + array[1]);
        }
    }
}
