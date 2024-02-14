import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();


        int[] array = new int[size];


        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }


        scanner.close();


        int largestElement = findLargestElement(array);


        System.out.println("The largest element in the array is: " + largestElement);
    }


    public static int findLargestElement(int[] arr) {

        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }


        int largest = arr[0];


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }
}
