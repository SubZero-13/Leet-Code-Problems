class Solution {
    
    // Dp with Tabulation
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int dp[][] = new int[m][n];
        for(int j = 0; j < n; j++) {
            dp[0][j] = matrix[0][j];
        }
        for(int i = 1; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(j == 0) {
                    dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j], dp[i-1][j+1]);
                }
                else if(j == n-1) {
                    dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j], dp[i-1][j-1]);
                }
                else {
                    dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i-1][j+1]));
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for(int j = 0; j < n; j++) {
            res = Math.min(dp[m-1][j], res);
        }
        return res;
    }
    
		// Recursion with Memoization DP
		// int dp[][];
		// public int minFallingPathSum(int[][] matrix) {
		// int res = Integer.MAX_VALUE;
		// int m = matrix.length;
		// int n = matrix[0].length;
		// dp = new int[m][n];
		// for(int row[]: dp) 
		// Arrays.fill(row, -200);
		// for(int j = 0; j < n; j++) {
		// int temp = helper(matrix.length-1, j, matrix);
		// res = Math.min(res, temp);
		// }
		// return res;
		// }
		// private int helper(int i, int j, int[][] mat) {
		// if(j < 0 || j >= mat.length) {
		// return (int)1e9;
		// }
		// if(i == 0) {
		// return mat[0][j];
		// }
		// if(dp[i][j] != -200) {
		// return dp[i][j];
		// }
		// int up = mat[i][j] + helper(i-1, j, mat);
		// int rdgu = mat[i][j] + helper(i-1, j+1, mat);
		// int ldgu = mat[i][j] + helper(i-1, j-1, mat);
		// return dp[i][j] = Math.min(up, Math.min(ldgu, rdgu));
		// }
}