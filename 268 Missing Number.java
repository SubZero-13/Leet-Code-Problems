class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i, ans=0;
        for(i=0; i < nums.length;i++)
        {
            if(i!=nums[i])
            {
                ans = i;
                break;
            }
        }
        if(i == nums.length)
        {
            return i;
        }
        return ans;
    }
}