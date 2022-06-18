class Solution {
    public int helper(int nums[], int n) {
        if(n == 1) {
            return nums[0];
        }
        int arr[] = new int[n-1];
        for(int i = 0; i < arr.length; i++) {
            int sum = nums[i] + nums[i+1];
            arr[i] = sum % 10;
        }
        return helper(arr, arr.length);
    }
    public int triangularSum(int[] nums) {
        int n = nums.length;
        return helper(nums, n);
    }
}