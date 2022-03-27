class Solution{
    public int maxProfit(int[] prices) {
         //Method 1
         int min = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(min > prices[i]) {
                min = prices[i];
            }
            else if(min < prices[i]) {
                maxProfit = Math.max(maxProfit, prices[i]-min);
            }
        }
        return maxProfit;
        
        
        // Method 2
        // int maxProfit = 0;
        // int minSoFar = prices[0];
        // for(int i = 0; i < prices.length; i++)
        // {
        //     minSoFar = Math.min(minSoFar, prices[i]);
        //     int profit = prices[i] - minSoFar;
        //     maxProfit = Math.max(maxProfit, profit);
        // }
        // return maxProfit;
    }
}
