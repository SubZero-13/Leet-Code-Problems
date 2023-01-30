class Solution {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        // int[] ans = new int[n+1];
        // ans[0] = 0;
        // ans[1] = 1;
        // ans[2] = 1;
        int prev1 = 1, prev2 = 1, prev3 = 0; 
        for(int i = 3; i <= n; i++) {
            // ans[i] = ans[i-1] + ans[i-2] + ans[i-3];
            int curr = prev1 + prev2 + prev3;
            prev3 = prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}