class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        int[] dp = new int[n];
        int hash[] = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(hash, 1);
        
        for (int i = 0; i <= n - 1; i++) {
            hash[i] = i;
            for (int prevIndex = 0; prevIndex <= i - 1; prevIndex++) {
                if (nums[i] % nums[prevIndex] == 0 && 1 + dp[prevIndex] > dp[i]) {
                    dp[i] = 1 + dp[prevIndex];
                    hash[i] = prevIndex;
                }
            }
        }
        
        int ans = -1;
        int lastIndex = -1;
        
        for (int i = 0; i <= n - 1; i++) {
            if (dp[i] > ans) {
                ans = dp[i];
                lastIndex = i;
            }
        }
        
        List<Integer> temp = new ArrayList<>();
        temp.add(nums[lastIndex]);

        while (hash[lastIndex] != lastIndex) { // till not reach the initialization value
            lastIndex = hash[lastIndex];
            temp.add(nums[lastIndex]);    
        }
        
        Collections.reverse(temp);

        return temp;
    }
}