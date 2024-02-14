class Disc {
    double amt;

    void insert(double amount) {
        amt = amount;
    }

    double calc() {
        if (amt >= 1000) {
            return amt - (amt * 0.05);
        } else if (amt >= 500 && amt < 1000) {
            return amt - (amt * 0.02);
        } else if (amt > 0 && amt < 500) {
            return amt - (amt * 0.01);
        } else {

            return amt;
        }
    }
}

public class Discount {
    public static void main(String[] args) {
        Disc ob1 = new Disc();
        ob1.insert(560);
        double discountAmount = ob1.calc();
        System.out.println("After discount the amount is : " + discountAmount);
    }
}
