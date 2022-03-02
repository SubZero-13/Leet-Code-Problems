class Solution {
    public boolean canJump(int[] nums) {
          int last=nums.length-1,i,j;
    for(i=nums.length-2;i>=0;i--){
        if(i+nums[i]>=last)last=i;
    }
    return last<=0;
    }
}