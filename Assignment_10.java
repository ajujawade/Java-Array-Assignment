import java.util.Scanner;

public class Assignment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < sizeArray; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("\nElements in the array:");
        for (int arr : array) {
            System.out.print(arr + " ");
        }

        System.out.println("\n\nDuplicate values in the array:");
        int[] printedDuplicates = new int[sizeArray];
        int duplicateIndex = 0;
        boolean hasDuplicates = false;

        for (int i = 0; i < sizeArray; i++) {
            for (int j = i + 1; j < sizeArray; j++) {
                if (array[i] == array[j]) {
                    boolean alreadyPrinted = false;
                    for (int k = 0; k < duplicateIndex; k++) {
                        if (printedDuplicates[k] == array[i]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }

                    if (!alreadyPrinted) {
                        System.out.print(array[i] + " ");
                        printedDuplicates[duplicateIndex++] = array[i];
                        hasDuplicates = true;
                    }
                    break;
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found!");
        }

        System.out.println("\n\nArray without duplicates:");
        int[] newArray = new int[sizeArray];
        int index = 0;

        for (int i = 0; i < sizeArray; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (array[i] == newArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                newArray[index++] = array[i];
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
