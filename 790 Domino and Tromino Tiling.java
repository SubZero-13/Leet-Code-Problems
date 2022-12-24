class Solution {
    long MOD = (long)1e9+7;
    public int numTilings(int n) {
        long dp[] = new long[10001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;
        if(n <= 3) {
            return (int)dp[n];
        }
        for(int i = 4; i <= n; ++i) {
            dp[i] = (2*dp[i-1] + dp[i-3]) % MOD;
        }
        return (int)dp[n];
    }
}