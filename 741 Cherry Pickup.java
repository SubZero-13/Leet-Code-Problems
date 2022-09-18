class Solution {
    int n;
    int [][]grid;
    int dp[][][][];
    public int cherryPickup(int[][] grid) {
        this.n = grid.length;
        this.grid = grid;
        dp = new int[n][n][n][n];
        for(int t[][][]: dp) {
            for(int u[][]: t) {
                for(int v[]: u) {
                    Arrays.fill(v, -1);
                }
            }
        }
        int ans = cherryPick(0, 0, 0, 0);
        if(ans <= 0) {
            return 0;
        }
        return ans;
    }
    
    private int cherryPick(int r1, int c1, int r2, int c2) {
        if(r1 >= n || r2 >= n || c1 >= n || c2 >= n || grid[r1][c1] == -1 || grid[r2][c2] == -1) {
            return (int)(-1e9);
        }
        if(r1 == n-1 && c1 == n-1) {
            return grid[r1][c1];
        }
        if(r2 == n-1 && c2 == n-1) {
            return grid[r2][c2];
        }
        if(dp[r1][r2][c1][c2] != -1) {
            return dp[r1][r2][c1][c2];
        }
        int cherries = 0;
        if(r1 == r2 && c1 == c2) {
            cherries = grid[r1][c1];
        }
        else {
            cherries = grid[r1][c1] + grid[r2][c2];
        }
        int f1 = cherryPick(r1+1, c1, r2+1, c2);
        int f2 = cherryPick(r1+1, c1, r2, c2+1);
        int f3 = cherryPick(r1, c1+1, r2+1, c2);
        int f4 = cherryPick(r1, c1+1, r2, c2+1);
        cherries += Math.max(Math.max(f1, f2), Math.max(f3, f4));
        return dp[r1][r2][c1][c2] = cherries;
    }
    
    
    // int m, n;
    // int [][]grid;
    // int max = 0;
    // public int cherryPickup(int[][] grid) {
    //     this.m = grid.length;
    //     this.n = grid[0].length;
    //     this.grid = grid;
    //     cherryPick(0, 0, 0);
    //     return max;
    // }
    // private void cherryPick(int i, int j, int ccsf){
    //     if(i >= m || j >= n || i < 0 || j < 0 || grid[i][j] == -1) {
    //         return;
    //     }
    //     if(i == m-1 && j == n-1) {
    //         goingBack(m-1, n-1, ccsf);
    //         return;
    //     }
    //     int cherries = grid[i][j];
    //     grid[i][j] = 0;
    //     cherryPick(i+1, j, cherries + ccsf);
    //     cherryPick(i, j+1, cherries + ccsf);
    //     grid[i][j] = cherries;
    // }
    // private void goingBack(int i, int j, int ccsf) {
    //     if(i < 0|| j < 0 || grid[i][j] == -1) {
    //         return;
    //     }
    //     if(i == 0 && j == 0) {
    //         max = Math.max(max, ccsf);
    //     }
    //     int cherries = grid[i][j];
    //     grid[i][j] = 0;
    //     goingBack(i-1, j, cherries + ccsf);
    //     goingBack(i, j-1, cherries + ccsf);
    //     grid[i][j] = cherries;
    // }
    
    
}