import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();


        int[] originalArray = new int[size];


        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.nextInt();
        }


        System.out.print("Enter the element to insert: ");
        int elementToInsert = scanner.nextInt();


        System.out.print("Enter the position of insertion: ");
        int position = scanner.nextInt();


        if (position < 0 || position > originalArray.length) {
            System.out.println("Invalid position for insertion");
            return;
        }


        int[] newArray = new int[originalArray.length + 1];


        System.arraycopy(originalArray, 0, newArray, 0, position);


        newArray[position] = elementToInsert;


        System.arraycopy(originalArray, position, newArray, position + 1, originalArray.length - position);


        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Element to Insert: " + elementToInsert);
        System.out.println("Position of Insertion: " + position);
        System.out.println("Modified Array: " + Arrays.toString(newArray));


        scanner.close();
    }
}
