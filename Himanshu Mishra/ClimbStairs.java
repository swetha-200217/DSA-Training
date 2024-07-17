import java.util.HashMap;
import java.util.Map;
public class ClimbStairs {
    private static Map<Integer, Integer> memo = new HashMap<>();
    public static int climbStairs(int n) {
        if (n == 0) return 1;  
        if (n == 1) return 1; 
        
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
       int result = climbStairs(n - 1) + climbStairs(n - 2);
        memo.put(n, result);

        return result;
    }
    public static void main(String[] args) {
        int n = 5; // Example number of steps
        System.out.println("Number of ways to climb " + n + " steps: " + climbStairs(n));
    }
}
