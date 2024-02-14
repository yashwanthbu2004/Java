import java.util.Scanner;

public class array1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");

        for(int i=0;i<size;i++){
            System.out.print("Element "+ (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        scanner.close();

        int sum = calculateSum(array);
        System.out.println("The sum od the array is: " + sum);

    }

    public static int calculateSum(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }

        return sum;
    }
}

