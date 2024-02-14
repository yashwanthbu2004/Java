public class SalesGoalCalculator {
    public static void main(String[] args) {
        final double BASE_SALARY = 5000.0;
        final double GOAL_AMOUNT = 30000.0;
        final double COMMISSION_RATE_TIER1 = 0.08;
        final double COMMISSION_RATE_TIER2 = 0.10;
        final double COMMISSION_RATE_TIER3 = 0.12;

        double totalSalary = BASE_SALARY;
        double salesAmount = 0.0;

        while (totalSalary < GOAL_AMOUNT) {
            if (salesAmount <= 5000) {
                totalSalary += salesAmount * COMMISSION_RATE_TIER1;
            } else if (salesAmount <= 10000) {
                totalSalary += 5000 * COMMISSION_RATE_TIER1 + (salesAmount - 5000) * COMMISSION_RATE_TIER2;
            } else {
                totalSalary += 5000 * COMMISSION_RATE_TIER1 + 5000 * COMMISSION_RATE_TIER2 +
                        (salesAmount - 10000) * COMMISSION_RATE_TIER3;
            }

            salesAmount += 0.01;
        }

        System.out.println("To earn $30,000, the minimum sales amount required is: $" + salesAmount);
    }
}
