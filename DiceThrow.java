import java.util.Scanner;

public class DiceThrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of dice (n):");
        int n = scanner.nextInt();

        System.out.println("Enter the number of faces on each die (m):");
        int m = scanner.nextInt();

        System.out.println("Enter the desired sum (x):");
        int x = scanner.nextInt();

        scanner.close();

        int numberOfWays = findWays(n, m, x);
        System.out.println("Number of ways to get sum " + x + " with " + n + " dice and " + m + " faces: " + numberOfWays);
    }

    public static int findWays(int n, int m, int x) {
        int[][] dp = new int[n + 1][x + 1];

        // Initialize the base cases
        for (int j = 1; j <= m && j <= x; j++) {
            dp[1][j] = 1;
        }

        // Fill the rest of the dp array
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= x; j++) {
                for (int k = 1; k <= m && k < j; k++) {
                    dp[i][j] += dp[i - 1][j - k];
                }
            }
        }

        return dp[n][x];
    }
}