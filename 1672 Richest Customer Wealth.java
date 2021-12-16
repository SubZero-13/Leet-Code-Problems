class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0, sum;
        for(int i = 0; i < accounts.length; i++){
            sum = 0;
            for(int j = 0; j < accounts[i].length; j++)
            {
                sum += accounts[i][j];
            }
            wealth = Math.max(wealth, sum);
        }
        return wealth;
    }
}