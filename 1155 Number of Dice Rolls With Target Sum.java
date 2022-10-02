class Solution {
    // DP Tabulation
    int MOD = 1000000000 + 7;
    public int numRollsToTarget(int n, int k, int target) {
        long dp[][] = new long[n+1][target+1];
        dp[0][0] = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= target; j++) {
                for(int faces = 1; faces <= k; faces++) {
                    if(j >= faces) {
                        dp[i][j] = (dp[i][j] + dp[i-1][j-faces])%MOD;
                    }
                    else {
                        break;
                    }
                }
            }
        }
        return (int)(dp[n][target]);
    }
    
    
    
    
    
    // Memoization DP
    // int MOD = 1000000000 + 7;
    // Map<String, Integer> ans = new HashMap<>();
    // public int numRollsToTarget(int n, int k, int target) {
    //     return solve(n, k, target);
    // }
    // public int solve(int n, int k, int target) {
    //     if(n==0 && target == 0) {
    //         return 1;
    //     }
    //     if(n == 0 || target == 0) {
    //         return 0;
    //     }
    //     String str = n + " " + target;
    //     if(ans.containsKey(str)) {
    //         return ans.get(str);
    //     }
    //     int res = 0;
    //     for(int i = 1; i <= k; i++) {
    //         if(target >= i) {
    //             res = (res + solve(n-1, k, target-i))%MOD;
    //         }
    //         else {
    //             break;
    //         }
    //     }
    //     ans.put(str, res);
    //     return res;
    // }
}