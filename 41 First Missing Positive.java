class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean one = false;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 1) {
                one = true;
            }
            if(nums[i] < 1 || nums[i] > n) {
                nums[i] = 1;
            }
        }
        if(!one) {
            return 1;
        }
        for(int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            nums[num-1] = -Math.abs(nums[num-1]);
        }
        for(int i = 0; i < n; i++) {
            if(nums[i] > 0) {
                return (i+1);
            }
        }
        return (n+1);
    }
}