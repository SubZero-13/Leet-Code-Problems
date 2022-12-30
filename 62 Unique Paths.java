class Solution {
    int dp[][];
    public int uniquePaths(int m, int n) {
        dp = new int[m+1][n+1];
        for(int[] row: dp) {
            Arrays.fill(row, -1);
        }
        return dfs(m-1, n-1);
    }
    public int dfs(int i, int j) {
        if(i < 0 || j < 0) {
            return 0;
        }
        if(dp[i][j] != -1) return dp[i][j];
        if(i == 0 && j == 0) return 1;
        int left = dfs(i, j-1);
        int up = dfs(i-1, j);
        return dp[i][j] = (left+up);
    }
}