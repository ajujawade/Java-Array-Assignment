//Java program to remove a specific element from an array.

import java.util.*;

public class Assignment_6 {

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

        boolean indexFound = false;
        System.out.println("Which Element's you want to remove ?");
        int elementToRemove = scanner.nextInt();

        int count = 0;

        for(int arr : array){
            if (arr == elementToRemove){
                count++;
            }
        }

        if (count==0){
            System.out.println("Element Not Found ! ");
        }else {
            int [] newArray = new int[sizeArray - count];
            int index = 0;
            for(int value : array){
                if (value != elementToRemove){
                    newArray[index++] = value;
                }
            }

            System.out.println("Element " + elementToRemove +" is removed from the Array.");
            System.out.println("New Array After Removing the Element " + elementToRemove + " is : ");
            for(int num : newArray){
                System.out.print(num + " ");
            }

        }

        }
    }



