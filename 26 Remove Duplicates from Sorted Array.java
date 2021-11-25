class Solution {
    public int removeDuplicates(int[] nums) {
       int i = 0;
       int j = 0;
        while(j < nums.length)
        {
            while(j < nums.length-1 && nums[j+1] == nums[j])
            {
                j++;
            }
            nums[i] = nums[j];
            i++;
            j++;
        }
        return i;
    }
}