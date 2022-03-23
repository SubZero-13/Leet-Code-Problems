class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int count = Integer.MAX_VALUE;
        int j = 0;
        int sum = nums[0];
        for(int i = 1; i <= nums.length; i++) {
            while(sum >= target && j <= i-1) {
                count = Math.min(count, i-j);
                sum -= nums[j];
                j++;
            }
            if(i < nums.length) {
                sum += nums[i];
            }
        }
        if(count == Integer.MAX_VALUE) {
            return 0;
        }
        return count;
    }
}