//Java program to calculate the average value of array elements

import java.util.Scanner;

public class Assignment_3 {

    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int sizeArray = scanner.nextInt();
        int[] numbers = new int[sizeArray];
        int total = 0;
        System.out.println("Enter Elements of Array : ");

        for (int i=0; i<sizeArray; i++){
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        System.out.println("Sum of the Elements Present in the Array : " + total);

        System.out.print("Average Value of Arrray Elements : " + total/sizeArray);

    }


}
