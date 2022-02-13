class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int dp[] = new int[n+1];
        int ptr[] = new int[primes.length];
        Arrays.fill(ptr, 1);
        dp[1] = 1;
        for(int i =2; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < primes.length; j++) {
                min = Math.min(min, primes[j] * dp[ptr[j]]);
            }
            dp[i] = min;
            for(int j = 0; j < primes.length; j++) {
                if(primes[j] * dp[ptr[j]] == min) {
                    ptr[j]++;
                }
            }
        }
        return dp[n];
    }
}