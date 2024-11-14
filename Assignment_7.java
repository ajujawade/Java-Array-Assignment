//Java program to insert an element (specific position) into an array.

import java.util.*;

public class Assignment_7 {

   public static void main(String[] args){
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

        System.out.println("Which Element you want to insert ?");
        int elementToInsert = scanner.nextInt();

        System.out.print("Enter the Position to Insert new Value : ");
        int newElement = scanner.nextInt();



    }

}
