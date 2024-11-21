// Java program to sort a numeric array and a string array.

import java.util.Scanner;

public class Assignment_1 {

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
            System.out.println();

            for (int i = 0; i < sizeArray - 1; i++){
                for (int j = 0; j < sizeArray - i - 1; j++){
                    if (array[j] > array[j + 1]){
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j + 1] = temp;
                    }
                }
            }

            System.out.println("Sorted Integer Array : " );

            for (int arr : array){
                System.out.print(arr + " ");
            }


            System.out.println();
            System.out.println("Enter String Array Size : ");

            int sizeArr = scanner.nextInt();

            String[] stringArr = new String[sizeArr];

            System.out.println("Enter String Values In Array : ");


            for (int i = 0; i < sizeArr; i++){

                stringArr[i] = scanner.nextLine();

            }

            System.out.println("Elements of String Array : ");

            for (String arr : stringArr){
                System.out.print(arr + " ");
            }
            System.out.println();
            System.out.println("Sorted String Array : ");

            for (int i = 0; i < sizeArray - 1; i++){
                for (int j = 0; j < sizeArray - i - 1; j++) {
                    if(stringArr[j].charAt(0) > stringArr[j + 1].charAt(0)){
                            String temp = stringArr[j];
                            stringArr[j] = stringArr[j+1];
                            stringArr[j+1] = temp;
                    }
                }
            }

            for (String arr : stringArr){
                System.out.print(arr + " ");
            }

        }




}
