class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = nums[n-1] - nums[0];
        for(int i = 0; i < n-1; i++) {
            int j = i+1;
            int max = Math.max(nums[i]+k, nums[n-1]-k);
            int min = Math.min(nums[0]+k, nums[j]-k);
            ans = Math.min(ans, max-min);
        }
        return ans;
    }
}