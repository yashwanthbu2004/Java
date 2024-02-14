import java.util.Scanner;

public class Vote {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        scanner.close();

        if(age<18)
        {
            System.out.println("Not eligible to vote.");
        }
        else
        {
            System.out.println("Eligible to vote.");
        }

    }
}
