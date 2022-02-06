class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefixArray[] = new int[nums.length];
        int postfixArray[] = new int[nums.length];
        int ans[] = new int[nums.length];
        int product = 1;
        for(int i = 0; i < nums.length; i++) {
            product *= nums[i];
            prefixArray[i] = product;
        }
        product = 1;
        for(int i = nums.length-1; i>= 0; i--) {
            product *= nums[i];
            postfixArray[i] = product;
        }
        for(int i = 0; i < nums.length; i++) {
            if(i==0) {
                ans[i] = postfixArray[i+1];
            }
            else if(i==nums.length-1) {
                ans[i] = prefixArray[i-1];
            }
            else{
                ans[i] = prefixArray[i-1] * postfixArray[i+1];
            }
        }
        return ans;
        
    }
}