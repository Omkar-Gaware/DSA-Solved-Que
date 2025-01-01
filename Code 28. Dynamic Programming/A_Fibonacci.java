public class A_Fibonacci {
    public static int Memoization(int n, int dp[]){
        if (n==0 || n==1) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = Memoization(n-1, dp) + Memoization(n-2, dp);
        return dp[n];
    }

    public static int Tabulation(int n, int dp[]){
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
    
    public static void main(String[] args) {
        int n = 6;
        int dp[] = new int[n+1];
        System.out.println(Tabulation(n, dp));
    }
}