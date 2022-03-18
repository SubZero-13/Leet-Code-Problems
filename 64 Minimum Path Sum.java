class Solution {
    public int minPathSum(int[][] grid) {
        int dp[][] = new int[grid.length][grid[0].length];
        int m = grid.length, n = grid[0].length;
        for(int i = m-1; i >=0; i--) {
            for(int j = n-1; j>=0; j--) {
                if(i == m-1 && j == n-1) {
                    dp[i][j] = grid[i][j];
                }
                else if(i == m-1 && j != n-1) {
                    dp[i][j] = grid[i][j] + dp[i][j+1];
                }
                else if(i != m-1 && j == n-1) {
                    dp[i][j] = grid[i][j] + dp[i+1][j];
                }
                else {
                    dp[i][j] = grid[i][j] + Math.min(dp[i][j+1], dp[i+1][j]);
                }
            }
        }
        return dp[0][0];
    }
}