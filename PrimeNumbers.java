public class PrimeNumbers {
    public static void main(String[] args) {
        final int PRIME_COUNT = 50;
        final int NUMBERS_PER_LINE = 10;

        int count = 0;
        int number = 2;

        System.out.println("The first " + PRIME_COUNT + " prime numbers are:");

        while (count < PRIME_COUNT) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;


                if (count % NUMBERS_PER_LINE == 0) {
                    System.out.println();
                }
            }

            number++;
        }
    }


    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
