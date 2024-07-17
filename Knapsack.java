public class Knapsack {
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    static int knapSack(int W, int weights[], int values[], int n) {
        int i, w;
        int K[][] = new int[n + 1][W + 1];
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (weights[i - 1] <= w)
                    K[i][w] = max(values[i - 1] + K[i - 1][w - weights[i - 1]], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }
        return K[n][W];
    }
        public static void main(String args[]) {
        int W = 7;
        int weights[] = {1, 3, 4, 5};
        int values[] = {1, 4, 5, 7};
        int n = values.length;
        System.out.println("Maximum value in knapsack = " + knapSack(W, weights, values, n));
    }
}
