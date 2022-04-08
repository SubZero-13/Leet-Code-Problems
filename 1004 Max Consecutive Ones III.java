class Solution {
    public int longestOnes(int[] nums, int k) {
        int i, j = 0;
        int ans = Integer.MIN_VALUE;
        int zeroCount = 0;
        for(i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zeroCount++;
                if(zeroCount > k) {
                    while(zeroCount > k) {
                        if(nums[j] == 0) {
                            zeroCount--;
                        }
                        j++;
                    }
                }
            }
            ans = Math.max(ans, i-j+1);
        }
        return ans;
    }
}