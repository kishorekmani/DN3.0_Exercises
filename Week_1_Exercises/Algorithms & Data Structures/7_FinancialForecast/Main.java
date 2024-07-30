public class Main {
    public static void main(String[] args) {
        double initialValue = 1000.0;
        double growthRate = 0.05; // 5% growth rate
        int years = 10;

        // Calculate future value using the recursive approach
        double futureValue = FinancialForecasting.predictFutureValue(initialValue, growthRate, years);
        System.out.println("Predicted future value (recursive): " + futureValue);

        // Calculate future value using the optimized recursive approach with memoization
        double[] memo = new double[years + 1];
        for (int i = 0; i <= years; i++) {
            memo[i] = -1;
        }
        double futureValueOptimized = FinancialForecasting.predictFutureValueOptimized(initialValue, growthRate, years, memo);
        System.out.println("Predicted future value (optimized): " + futureValueOptimized);
    }
}
