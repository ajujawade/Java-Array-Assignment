//Java program to find duplicate values in an array of string values.

import java.util.Scanner;

public class Assignment_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Size Of Array");
        int sizeArray = scanner.nextInt();
        String[] array = new String[sizeArray];

        System.out.println("Enter Elements of Array : ");

        for (int i = 0; i < sizeArray; i++) {
            array[i] = scanner.nextLine();
        }

        System.out.println("Elements in Array : ");

        for (String arr : array) {
            System.out.println(arr);
        }

        System.out.println("Duplicate Values in Array : ");
        boolean hasDuplicate = false ;

        for (int i = 0; i < sizeArray; i++){
            for(int j  = i + 1; j < sizeArray; j++){
                if (array[i].equals(array[j])){
                    System.out.println(array[i]);
                    hasDuplicate = true;
                    break;
                }
            }
        }
        if (!hasDuplicate){
            System.out.println("No Duplicates Found !");
        }
    }
}