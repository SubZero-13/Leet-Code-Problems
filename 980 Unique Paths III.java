class Solution {
    int res = 0, empty = 1;
    public int uniquePathsIII(int[][] grid) {
        int sx=-1, sy=-1;
        int m = grid.length, n = grid[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 0) empty++;
                else if(grid[i][j] == 1) {
                    sx= i;
                    sy = j;
                }
            }
        }
        dfs(grid, sx, sy);
        return res;
    }
    public void dfs(int[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] < 0) {
            return;
        }
        if(grid[i][j] == 2) {
            if(empty == 0) res++;
            return;
        }

        grid[i][j] = -2;
        empty--;
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
        grid[i][j] = 0;
        empty++;
    }
}