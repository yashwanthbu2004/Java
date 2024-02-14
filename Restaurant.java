import java.util.Scanner;

class Restaurant1
{
    String restaurantName;
    long restaurantContact;
    String restaurantAddress;
    float rating;



    void displayRestaurantDetails()
    {
        System.out.println("Restaurant details\n******************");
        System.out.println("Restaurant Name : " + restaurantName);
        System.out.println("Restaurant Rating : " + rating);
        System.out.println("Restaurant Contact : " + restaurantContact);
        System.out.println("Restaurant Address : " + restaurantAddress);

    }
}

public class Restaurant {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Restaurant1 ob = new Restaurant1();

        System.out.print("Enter the Restaurant name : ");
        ob.restaurantName = scanner.nextLine();
        System.out.print("Enter the Restaurant rating : ");
        ob.rating = scanner.nextFloat();
        System.out.print("Enter the Restaurant contact : ");
        ob.restaurantContact = scanner.nextLong();
        System.out.print("Enter the Restaurant address : ");
        ob.restaurantAddress = scanner.next();

        ob.displayRestaurantDetails();


    }
}
