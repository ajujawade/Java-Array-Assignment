//a Java program to merge elements of A with B by maintaining the sorted order
// i.e. fill A with first p smallest elements and fill B with remaining elements.


import java.util.Scanner;

public class Assignment_18 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Size Of Array A : ");
        int sizep = scanner.nextInt();
        int[] p = new int[sizep];

        System.out.println("Enter Elements of Array A : ");

        for (int i = 0; i < sizep; i++) {
            p[i] = scanner.nextInt();
        }
        System.out.println("Enter Size Of Array B : ");
        int sizeq = scanner.nextInt();
        int[] q = new int[sizeq];

        System.out.println("Enter Elements of Array B : ");

        for (int i = 0; i < sizeq; i++) {
            q[i] = scanner.nextInt();
        }

        System.out.println("Elements in Array A : ");

        for (int arr : p) {
            System.out.print(arr + " ");
        }

        System.out.println();
        System.out.println("Elements in Array B : ");

        for (int arr : q) {
            System.out.print(arr + " ");
        }

        int[] mergedArray = new int [sizep + sizeq];
        int index = 0;

        for (int i = 0; i < sizep; i++){
                mergedArray[index++] = p[i];
        }

        System.out.println(index);

        for (int i = 0; i < sizeq; i++){
            mergedArray[index++] = q[i];
        }

//        System.out.println("Merged Array : ");
//
//        for (int arr : mergedArray){
//            System.out.print(arr + " ");
//        }

        for (int i = 0; i < mergedArray.length - 1 ; i++){
            for (int j = 0 ; j < mergedArray.length - 1 - i; j++){
                if (mergedArray[j] > mergedArray[j + 1]){
                    int temp = mergedArray[j];
                    mergedArray[j] = mergedArray[j + 1];
                    mergedArray[j + 1] = temp;
                }
            }
        }
        System.out.println();
//        System.out.println("Sorted Merged Array : ");
//
//        for (int arr : mergedArray){
//            System.out.print(arr + " ");
//        }

        System.out.println();

        System.out.println("Array A : ");
        for (int i = 0; i < sizep; i++){
            System.out.print(mergedArray[i] + " ");
        }

        System.out.println();

        System.out.println("Array B : ");
        for (int i = sizep; i < mergedArray.length; i++){
            System.out.print(mergedArray[i] + " ");
        }

    }

}
