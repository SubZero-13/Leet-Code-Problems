class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int rowMax[] = new int[grid.length];
        int colMax[] = new int[grid[0].length];
        for(int i = 0; i < rowMax.length; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < colMax.length; j++) {
                if(max < grid[i][j]) {
                    max = grid[i][j];
                }
            }
            rowMax[i] = max;
        }
        for(int j = 0; j < colMax.length; j++) {
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < rowMax.length; i++) {
                if(max < grid[i][j]) {
                    max = grid[i][j];
                }
            }
            colMax[j] = max;
        }
        int ans = 0;
        for(int i = 0; i < rowMax.length; i++) {
            for(int j = 0; j < colMax.length; j++) {
                int minVal = Math.min(rowMax[i], colMax[j]);
                ans += (minVal - grid[i][j]);
            }
        }
        return ans;
    }
}