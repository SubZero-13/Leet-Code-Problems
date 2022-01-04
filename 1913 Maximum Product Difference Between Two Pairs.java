class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int prod1 = nums[nums.length-1] * nums[nums.length-2];
        int prod2 = nums[0] * nums[1];
        return (prod1-prod2);
    }
}