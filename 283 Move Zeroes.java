class Solution {
    public void moveZeroes(int[] nums) {
        int lastZero = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                if(i != lastZero)
                    nums[lastZero] = nums[i];
                lastZero++;
            }
        }
        while(lastZero<nums.length)
            nums[lastZero++] = 0;
    }
}