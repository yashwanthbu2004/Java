class Area {

    double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    double calculateArea(double side) {
        return side * side;
    }


    double calculateArea(double radius, String shape) {
        if (shape.equalsIgnoreCase("circle")) {
            return Math.PI * radius * radius;
        } else {

            System.out.println("Unknown shape: " + shape);
            return 0;
        }
    }
}

public class OverloadArea {
    public static void main(String[] args) {
        Area areaCalculator = new Area();


        double rectangleArea = areaCalculator.calculateArea(4, 5);
        System.out.println("Rectangle Area: " + rectangleArea);


        double squareArea = areaCalculator.calculateArea(4);
        System.out.println("Square Area: " + squareArea);


        double circleArea = areaCalculator.calculateArea(3, "circle");
        System.out.println("Circle Area: " + circleArea);
    }
}
