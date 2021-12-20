class Solution {
    public int findPeakElement(int[] nums) {
          int n = nums.length;
        int lastDiff = 1; 
        int diff;
        for(int i = 0; i < n - 1; i++) {
            diff = nums[i + 1] - nums[i];
            if(diff < 0 && lastDiff > 0) {
                return i;
            }
            lastDiff = diff;
        }
        return n - 1;
    }
}