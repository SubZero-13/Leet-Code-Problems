class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<String>();

	for (int left = 0, right = 0; right < nums.length; right++)
		if (right == nums.length - 1 || nums[right] + 1 != nums[right + 1]) {
		
			if (left == right)
				ranges.add(String.valueOf(nums[right]));
			else
				ranges.add(nums[left] + "->" + nums[right]);
				
			left = right + 1;
		}

	return ranges;
        
    }
}