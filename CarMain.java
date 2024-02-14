import java.util.Scanner;

class Car {

    String company_name;
    String model_name;
    int year;
    double mileage;

    // Method to assign variable values using Scanner
    void assign() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter company name: ");
        this.company_name = scanner.nextLine();

        System.out.print("Enter model name: ");
        this.model_name = scanner.nextLine();

        System.out.print("Enter year: ");
        this.year = scanner.nextInt();

        System.out.print("Enter mileage: ");
        this.mileage = scanner.nextDouble();
    }


    void display() {
        System.out.println("Company Name: " + this.company_name);
        System.out.println("Model Name: " + this.model_name);
        System.out.println("Year: " + this.year);
        System.out.println("Mileage: " + this.mileage);
    }
}

public class CarMain {
    public static void main(String[] args)
    {

        Car myCar = new Car();
        myCar.assign();
        myCar.display();
    }
}
