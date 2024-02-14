import java.util.Scanner;
class Box {
    double length;
    double width;
    double breadth;

    Box() {
        this.length = 10.0;
        this.width = 2.0;
        this.breadth = 3.0;
    }
    Box(double length, double width, double breadth) {
        this.length = length;
        this.width = width;
        this.breadth = breadth;
    }


    double calculate() {
        return length * width * breadth;
    }
}

public class volume3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Box box1 = new Box();
        System.out.println("Enter length: ");
        box1.length = scanner.nextDouble();
        System.out.println("Enter breadth: ");
        box1.breadth = scanner.nextDouble();
        System.out.println("Enter width: ");
        box1.width = scanner.nextDouble();

        System.out.println("Volume of Box 1: " + box1.calculate());


        Box box2 = new Box(5.0, 3.0, 2.0);
        System.out.println("Volume of Box 2: " + box2.calculate());
    }
}
