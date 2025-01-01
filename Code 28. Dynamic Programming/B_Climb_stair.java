public class B_Climb_stair {
    public static int Memoization(int n, int dp[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = Memoization(n - 1, dp) + Memoization(n - 2, dp);
        return dp[n];
    }

    public static int Tabulation(int n, int dp[]) {
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n + 1];
        System.out.println(Tabulation(n, dp));
    }
}