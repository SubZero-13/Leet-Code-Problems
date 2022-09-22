class Solution {
    public int maximumTop(int[] nums, int k) {
        if(nums.length == 1 && k > 0) {
            if(k % 2 == 0) {
                return nums[0];
            }
            else {
                return -1;
            }
        }
        if(k == 0) {
            return nums[0];
        }
        int max = -1;
        int i = 0;
        while(i < nums.length && k-- > 1) {
            max = Math.max(nums[i++], max);
        }
        
        if(i < nums.length-1)
            max = Math.max(nums[i+1], max);
        
        return max;
    }
}