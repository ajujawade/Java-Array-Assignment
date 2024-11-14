//Java program to test if an array contains a specific value.

import java.util.*;

public class Assignment_4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Size of Array : ");
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
            System.out.println("Enter an element to test : ");
            int testValue = scanner.nextInt();

            boolean found = false;

            for(int arr : array){
                if(arr == testValue){
                    found = true;
                    break;
                }
            }

            if(found){
                System.out.println(testValue + " is Present in the Array.");
            }else{
                System.out.println(testValue + " is Not Present in the Array.");
            }

        }
}
