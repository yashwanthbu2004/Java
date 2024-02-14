import java.util.Scanner;
public class Day {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day number between 1 to 7: ");
        int num = scanner.nextInt();
        scanner.close();

        String weekday;
        switch(num)
        {
            case 1:
                weekday = "Monday";
                break;
            case 2:
                weekday = "Tuesday";
                break;
            case 3:
                weekday = "Wednesday";
                break;
            case 4:
                weekday = "Thursday";
                break;
            case 5:
                weekday = "Friday";
                break;
            case 6:
                weekday = "Saturday";
                break;
            case 7:
                weekday = "Sunday";
                break;
            default:
                weekday = "Invalid input. Please enter a number between 1 and 7.";
        }
        System.out.println("Result: " + weekday);
        }
    }

