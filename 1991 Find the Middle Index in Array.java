class Solution {
    public int findMiddleIndex(int[] nums) {
        int total  =0;
        int leftSum = 0;
        int i;
        for(int x: nums)
        {
            total += x;
        }
        for(i = 0; i < nums.length; i++)
        {
            if(leftSum == total-leftSum-nums[i])
                return i;
            leftSum += nums[i];
        }
        return -1;
    }
}