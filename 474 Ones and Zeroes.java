class Solution {
    int dp[][][];
    int findMax(String[] strs, int m, int n, int idx) {
        if(idx == strs.length) {
            return 0;
        }
        if(dp[m][n][idx] > 0) {
            return dp[m][n][idx];
        }
        int count[] = count(strs[idx]);
        int include = 0;
        if(m >= count[0] && n >= count[1]) {
            include = 1 + findMax(strs, m-count[0], n-count[1], idx+1);
        }
        int exclude = findMax(strs, m, n, idx+1);
        dp[m][n][idx] = Math.max(include, exclude);
        return dp[m][n][idx];
    }
    int[] count(String s) {
        int count[] = new int[2];
        for(char c:s.toCharArray()) {
            count[c-'0']++;
        }
        return count;
    }
    public int findMaxForm(String[] strs, int m, int n) {
        dp = new int[m+1][n+1][strs.length];
        return findMax(strs, m, n, 0);
    }
}