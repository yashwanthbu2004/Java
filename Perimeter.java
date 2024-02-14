import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();


        double perimeter = calculateRectanglePerimeter(length, width);


        System.out.println("The perimeter of the rectangle is: " + perimeter);

        scanner.close();
    }


    public static double calculateRectanglePerimeter(double length, double width) {

        return 2 * (length + width);
    }
}
