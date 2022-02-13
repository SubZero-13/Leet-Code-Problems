class Solution {
    public int nthUglyNumber(int n) {
        int dp[] = new int[n+1];
        int ptr[] = {1,1,1};
        int primes[] = {2,3,5};
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for(int j =0 ; j < primes.length; j++) {
                min = Math.min(min, primes[j] * dp[ptr[j]]);
            }
            dp[i] = min;
             for(int j =0 ; j < primes.length; j++) {
               if(primes[j] * dp[ptr[j]] == min) {
                   ptr[j]++;
               }
            }
        }
        return dp[n];
    }
}