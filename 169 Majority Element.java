class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1)
            return nums[0];
        
        Arrays.sort(nums);
        int count = 1, max = 0, majority = 0, i;
        for(i = 0; i < nums.length-1; i++)
        {
            if(nums[i] == nums[i+1])
            {
                count++;
            }
            else
            {
                if(max <= count)
                {
                    max = count;
                    count = 1;
                    majority = nums[i];
                }
            }
        }
        if(i == nums.length-1)
        {
            if(max <= count)
                {
                    max = count;
                    count = 1;
                    majority = nums[i];
                }
        }
        if(max <= nums.length/2)
        {
            return 0;
        }
        return majority;

    }
}