//Java program to remove duplicate elements from a given array and return the updated array length

import java.util.Scanner;

public class Assignment_17 {

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

        System.out.println("\n\n Duplicate values in the array : ");
        int[] printedDuplicates = new int[sizeArray];
        int duplicateIndex = 0;

        int count = 0;
        boolean hasDuplicate = false;

        for (int i = 0; i < sizeArray; i++) {
            for (int j = i + 1; j < sizeArray; j++) {
                if (array[i] == array[j]) {
                    boolean alreadyPrinted = false;
                    for (int k = 0; k < duplicateIndex; k++){
                        if (printedDuplicates[k] == array[i]){
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    if (!alreadyPrinted){
                        System.out.print(array[i] + " ");
                        printedDuplicates[duplicateIndex++] = array[i];
                        hasDuplicate = true;
                    }
                }
            }
        }


        if (!hasDuplicate) {
            System.out.println("No Duplicates Found !");
        }

        int [] newArray = new int[sizeArray];
        int index = 0;

        for (int i = 0; i < sizeArray; i++){
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++){
                if (array[i] == newArray[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                newArray[index++] = array[i];
                count++;
            }
        }

        System.out.println("\n\n Length of Array without Duplicates : " + count);

    }

}
