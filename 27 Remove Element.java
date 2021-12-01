class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; 
    
	if(nums.length == 0) return k; 
    
    for (int j=0; j<nums.length; j++)
    {
        if (nums[j]!=val) //
        {
            nums[k] = nums[j]; k++; 
            
        }
    }
    return k++;
    }
}