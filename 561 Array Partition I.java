class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 2)
        {
            return nums[0];
        }
        int sum = nums[0];
        for(int i = 1; i < nums.length-1; i+=2)
        {
            sum += nums[i+1];
        }
        return sum;
    }
}