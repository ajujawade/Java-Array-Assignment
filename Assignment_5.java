// Java program to find the index of an array element.

import java.util.Scanner;

public class Assignment_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Size Of Array : ");
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

        boolean indexFound = false;
        System.out.println();
        System.out.println("Which Element's Index you want to find ?");
        int element = scanner.nextInt();

        for(int i = 0; i < sizeArray; i++ ){
            if(array[i] == element){
                indexFound = true;
                if(indexFound) {
                    System.out.println("Index of element " + element + " is " + i);
                    break;
                }
            }
        }
        if (!indexFound){
            System.out.println("Element not Present in Array.");
        }
    }
}
