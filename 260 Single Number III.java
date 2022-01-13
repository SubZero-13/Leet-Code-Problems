class Solution {
    public int[] singleNumber(int[] nums) {
        Set <Integer> d = new HashSet<>();
		
		int size = d.size();
		int found = 0;
		
		for (int i = 0; i < nums.length; i ++) {
			d.add(nums[i]); // 2, 1, 1
			if ( d.size() == size+i) { 
				d.remove(nums[i]);
				size = size - 2;
			}  	  	
		}

		int [] founds = new int [d.size()];
		
		int i =0;
		for (int item : d) {
			found = item;
			founds[i++]=found;
		}
		
		return founds;
    }
}