class Order1 {
    int orderId;
    String orderedFoods;
    String status;

    Order1() {
        status = "Ordered";
    }

    Order1(int orderId, String orderedFoods) {
        this.orderId = orderId;
        this.orderedFoods = orderedFoods;
        status = "Ordered";
    }

    int getOrderId() {
        return orderId;
    }

    String getOrderedFoods() {
        return orderedFoods;
    }

    String getStatus() {
        return status;
    }
}

public class Order {
    public static void main(String[] args) {

        Order1 order1 = new Order1();
        System.out.println("Status of order 1: " + order1.getStatus());

        Order1 order2 = new Order1(101, "Pizza, Burger, Fries");
        System.out.println("Status of order 2: " + order2.getStatus());
        System.out.println("ID of order 2: " + order2.getOrderId());
        System.out.println("Ordered items in order 2: " + order2.getOrderedFoods());


    }
}
