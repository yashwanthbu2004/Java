import java.util.Scanner;

public class PositiveNegative {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int num = scanner.nextInt();
            scanner.close();
            if(num>0)
            {
                System.out.println("The number is positive.");
        }else if(num<0)
            {
                System.out.println("The number is negative.");
            }else
            {
                System.out.println("The number is zero.");
            }
    }

}
