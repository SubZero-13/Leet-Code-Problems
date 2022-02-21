class Solution {
    private int kadane(int[] arr) {
        int csum = arr[0];
        int osum = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(csum >= 0) {
                csum += arr[i];
            }
            else {
                csum = arr[i];
            }
            if(csum > osum) {
                osum = csum;
            }
        }
        return osum;
    }
    public int maxSubarraySumCircular(int[] nums) {
         int max = Arrays.stream(nums).max().getAsInt();
        if(max < 0) {
            return max;
        }
         int total = 0;
        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
       int k1 = kadane(nums);
        for(int i = 0; i < nums.length; i++) {
            nums[i] = -nums[i];
        }
         
        int k2 = kadane(nums);
        int res = (total + k2);
        return Math.max(k1, res);
    }
}