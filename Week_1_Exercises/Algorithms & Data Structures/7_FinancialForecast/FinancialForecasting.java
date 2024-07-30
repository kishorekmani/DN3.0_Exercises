public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double predictFutureValue(double initialValue, double growthRate, int years) {
        // Base case: if no years are left, return the initial value
        if (years == 0) {
            return initialValue;
        }
        // Recursive case: calculate future value for the remaining years
        return predictFutureValue(initialValue * (1 + growthRate), growthRate, years - 1);
    }

    // Optimized method using memoization to avoid excessive computation
    public static double predictFutureValueOptimized(double initialValue, double growthRate, int years, double[] memo) {
        // Base case: if no years are left, return the initial value
        if (years == 0) {
            return initialValue;
        }
        // If the result is already computed, return it
        if (memo[years] != -1) {
            return memo[years];
        }
        // Recursive case: calculate future value for the remaining years and store it in memo
        memo[years] = predictFutureValueOptimized(initialValue * (1 + growthRate), growthRate, years - 1, memo);
        return memo[years];
    }
}
