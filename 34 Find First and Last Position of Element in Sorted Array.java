class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res= {-1, -1};
        int first, last, mid;
        first = 0;
        last = nums.length-1;
        while(first <= last)
        {
            mid = (first + last)/2;
            if(nums[mid] == target)
            {
                res[0] = mid;
                last = mid-1;
            }
            else if(nums[mid] < target)
            {
                first = mid+1;
            }
            else
            {
                last = mid-1;
            }
        }
         first = 0;
        last = nums.length-1;
        while(first <= last)
        {
            mid = (first + last)/2;
            if(nums[mid] == target)
            {
                res[1] = mid;
                first = mid+1;
            }
            else if(nums[mid] < target)
            {
                first = mid+1;
            }
            else
            {
                last = mid-1;
            }
        }
        return res;
        
    }
}