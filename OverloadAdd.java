class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    float add(int a, float b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class OverloadAdd {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        int sum1 = calculator.add(5, 10);
        System.out.println("Sum of two ints: " + sum1);


        float sum2 = calculator.add(7, 3.5f);
        System.out.println("Sum of int and float: " + sum2);


        int sum3 = calculator.add(3, 6, 9);
        System.out.println("Sum of three ints: " + sum3);
    }
}
