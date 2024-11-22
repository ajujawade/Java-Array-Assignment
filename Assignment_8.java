//Java program to find the maximum and minimum value of an array.

import java.util.Scanner;

public class Assignment_8 {

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
            System.out.println(arr);
        }

        int maxValue = array[0];

        for(int num : array){
            if (maxValue < num){
                maxValue = num;
            }
        }

        System.out.println("Maximum Value in Array : " + maxValue);

        int minValue = array[0];

        for(int num : array){
            if (minValue > num){
                minValue = num;
            }
        }

        System.out.println("Minimum Value in Array : " + minValue);

    }
}