import java.util.HashMap;
import java.util.Map;

public class ClimbStairs {

    // Memoization map to store already computed results
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int climbStairs(int n) {
        // Base cases
        if (n == 0) return 1;  // No steps, 1 way to do nothing
        if (n == 1) return 1;  // One step, 1 way to climb it
        
        // Check if result is already computed
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Compute the result recursively and store it in memo
        int result = climbStairs(n - 1) + climbStairs(n - 2);
        memo.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        int n = 5; // Example number of steps
        System.out.println("Number of ways to climb " + n + " steps: " + climbStairs(n));
    }
}
