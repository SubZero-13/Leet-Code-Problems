class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length < 3) {
            return 0;
        }
        //Method 1-- O(n^2)
        /*int count = 0;
        for(int i = 0; i < nums.length-1; i++) {
            int diff = nums[i] - nums[i+1];
            for(int j = i+1; j < nums.length-1; j++) {
                if(nums[j] - nums[j+1] == diff) {
                    count++;
                }
                else {
                    break;
                }
            }
        }
        return count;*/
        // Mehod 2 -- O(n)
        int count = 0, curr = 0;
        for(int i = 2; i < nums.length; i++) {
            if((long)nums[i-2]-nums[i-1] == (long)nums[i-1] - nums[i]) {
                curr += 1;
                count += curr;
            } 
            else {
                curr = 0;
            }
        }
        return count;
    }
}