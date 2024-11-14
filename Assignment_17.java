//Java program to remove duplicate elements from a given array and return the updated array length

import java.util.Scanner;

public class Assignment_17 {

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
        System.out.println();
        System.out.print("Duplicate Values in Array : ");
        boolean hasDuplicate = false;

        for (int i = 0; i < sizeArray; i++) {
            for (int j = i + 1; j < sizeArray; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i] + " ");
                    hasDuplicate = true;
                    break;
                }
            }
        }
        if (!hasDuplicate) {
            System.out.println("No Duplicates Found !");
        }

    }
}
