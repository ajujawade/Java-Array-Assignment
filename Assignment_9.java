//Java program to reverse an array of integer values.


import java.util.Scanner;

public class Assignment_9 {

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


        System.out.println("Reversed Array : ");
        for(int i = sizeArray - 1; i >= 0; i--){
            System.out.print(array[i] +  " ");
        }

 }
}
