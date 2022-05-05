class Solution {
    int res = 0, target = 0;
    public int countMaxOrSubsets(int[] nums) {
        for(int num:nums)
            target |= num;
        dfs(nums, 0, 0);
        return res;
    }
    public void dfs(int[] nums, int idx, int bitOr) {
        if(target == bitOr)
            res++;
        
        for(int i = idx; i < nums.length; i++) {
            dfs(nums, i+1, bitOr|nums[i]);
        }
    }
}