class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                secMax = max;
                max = nums[i]; 
            }
            else if(nums[i] > secMax) {
                secMax = nums[i];
            }
        }
        return ((max-1) * (secMax-1));
    }
}