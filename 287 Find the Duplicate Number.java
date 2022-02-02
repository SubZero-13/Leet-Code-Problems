class Solution {
    public int findDuplicate(int[] nums) {
        /* Method 1: Time--> O(n) Space--> O(n)
       int [] dp = new int[nums.length];
        int n = 0;
        for(int i = 0; i < nums.length; i++)
        {
            n = nums[i];
           if(dp[n] == 1)
           {
               break;
           }
            dp[n] = 1;
        }
        return n;
        */
        // Method 2: Time--> O(n) Space--> O(1)
        if(nums.length == 0)
            return 0;
        for(int i = 0; i < nums.length; i++)
        {
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0) 
                return index+1;
            nums[index] = -nums[index];
        }
        return 0;
    }
}