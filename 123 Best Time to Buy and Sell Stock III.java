class Solution {
    int[][][] dp;
    public int maxProfit(int[] prices) {
        dp = new int[prices.length+1][3][3];
        for(int col[][]: dp) {
            for(int[] row: col) {
                Arrays.fill(row, -1);
            }
        }
        return dfs(0, prices, 2, false);
        
    }
    private int dfs(int idx, int[] nums, int k, boolean buy) {
        if(idx >= nums.length || k == 0) {
            return 0;
        }
        int bought = buy ? 1 : 0;
        if(dp[idx][k][bought] != -1) return dp[idx][k][bought];
        int profit = 0;
        profit = dfs(idx+1, nums, k, buy);
        if(buy) {
            profit = Math.max(profit, nums[idx] + dfs(idx+1, nums, k-1, false));
        }
        else {
            profit = Math.max(profit, (-nums[idx]) + dfs(idx+1, nums, k, true));
        }
        return dp[idx][k][bought] = profit;
    }
}