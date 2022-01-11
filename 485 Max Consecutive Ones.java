class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int j = 0;
		int k = 0;
		int max = 0;
		
		while(j != nums.length) {
			if(nums[j] == 1) {
				k++;
				if(k > max) {
					max = k;
				}
			} else {
				k = 0; 
			}
			j++;
		}
		return max;
    }
}