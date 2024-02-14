import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter details for the first matrix:");
        int[][] matrix1 = inputMatrix(scanner);


        System.out.println("Enter details for the second matrix:");
        int[][] matrix2 = inputMatrix(scanner);


        if (canAddMatrices(matrix1, matrix2)) {

            int[][] resultMatrix = addMatrices(matrix1, matrix2);


            System.out.println("Resultant Matrix (Sum of the matrices):");
            displayMatrix(resultMatrix);
        } else {
            System.out.println("Matrices cannot be added. Make sure they have the same dimensions.");
        }


        scanner.close();
    }


    public static int[][] inputMatrix(Scanner scanner) {
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }


    public static boolean canAddMatrices(int[][] matrix1, int[][] matrix2) {
        return (matrix1.length == matrix2.length) && (matrix1[0].length == matrix2[0].length);
    }


    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] resultMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }


    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
