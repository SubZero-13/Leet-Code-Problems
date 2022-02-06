class Solution {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE; 
        int cprod = 1;
        for(int i=0; i < nums.length; i++) {
            cprod *= nums[i];
            ans = Math.max(ans, cprod);
            if(cprod == 0) {
                cprod = 1;
            }
        }
        cprod = 1;
        for(int i = nums.length-1; i>= 0; i--) {
            cprod *= nums[i];
            ans = Math.max(ans, cprod);
            if(cprod == 0) {
                cprod = 1;
            }
        }
        return ans;
    }
}